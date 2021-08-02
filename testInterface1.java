interface drawable
{
void draw();
}
//Implementation: by second user
class Rectangle implements drawable
{
public void draw()
{
System.out.print("drawing rectangle");
}
}
class circle implements drawable
{
public void draw()
{
System.out.print("drawing circle");
}
}
//Using interface: by third user
class TestInterface1
{
public static void main(String args[])
{
drawable d=new circle();
d.draw();
}
}
