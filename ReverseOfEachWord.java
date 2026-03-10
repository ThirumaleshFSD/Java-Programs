public class ReverseOfEachWord {
    public static void main(String[] args) {
        String s="java is easy";
        String s1="";
        String rev="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                s1=ch+s1;

            }else{
                rev+=s1+" ";
                s1="";
            }
        }
        rev=rev+s1;
        System.out.println(rev);
    }
}
