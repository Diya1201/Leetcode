import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
public class Array350{
    public int[] intersect(int[] nums1, int[] nums2){
        Hashtable<Integer, Integer> nums1Map = new Hashtable<>();
        ArrayList<Integer> intersectionalAL = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            if(nums1Map.containsKey(nums1[i])){
                nums1Map.put(nums1[i], nums1Map.get(nums1[i]) + 1);
            }
            else{
                nums1Map.put(nums1[i],1);
            }
        } 
        for(int i = 0; i < nums2.length; i++){
            if(nums1Map.containsKey(nums2[i])){
                intersectionalAL.add(nums2[i]);
                nums1Map.put(nums2[i], nums1Map.get(nums2[i]) - 1);
                if(nums1Map.get(nums2[i]) == 0){
                    nums1Map.remove(nums2[i]);
                }
            }
        }
        int[] result = new int[intersectionalAL.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = intersectionalAL.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Array350 result = new Array350();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] intersection = result.intersect(nums1, nums2);
        //System.out.print("Intersected array is: ");
        System.out.println("Final Intersected array is: " + Arrays.toString(intersection));
    }
}
