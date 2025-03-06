class second {
    public String reverseWords(String str) {
        int left=0,right=str.length()-1;
        String ans="";
        String temp="";
        while(left<=right){
            char ch=str.charAt(left);
            if(ch!=' '){
                temp+=ch;
            }
            else if(ch==' '){
                if(!ans.equals(" ")){
                    ans=temp +" "+ans;
                }
                else{
                    ans=temp;
                }
                temp="";
            }
            left++;
        }
        if(temp!="") {
            if (!ans.equals(" ")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }
        return ans;
    }
}
