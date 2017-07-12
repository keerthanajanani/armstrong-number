# armstrong-number
import java.io.*;
import java.util.*;
public class armstrong number
{
public static void main(String args[])throws IOException
{
int a,n,c=0,temp;
temp=n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
n=Integer.parseInt(br.readLine());
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==c)
System.out.println("armstrong number");
}
}
