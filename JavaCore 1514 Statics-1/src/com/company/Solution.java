package com.company;

/*

1514. Level 15 Lection 9. Statics-1
In a static block, initialize labels 5 with different key-value pairs.
Requirements:
1. There should be only one method (main) in the Solution class.
2. In the class Solution, a static label field of type Map must be declared.
3. The labels field must be filled with 5 different key-value pairs in a static block.
4. The main method should display the contents of labels on the screen.

 */

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(100D,"Red");
        labels.put(101D,"Yellow");
        labels.put(102D,"Green");
        labels.put(103D,"Blue");
        labels.put(104D,"Orange");
    }



    public static void main(String[] args) {
        System.out.println(labels);
    }
}
