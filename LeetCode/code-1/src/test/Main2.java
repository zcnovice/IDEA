package test;

public class Main2 {
   /* public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    }*/

    public static void main(String[] args) {
    /*    MyNode<Integer> number4 = new MyNode<>(4, null);
        MyNode<Integer> number3 = new MyNode<>(3, number4);*/

        //2->4->3     5->6->4
        MyNode_2<Integer> number1 = new MyNode_2<>(3,null);
        MyNode_2<Integer> number2 = new MyNode_2<>(4,number1);
        MyNode_2<Integer> number3 = new MyNode_2<>(2,number2);

        MyNode_2<Integer> number4 = new MyNode_2<>(4,null);
        MyNode_2<Integer> number5 = new MyNode_2<>(6,number4);
        MyNode_2<Integer> number6 = new MyNode_2<>(5,number5);


        int result = convertLinkedListToNumber(number6);
        System.out.println(result);

        /*int num2 = 0;
        while (number3 != null){
            //342
            int i = number3.getData();
            num2  = num2*10 + i;
            number3 = number3.getNext();
        }*/
    }

    public static int convertLinkedListToNumber(MyNode_2<Integer> head) {
        int num = 0;
        int place = 1;
        MyNode_2<Integer> current = head;

        while (current != null) {
            num += current.getData() * place;
            place *= 10;
            current = current.getNext();
        }

        return num;
    }



//---------------------------------------------------------------------------------------------------------
    //原先用自定义链表
    //下面用的是ListNode
    //D:\Java113\笔记\LeetCode\结点ListNode与自定义结点区别.md     写了详细笔记
    //----------------------------------------------------------------------------------------------------

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
            ListNode res = new ListNode();//这个是新建的一个链
            // 移动的临时指针
            ListNode temp = res;//指针指向后，下面开始头插
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
}
