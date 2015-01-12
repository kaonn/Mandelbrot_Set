package math;

public class ThreeDarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = {1,2,3,4,5,56,76,7};
		int i1[] = {0,0,0,0,0,0,0,0,0,};
		int i2[] = {1,1,1,1,1,1,1,1,1,};
		int whole[][][][] = {
				{{i,i2},{i1}	},{{i}}
		};
		for(int j =0;j<i.length;j++)
		System.out.println(whole[0][1][0][j]);
		
		
	}

}
