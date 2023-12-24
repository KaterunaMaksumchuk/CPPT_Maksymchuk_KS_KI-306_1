public class Main {
    public static void main(String[] args) {
        Office OfficeKatya = new Office(4);
        SportGym SportGymVoloda = new SportGym(3);
        SportGym SportGymDog = new SportGym(50);
        Office OfficeKatya3 = new Office(4);

        Building <? super Floor> OurHome = new Building<Floor>();

        OurHome.AddFloor(SportGymVoloda);
        OurHome.AddFloor(OfficeKatya);
        OurHome.AddFloor(OfficeKatya);
        OurHome.AddFloor(OfficeKatya);
        OurHome.AddFloor(OfficeKatya);
        OurHome.AddFloor(SportGymDog);




        System.out.println("The most expensive floor price: " + OurHome.findMax().getPrice());
        System.out.println("The most poor floor price: " + OurHome.findMin().getPrice());



    }
}