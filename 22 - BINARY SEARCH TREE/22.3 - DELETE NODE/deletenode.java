import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class deletenode {
    static class NODE{
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


        public static NODE findinorder(NODE root){
            while ((root.left != null)) {
                root = root.left;
            }
            return root;
        }

        public static NODE delete(NODE root, int val) {
            if(root.data < val){
                root.right = delete(root.right, val);
            } else if(root.data > val){
                root.left = delete(root.left, val);
            }
            else{
                if(root.left == null && root.right == null){
                    return null;
                }
                

                if(root.left == null){
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }


                NODE IS = findinorder(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
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
       
    }
}
