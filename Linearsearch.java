import java.util.*;
class Linearsearch
{
public static void main (String args[])
{
int i, ele,flag=0;
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements \n");
for(i=0; i<5; i++)
{
a[i]=sc.nextInt();
}
System.out.println("Elements are \n");
for(i=0; i<5; i++)
{
System.out.print(a[i]+"\t");
}

System.out.println("Enter element to be search \n");
ele=sc.nextInt();
for(i=0; i<5; i++)
{
if(ele==a[i])
{
flag=1;
break;
}
}
if(flag==1)
System.out.print("element found successfully");
else
System.out.print("element not found");
}
}