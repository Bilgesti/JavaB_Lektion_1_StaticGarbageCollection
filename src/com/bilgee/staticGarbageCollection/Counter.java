package com.bilgee.staticGarbageCollection;

public class Counter {
    static int value = 0;

    static public void count() {
        System.out.println("Before " + value);
        value++;
        System.out.println("After " + value);
    }
}
/*
* TODO-About static!
*  static methods, MUST have static variables
*  regular methods, CAN have static variables
*  !
*  What does static method do?
*    - Added new Feature
*    - No necessary instantiation for method calling
*  What does static variables do?
*    -Unchanged memory position
*    -ONE memory position is allocated
*    -ONE reference only
*  */
/*
* Mineshantering, singulär referens och instansiering.
* SOLUTION-----
* static tillåter arbeta inom class/ metoder utan instansiering. Besparar minne. Pekar dock på samma minnesplats
*   */
