/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(stack.size() > 0){
            result.add(root.val);
            stack.pop();
            ListIterator it = root.children.listIterator();
            for(int i = root.children.size() - 1; i >= 0; i--){
                stack.push(root.children.get(i));
            }
            if(stack.isEmpty()) break;
            root = stack.peek();
        }
        return result;

//  recursive approach
//         List<Integer> result = new LinkedList<>();
//         if(root == null){
//             return result;
//         }
//         result.add(root.val);
//         for(Node child: root.children){
//             result.addAll(preorder(child));
//         }
        
//         return result;
    }
}