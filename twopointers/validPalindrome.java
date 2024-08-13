public class validPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            int startChar = s.charAt(left);
            int endChar = s.charAt(right);
            if (!Character.isLetterOrDigit(startChar )) {
                left++;
            } else if(!Character.isLetterOrDigit(endChar)) {
                right--;
            }
            else{
                if(Character.toLowerCase(startChar)!=Character.toLowerCase(endChar)) {
                    System.out.println("False");
                    break;
                }
                left++;
                right--;
            }
        }
        System.out.println("True");
    }
}
