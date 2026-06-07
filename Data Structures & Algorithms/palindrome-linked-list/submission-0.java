
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer>st=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            st.push(curr.val);
            curr=curr.next;
        }
        curr=head;
        while(!st.isEmpty()){
            if(st.pop()!=curr.val)return false;
            curr=curr.next;
        }
        return true;
    }
}