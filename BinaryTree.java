//Recursive Process
public class BinaryTree {
    private class TreeNode
    {
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data)//constructor never return any value,not private
        {
            this.data=data;
        }
    }TreeNode root;
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
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(TreeNode root)
    {
       if(root==null)
           return;
       inorder(root.left);
       System.out.print(root.data+" ");
       inorder(root.right);
    }
    public void postorder(TreeNode root)
    {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
        bt.preorder(bt.root);
        System.out.println();
        bt.inorder(bt.root);
        System.out.println();
        bt.postorder(bt.root);
    }
}
