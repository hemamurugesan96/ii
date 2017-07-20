import java.io.*;
import java.util.Scanner;
class Repeated
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
char ch;
StringBuffer str=new StringBuffer(s);
for(int i=0;i<str.length()-1;i++)
{
if((i%2)==0)
{
ch=str.charAt(i+1);
str.setCharAt(i+1,str.charAt(i));
str.setCharAt(i,ch);
}
}
System.out.println(str);
}
}
