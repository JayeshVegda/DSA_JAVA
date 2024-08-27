public class levelorder {
    static class NODE{
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
        public static void KthLevel(NODE root, int lvl, int k){
            if(root == null){
                return;
            }

            if(lvl == k){
                System.out.println(root.data + " ");
            }

            KthLevel(root.left, lvl+1, k);
            KthLevel(root.right, lvl+1, k);
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
        b.KthLevel(root, 1, 0 );
    }
}
