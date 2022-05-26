//References:https://umiitkose.com/2015/08/metodlar/
/*
Metodlar java programlarının ana parçalarıdır. Metodlar sınıfların(class) içinde yer alan küçük program parçacıklarıdır.
Metodların çoğunda değişken parametreler metotlar ve sınıflar arasında iletişimi sağlarlar. Ayrıca her metodun kendine özgü değişkenleri de vardır.
Metod yapısının ana sebebi programları modüler hale getirmektir. Aynı zamanda aynı program parçacığının tekrarlanmasını önlemeyi de sağlar.
Her metod çağrıldığı program parçacığına belli bir değişkeni aktarabilir. Metodların tanımlarında aktardıkları değişken türü tanımlanır.
Eğer metod hiçbir değişken aktarmıyorsa void sözcüğüyle tanımlanır.

        Metodların özellikleri şunlardır ;

        -Class içerisinde tanımlanmalıdır
        -Modifier bulunmalıdır (private,public,protected ya da belirtmezsek default) return type herhangi bir veri tipi yada void olabilir
        -Metod ismi belirtilmelidir
        -Metod parametreleri parantez içerisinde belirtilmelidir. Eğer parametre almayacaksa parantez açılıp kapatılır
        -Metod içerisinde kod blokları{ işaretiyle başlar } işaretiyle sonlandırılır
        -Metod parametrelerini ayırmak için ,işareti kullanılır
        -Exception lar metodların yanında {işaretinden önce belirtilebilir

        Metotlar oluşturulma şekillerine göre ikiye ayrılırlar :

        *Önceden Tanımlanmış Metotlar : Java kütüphanelerinde bulunan hazır metotlardır.

        Örneğin : pow(x,y) metodu. Math sınıfına ait olan bu metot, x ve y olarak iki değer alır ve bir değerdöndürür.
        Görevi ilk değerin(x), ikinci değer(y)üssünü almaktır.

        *Kullanıcı Tanımlı Metotlar: Bizim yazdığımız ve oluşturduğumuz metotlardır.

        Metotların genel tanımı aşağıdaki gibidir:

        Öncelikle bir Main metoduna bakarak hatırlıyalım.Nasıldı o main metodu :

        Public Static Void Main(String[] args){} Şimdi bunu genel bir ifadeyle yorumlarsak aşağıdaki olay çıkar

        erişim_tipi (public,private) static (olabilir, olmayabilir ) dönüş_tipi(void ,int vb) foksiyon_ismi(parametreler){

  // Gövde kısmı

}

        ÖRNEKLER:

        public static void fonksiyon(){
        }
        public static int fonksiyon(){
        }
        private void fonksiyon(){
        }
        public String fonksiyon(){
        }

Erişim Tipleri :

public:
public damgası bir değişkeni, metodu ya da sınıfı niteleyebilir. Niteledikleri öğeler herkes tarafından kullanılabilir.
Başka pakette olsa bile, program içinkedi her kod onlara erişebilir.
public damgalı bir sınıfın değişkenlerine ve metotlarına kendi alt-sınıfları ve dışarıdaki başka sınıflar kısıtsız erişebilir.
public damgalı değişkenler ve metotlar için de kısıtsız erişim vardır. Uygulama programlarında main() metodunun public damgalı olmasının nedeni budur.

private
Bazı değişken, metot ya da sınıflara başka sınıftaki kodların erişmesini engellemek isteyebiliriz.
Bunun için private nitelemesini kullanırız. private damgalı öğelere yalnız aynı sınıftaki kodlar erişebilir, başka sınıftaki kodlar erişemez.
Kendi alt-sınıfları bile erişemez. Bir alt-sınıf, atasının public ve ön-tanımlı öğelerine erişebilir, ama private öğelerine erişemez.
Onlara erişebilmesi için, super class interface-fonksiyonu kullanılır.

protected
Bir sınıf içindeki değişken ve metotlara alt-sınıfların erişebilmesini, ama paket içindeki ya da program içindeki başka kodların erişmesini engellemek isteyebiliriz.
Bunun için sözkonusu öğeyi, protected damgası ile nitelemek yetecektir.

Static Durumu :

Static anahtar kelimesi kullanılarak oluşturulan değişkenler nesne değişkeni değil “sınıf değişkeni” olarak adlandırılırlar.
Bu değişkenler nesneye ait değil, sınıfa ait bilgileri taşırlar.
Sınıf değişkenleri içinde tanımlandığı sınıftan hiçbir nesne oluşturulmamış olsa bile bellekte yer kaplarlar.
Nesne değişkenleri ise ancak bir nesne tanımlandığında bellekte yer kaplarlar.
Bu iki tür değişkenin ayrıldığı bir başka nokta da sınıf değişkenlerinin sadece bir örneğinin olmasıdır.
Yani o sınıftan kaç tane nesne oluşturulursa oluşturulsun, bellekte tek bir tane sınıf değişkeni vardır.
Ne şekilde erişirsek erişelim, aynı sınıf değişkenine erişiriz.

Dönüş Tipi:

Void: Geri Dönüş değeri almaz.

İnt, String, Float, Double : Return değeri almaktadır.

Parametre:Parametre, malzeme olarak örneklenebilir. Siz metoda malzeme verirsiniz ve o da size onu işleyerek geri döndürür veya döndürmeden kendi işlemlerinde kullanır.
Bazı metotlar dışarıdan parametreye ihtiyaç duyarken, bazıları duymaz.

Metod Çağırma (Calling Methods)

Metodları ana mainde iki şekilde çağırabiliriz ;

Eğer metod static değilse :

Sınıfİsmi class = new Sınıfİsmi();
class.metod();

Eğer metod static ise :

metod();

*/

//@Author MelihDemirtel

import java.util.Scanner;

//Örnek: 10 kere java yazan metod
public class Main {

    public static void main(String[] args) {

        //İçine yazılan sayı kadar Java yazar
        ornek(10);

        //İçlererine yazılan sayıları işler
        System.out.println(topla(10,20));
        System.out.println(faktoriyel(5));
        System.out.println(usAl(2,3));

        //Yazılan kelimeyi ters çevirir
        Scanner scn = new Scanner(System.in);
        System.out.println("Kelime Gir : ");
        String kelime = scn.nextLine();
        System.out.println(tersCevir(kelime));
    }

    public static void ornek(int a) {
        int i;
        for (i = 0; i < a; i++){
            System.out.println("Java");
        }
    }

    //topla,faktoriyel ve üst alma işlemleri metodu
    public static int topla(int a,int b)
    {
        int toplam = a + b;
        return toplam;
    }
    public static int faktoriyel(int c)
    {
        int f = 1;
        for(int i = 1; i <= c; i++)
        {
            f = f * i;
        }
        return f ;
    }
    public static int usAl(int taban,int us)
    {
        int sonuc = 1;
        for(int i = 1; i <= us; i++)
        sonuc = sonuc * taban;
        return sonuc;
    }

    //Girilen stringi tersten yazdıran java örneği

    public static String tersCevir(String kelime){
        String sonuc = "";
        for(int i = kelime.length()-1; i >= 0; i--)
        {
            sonuc += kelime.charAt(i);
        }
        return sonuc;
    }

}
