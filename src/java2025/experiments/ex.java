package java2025.experiments;

import java.util.LinkedList;
import java.util.Queue;

public class ex {
    public static void main(String[] args){

        Queue<String> customerList = new LinkedList<>();

        customerList.add("Eldar");
        customerList.add("Eziz");
        customerList.add("Aigerim");
        customerList.add("Bakyt");
        customerList.add("Sonya");
        customerList.add("Bill");

        System.out.println("Full list: " + customerList);

        while(!customerList.isEmpty()){
            String firstCustomer =  customerList.poll();
            System.out.println("working with the customer: " + firstCustomer);

            if(!customerList.isEmpty()){
                System.out.println("next customer: " + customerList.peek());
            }else{
                System.out.println("The line is empty");
            }
        }










    }

}
