//without parameters without return
/*class Method
{
public void add()
{
System.out.println(10+20);
}
static public void main(String[] ab)
{
Method m=new Method();
m.add();
}
}
Output:
30*/

//without parameters with return
/*class Method
{
public int sub()
{
return(10-20);
}
static public  void main(String[] args)
{
Method m=new Method();
System.out.println(m.sub());
}
}
Output:-10*/

//with parameters without return
/*class Method
{
public void mul(int a,int b)
{
System.out.println(a*b);
}
static public  void main(String[] mul)
{
Method m=new Method();
m.mul(10,20);
}
}
Output:200*/


//with parameters with return
/*class Method
{
public int div(int a,int b)
{
return(a/b);
}
static public  void main(String[] div)
{
Method m=new Method();
m.div(10,20);
System.out.println(m.div(10,20));
}
}
Output:0*/