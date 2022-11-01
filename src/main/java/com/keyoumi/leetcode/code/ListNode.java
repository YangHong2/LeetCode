package com.keyoumi.leetcode.code;

import com.sun.org.apache.bcel.internal.generic.NEW;

import static java.lang.System.out;

/**
 * @Auther: Ke Youmi
 * @Date: 2022/11/1 - 11 - 01 - 9:10
 * @Description: com.keyoumi.leetcode.code
 * @version: 1.0
 */
/*
给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0 开头。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

class Solution_1 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode vo = new ListNode(0); //创建返回的对象  此时next为NULL
        ListNode v_o = vo;
        int carry = 0; //进位
        //只要传入和进位的不为null和0都需要进行一次计算
        while (l1 != null || l2 != null || carry != 0) {
            int num1 = l1 != null ? l1.val : 0;//健壮判断
            int num2 = l2 != null ? l2.val : 0;//健壮判断
            int sum = num1 + num2 + carry;//求出和
            carry = sum / 10;//满十进一
            v_o=v_o.next = new ListNode(sum % 10);//存入个位
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return vo.next;
    }
}