import java.util.Arrays;

public class Vector {
    private double[] components;
    private int dimension;

    // Constructor with dimension validation
    public Vector(double... components) throws VectorException {
        if (components.length < 2 || components.length > 3) {
            throw new VectorException("Invalid Dimension: Only 2D or 3D vectors are allowed.");
        }
        this.components = components;
        this.dimension = components.length;
    }

    // Helper method to check if dimensions match for operations
    private void checkCompatibility(Vector other) throws VectorException {
        if (this.dimension != other.dimension) {
            throw new VectorException("Dimension Mismatch: Cannot perform operation on " 
                                       + this.dimension + "D and " + other.dimension + "D vectors.");
        }
    }

    // Addition: returns a new Vector
    public Vector add(Vector other) throws VectorException {
        checkCompatibility(other);
        double[] result = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            result[i] = this.components[i] + other.components[i];
        }
        return new Vector(result);
    }

    // Subtraction: returns a new Vector
    public Vector subtract(Vector other) throws VectorException {
        checkCompatibility(other);
        double[] result = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            result[i] = this.components[i] - other.components[i];
        }
        return new Vector(result);
    }

    // Dot Product: returns a scalar (double)
    public double dotProduct(Vector other) throws VectorException {
        checkCompatibility(other);
        double result = 0;
        for (int i = 0; i < dimension; i++) {
            result += this.components[i] * other.components[i];
        }
        return result;
    }

    // Display method
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return (dimension == 2) 
            ? String.format("(%.2f, %.2f)", components[0], components[1])
            : String.format("(%.2f, %.2f, %.2f)", components[0], components[1], components[2]);
    }
}