import java.util.HashSet;
class Array217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(numbers.contains(nums[i])){
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Array217 result = new Array217();
        int[] arr = {1,2,3,4,5,6};
        boolean hasDuplicate = result.containsDuplicate(arr);  // Call the method
        System.out.println("Contains duplicate: " + hasDuplicate);
    }
}
