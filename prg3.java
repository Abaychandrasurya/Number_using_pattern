package Day9;

public class prg3 {
    public static void main(String[] args) {
        int n=17;
         
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==0||j ==n-1 ||i ==n/2 || i ==n-1 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
