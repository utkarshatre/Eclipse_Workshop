package Arrays;

public class AllArrays {
	public static void main(String[] args) {	
	
//		//maxmin();
//		//subarrymax();
//		//System.out.println(duplicate());
       choclatedist();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void maxmin() {
		int a[] = {60,20,40,50,70,10};
		int max=a[0];
		int min=a[0];
		for(int i =0; i<a.length; i++) {
				if(a[i]>=max) {
					max=a[i];
				}
				else {
					min=a[i];
				}
			}
		System.out.println(max);
		System.out.println(min);
	}
	public static void subarrymax() {
		int a[]= {-2,1,-3,4,-1,2,1,-5,4};
		int tsum=0;
		int s[] = new int[4];
		for(int i =0; i<a.length; i++) {
			int csum=0;
			for(int j =i; j<a.length;j++) {
				csum+=a[j];
				
				if(csum>=tsum) {
					tsum=csum;
					s[j]=a[j];
					System.out.println(s[j]);
				}
			}
		}
		System.out.println(tsum);
		}
	public static boolean duplicate() {
		int a[] = {1,2,3,4,7};
		for(int i =0; i<a.length; i++) {
			for(int j =i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void choclatedist() {
		int a[] = {7,3,2,4,9,12,56};
		int m =3;
		for(int i =0;i<a.length; i++) {
			int temp =0;
			for(int j =i+1; j<a.length;j++){
				if(a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		 //{7,3,2,4,9,12,56};
		//  0 1 2 3 4 5  6
		int tdiff=0;
		int min=a[0];
		for(int i =0; i+m-1<a.length;i++) {
			tdiff=a[i+m-1]-a[i];
			///System.out.println(" "+tdiff);
			if(tdiff<min) {
				//System.out.println();
				
				min = tdiff;
			}
		}
		System.out.println(min);
		
	}

}















