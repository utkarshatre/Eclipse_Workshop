package Arrays;
//wha ion  by  array
//creation of array by user inpour
//sum of arry element
//linear search ith array
//binary srrch with aray
//sum of prime eoenemtn  in arry
//max and min element i  array
//bubble sorting
public class ArrayAss {
	public static void main(String[] args) {
		//maxmin();
		//sum();
		//sumprime();
		//bubblesort();
		//palindrome();
		//linearsearchtree();
		binarySearchTree();
	}
	public static void maxmin() {
		int []a= {10,80,50,30,20,60};
		int max=a[0];
		int min=a[0];
		for(int i =0; i<a.length; i++) {
			if(a[i]>=max) {
				max=a[i];
			}
			else if(a[i]<=min){
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	public static void sum() {
		int []a= {10,50,30,20,60};
		int sum=0; 
		for(int i =0; i<a.length; i++) {
			sum +=a[i];
		}
		System.out.println(sum);
	}
	public static void sumprime() {
		System.out.println("sumo fprime no");
		int []a= {5,3,6,7,11,2};
		int sp =0;
		for(int i =0; i<a.length; i++) {
			int count=0;
			for(int j=1; j<=a[i]; j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a[i]+" is primeno");
			}
			else {
				System.out.println(a[i]+" is not a prime no");
			}
	}
	} 
	public static void bubblesort(){
		int []a= {5,3,6,7,11,2};
		int temp=0;
		for(int i =0; i<a.length;i++) {
		
			for(int j =1; j<(a.length-i);j++) {
				if(a[j-1]>a[j]) {
					temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
		}

	}
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}	
	}
	public static void palindrome() {
		int n1 = 121;
		int n2=0;
		int n3=n1;
		while(n1!=0) {
			int s=n1%10;
			n2=(n2*10)+s;
			n1=n1/10;
		}
		System.out.println(n2);
		if(n3   ==n2) {
			System.out.println("palindrome no");
		}
		else {
			
			System.out.println("not a palinrome no");
		}
	}
	public static void linearsearchtree() {
		int a[]= {10,20,30,40,5};
		int key=30;
		for(int i=0; i<a.length;i++) {
			if(key==a[i]) {
				System.out.println(key+ " is key at position at "+i);
			}
		}
		
	}
	
	public static void binarySearchTree() {
		int a[] = {1,4,3,6,4,9,7,2};
		int begin=0;
		int last=a.length-1;
		int pos=-1;
		
	}
	
}
