import java.util.HashMap;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int index=nums[i];
                if(hash.get(index)!=null){
                    hash.put(index,hash.get(index)+1);
             }
                else{
                    hash.put(index,1);
            }
            }
            int min=hash.get(nums[0]);
            int minkey=nums[0];
            for(Integer key: hash.keySet()){
                if(hash.get(key)<min){
                    min=hash.get(key);
                    minkey=key;
                }
            }
                return minkey;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}

}
