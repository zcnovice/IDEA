package test;

public class test1 {

    static class ListNode {
        int val;//存储结点的值
        ListNode next;//下一个结点
        ListNode() {}//无参构造
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            // 结果指针
            ListNode res = new ListNode();
            // 移动的临时指针
            ListNode temp = res;
            // 进位标识
            int carry = 0;
            while (l1 != null || l2 != null) {
                // v1记录l1的当前值 v2记录l2的当前值
                int v1 = 0, v2 = 0;
                if (l1 != null) {
                    v1 = l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    v2 = l2.val;
                    l2 = l2.next;
                }
                // 当前求和的个位 即当前位置的值
                int v = (v1 + v2 + carry) % 10;
                temp.next = new ListNode(v);
                temp = temp.next;
                // 更新进位标识的值
                carry = (v1 + v2 + carry) / 10;
            }
            // 若最后还有多余的进位则加上该值
            if (carry == 1) {
                temp.next = new ListNode(1);
            }
            return res.next;
        }
    }

    // 示例运行代码
    public class Main {
        public static void main(String[] args) {

            ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
            ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

            Solution solution = new Solution();
            ListNode result = solution.addTwoNumbers(l1, l2);

            // 打印结果链表
            while (result != null) {
                System.out.print(result.val + " ");
                result = result.next;
            }
        }
    }
}
