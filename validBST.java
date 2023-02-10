public class validBST {
        private class TreeNode
        {
            private long data;//***
            private TreeNode left;
            private TreeNode right;
            public TreeNode(int data)
            {
                this.data=data;
            }
        }

        TreeNode root;
        //-----------------------------------------------------------------------------
        //check whether bst is valid or not//
        public static boolean isValid(TreeNode root, long min, long max)
        {
            if(root==null)
                return true;
            if(root.data<=min || root.data>=max)
                return false;
            boolean left=isValid(root.left,min,root.data);
            //if(left==true) or if(left),anything is correct
            if(left) {
                boolean right = isValid(root.right, root.data, max);
                return right;//left already true,now everything depends on right
                //If right true then true,If right false then false
            }
            //if left is false then return false,no need to check again right
            return false;
        }
        //----------------------------------------------------------------------------
    public void createBinaryTree(){
        TreeNode t1=new TreeNode(5);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(6);
        TreeNode t4=new TreeNode(1);
        TreeNode t5=new TreeNode(3);
        root=t1;
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
    }
        public static void main(String[] args) {
            validBST bst=new validBST();
            bst.createBinaryTree();
            System.out.println(
                    isValid(bst.root,Long.MIN_VALUE,Long.MAX_VALUE)
            );
        }
    }

