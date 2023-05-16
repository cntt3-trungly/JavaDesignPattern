package Easy.No21MergeSortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
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

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> v = new ArrayList<>();
        while (list1 != null) {
            v.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            v.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(v);
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        for (int i = 0; i < v.size(); i++) {
            result.next = new ListNode(v.get(i));
            result = result.next;
        }
        return temp.next;
    }
}
