package solicitar5numeros;
import java.util.Scanner;
public class Denny
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        int[]denny=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("ingresa el numero # " + (i+1)+": ");
            denny[i]=leer.nextInt();
        }
        System.out.print("los numeros ingresados son: ");
        for(int i=0;i<5;i++)
        {
            System.out.println("numero" + (i+1) + "; " + denny[i]);
        }
    }
    
}
