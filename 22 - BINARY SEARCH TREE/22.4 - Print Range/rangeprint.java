import java.time.LocalDate;
import java.time.Period;

public class rangeprint {
    static class NODE {
        int data;
        NODE right;
        NODE left;

        NODE(int data){
            this.data = data;
            this.right = null;
            this.left =null;
        }
    }

    static class BT {
        
        public static void printrange(NODE root, int k,  int j) {
            if(root == null)
            {
                return;
            }

            if(root.data >= k && root.data <= j){
                printrange(root.left, k, j);
                System.out.print(root.data + " ");
                printrange(root.right, k, j);
            }else if(root.data <= k){
                printrange(root.left, k, j);
            }else{
                printrange(root.right, k, j);
            }
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
        NODE root = new NODE(8);
        root.left = new NODE(5);
        root.right = new NODE(10);
        root.left.left = new NODE(3);
        root.left.right = new NODE(6);
        root.left.left.left = new NODE(1);
        root.left.left.right = new NODE(4);
        root.right.right = new NODE(11);
        root.right.right.right = new NODE(14);

        BT b = new BT();
        b.printrange(root, 3, 11);
    }
}
