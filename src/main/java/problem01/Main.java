package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		//
		// 코드를 완성 하십시오.
		//
		int[] arr1 = new int[arr.length];
		int max=0;
		int result=0,result1=0;
		int gop=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				gop = arr1[i]*arr1[j];
				if(max<gop) {
					max=gop;
					result=arr1[i];
					result1=arr1[j];
					if(result<result1) {
						temp=result;
						result=result1;
						result1=temp;
					}
				}
			}
		}
		System.out.println("["+result+","+result1+"]");
	}
}
