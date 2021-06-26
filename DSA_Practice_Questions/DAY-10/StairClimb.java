////Stair Climb Problem////
//Step-1 , Step-2 , Step-3 (1,2,3)
//Climb -4
//Possiblites
//1,1,1, 1
//1,2,1
import java.util.ArrayList;

public class StairClimb {

	static ArrayList<String> stair(int currStair,int climb){
		if(currStair==climb) {
			ArrayList<String> list=new ArrayList<>();
			list.add("");
			return list;
		}
		ArrayList<String> result=new ArrayList<>();
		for(int st=1;st<=3;st++) {
			int newval=currStair+st;
			if(currStair>climb) {
				break;
			}
			ArrayList<String> temp=stair(newval, climb);
			for(String ele:temp) {
				result.add(st+ele);
			}
		}
		
		return result;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(stair(0, 4));
	}

}
