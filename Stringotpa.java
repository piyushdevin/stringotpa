import java.util.*;
public class Stringotpa {

	public static void main(String[] args)
	{
		String myotp;
		char arr[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','W','X','Y','Z'};
		char arr1[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Random rd=new Random();
		int n1=rd.nextInt(10);
		char c1=arr[rd.nextInt(arr.length)];
		char c2=arr1[rd.nextInt(arr1.length)];
		int n2=rd.nextInt(10);
		int n3=rd.nextInt(10);
		myotp=n1+""+c1+""+n2+""+c2+""+n3;
		System.out.println(myotp);
	}
}


//this is a program which generates otpa or one time pasword which is of integer then big abc then inter then small abc and then again integer. 