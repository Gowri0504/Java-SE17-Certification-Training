// Step 1: Shape interface
interface Shape {
    void draw();
}

// Step 2: Concrete classes
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Step 3: ShapeFactory
class ShapeFactory {

    // Factory method: returns a Shape object based on input
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}

// Step 4: Test class
public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Get Circle object from factory
        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw(); // Output: Drawing a Circle

        // Get Square object from factory
        Shape shape2 = ShapeFactory.getShape("square");
        shape2.draw(); // Output: Drawing a Square

        // Unknown shape
        Shape shape3 = ShapeFactory.getShape("triangle");
        if (shape3 != null) {
            shape3.draw();
        } else {
            System.out.println("Unknown shape type!");
        }
    }
}