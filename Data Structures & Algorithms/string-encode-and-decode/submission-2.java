class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "\0";
        }
        for(int i=0;i<strs.size();i++){
            if(strs.get(i)=="") 
                strs.set(i,"~!$");
        }
        String s=String.join("-",strs);
        return s;
    }

    public List<String> decode(String str) {
        //  List<String> lst=new ArrayList<>();
        if(str.equals("\0")){
            return new ArrayList<>();
        }
        String[] ans=str.split("-");
        for(int i=0;i<ans.length;i++){
            if(ans[i].equals("~!$")){
                ans[i]="";
            }
        }
        return Arrays.asList(ans);
    }
}
