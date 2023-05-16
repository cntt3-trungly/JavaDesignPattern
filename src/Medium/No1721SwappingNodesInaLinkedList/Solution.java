package Medium.No1721SwappingNodesInaLinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    boolean hasNext() {
        if (next != null) {
            return true;
        } else return false;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int n = k-1;
        ListNode headNode = head;
        while (n>0){
            headNode = headNode.next;
            n--;
        }
        ListNode tailNode = head;
        ListNode f = headNode;
        while (f.next != null) {
            tailNode = tailNode.next;
            f= f.next;
        }
        int temp = tailNode.val;
        tailNode.val = headNode.val;
        headNode.val = temp;
        return head;
    }

    public static void main(String[] args) {
        int [] check = new int[] {7,9,6,6,7,8,3,0,9,5};

        ListNode node = new ListNode(check[0]);
        ListNode tempNode = node.next;

        ListNode resultNode = new Solution().swapNodes(node, 5);
        System.out.println(resultNode.val);
        while(resultNode.hasNext()){
            resultNode = resultNode.next;
            System.out.println(resultNode.val);
        }
    }
}
