package com.keyoumi.leetcode.code;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("VI"));
    }

    public static int romanToInt(String s) {
        int a[] = new int[100];
        a[73] = 1;  // *   I             1
        a[86] = 5;  //*    V             5
        a[88] = 10;  //  * X             10
        a[76] = 50; //*    L             50
        a[67] = 100; //*   C             100
        a[68] = 500;// *   D             500
        a[77] = 1000;//  * M             1000
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            if (i < s.length() - 1 && a[(int) s.charAt(i)] < a[(int) s.charAt(i + 1)])
                sum = sum - a[(int) s.charAt(i)];
            else
                sum = sum + a[(int) s.charAt(i)];
        return sum;
    }
}
