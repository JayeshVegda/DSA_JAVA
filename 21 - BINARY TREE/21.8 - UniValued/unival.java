public class unival 
{
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
        public boolean uni(NODE root){
            if(root == null){
                return true;
            }

            if(root.left != null && root.data != root.left.data){
                return false;
            }            
            if(root.right != null && root.data != root.right.data){
                return false;
            }
            return uni(root.left) && uni(root.right);
        }
    }

    public static void main(String[] args) {
        NODE root = new NODE(2);
        root.left = new NODE(2);
        root.right = new NODE(2);
        root.left.left = new NODE(5);
        root.left.right = new NODE(2);
        
        BT b = new BT();
       System.out.println(b.uni(root));
    }
}
