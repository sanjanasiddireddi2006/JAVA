import java.io.*;
import java.util.*;
class LinearSearch {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int pos=-1;
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" values into array:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int key;
        System.out.println("Enter search element:");
        key=sc.nextInt();
        for(int i=0;i<n;i++) {
            if(arr[i]==key) {
                pos=i+1;
                break;
            }
        }
        if(pos==-1) {
            System.out.println(key+" not found in the array.search unsuccessfull");
        }
        else {
            System.out.println(key+" found at "+pos+" position in the array");
        }
    }
}
