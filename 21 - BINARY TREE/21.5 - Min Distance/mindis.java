public class mindis {
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


    static class BT{
        public static NODE lca(NODE root, int n1, int n2){

            if(root == null || root.data == n1 || root.data == n2){
             return root;
            }
 
            NODE left_lca = lca(root.left, n1, n2);
            NODE right_lca = lca(root.right, n1, n2);
 
            if(left_lca == null){
                 return right_lca;
            }
            if (right_lca == null) {
                 return left_lca;
            }
 
            return root;
 
         }

        public static int lcadistance(NODE root, int n){
            if(root == null){
                return -1;
            }

            if(root.data == n){
                return 0;   
            }

            int left = lcadistance(root.left, n);
            int right = lcadistance(root.right, n);

            if(left  == -1 && right == -1){
                return -1;
            }else if(left == -1){
                return right + 1;
            }else{
                return left + 1;
            }
        }
        
        public static int min_distance(NODE root, int n1, int n2){
            NODE mylca = lca(root, n1, n2);
            int d1 = lcadistance(mylca, n1);
            int d2 = lcadistance(mylca, n2);



            return d1 + d2;
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
        System.out.println(
            b.min_distance(root, 4, 6 ));
    }
}
