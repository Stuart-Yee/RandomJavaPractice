package com.CodeChallenge.submissions.EndOfFile;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNext() == true) {
            System.out.printf(
                "%d %s%s%n", 
                i, 
                scan.next(), 
                scan.nextLine()
                );
            i++;
        }
    }
}