/* pattern1`
class pattern1
{
public static void main(String[] args)
{
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}*/

/* pattern2
class pattern1
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}*/


/* pattern3
class pattern1
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}*/


/* pattern4
class pattern1
{
public static void main(String[] args)
{
int z=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(z+" ");
z=z+1;
}
System.out.println();
}
}
}*/

/* pattern5
class pattern1
{
public static void main(String[] args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
if(n==10)
{
n=1;
}
}
System.out.println();
}
}
}*/

/* pattern 6
class pattern1
{
public static void main(String[] args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(n+" ");
n=n+2;
if(n==49)
{
n=49;
}
}
System.out.println();
}
}
}*/

/* pattern 7
class pattern1
{
public static void main(String[] args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
if(j%2==0)
{
System.out.println("0");
}
else
{
System.out.print("1");
}
}
System.out.println();
}
}
}*/


class pattern1
{
public static void main(String[] args)
{
for(int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++)
{
System.out.print(" ");
}
for(int k=1;k<=n;k++)
{
System.out.print("*  ");
}
System.out.println();
}
}
}




