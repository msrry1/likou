package com.algorithm.likou.p701_p800;

/**
 * @ClassName:p707_设计链表
 * @Auther: Lyh
 * @Date: 2022/7/22 19:29
 * @Version: v1.0
 */
public class p707_设计链表 {
}
class ListNode{
    ListNode next;//后驱节点
    int val;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
}
class MyLinkedList {
    int size;//记录链表长度
    ListNode head;//虚拟头节点
    public MyLinkedList() {//初始化
        size=0;
        head=new ListNode(0);
    }

    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }
        ListNode cur=head;
        for(int i=0;i<=index;i++){//因为有虚拟头节点,查找index+1位置。
            cur=cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
//index大于size直接返回
        if(index>size){
            return;
        }
//index<0,根据题意在头部插入节点
        if(index<0){
            index=0;
        }
//添加了节点记得链表的长度要加一。
        size++;
        ListNode pred=head;
//遍厉找到要添加节点位置的前一个节点
        for(int i=0;i<index;i++){
            pred=pred.next;
        }
//创建新的节点
        ListNode AddNode=new ListNode(val);
        AddNode.next=pred.next;
        pred.next=AddNode;
    }

    public void deleteAtIndex(int index) {
        //因为index从零开始,所以index=size时也是越界了。
        if(index<0||index>=size){
            return;
        }
//删除节点记得链表长度减一
        size--;
        ListNode cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
    }
}

