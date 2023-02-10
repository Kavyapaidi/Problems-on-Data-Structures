import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree3 {
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
           //TreeNode seventh=new TreeNode(7);
            root=first;
            first.left=second;
            first.right=third;
            second.left=fourth;
            second.right=fifth;
            third.left=sixth;
            //third.right=seventh;
        }
        public int findMax(TreeNode root) {
            if(root==null)
                return Integer.MIN_VALUE;//not effects max value
            int result=root.data;
            int left=findMax(root.left);
            int right=findMax(root.right);
            if(left>result)
                result=left;
            if(right>result)
                result=right;
            return result;

        }

        public static void main(String[] args) {
            BinaryTree3 bt=new BinaryTree3();
            bt.createBinaryTree();
            System.out.print(bt.findMax(bt.root));
        }

}
