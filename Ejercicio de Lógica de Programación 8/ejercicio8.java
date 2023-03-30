import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
	
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese 10 números enteros");
        int[] nums = new int[10];
        for (int i=0; i<nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        scan.close();
        
        int[] numsP = new int[10];
        int[] numsNP = new int[10];
        for (int i=0; i<nums.length; i++) {
            if (Primo(nums[i])) {
                numsP[i] = nums[i];
            } else {
                numsNP[i] = nums[i];
            }
        }
        System.out.println("Los números que ingresaste son:");
        for (int i=0; i< nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("De los cuales números primos son:");
        for (int i = 0; i < numsP.length; i++) {
            if (numsP[i] != 0) {
            	Arrays.sort(numsP);
                System.out.println(numsP[i]);
            }
        }
        System.out.println("De los cuales números NO primos son:");
        for (int i = 0; i < numsNP.length; i++) {
            if (numsNP[i] != 0) {
            	Arrays.sort(numsNP);
                System.out.println(numsNP[i]);
            }
        }

    }
    // FUNCION PARA SABER SI ES PRIMO
    public static boolean Primo(int numero) {
        if (numero==1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero%i==0) {
                return false;
            }
        }
        return true;
    }
}