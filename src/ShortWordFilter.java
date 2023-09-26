public class ShortWordFilter implements Filter{
    @Override
    public boolean accept(Object x){
        if (x instanceof String){
            String calcString = (String) x;
            return calcString.length() < 5;
        }
            return false;
    }
    //If the string is less than 4 characters the object x returns true
    //If the string is more than 4 characters then it returns object x as false
}
