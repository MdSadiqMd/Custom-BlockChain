package org.example;
import java.util.*;
public class blockChain {
    public static void main(String[] args) {
        Transaction transaction1=new Transaction("sadiq","akhil",100L);
        Transaction transaction2=new Transaction("sadiq1","akhil1",1000L);
        Transaction transaction3=new Transaction("sadiq2","akhil2",10000L);
        System.out.println(transaction1.hashCode());
        System.out.println(transaction2.hashCode());
        System.out.println(transaction3.hashCode());
        Block FirstBlock=new Block(0,Arrays.asList(transaction1,transaction2));
        System.out.println(FirstBlock.hashCode());
        Block SecondBlock=new Block(FirstBlock.hashCode(),Arrays.asList(transaction3));
        System.out.println(SecondBlock.hashCode());
    }
}
