package Day9;

public class prg1 {
    public static void main(String[] args) {
        int n=17;
         
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
   