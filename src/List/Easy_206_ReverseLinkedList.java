package List;



/*Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?*/
public class Easy_206_ReverseLinkedList {
	
	/*
	 * �ǵݹ鷽����1.��ȡ��ǰnode���¸�node�����棬��Ϊ�ᶪʧ��
	 * 2.��ǰnode������ָ����ǰ����
	 * 3.����pre��cur
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
