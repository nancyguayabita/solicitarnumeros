package solicitarnombreprecioalmacenar;
import java.util.Scanner;
public class Solicitarnombreprecioalmacenar 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String[] denny = new String[4];
        int[] espino = new int[4];
        for (int i = 0; i < 4; i++) 
        {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            denny[i] = leer.nextLine();
        }
        for (int i = 0; i < 4; i++) 
        {
            System.out.print("Ingrese el precio de " + denny[i] + ": ");
            espino[i] = leer.nextInt();
        }
        System.out.println("Productos y precios almacenados:");
        for (int i = 0; i < 4; i++) 
        {
            System.out.println(denny[i] + ": $" + espino[i]);
        }

    }
    
}
