public class Findindexinarray {
    public static void main(String[] args) {
        int[] nums = {23,45,65,75,3,56,78,90};
        int target = 78;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}