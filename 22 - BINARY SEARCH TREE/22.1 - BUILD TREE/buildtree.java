public class buildtree {
    static class NODE {
        int data;
        NODE left;
        NODE right;
        
        NODE(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BT {
        public static NODE data_insert(NODE root, int val) {
            if(root == null){
                root = new NODE(val);
                return root;
            }

            if(root.data > val){
               root.left =  data_insert(root.left, val);
            }else{
               root.right = data_insert(root.right, val);
            }

            return root;
        }

        public static void inorder(NODE root){
            if(root==null){
                return;
            }

            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        
    }

    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
        NODE root = null;
        BT b = new BT();
        for(int i = 0; i<val.length; i++){
            root = b.data_insert(root, val[i]);
        }

        b.inorder(root);
        
    }
}
