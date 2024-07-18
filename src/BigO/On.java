package BigO;

//elimizdeki veri seti arttikca , algoritmanin calistirlma suresi dogru orantili sekilde artis gosterir
//Ornegin elimizde kac tane eleman varsa ekrana yazdir. Bin tane varsa bin 1 tane varsa 1
public class On { //O(n) ---> Linear Complexity

    public static void main(String[] args) {

        //arrayin btutn elemanlarini ekrana basalim
        int[] arr ={21, 33, 2, 4,23, 11};

        for (int item: arr){
            System.out.println(item + ","); //burasi eleman sayisi kadar doner
        }

    }
}
