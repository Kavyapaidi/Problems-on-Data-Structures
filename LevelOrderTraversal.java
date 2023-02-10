import java.util.*;
import java.util.LinkedList;

public class LevelOrderTraversal {
    //Recursive Process
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
        public void LevelOrder(TreeNode root)
        {
            if(root==null)
                return;
            Queue<TreeNode> q=new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty())
            {
                TreeNode temp=q.poll();
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }
            return;
        }

        public static void main(String[] args) {
            LevelOrderTraversal lot=new LevelOrderTraversal();
            lot.createBinaryTree();
            lot.LevelOrder(lot.root);
        }
    }
