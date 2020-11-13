import java.util.InputMismatchException;
import java.util.Scanner;

public class InputApp{	
	int n;
	Scanner sc=new Scanner(System.in);
	void getInput() throws Exception{
		System.out.println("enter a number ");
		n=sc.nextInt();
		if(n!=(int)n) {
			throw new Exception("Different Value Found Accept integer");
		}
		if(n==(int)n) {
			if(n<0) {
				throw new Exception("Negative Integer Found");
			}
		}
	}

	public static void main(String[] args){
		int temp;
		InputApp i=new InputApp();
		try {
			i.getInput();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
