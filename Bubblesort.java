import java.util.*;
class Bubblesort
{
 public static void main (String args[])
{
  Scanner sc = new Scanner(System.in);
  int a[]=new int[10];
  System.out.print("Enter 10 elements: ");
 for (int i=0; i<10; i++)
{
 a[i]= sc.nextInt();
}
 System.out.print("Array elements are: ");
 for(int i=0; i<10; i++)
{
 System.out.print(a[i] + " ");
}
int temp;
 for(int i=0; i<10; i++)
{
 for (int j=0; j<9; j++)
{
 if (a[j]>a[j+1])
{
 temp= a[j];
 a[j]=a[j+1];
 a[j+1]=temp;
}
}
}
 System.out.println("\nArray after sorting: ");
 for(int i=0; i<10; i++)
{
 System.out.print(a[i] + " ");
}
}
}
