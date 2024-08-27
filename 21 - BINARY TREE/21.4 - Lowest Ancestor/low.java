import java.util.ArrayList;

public class low {
    static class NODE{
        int data;
        NODE right;
        NODE left;

        NODE(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {
        
        public static NODE lcom(NODE root, int n1, int n2){

           if(root == null || root.data == n1 || root.data == n2){
            return root;
           }

           NODE left_lca = lcom(root.left, n1, n2);
           NODE right_lca = lcom(root.right, n1, n2);

           if(left_lca == null){
                return right_lca;
           }
           if (right_lca == null) {
                return left_lca;
           }

           return root;

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
        System.out.println(b.lcom(root, 4, 5 ).data);
    }
}
