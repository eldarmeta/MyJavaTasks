import java.util.*;

// Word Ladder II (Hard): find all shortest transformation sequences
// from beginWord to endWord using a given dictionary (wordList).
// Approach: BFS to compute min distance and parents; DFS to build paths.
public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        List<List<String>> res = new ArrayList<>();
        if (!dict.contains(endWord)) return res;
        dict.add(beginWord);

        Map<String, List<String>> parents = new HashMap<>(); // child -> list of parents
        Map<String, Integer> dist = new HashMap<>();
        for (String w : dict) dist.put(w, Integer.MAX_VALUE);
        dist.put(beginWord, 0);

        Queue<String> q = new ArrayDeque<>();
        q.offer(beginWord);

        int L = beginWord.length();
        boolean found = false;

        while (!q.isEmpty() && !found) {
            int sz = q.size();
            Map<String, Integer> thisLevel = new HashMap<>();
            for (int i = 0; i < sz; i++) {
                String cur = q.poll();
                int d = dist.get(cur);
                char[] arr = cur.toCharArray();
                for (int p = 0; p < L; p++) {
                    char original = arr[p];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == original) continue;
                        arr[p] = ch;
                        String nxt = new String(arr);
                        if (!dict.contains(nxt)) continue;
                        int nd = d + 1;

                        // If first time seen on this level
                        if (nd <= dist.get(nxt)) {
                            if (nd < dist.get(nxt)) {
                                dist.put(nxt, nd);
                                if (!thisLevel.containsKey(nxt)) {
                                    q.offer(nxt);
                                    thisLevel.put(nxt, nd);
                                }
                            }
                            parents.computeIfAbsent(nxt, k -> new ArrayList<>()).add(cur);
                        }
                        if (nxt.equals(endWord)) found = true;
                    }
                    arr[p] = original;
                }
            }
        }

        if (!found) return res;
        LinkedList<String> path = new LinkedList<>();
        path.add(endWord);
        backtrack(endWord, beginWord, parents, path, res);
        return res;
    }

    private void backtrack(String word, String begin, Map<String, List<String>> parents,
                           LinkedList<String> path, List<List<String>> res) {
        if (word.equals(begin)) {
            ArrayList<String> copy = new ArrayList<>(path);
            Collections.reverse(copy);
            res.add(copy);
            return;
        }
        List<String> pars = parents.get(word);
        if (pars == null) return;
        for (String p : pars) {
            path.addLast(p);
            backtrack(p, begin, parents, path, res);
            path.removeLast();
        }
    }

    // Demo
    public static void main(String[] args) {
        WordLadderII wl = new WordLadderII();
        String begin = "hit";
        String end = "cog";
        List<String> words = Arrays.asList("hot","dot","dog","lot","log","cog");
        List<List<String>> ladders = wl.findLadders(begin, end, words);
        for (List<String> ladder : ladders) {
            System.out.println(ladder);
        }
        System.out.println("Total ladders: " + ladders.size());
    }
}
