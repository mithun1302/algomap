public class mergeStringAlternate {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        String output = "";
        int a=word1.length();
        int b=word2.length();
        int n = Math.max(a,b);
        for(int i=0;i<n;i++){
            if(i<a){
                output+=word1.charAt(i);
            }
            if(i<b){
                output+=word2.charAt(i);
            }
        }
        System.out.println(output);
    }
}
