
public class TowerOfHanoi {

	static void tower(int n,int a,int b,int c) {
		if(n>0) {
			tower(n-1,a,c,b);
			System.out.println("("+a+", "+c+")");
			tower(n-1,b,a,c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		tower(n,1,2,3);
	}

}
