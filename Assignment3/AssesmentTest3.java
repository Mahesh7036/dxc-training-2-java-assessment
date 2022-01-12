package assesment3;

public class AssesmentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest a = new ArrayTest();
		
		int [] uniqueList = {3, 6, 12, 4, 5, 7, 8, 9, 10, 11};
		int [] duplicateList = {3, 6, 12, 4, 5, 7, 8, 9, 10, 11, 3};

		double [] sortedList =  {16.1, 12.3, 22.2, 14.4} ;
		double [] unsortedList = {1.5, 4.3, 7.0,7.0, 19.5, 25.1, 46.2,46.2};

		try {
			System.out.println(a.isUnique(uniqueList));
			System.out.println(a.isUnique(duplicateList));
			
			System.out.println("Is Sorted " + a.isSorted(sortedList));
			System.out.println("Is Sorted " + a.isSorted(unsortedList));
		} catch (NoElementsInArrayException e) {
			System.out.println(e);
		}

	}

}
