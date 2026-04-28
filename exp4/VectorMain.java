public class VectorMain {
    public static void main(String[] args) {
        try {
            // Creating valid vectors
            Vector v2d_1 = new Vector(3.0, 4.0);
            Vector v2d_2 = new Vector(1.0, 2.0);
            Vector v3d_1 = new Vector(1.0, 2.0, 3.0);
            Vector v3d_2 = new Vector(4.0, 5.0, 6.0);

            System.out.println("--- 2D Operations ---");
            System.out.print("V1: "); v2d_1.display();
            System.out.print("V2: "); v2d_2.display();
            
            Vector sum2d = v2d_1.add(v2d_2);
            System.out.print("Sum: "); sum2d.display();
            
            double dot2d = v2d_1.dotProduct(v2d_2);
            System.out.println("Dot Product: " + dot2d);

            System.out.println("\n--- 3D Operations ---");
            System.out.print("V3: "); v3d_1.display();
            System.out.print("V4: "); v3d_2.display();
            
            Vector diff3d = v3d_2.subtract(v3d_1);
            System.out.print("Difference (V4 - V3): "); diff3d.display();

            // Testing Exception: Dimension Mismatch
            System.out.println("\n--- Testing Error: Adding 2D to 3D ---");
            v2d_1.add(v3d_1);

        } catch (VectorException e) {
            System.err.println("Caught Expected Error: " + e.getMessage());
        }

        try {
            // Testing Exception: Invalid Dimension (4D)
            System.out.println("\n--- Testing Error: Creating 4D Vector ---");
            Vector v4d = new Vector(1, 2, 3, 4);
        } catch (VectorException e) {
            System.err.println("Caught Expected Error: " + e.getMessage());
        }
    }
}