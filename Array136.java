class Array136 {
    public int singleNumber(int[] nums) {
        int finder = 0;
        for(int i = 0; i < nums.length; i++){
            finder ^= nums[i];
        }
        return finder;
    }
    public static void main(String[] args) {
        Array136 finder = new Array136();
        int[] arr = {4,1,2,1,2,4,7};
        int result = finder.singleNumber(arr);
        System.out.println("Single Number is " + result);
    }
}
