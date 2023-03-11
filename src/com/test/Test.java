package com.test;

public class Test {
	public static void main(String args[])
    {

        int[][] arr = { { 1, 1, 1, 1, 1 },
                        { 1, 0, 1, 0, 1},
                        { 1, 1, 1, 1, 1}
        };

        print(arr);
        setZeros(arr);
        print(arr);
    }

    public static void setZeros(int[][] matrix) {
    	 int rowLength = matrix.length;
         int colLength = matrix[0].length;
    	for (int i =0;i<rowLength;i++) {
    		for (int j =0;j<colLength;j++) {
    			if(matrix[i][j]==0) {
    				int row=i;
    				int column =j;
    				for(int a=0;a<colLength;a++) {
    					matrix[i][a]=0;
    				}
    			}
    		}
    	}
    }

    public static void print(int[][] matrix) {

        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        System.out.print("Array  Data :-\n");
        for (int i=0; i<rowLength; i++){
            StringBuffer sb = new StringBuffer();
            for (int j=0; j<colLength; j++){
                sb.append(matrix[i][j]).append(",");
            }
            System.out.println(sb.toString());
        }
    }

}
