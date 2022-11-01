package com.keyoumi.leetcode.code;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: Ke Youmi
 * @Date: 2022/11/1 - 11 - 01 - 11:30
 * @Description: com.keyoumi.leetcode.code
 * @version: 1.0
 */
/*
给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

ssddffgh
 */
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        //定义返回的最大长度,左右指针和临时变量
        int max = 0, left = 0, right = 0;
        //转换成 char 数组
        char[] chars = s.toCharArray();
        //利用hash特性判断重复性
        HashSet<Character> set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            //检查当前字符是否存在于set内 存在则不断移动左指针直到没有重复字母为止
            while (set.contains(chars[i])) set.remove(chars[left++]);
            //添加当前字符
            set.add(chars[i]);
            //更新最大长度   max为最大则保持,不是赋值为当前长度
            max = Math.max(right - left + 1, max);
            right++; //right 指针右移
        }
        return max;
    }
    public int lengthOfLongestSubstring_1(String s) {
        //用链表实现双头通道，是先进先出的
        Queue<Character> queue = new LinkedList<>();
        int max = 0;
        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                //如果有重复的，队头出队
                queue.poll();
            }
            //当前元素添加到队尾
            queue.add(c);
            //更新最大长度   max为最大则保持,不是赋值为当前长度
            max = Math.max(max, queue.size());
        }
        return max;
    }




}
