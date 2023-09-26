public class BigRectangleFilter implements Filter{

    //More or less a copy and paste of the ShortWordFilter class
    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle){
            Rectangle variRectangle = (Rectangle) x;
            return variRectangle.calcPerimeter() > 10;
        }
        return false;
    }
}
