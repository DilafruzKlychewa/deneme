package BigO;

//Array ne kadar buyuk olursa olsun, algoritmanin gelistirilme suresi hep sabit kalacaktir

public class O1 {// o(1) --> Constant Complexity

    public static void main(String[] args) {

        int [] arr = {10, 2, 5, 34, 56, 345667, };
        //arrayin son elemanini ekrana yazdiralim
        System.out.println(arr[arr.length-1]);

    }
}
