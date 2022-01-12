package assesment3;

import java.util.HashSet;

public class ArrayTest {
	
	public boolean isSorted(double a[]) throws NoElementsInArrayException{
		if(a.length == 0)
			throw new NoElementsInArrayException();
		
		if(a.length ==1) {
			return true;
		}
		
		for(int superIndex =0;superIndex < a.length-1;superIndex++) {
			if( !(a[superIndex] < a[superIndex+1]) ) {
				if(!(a[superIndex] == a[superIndex+1]))
					return false;
			}
				
			
			
		}
		return true;
	}
	
	public boolean isUnique(int a[]) throws NoElementsInArrayException{
		if(a.length == 0)
			throw new NoElementsInArrayException();
		
		if(a.length ==1) {
			return true;
		}
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int superIndex =0;superIndex < a.length;superIndex++) {
			if(!hs.add(a[superIndex]))
				return false;
			
			
		}
		return true;
	}

}
