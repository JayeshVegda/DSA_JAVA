import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class topview {

    // Node class representing a single node in the binary tree
    static class NODE {
        int data;
        NODE left;
        NODE right;

        NODE(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {

        // Info class to hold a node and its horizontal distance (hd)
        static class Info {
            NODE node;
            int hd;

            public Info(NODE node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        // Method to print the top view of the binary tree
        public static void myview(NODE root) {
            // Queue to hold nodes along with their horizontal distance (hd)
            Queue<Info> q = new LinkedList<>();
            // HashMap to store the first node encountered at each horizontal distance
            HashMap<Integer, NODE> map = new HashMap<>();

            // Initialize min and max horizontal distances
            int min = 0;
            int max = 0;

            // Start level order traversal with the root node at horizontal distance 0
            q.add(new Info(root, 0));

            while (!q.isEmpty()) {
                Info curr = q.remove();

                // If horizontal distance is not already in map, add the node to the map
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                // If the current node has a left child, add it to the queue with hd-1
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);  // Update min hd
                }

                // If the current node has a right child, add it to the queue with hd+1
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);  // Update max hd
                }
            }

            // Print the top view by traversing from min hd to max hd
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
        }

    }

    public static void main(String[] args) {
        // Create a binary tree
        NODE root = new NODE(1);
        root.left = new NODE(2);
        root.right = new NODE(3);
        root.left.left = new NODE(4);
        root.left.right = new NODE(5);
        root.right.left = new NODE(6);
        root.right.right = new NODE(7);

        // Create the binary tree object and print the top view
        BT tree = new BT();
        BT.myview(root);
    }
}
