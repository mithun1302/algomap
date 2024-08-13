public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int n = height.length;
        int output = 0;
        int left = 0;
        int right = n-1;
        int result = 0;
        while(left<right){
            int a = right - left;
            int b = Math.min(height[left],height[right]);
            result = Math.max(result,a*b);
            if (height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(result);
    }
}
