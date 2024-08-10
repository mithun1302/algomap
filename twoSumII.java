
public class twoSumII {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int left = 0;
        int right = numbers.length-1;
        int[] output = new int[2];
        while(left<right){
            if(numbers[left]+numbers[right] > target){
                right--;
            }
            else if(numbers[left]+numbers[right] < target){
                left++;
            }
            else{
                output[0] = left+1;
                output[1] = right+1;
                break;
            }
        }
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
}
