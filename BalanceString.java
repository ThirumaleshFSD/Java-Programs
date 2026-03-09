
import java.util.Stack;

public class BalanceString {
    public static void main(String[] args) {
          String s="{([])}";
        System.out.println(isBal(s));
    }
    public static boolean isBal(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            System.out.println(ch);
            
            if(ch=='{'||ch=='('||ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty())
                    return false;

                char top=st.pop();
                if((ch=='}'&&top!='{')||(ch==')'&&top!='(')||(ch==']'&&top!='[')){

                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    }

