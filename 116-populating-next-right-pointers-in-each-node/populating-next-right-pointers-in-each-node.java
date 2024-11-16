/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        // add level
        // change it pointers while adding the next level   
        while(!queue.isEmpty()){
            if(queue.peek() == null) break;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node current = queue.remove();
                if(current == null) break;
                current.next = queue.peek();
                queue.add(current.left);
                queue.add(current.right);
            }
            queue.add(null);
        }
        return root;
    }
}