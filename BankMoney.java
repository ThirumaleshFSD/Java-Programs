public class BankMoney {
    public static void main(String[] args){
       
        int m=1200;
        int notes[]={500,200,100,50,20,10,5,1};
        for(int i=0;i<notes.length;i++){
            if(m>=notes[i]){
                int count = m/notes[i];
                m%=notes[i];
                System.out.println(notes[i]+" =" +count);
            }
        }
    }
}

