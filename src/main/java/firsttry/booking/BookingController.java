package firsttry.booking;


import com.sun.org.apache.regexp.internal.RE;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pritesh on 06/10/16.
 */
@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    private List<HotelBooking> bookings;

    public BookingController(){
        bookings = new ArrayList<>();
        bookings.add(new HotelBooking("Marriot", 200.30, 3));
        bookings.add(new HotelBooking("Ibiz", 20.30, 2));
        bookings.add(new HotelBooking("Hayat", 2000.30, 9));

    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookings;
    }
}
