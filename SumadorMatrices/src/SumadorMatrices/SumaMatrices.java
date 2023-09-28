package SumadorMatrices;
import PaqueteLectura.Lector;

public class SumaMatrices {

    public static void main(String[] args) {
        // dimension matriz
        System.out.println("Dimensiones de la primera matriz: ");
        int n1 = Lector.leerInt();
        int m1 = Lector.leerInt();
        System.out.println("Dimensiones de la segunda matriz: ");
        int n2 = Lector.leerInt();
        int m2 = Lector.leerInt();
        
        // declaraciones matriz;
        int [][] matrix1 = new int[n1][m1];
        int [][] matrix2 = new int[n2][m2];
        int [][] matrixSuma = new int[n1][m1];
        
        // primera matriz
        System.out.println("Ingrese los elementos de la primera matriz: ");
        int i,j;
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                System.out.print(i);
                System.out.print("-");
                System.out.print(j);
                System.out.print(" : ");
                matrix1[i][j] = Lector.leerInt();
            }
        }
        
        // segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz: ");
        for(i=0;i<n2;i++){
            for(j=0;j<m2;j++){
                System.out.print(i);
                System.out.print("-");
                System.out.print(j);
                System.out.print(" : ");
                matrix2[i][j] = Lector.leerInt();
            }
        }
        // mostrar la primera matriz
        System.out.println("La primera matriz es: ");
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                System.out.print(matrix1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        // mostrar la segunda matriz
        System.out.println("La segunda matriz es: ");
        for(i=0;i<n2;i++){
            for(j=0;j<m2;j++){
                System.out.print(matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        
        // suma de matrices
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                matrixSuma[i][j] = matrix1[i][j] + matrix2[i][j]; 
 
            }
        }
        
        // mostrar resultado
        System.out.println("Su suma: ");
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                System.out.print(matrixSuma[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
    
}
