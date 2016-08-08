# NumberArray
import java.util.Scanner;


public class ArrayNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int a[]=new int[len];
		for(int i=0;i<len;i++){
			a[i]=sc.nextInt();
			
	}
		if(a[0]>9){
			System.out.println(a[0]);
		}
		else{
			System.out.println(a[0]+a[1]);
		}
	}

}
