//Remove duplicates from given array
class ArrayDuplicate{
    public int removeDuplicates(int[] nums) {
        int lastUniqueIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[lastUniqueIndex]  != nums[i]){
                nums[lastUniqueIndex + 1] = nums[i];
                lastUniqueIndex ++;
            }
        }
        return lastUniqueIndex + 1;
    }
    public static void main(String[] args){
        ArrayDuplicate sol = new ArrayDuplicate();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int newLength = sol.removeDuplicates(arr);  // Store the returned value
        System.out.print("Unique elements: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}