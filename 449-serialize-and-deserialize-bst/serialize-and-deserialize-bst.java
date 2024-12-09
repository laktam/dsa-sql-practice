/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private List<String> preorder = new ArrayList<>();
    private List<String> inorder = new ArrayList<>();
    private int n = 0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // create inorder and postorder traversals
        // encode : "size inorder postorder"
        createPreorder(root);
        createInorder(root);
        return inorder.size() + "," + String.join(",", preorder) + "," + String.join(",", inorder);
    }

    private void createPreorder(TreeNode root){
        if(root == null) return;
        preorder.add(root.val + "");
        createPreorder(root.left);
        createPreorder(root.right);
    }

    private void createInorder(TreeNode root){
        if(root == null) return;
        createInorder(root.left);
        inorder.add(root.val + "");
        createInorder(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String dataSplit[] = data.split(",");
        int size = Integer.parseInt(dataSplit[0]);
        if(size != 0){
            System.out.println("tree size : " + size);
            String preorderArr[] = Arrays.copyOfRange(dataSplit, 1, size + 1);
            String inorderArr[] = Arrays.copyOfRange(dataSplit, size + 1, dataSplit.length);

            System.out.println(Arrays.toString(preorderArr));
            System.out.println(Arrays.toString(inorderArr));

            return createTree(preorderArr, inorderArr, 0, preorderArr.length - 1);
        }
        else return null;
    }

    private TreeNode createTree(String preorderArr[], String inorderArr[], int start, int end){
        if(n >= preorderArr.length) return null;

        TreeNode root = new TreeNode(Integer.parseInt(preorderArr[n]));
        // root index in inorder
        int rootIndex = 0;
        for(int i = start; i <= end; i++){
            if(preorderArr[n].equals(inorderArr[i])){
                rootIndex = i;
                break;
            }
        }
        if(start < rootIndex){
            n++;
            root.left = createTree(preorderArr, inorderArr, start, rootIndex - 1);
        }
        if(rootIndex < end){
            n++;
            root.right = createTree(preorderArr, inorderArr, rootIndex + 1, end);
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;