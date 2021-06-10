import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent2{
	int x,y,z;
	Parent2() {
		x=10;
		y=20;
		z =30;
		System.out.println("Parent Constructor     "+"X: "+x+", Y: "+y+", Z: "+z);
	}
	
}
class Child2 extends Parent2 implements Serializable{
	int a,b;
	Child2() {
		a=11;
		b=12;
		x=a+x;
		y=a+y;
		z=a+z;
		System.out.println("Child Constructor     "+"X: "+x+", Y: "+y+", Z: "+z+", A: "+a+", B: "+b);
	}
	@Override
	public String toString() {
		return "Child2 [a=" + a + ", b=" + b + ", x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
public class ChildSeriazable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Child2 child2=new Child2();
		String path="C:\\Users\\lenovo\\Downloads\\xyz.dat";
		FileOutputStream fo=new FileOutputStream(path);
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(child2);
		os.close();
		fo.close();
		System.out.println("DONE!!");
		
		FileInputStream fi=new FileInputStream(path);
		ObjectInputStream oi=new ObjectInputStream(fi);
		Child2 ch2=(Child2)oi.readObject();
		System.out.println(ch2);
		oi.close();
		fi.close();
	}

}
