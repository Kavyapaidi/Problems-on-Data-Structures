//Iterative Process
import java.util.Stack;
public class BinaryTree2{
        private class TreeNode
        {
            private int data;
            private TreeNode left;
            private TreeNode right;
            public TreeNode(int data)//constructor never return any value,not private
            {
                this.data=data;
            }
        }

        TreeNode root;
        //private TreeNode root;
        public void createBinaryTree(){
            TreeNode first=new TreeNode(1);
            TreeNode second=new TreeNode(2);
            TreeNode third=new TreeNode(3);
            TreeNode fourth=new TreeNode(4);
            TreeNode fifth=new TreeNode(5);
            TreeNode sixth=new TreeNode(6);
            TreeNode seventh=new TreeNode(7);
            root=first;
            first.left=second;
            first.right=third;
            second.left=fourth;
            second.right=fifth;
            third.left=sixth;
            third.right=seventh;
        }
        public void preorder(TreeNode root)
        {
            if(root==null)
                return;
            Stack<TreeNode> st=new Stack<>();
            st.push(root);
            while(!st.isEmpty())
            {
                TreeNode temp=st.pop();
                System.out.print(temp.data+" ");
                if(temp.right!=null)//as stack follows LIFO
                    st.push(temp.right);
                if(temp.left!=null)
                    st.push(temp.left);
            }
            return;
        }
    public void inorder(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        if(!st.isEmpty() && temp != null) {
            st.push(temp);
            temp=temp.left;
        }
        else
        {
            temp=st.pop();
            System.out.print(temp.data+" ");
            temp=temp.right;
        }
        return;
    }
    /*public void postorder(TreeNode root)
    {

    }
*/

        public static void main(String[] args) {
            BinaryTree bt=new BinaryTree();
            bt.createBinaryTree();
            bt.preorder(bt.root);
            System.out.println();
            bt.inorder(bt.root);
        }
    }

