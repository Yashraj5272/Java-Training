public class Reversetwopointerarray {
    Public static void main(string[] args){
        int[] arr={42, 23, 16, 15, 8, 4};
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            int temp = arr[left];
            arr[left]=arr[right]:
            arr[right]=temp;
            left++;
            right--;
        
        }
        system.out.print(Reversed Array: );


    
}
