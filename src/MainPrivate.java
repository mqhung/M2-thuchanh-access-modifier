
public class MainPrivate {
    public static void main(String[] args) {
        Private obj = new Private();
        System.out.println(obj.number); //khong the truy cap vi la muc do private
        System.out.println(obj.mes); //khong the truy cap vi la muc do private
        System.out.println(obj.msg());//khong the truy cap vi la muc do private
    }
}
