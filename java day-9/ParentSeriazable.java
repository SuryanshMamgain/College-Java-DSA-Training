import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent implements Serializable {
	int x,y,z;
	Parent() {
		x=10;
		y=20;
		z =30;
		System.out.println("Parent Constructor     "+"X: "+x+", Y: "+y+", Z: "+z);
	}
	
}
class Child extends Parent{
	int a,b;
	Child() {
		a=11;
		b=12;
		x=a+x;
		y=a+y;
		z=a+z;
		System.out.println("Child Constructor     "+"X: "+x+", Y: "+y+", Z: "+z+", A: "+a+", B: "+b);
	}
	@Override
	public String toString() {
		return "Child [a=" + a + ", b=" + b + ", x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
public class ParentSeriazable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Child child=new Child();
		String path="C:\\Users\\lenovo\\Downloads\\abc.dat";
		FileOutputStream fo=new FileOutputStream(path);
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(child);
		os.close();
		fo.close();
		System.out.println("DONE!!");
		
		FileInputStream fi=new FileInputStream(path);
		ObjectInputStream oi=new ObjectInputStream(fi);
		Child ch=(Child)oi.readObject();
		System.out.println(ch);
		oi.close();
		fi.close();
	}

}
