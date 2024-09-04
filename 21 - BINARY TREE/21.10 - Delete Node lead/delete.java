public class delete {
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
        public static NODE delete(NODE root, int x){
            if(root == null){
                return null;
            }

            root.left = delete(root.left, x);
            root.right = delete(root.right, x);

            if(root.data == x && root.left == null && root.right ==null){
                return null;
            }
            
            return root;
        }
    }

    public static void inorder(NODE root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void main(String[] args) {
        NODE root = new NODE(1);
        root.left = new NODE(3);
        root.right = new NODE(3);
        root.left.left = new NODE(3);
        root.left.right = new NODE(2);
        
        BT b = new BT();
       System.out.println(b.delete(root, 3));
       inorder(root);
    }
}
