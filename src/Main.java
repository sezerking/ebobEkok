import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("n1 syısını giriniz: ");
        int n1=scn.nextInt();

        System.out.println("n2 sayısını giriniz: ");
        int n2=scn.nextInt();

        //while döngüsü ile ebob
        int ebob=1;
        int k=n1;
        while (k>=1){
            if (n1%k==0 &&n2%k==0){
                ebob=k;
                break;
            }
            k--;
        }
        System.out.println(ebob);

        //while döngüsü ile ekok
        int i=1;
        while (i<=(n1*n2)){
            if (i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
            i++;
        }


/*
    //ekok
        for (int i=1; i<=(n1*n2);i++){
            if (i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
        }
        //*********************************************
        //ebob yöntem-1
        for (int i=1;i<=n1;i++){
            if (n1%i==0&&n2%i==0){
                System.out.println(i);
                ebob=i;
            }
        }
        //********************************************
        //ebob yöntem-2
        for (int k=n1;k>=1;k--){
            if (n1%k==0 &&n2%k==0){
                System.out.println(k);
                ebob=k;
                break;
            }
        }

        */

    }
}
