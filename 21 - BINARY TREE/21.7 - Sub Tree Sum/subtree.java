public class subtree {
    static class NODE {
        int data;
        NODE right;
        NODE left;
        NODE(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class BT {
    
    
    public static int sum(NODE root){
        if(root == null){
            return 0;
        }

        int leftchild = sum(root.left);
        int rightchild = sum(root.right);

        int data = root.data;
        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;

        root.data = newright + leftchild + newleft + rightchild;
 
        return data;
    }

    public static void preorder(NODE root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
        
}
    public static void main(String[] args) {
        NODE root = new NODE(1);
        root.left = new NODE(2);
        root.right = new NODE(3);
        root.left.left = new NODE(4);
        root.left.right = new NODE(5);
        root.right.left = new NODE(6);
        root.right.right = new NODE(7);

        BT b = new BT();
        b.sum(root);
        b.preorder(root);
    }
}
