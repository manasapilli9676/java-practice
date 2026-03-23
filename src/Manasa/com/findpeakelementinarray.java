package Manasa.com;
import java.util.Scanner;
//peak index in mountain array
public class findpeakelementinarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();

        //for binary search array must be sorted
        //no dublicate array
        int[] arr=new int[x];
        for(int i =0;i<arr.length;i++) {
            arr[i]=input.nextInt();
        }
        int target=input.nextInt();
        int ans=findingpeakofanarray(arr,target);
        System.out.println(ans);
    }//
    //in the end start and end point to the same value
    //
    // the same loop will repreat until the resulted andwer is found
    static int findingpeakofanarray(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
                //ia ma in asc part of aarray
                //because we know that mid+1 element>mid element

            }
            else{
//i am may be the decreasing part of array
                //this may be the ans but look at left
                end=mid;
            }
        }
        return start;
        //where the start==end and pointing to the largrst number because of the 2 cheak  above
        //start and are always tring to find the max elementin the above 2 chaeck
        //hence when they are pointing to just one element thatis max one because that is waht we check say
        //more elobaration at every point of time for start and end they have the besst possible answerntill that time
        //if we are asaying that only one item is remaning hance out of aove line that is the best possible ans

    }

}
