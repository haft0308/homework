package func;

public class FuncAddMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= new int[2][4];
		int[][] arr2 = new int[2][4];
		
		
		
		//임의의 값을 구하자. 1-9

		arr=make(arr);
		arr2=make(arr2);		
		
		int[][] result = multiply(arr, arr2);
		print(result);//곱한 배열을 출력하자.
		
		result = add(arr, arr2);
		print(result);//더한 배열을 출력하자.
		
		addOther( result, arr, arr2);
		print(result);//더한 배열을 출력하자.
	}
	
	static int[][] make(int[][] arr2)
	{
		for ( int i = 0; i<2; i++)
		{
			for ( int j = 0; j < 4; j++)
			{
				arr2[i][j] = ((int)(Math.random()*9)+1);
			}
		}
		return arr2;
	}
	
	static int[][] multiply(int[][] arr, int[][] arr2)
	{
		int[][] arrMultiple=new int[2][4];
		
		for ( int i = 0; i<2; i++)
		{
			for ( int j = 0; j < 4; j++)//i=0, j=0
			{
				arrMultiple[i][j] = arr[i][j]*arr2[i][j];//arr[0][0]*arr2[0][0]//5*5
			}
		}
		return arrMultiple;
	}
	
    static void print(int[][] result)
    {
    	for ( int i = 0; i<2; i++)
		{
			for ( int j = 0; j < 4; j++)
			{
				System.out.println(result[i][j]);
			}
		}	
    }
	static void addOther(int[][] result,int[][] arr, int[][] arr2)
	{
		//int[][] arrAdd = new int[2][4];
		
		for ( int i = 0; i<2; i++)
		{
			for ( int j = 0; j < 4; j++)
			{
				result[i][j] = arr[i][j]+arr2[i][j];
			}
		}
		//return arrAdd;
	}
	
	static int[][] add(int[][] arr, int[][] arr2)
	{
		int[][] arrAdd = new int[2][4];
		
		for ( int i = 0; i<2; i++)
		{
			for ( int j = 0; j < 4; j++)
			{
				arrAdd[i][j] = arr[i][j]+arr2[i][j];
			}
		}
		return arrAdd;
	}


}
