package List;



/*Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?*/
public class Easy_206_ReverseLinkedList {
	
	/*
	 * 非递归方法。1.获取当前node的下个node，保存，因为会丢失。
	 * 2.当前node的坐标指向先前坐标
	 * 3.更新pre，cur
	 */
	public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextTmp;
        }
        return pre;
    }
	
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }

}
