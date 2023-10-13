package com.bilgee.staticGarbageCollection;

public class Main {


// DEPRECATED
   /* public void finalize () {
        System.out.println("Test Garbage Collection");
        }
    */

    public static void main(String[] args) {

        // Counter counterA = new Counter();
        // Counter counterB = new Counter();
        Counter counterC = new Counter();
        Counter counterD = new Counter();




        // Garbage Collection - Mark for unreferenced Objects (heap)
        new Counter(); // Anonymous object
        counterC = null;  // Nulling Reference
        counterC = counterD; // Assigning Reference ( to another )

        System.out.println(counterC); // Same Memory Address
        System.out.println(counterD); // Same Memory Address

        System.gc();



        for ( int i = 0; i<5; i++) {
            System.out.println("--Counter A--");
            Counter.count();

            System.out.println("--Counter B--");
            Counter.count();
        }




    }
}
