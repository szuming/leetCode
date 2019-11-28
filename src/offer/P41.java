package offer;

import java.util.ArrayList;

/**
 * 和为s的两个数字
 *
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 输出描述:
 * 对应每个测试案例，输出两个数，小的先输出
 */
public class P41 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<>(2);
        if (array.length<2)return result;
        int left = 0, right =array.length-1,count = array[left]+array[right];
        while (left<right) {
            if (count==sum){
                result.add(array[left]);
                result.add(array[right]);
                break;
            }else if (count<sum){
                left++;
            }else {
                right--;
            }
            count = array[left]+array[right];
        }
        return result;
    }
}