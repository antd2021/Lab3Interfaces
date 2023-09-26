public class Rectangle {

    private int recWidth;
    private int recHeight;

    //Rectangle constructor
    public Rectangle(int recWidth, int recHeight) {
        this.recWidth = recWidth;
        this.recHeight = recHeight;
    }

    //Rectangle getter and setter

    //recWidth getter
    public int getRecWidth() {
        return recWidth;
    }
    //recwidth setter
    public void setRecWidth(int recWidth) {
        this.recWidth = recWidth;
    }
    //recHeight getter
    public int getRecHeight() {
        return recHeight;
    }
    //recHeight setter
    public void setRecHeight(int recHeight) {
        this.recHeight = recHeight;
    }

    //toString method

    @Override
    public String toString() {
        return "Rectangle{" +
                "recWidth=" + recWidth +
                ", recHeight=" + recHeight +
                '}';
    }

    //Method to calculate the Perimeter
    public int calcPerimeter(){
        return (this.recHeight * this.recWidth) * 2;
    }
}
