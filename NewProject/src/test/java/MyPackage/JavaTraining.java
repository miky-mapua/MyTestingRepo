package MyPackage;

public class JavaTraining {

	public static void main(String[] args) {
			
		int TopTenList[] = new int[9];
			
		for (int i = 0; i < 9; i++) {
			TopTenList[i] = i + 1;
		}
			
		for (int j = 0; j < 9; j++) {
			if (TopTenList[j] % 2 == 0) {
				System.out.println(TopTenList[j]);
			}	
		}
	}
}