import com.thinking.machines.util.*;

class KeyboardTestCase
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();

String a;
a=k.getString("Enter a string : ");

char c;
c=k.getCharacter("Enter gender (M/F) : ");

long l;
l=k.getLong("Enter a long type value : ");

int i;
i=k.getInt("Enter a int type value : ");

short s;
s=k.getShort("Enter a short type value : ");

byte b;
b=k.getByte("Enter a byte type value : ");

double d;
d=k.getDouble("Enter a double type value : ");

float f;
f=k.getFloat("Enter a float type value : ");

boolean x;
x=k.getBoolean("Enter a boolean type value : ");

System.out.println(a);
System.out.println(c);
System.out.println(l);
System.out.println(i);
System.out.println(s);
System.out.println(b);
System.out.println(d);
System.out.println(f);
System.out.println(x);
}
}