package account;

import java.util.Random;

/**
 *
 * @author David Sanchez
 */
public class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
     /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void calculate(int a, int b) {
        final int suma= a + b;
        System.out.println("Suma of a and b: " + suma);
        final int diferencia = a - b;
        System.out.println("Diferencia of a and b: " + diferencia);
        final int producto = a * b;
        System.out.println("Producto of a and b: " + producto);
        final int cociente = a / b;
        System.out.println("Cociente of a and b: " + cociente);
    }

    public static void main(String[] args) {
        int[] nums = generarNumerosAleatorios(10);
        int suma = sumarNumeros(nums);
        System.out.println("Suma de los números pares e impares multiplicados por 3 y 2 respectivamente: " + suma);
    }

    public static int[] generarNumerosAleatorios(int cantidad) {
        int[] nums = new int[cantidad];
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            nums[i] = rand.nextInt(100) + 1;
        }//Fin Para
        return nums;
    }

    public static int sumarNumeros(int[] nums) {
        int suma = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            suma += num % 2 == 0 ? num * 3 : num * 2;
        }//Fin Para
        return suma;
    }
}
   
    

