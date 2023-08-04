package day1;

import java.util.ArrayList;

public class day1 {

	public static void main(String[] args) {
		
		System.out.println("Hello 1");
		// TODO Auto-generated method stub
		String str="done";
		String btr="concat";
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add(" Swapnil");
		al.add("Shrikant");
		al.add("Gadge ");
		al.add(str);
		
		System.out.println(al);
		
		
		for(String obj:al) {
		if(obj=="Gadge ") {
		System.out.println("Final Answer Got it");
		break;
		}
		System.out.println("Answer Is not getting");
		}

	}

}
