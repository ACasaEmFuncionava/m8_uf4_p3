/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

import java.util.Scanner;

/**
 *
 * @author Random-II
 */
public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introduce un valor");
            System.out.print("> ");
            nums[i] = input.nextInt();
        }
        
        int check = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < check) {
                check = nums[i];
            } else {
                System.out.println("Siguiente valor\n");
            }
        }
        System.out.println("value of check: "+check);

    }
}
