package array;

public class TestArray {

    public static void main(String[] args) {
        Array array = new Array();
        array.push("teste1");
        array.push("teste2");
        System.out.println(array.size());
        array.push("teste3");
        System.out.println(array.size());
        array.pop();
        System.out.println(array.size());

    }
}
