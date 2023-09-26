import java.util.ArrayList;
import java.util.List;

public class BigRectLister {

    public static void main(String[] args) {

        List<Rectangle> rectangles = new ArrayList<>();
            //creates the array list for the Rectangle objects to be added
        rectangles.add(new Rectangle(2, 10));
        rectangles.add(new Rectangle(2, 9));
        rectangles.add(new Rectangle(2, 8));
        rectangles.add(new Rectangle(2, 7));
        rectangles.add(new Rectangle(2, 6));
        rectangles.add(new Rectangle(2, 5));
        rectangles.add(new Rectangle(2, 4));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(2, 1));
            //added objects

        Filter bigRectangleFilter = new BigRectangleFilter();

        System.out.println("Rectangles with big perimeters (> 10):");
        collectAll(rectangles, bigRectangleFilter);
    }

    //zMore or less the same collectAll method as in the ShortLister class
    public static void collectAll(List<Rectangle> rectangles, Filter filter) {
        for (Rectangle rectangle : rectangles) {
            if (filter.accept(rectangle)) {
                System.out.println("Perimeter: " + rectangle.calcPerimeter());
            }
        }
    }
}
