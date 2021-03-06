package firsttry.booking;

/**
 * Created by pritesh on 06/10/16.
 */

public class HotelBooking {
    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;


public HotelBooking(String hotelName, double pricePerNight, int nbOfNights){
    this.hotelName=hotelName;
    this.pricePerNight=pricePerNight;
    this.nbOfNights=nbOfNights;
}

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public String getHotelName() {
        return hotelName;
    }
    public double getTotalPrice(){
        return pricePerNight * nbOfNights;
    }
}