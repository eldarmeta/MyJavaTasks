/**
 * LeetCode 126 — Word Ladder II (HARD)
 * BFS by layers to record parent links for shortest paths, then DFS backtracking to build all ladders.
 * Time: O(N * L^2) roughly (patterns/neighbor lookups), Space: O(N * L),
 * where N is number of words, L is word length.
 * On LeetCode, rename this class to `Solution` and keep method `findLadders`.
 */
import java.util.*;

public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        List<List<String>> res = new ArrayList<>();
        if (!dict.contains(endWord)) return res;
        dict.add(beginWord);

        GraphWL graph = new GraphWL(new ArrayList<>(dict));
        Map<String, List<String>> parents = new HashMap<>(); // word -> list of parents on shortest paths
        Map<String, Integer> dist = new HashMap<>();         // shortest distance from beginWord

        bfs(beginWord, endWord, graph, parents, dist);
        if (!dist.containsKey(endWord)) return res;

        // Backtrack all paths from endWord to beginWord
        List<String> path = new ArrayList<>();
        path.add(endWord);
        backtrack(endWord, beginWord, parents, path, res);
        return res;
    }

    private void bfs(String start, String target, GraphWL graph,
                     Map<String, List<String>> parents, Map<String, Integer> dist) {
        Queue<String> q = new ArrayDeque<>();
        q.offer(start);
        dist.put(start, 0);
        int L = start.length();
        int foundDist = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            int sz = q.size();
            Map<String, Integer> localVisited = new HashMap<>(); // to avoid same-layer duplicates
            for (int i = 0; i < sz; i++) {
                String w = q.poll();
                int d = dist.get(w);
                if (d >= foundDist) continue;

                for (String nb : graph.neighbors(w)) {
                    if (nb.equals(w)) continue;
                    // If this is the first time we see nb globally, record distance and enqueue
                    if (!dist.containsKey(nb)) {
                        dist.put(nb, d + 1);
                        q.offer(nb);
                        parents.computeIfAbsent(nb, k -> new ArrayList<>()).add(w);
                        localVisited.put(nb, d + 1);
                    } else if (dist.get(nb) == d + 1) {
                        // Another shortest parent
                        parents.computeIfAbsent(nb, k -> new ArrayList<>()).add(w);
                    }
                    if (nb.equals(target)) foundDist = d + 1;
                }
            }
            // Early exit if we already found the target distance
            if (foundDist != Integer.MAX_VALUE) break;
        }
    }

    private void backtrack(String cur, String start,
                           Map<String, List<String>> parents,
                           List<String> path, List<List<String>> res) {
        if (cur.equals(start)) {
            List<String> ladder = new ArrayList<>(path);
            Collections.reverse(ladder);
            res.add(ladder);
            return;
        }
        List<String> ps = parents.get(cur);
        if (ps == null) return;
        for (String p : ps) {
            path.add(p);
            backtrack(p, start, parents, path, res);
            path.remove(path.size() - 1);
        }
    }
}
