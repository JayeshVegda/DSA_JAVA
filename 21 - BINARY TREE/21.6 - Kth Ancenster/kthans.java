public class kthans {
    static class NODE{
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
        public static int kth(NODE root, int n, int k){
            if(root == null){
                return -1;
            }

            if(root.data == n){
                return 0;
            }

            int left = kth(root.left, n, k);
            int right = kth(root.right, n, k);

            if(left == -1 && right == -1){
                return -1;
            }

            int max = Math.max(left, right);
            if(max + 1 == k){
                System.out.println(root.data);
            }

            return max  + 1;


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
        
            b.kth(root, 0, 0 );
    }
}
