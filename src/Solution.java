/*1. Нужно создать нерегулярный массив, подобный table:
int table[ ] [ ] = new int[ 4] [ ];
table[0] = new int[7];
table[1] = new int[3];
table[2] = new int[5];
table[3] = new int[1];
Количество строк вводится, а количество элементов в каждой строке
задается случайным образом в диапазоне от 1 до 10.

 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[][] table = new int[4][];
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            table[0] = new int[sc.nextInt()];
            table[1] = new int[sc.nextInt()];
            table[2] = new int[sc.nextInt()];
            table[3] = new int[sc.nextInt()];
        }

        for (int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                table[i][j] = (int)(Math.random()*10);
                System.out.print(table[i][j] + " ");
                if(j==table[i].length-1) {
                    System.out.println(" ");
                }
            }
        }
    }
}
