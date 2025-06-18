public class variable
{
int number=10;
public void showNumber()
{
int number=20;
System.out.println("local number:"+number);
System.out.println("global number:"+this.number);
}
public static void main(String[] args)
{
variable obj=new variable();
obj.showNumber();
}
}
