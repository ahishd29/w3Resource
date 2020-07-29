package w3resource;

import java.util.ArrayList;

public class TwinPrimeBelow100 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		boolean flag = true;
		for(int i=3;i<=100;i++) {
			flag=true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						flag=false;
						break;
					}	
					}
				if(flag) {
					al.add(i);
				}
			}
//		System.out.println(al);
//		int[] ar = new int[al.size()];
//		al.toArray();
//		System.out.println(ar.length);
//		for(int i=0;i<ar.length-2;i++) {
//			if(ar[i+1]-ar[i]==2) {
//				System.out.println("("+i+","+i+1+")");
//			}
//			System.out.println(ar[i]);
		int b[]= new int [al.size()];
        Integer m[] = new Integer[al.size()];//***Very important conversion to array*****
        m=(Integer[]) al.toArray(m);
        for(int i=0;i<al.size();i++)
			{
			    b[i]=m[i]; 
//			    System.out.println(b[i]);
			}
        for(int i=0;i<b.length-2;i++) {
			if(b[i+1]-b[i]==2) {
				System.out.println("("+b[i]+","+b[i+1]+")");
			}
		
		
		}
	}
}


