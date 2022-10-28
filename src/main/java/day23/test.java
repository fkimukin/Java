package day23;

public class test {



    public static void main(String[] args) {
        String s = "Marra";
        for(int i = s.length()-1; i > -1; i--){
            char c = s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
        }
    }
}
