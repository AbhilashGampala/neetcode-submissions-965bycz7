class Solution {
    public boolean isPalindrome(String s) {
    //    String[] a=String.split(" ",s);
    //    s=a.join("");
       String sa="";
       for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
               ch=Character.toLowerCase(ch); 
            }
            if(Character.isDigit(ch)||Character.isLetter(ch)){
                sa+=ch;
            }
        }
        int n=sa.length();
        int i=0;
        int j=n-1;
        // if(n%2==0){
        //     i=n/2-1;
        //     j=n/2;
        // }
        // else{
        //     i=n/2-1;
        //     j=n/2+1;
        // }
        boolean isP=true;
        while(i<j){
            if(sa.charAt(i)!=sa.charAt(j)){
                isP=false;
                break;
            }
            i++;
            j--;
        }
        return isP;
    }
}
