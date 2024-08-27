import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class prepre {

    static class Node
    {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        static Node build(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if(root == null){
            return;
        }

        System.out.print(root.data + " -> ");
        preorder(root.left);
        preorder(root.right);


    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }


        inorder(root.left);
        System.out.print(root.data + " - ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }


        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " - ");
    }
    public static void kthlevel(Node root, int level, int k){
      if(root == null){
        return;
      }

      if(level == k){
        System.out.print(root.data + " lelo ");
        return;
      }

      kthlevel(root.left, level + 1, k);
      kthlevel(root.right, level + 1, k);
    }
    static class Into{
        int hd;
        Node node;

        public Into(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root)
    {
        if (root == null) {
            return;
        }

        Queue<Into> q = new LinkedList<Into>();
        HashMap<Integer, Node> h = new HashMap<>();

        int min = 0;
        int max = 0;

        q.add(new Into(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Into curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else
            {
                if(!h.containsKey(curr.hd)){
                    h.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                    q.add(new Into(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd-1);
                }

                if(curr.node.right != null){
                    q.add(new Into(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }

        for(int i = min; i<=max;i++){
                System.out.print(h.get(i).data+" ");
        }


    }
    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }

        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;
    }
    public static boolean isSubTree(Node root, Node subRoot){
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int l = sum(root.left);
        int r = sum(root.right);
        return l + r + root.data;
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int l = count(root.left);
        int r = count(root.right);

        return l + r + 1;
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }


        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }
    public static int diameter(Node root) {
        if(root == null){
            return 0;
        }

        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int self = lh + rh + 1;
        return Math.max(self, Math.max(ld, rd));

    }

    static class Info {

        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info l = diameter2(root.left);
        Info r = diameter2(root.right);

        int diam = Math.max(Math.max(l.diam, r.diam), l.ht + r.ht + 1);
        int ht = Math.max(l.ht, r.ht) + 1;

        return new Info(diam, ht);
    }

    public static void lowcommon(Node root, int p1, int p2){
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> sec = new ArrayList<>();

        while(root.data != p1){
            lowcommon(root.left, p1, p2);
            lowcommon(root.left, p1, p2);
        }
    }
    public static void levelorder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);


        while (!q.isEmpty()) {
            Node curr = q.remove();

            if(curr == null)
            {
                System.out.println();

                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{

            System.out.print(curr.data + " ");
            if(curr.left != null){
                q.add(curr.left);
            }

            if(curr.right != null){
                q.add(curr.right);
            }
        }}

    
    }


    public static void main(String[] args) {
        // int nodes[] = {4,-7,-3,-1,-1,-9,-3,9,-7,-4,-1,6,-1,-6,-6,-1,-1,0,6,5,-1,9,-1,-1,-1,-4,-1,-1,-1,-2};
        // int subRoot[] = {4,-7,-3,-1,-1,-9,-3,9,-7,-4,-1,6,-1,-6,-6,-1,-1,0,6,5,-1,9,-1,-1,-1,-4,-1,-1,-1,-2};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.build(nodes);
        // Node subsroot = tree.build(subRoot);
        // postorder(root);
        // System.out.println();
        // levelorder(root);
        // System.out.println();
        // System.out.print(count(root));
        // // System.out.println(sum(root));
        // System.out.println(diameter2(root).diam);
        // System.out.println(diameter(root));

        Node root = new Node(1);
        root.left = new Node(25);
        root.right = new Node(251);
        root.right.right = new Node(5);
        root.left.right = new Node(53);
        root.left.left = new Node(4);


        Node sub = new Node(1);
        sub.left = new Node(2);
        sub.left.right = new Node(3);
        sub.left.left = new Node(4);
        // System.out.println(isSubTree(root, sub));
        // System.out.println(isSubTree(root, sub));
        // topView(root);
        kthlevel(root, 1, 2);
        lowcommon(root, 4, 5);
        // System.out.println(diameter2(root).ht);
    }


}
