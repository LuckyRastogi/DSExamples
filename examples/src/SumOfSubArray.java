public class SumOfSubArray {

    public void printSumOfSubArray(int sumOfSubArray, int[] array){
        int sum = 0;
        for(int i=0; i<array.length;i++){
                sum = sum + array[i];
            for(int j=i+1;j<array.length;j++){
                sum = sum + array[j];
                if(sum==sumOfSubArray){
                    System.out.println((i+1) +  " " + (j+1));
                }
            }
            sum = 0;
        }
    }

    public static void main(String[] args) {
        SumOfSubArray a = new SumOfSubArray();
        int[] array = new int[]{ 1,2,3,7,5 };
        int sumOfSubArray = 12;
        a.printSumOfSubArray(sumOfSubArray, array);
		// testing
    }

}
