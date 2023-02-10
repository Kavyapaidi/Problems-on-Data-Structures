//Insert element into BST
//elements in inorder traversal are in increasing order
//search a value/key in BST
public class BinarySearchTree {
    private class TreeNode
    {
        private long data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data)
        {
            this.data=data;
        }
    }TreeNode root;
    //--------------------------------------------------------
   public void insert(int value)
    {
        root=insert(root,value);
    }
    public TreeNode insert(TreeNode root,int value)
    {
        if(root==null)
        {
           root=new TreeNode(value);
           return root;}
        if(value<root.data){
            root.left=insert(root.left,value);
        }
        else if(value>root.data)
        {
            root.right=insert(root.right,value);
        }
        return root;
    }
    //--------------------------------------------------
    public TreeNode search(TreeNode root,int key)//returns node
    {
        if(root==null || root.data==key)
            return root;
        if(key<root.data)
            return search(root.left,key);
        else
            return search(root.right,key);
    }
    //----------------------------------------------------
    public static void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //-----------------------------------------------------
    //check whether bst is valid or not//
    public static boolean isValid(TreeNode root,long min,long max)
    {
        if(root==null)
            return true;
        if(root.data<=min || root.data>=max)
            return false;
        boolean left=isValid(root.left,min,root.data);
        //if(left==true)
        if(left) {
            boolean right = isValid(root.right, root.data, max);
            return right;//left already true,now everything depends on right
            //right true then true,If right false then false
        }
        //if left is false then return false,no need to check again right
        return false;
    }
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(5);
        bst.insert(2);
        bst.insert(6);
        bst.insert(1);
        bst.insert(7);
        bst.inorder(bst.root);
        System.out.println();
        if(bst.search(bst.root,10)!=null)
            System.out.println("found");
        else
            System.out.println("not found");
        System.out.println(isValid(bst.root,Long.MIN_VALUE,Long.MAX_VALUE));
    }
}
