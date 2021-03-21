package omt.csc262.w2.demos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omt
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("--- ArrayList Demo ---");
        
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        for (Integer n: nums) {
            System.out.println("n = " + n);
        }
    }
 
}
