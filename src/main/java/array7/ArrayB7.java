package array7;

public class ArrayB7 {
  public static int arrayMax(int a[]) {
		int max=0;
		for(int i:a) {
			if(i>max)
				max=i;
			
		}
		return max;
	}
}
