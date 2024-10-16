/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv3_zadani;

/**
 *
 * @author Tandler-D-0f5f
 */
public class prime_print {
    public static void main(String[] args) {
        int from = 2;
        int till = 10000;
        for (int i = from;i <= till;i++){
            if (isPrime(i)){
                System.out.printf("if (a == %d) prvocislo == true;\n",i);
            }
        }
    }
    public static boolean isPrime(int a){
        boolean has_div = false;
        for (int i = 2;i<(Math.round(Math.sqrt(a)));i++)
            if ((a % i) == 0){
                has_div = true;
                break;
            }
        return has_div;
    }
}