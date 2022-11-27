public class DZ_1 {
 
    public static void main(String[] args) {
        System.out.println("R = (p & q)");
        System.out.println("Таблица истинности");        
        System.out.println("p q  R");
    out(false,false);
    out(false,true);
    out(true,false);
    out(true,true);
    }
    public static void out(boolean p, boolean q){
        System.out.println((p ? "1 " : "0 ") + (q ? "1 " : "0 ") + (!(!p & q) ? " 1" : " 0"));
    }
}