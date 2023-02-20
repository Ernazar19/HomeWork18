public class Main {
    public static void main(String[] args) {
        //TODO tapshyrma:
    /*    1. Үй-булөлөр өз үйүндө, батирде жана мейманканада жашашат.
        2. Өз үйүндө жашагандар ком услуга төлөшөт (5 адам жашайт)
        3. Батир менен гостиницада жашагандар квартплата + ком услуга төлөшөт (3 адам жашайт)

        4. Мейманканада жашагандар номерге төлөшөт (2 адам жашайт)

        5. Кайсы жерде канча адам жашаганын жана канча чыгым болгонун консольго чыгарыңыз
        PS: кыймыл аракеттерди интерфейс аркылуу реализация кыласыздар,
        жашаган жерлери бул класстар, үй-бүлө бул массив, адам бул класс.*/

        Person[] family1 ={ new Person("John"),
                new Person("Shakira"),
                new Person("Lexy"),
                new Person("Jeremy"),
                new Person("Jenny")};

        Home home = new Home("Adams", family1, 400, 40.65, 25);
        System.out.println(home.toString());
        home.expedinture();

        Person[] family2 ={ new Person("Mark"),
                           new Person("Merlin"),
                           new Person("Stan")};
        Flat flat = new Flat("Jackson",family2,400,40.65,25,25000);
        System.out.println(flat.toString());
        flat.expedinture();
        Person[] family3 = {new Person("Kristian"),
                            new Person("Stefani")};

        Hostel hostel =new Hostel("Litle",family3,400,40.65,25,1500);
        System.out.println(hostel.toString());
        hostel.expedinture();
    }
}