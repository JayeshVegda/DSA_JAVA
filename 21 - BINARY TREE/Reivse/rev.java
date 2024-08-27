import java.util.LinkedList;
import java.util.Queue;

public class rev {
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
        static int idx = -1;
        public static NODE buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            NODE newNode =  new NODE(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }


        public static void preorder(NODE root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void postorder(NODE root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        public static void inorder(NODE root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        } 
        public static void levelorder(NODE root){
            if(root == null){
                return;
            }
            
            System.out.println("\nLEVEL ORDER : ");

            Queue<NODE> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                NODE curr = q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curr.data);
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
    
        public static int count(NODE root){
            if(root == null){
                return 0;
            }

            int left = count(root.left);
            int right = count(root.right);
            return left + right + 1;
        }
        public static int diameter(NODE root){
            if(root == null){
                return 0;
            }

            int l = diameter(root.left);
            int lh = height(root.left);
            int r = diameter(root.right);
            int rh = height(root.right);

            int self = lh + rh + 1;

            return Math.max(self, Math.max(l, r)); 
        }
        public static int sum(NODE root){
            if(root == null){
                return 0;
            }

            int l = sum(root.left);
            int h = sum(root.right);
            return l + h + root.data;
        }
        public static int height(NODE root){
            if(root == null){
                return 0;
            }

            int left = height(root.left);
            int right = height(root.right);
            return Math.max(left, right) + 1;
        }
    
    
        public static boolean isIdentical(NODE node, NODE subroot){
            if(node == null && subroot == null){
                return true;
            }else if(node == null || subroot == null || node.data != subroot.data){
                return false;
            }
            
            if(!isIdentical(node.left, subroot.left)){
                return false;
            }

            if(!isIdentical(node.right, subroot.right)){
                return false;
            }

            return true;
        }
        public static boolean isSubTree(NODE root, NODE subroot){
            if(root == null){
                return false;
            }
            
            if(root.data == subroot.data){
                if(isIdentical(root, subroot)){
                    return true;
                }
            }

            return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
        }
    }
    public static void main(String[] args) {
         // Build the tree using the buildtree method or manually as below
        //       1
        //    2    5  
        //  3  4  6  7
        //              7    

         NODE root = new NODE(1);

         root.left = new NODE(2);
         root.right = new NODE(3);
         root.left.left = new NODE(4);
         root.left.right = new NODE(5);
 
         root.right.left = new NODE(6);
         root.right.right = new NODE(7);
         


         // sub tree
        //     1
        //        5
        //      6   7
        //             7
        
         NODE ruut = new NODE(2);
         ruut.right = new NODE(5);
         ruut.left = new NODE(4);

         // Call various traversal methods
         System.out.println("Preorder Traversal:");
         BT.preorder(root);
 
         System.out.println("\nInorder Traversal:");
         BT.inorder(root);
 
         System.out.println("\nPostorder Traversal:");
         BT.postorder(root);
 
         BT.levelorder(root);
 
         // Call count and height methods
         System.out.println("Height of the tree: " + BT.height(root));
         System.out.println("\nTotal number of nodes: " + BT.count(root));
         System.out.println("\nTotal sum of nodes: " + BT.sum(root));
         System.out.println("\nTotal Diameter of nodes: " + BT.diameter(root));
         System.out.println("\nTotal Diameter of nodes: " + BT.isSubTree(root, ruut));
    }
}
