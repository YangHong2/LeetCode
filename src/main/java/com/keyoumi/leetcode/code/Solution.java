package com.keyoumi.leetcode.code;

import java.util.ArrayList;

import static java.lang.System.out;

/**
 * @Auther: Ke Youmi
 * @Date: 2022/10/31 - 10 - 31 - 17:04
 * @Description: com.keyoumi.leetcode
 * @version: 1.0
 */
/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/palindrome-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static boolean isPalindrome(int x) {
        Integer integer = x;
        String s = integer.toString();
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i <= j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 101;
        x %= 10;
//        out.println(x);/*换行输出*/

        out.println(isPalindrome2(1001001));/*换行输出*/

    }

    public static boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        ArrayList<Integer> array = new ArrayList();
        int v = x % 10;
        array.add(v);
        int tem = x;
        for (; ; ) {
            tem = tem / 10;
            int v1 = tem % 10;
            if (tem == 0) {
                break;
            }
            array.add(v1);
        }
        for (int i = 0, j = array.size() - 1; i <= j; i++, j--) {
            if (array.get(i) != array.get(j)) {
                return false;
            }
        }
        return true;
    }
}
