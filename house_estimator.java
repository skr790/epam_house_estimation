package home_calc;
import java.util.HashMap;

class home_estmation {
	public int get_cost(String standards,int area) {
        //Using nested if checks every condition causes time redundant
        // the retrival time of Hashmap is O(1)

        HashMap<String, Integer> m=new HashMap(); //Storing required data in Hashmap
        m.put("standard",1200);
        m.put("above standard",1500);
        m.put("high standard",1800);
        m.put("high standard and automated",2500);

        return area*m.get(standards);



    }



}

