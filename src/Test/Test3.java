package Test;

public class Test3 {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            int a = 2 / 0;
            System.out.println("2");
        }catch (IllegalAccessError e){
            System.out.println("3");
        }catch (NullPointerException e){
            System.out.println("4");
        }catch (Exception e){
            System.out.println("5");
        }finally {
            System.out.println("6");
        }
    }
}
