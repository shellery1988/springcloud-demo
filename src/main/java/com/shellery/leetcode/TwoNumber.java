package com.shellery.leetcode;

/**
 * Author:   liuss
 * Date:     2020/1/14 20:06
 * Description:
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class TwoNumber {

    private static int listNodeToInt(ListNode listNode){
        int val = listNode.val;
        int num = 1;
        while(listNode.next != null){
            listNode = listNode.next;
            val += listNode.val * Math.pow(10,num);
            num ++;
        }
        return val;
    }

    private static ListNode intToListNode(int num){
        String numStr = String.valueOf(num);
        char[] charArr = numStr.toCharArray();
        ListNode nodeList = null;
        for(int i=0; i<charArr.length; i++){
            ListNode node = new ListNode((int)(charArr[i]-'0'));
            if(nodeList!=null){
                nodeList.next = node;
            } else {
                nodeList = node;
            }
        }
        return nodeList;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sumNum = listNodeToInt(l1) + listNodeToInt(l2);
        return intToListNode(sumNum);
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        node1.next = node2;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node5.next = node6;
        node4.next = node5;
        addTwoNumbers(node1, node4);
    }

}
