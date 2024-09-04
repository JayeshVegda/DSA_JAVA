public class invert {
    static class NODE 
    {
        int data;
        NODE left;
        NODE right;

        NODE(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {
        public static NODE invertTree(NODE root){
            if(root == null){
                return null;
            }

            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
        
            // Swap the left and right children
            root.left = right;
            root.right = left;
        
           
            return root;
        }
    }

    public static void main(String[] args) {
        NODE root = new NODE(2);
        root.left = new NODE(2);
        root.right = new NODE(2);
        root.left.left = new NODE(5);
        root.left.right = new NODE(2);
        
        BT b = new BT();
       System.out.println(b.invertTree(root));
    }
}
