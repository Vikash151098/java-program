class a
{
a(long i,long x){
System.out.print("value"+i+x);
System.out.print("first");
}
a(long i,int x){
System.out.print("second");
System.out.print("value"+i+x);}
public static void main(String []arg)
{
a ob=new a(5,6l);

}
}