import java.util.Scanner;
class abc
{
public static void main(String []arg)
{
int a[][]=new int[3][2];
Scanner reader=new Scanner(System.in);
System.out.println("enter the value in the array: ");
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
System.out.print("a["+i+"]["+j+"]: ");

a[i][j]=reader.nextInt();

}
}
System.out.println("the value of the array: ");

for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println();

}
}

}