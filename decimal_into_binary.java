import java.util.Scanner;
public class week3_1
{
    public static void main(String[] args)
    {
        //enter your code here...
        Scanner input = new Scanner(System.in);
		System.out.println("enter a decimal: ");
		int dec = input.nextInt();
		String inp = "";
		while(dec!=0){
			if(dec%2==0){
				inp=inp+0;
			}
			else{
				inp=inp+1;
			}
			dec/=2;
			
		}
		System.out.println(new StringBuilder(inp).reverse().toString());
	}   
        
    }
