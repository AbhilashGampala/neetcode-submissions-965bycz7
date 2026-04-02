class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> st=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                char ch=board[i][j];
                if(ch=='.') continue;
                else if(!st.add(ch+"in row "+i)||!st.add(ch+"in col "+j)||!st.add(ch+","+i/3+" "+j/3)){
                    return false;
                }
            }
        }
        return true;
    }
}
