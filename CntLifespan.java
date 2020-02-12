import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

public class test_auto {



	public static void main(String agrs[]) throws Exception {

		// Read the two arrays
		int[] b = { 1902, 1941, 2004, 1957, 1989, 1909, 1918, 1913, 1979, 1961,
				1977, 1909 };
		int[] d = { 1991, 1978, 2008, 2005, 2010, 2002, 2003, 1991 };
		
		
        
        HashMap<Integer,Integer> object = new HashMap<Integer,Integer>(); 
        for(int i=0;i<b.length;i++){
        	if(object.containsKey(b[i])){
        		int val =object.get(b[i]);
        	object.put(b[i],val+1);
        	}else{
        		object.put(b[i],1);
        	}
        }
        for(int i=0;i<d.length;i++){
        	int find = d[i]+1;
        	if(object.containsKey(find)){
        		int val =object.get(d[i]+1);
        	object.put(d[i]+1,val-1);
        	}else{
        		object.put(d[i]+1,-1);
        	}
        }
	System.out.println("xvxvv");
	TreeMap<Integer, Integer> sorted = new TreeMap<>(); 
	  
    // Copy all data from hashMap into TreeMap 
    sorted.putAll(object); 
    
    int prev=0;
    // Display the TreeMap which is naturally sorted 
    for (HashMap.Entry<Integer, Integer> entry : sorted.entrySet())  
    {    
    int value = entry.getValue()+ prev;
    sorted.put(entry.getKey(), value);
    if(prev>value){
    	System.out.println(entry.getKey());
    }
    prev= value;
    
    }
   
    
	}
	
	
}
