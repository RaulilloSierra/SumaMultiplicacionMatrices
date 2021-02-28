/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea24feb21;

/**
 *
 * @author RaulSierra
 */
import java.util.Scanner;
public class Tarea24Feb21 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String primera = "primera";
        String segunda = "segunda";
        int[][] matriz1 = pedirMatriz(input,primera);
        int[][] matriz2 = pedirMatriz(input,segunda);
        int[] columnasMatriz2 = new int[matriz2[0].length];
        if(matriz1[0].length==matriz2.length){
            System.out.println("La matriz producto será: ");
            int[][] productoMatriz = producto(matriz1, matriz2);
            for(int i=0;i<matriz1.length;i++){
                for(int j=0;j<matriz2[0].length;j++){
                    System.out.print(productoMatriz[i][j]+" ");
                }    
                System.out.print("\n");  
            }    
        }else{
            System.out.println("Estas dos matrices no se pueden multiplicar ");
            System.out.println("porque las columnas de la primera no coinciden ");
            System.out.println("con las filas de la segunda.");
        }
        
    }
    
    public static int[][] pedirMatriz(Scanner input, String palabra){
        System.out.print("Introduzca el número de filas de la "+palabra+" matriz:");
        int n = input.nextInt();
        System.out.print("Introduzca el número de columnas de la "+palabra+" matriz:");
        int m = input.nextInt();
        int[][] matriz = new int [n][m];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print("Elemento ["+i+"]["+j+"]:");
                matriz[i][j]= input.nextInt();
            }    
        }
        return matriz;
    }
    
   private static int[][] producto(int matriz1[][], int matriz2[][]){  
        int suma = 0;  
        int result[][] = new int[matriz1.length][matriz2.length];  
        for(int i = 0; i < matriz1.length; i++){  
            for(int j = 0; j < matriz2.length; j++){  
                suma = 0;  
                for(int k = 0; k < matriz2.length; k++){  
                    suma += matriz1[i][k] * matriz2[k][j];  
                }  
                result[i][j] = suma;  
            }  
        }  
        return result;  
    } 
    
}
