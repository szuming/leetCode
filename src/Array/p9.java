package Array;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:

 输入: 121
 输出: true

 示例 2:

 输入: -121
 输出: false
 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

 示例 3:

 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。

 进阶:

 你能不将整数转为字符串来解决这个问题吗？

 */
public class p9 {
    public boolean isPalindrome(int x) {
        if(x<0)return false;            //负数不为回文数
        int num[]=new int[100000];
        int index=0,i;
        while (x!=0){
            num[index++]=x%10;
            x=x/10;
        }
        for(i=0;i<index;i++){
            if(num[i]!=num[--index]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] argv){
        p9 temp=new p9();
        System.out.println(temp.isPalindrome(1));
    }
}
