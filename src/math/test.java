package math;

public class test {
	public static void main(String[]args){
		int count=0;
		for(int i =1;i<=1992;i++){
			String s = Integer.toString(i, 3);
			System.out.println(s);
			if(!s.contains("2"))count++;
		}
		int a = Integer.parseInt(Integer.toBinaryString(9),2);
		int b = Integer.parseInt(Integer.toBinaryString(12),2);
		int [][]x = {{1,0,0,0},
				{1,0,0,0}
		};
		System.out.println((0b1000101)^(0b1010101));
		System.out.println(x.length);
	}
}
