import java.util.Scanner;

public class hello{
    static void bubbleSort(int[] a,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                     a[i]=a[j];
                     a[j]=t;
                }
            }
        }


    }
    static void StringPrinter(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] naim){
      
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        bubbleSort(a, 10);
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }

        String s;
        s=sc.nextLine();
       System.out.println(s);
    }
}
