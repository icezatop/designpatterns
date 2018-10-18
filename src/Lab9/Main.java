package Lab9;

public class Main {
    public static void main(String[] args) {
        SingleTour singleTour = new SingleTour("Egypt yahoo",1000,100,50);
        System.out.println(singleTour.getName());
        System.out.println(singleTour.getPrice());
        System.out.println(singleTour.getAvailableSeats());

        Tour tour = new PackageTour("Special Price",
                new SingleTour("Egypt hello",1000,100,50),
                new SingleTour("Egypt hi",1000,100,50));
        System.out.println(tour.getName());
        System.out.println(tour.getPrice());
        System.out.println(tour.getAvailableSeats());
    }


}