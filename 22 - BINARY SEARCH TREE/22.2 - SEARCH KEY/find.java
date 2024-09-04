public class find {
    static class NODE {
        int data;
        NODE left;
        NODE right;
        NODE(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    static class BST {
    
        public static boolean key(NODE root, int k){
            if(root == null){
                return false;
            }

            if(root.data == k){
                return true;
            }

            if(root.data > k){
                return key(root.left, k);
            }else{
                return key(root.right, k);
            }


        }

        public static void inorder(NODE root){
            if(root==null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        NODE root = new NODE(5);
        root.left = new NODE(1);
        root.right = new NODE(7);
        root.left.right = new NODE(3);
        root.left.right.left = new NODE(2);
        root.left.right.right = new NODE(4);

        BST bst = new BST();
        bst.inorder(root);
        System.out.println(bst.key(root, 3));

    }
}
