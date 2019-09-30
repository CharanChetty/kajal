package hashmap_example;

import java.util.HashMap;
import java.util.Map;

public class Train_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Train> hm=new HashMap<Integer,Train>();
		
		Train t1=new Train(1,"chennai express","mumbai","chennai");
		Train t2=new Train(2,"chalukya express","dadar","pudhucherry");
		Train t3=new Train(3,"udhyan express","mumbai","bangalore");
		hm.put(1, t1);
		hm.put(2, t2);
		hm.put(3, t3);
		
		for(Map.Entry m:hm.entrySet())
		{
			Object key= m.getKey();
			Train value=(Train) m.getValue();
			System.out.println(key+" "+"item list:");
			System.out.println(value.getTrain_id() +" "+value.getTrain_name()+" "+value.getStart()+" "+value.getEnd());
			
		}



	}

}
