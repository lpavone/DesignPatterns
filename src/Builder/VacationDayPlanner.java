package Builder;

import org.junit.Test;

import java.util.Date;

/**
 * App to test usage of VacationDay Builder.
 * Created by leonardo on 11/11/17.
 */
public class VacationDayPlanner {

    @Test
    public void run(){
        VacationDay saturday = new VacationDay.Builder(new Date(2017, 12, 23))
                .addAccomodation(Accommodation.HOSTEL)
                .addReservationId("booking_id_723476237466")
                .addSpecialEvent(SpecialEvent.MUSEUM)
                .addPublicTransportTicket(PublicTransportTicket.BUS_TICKET)
                .build();

        VacationDay sunday = new VacationDay.Builder(new Date(2017, 12, 24))
                .addAccomodation(Accommodation.AIRBNB)
                .addReservationId("airbnb_9898958")
                .addSpecialEvent(SpecialEvent.CITY_TOUR)
                .build();

        VacationDay monday = new VacationDay.Builder(new Date(2017, 12, 25))
                .addAccomodation(Accommodation.CAMPING)
                .addReservationId("camping_la_arboleda_24345")
                .addSpecialEvent(SpecialEvent.CONCERT)
                .addPublicTransportTicket(PublicTransportTicket.TRAIN_TICKET)
                .build();

        VacationDay tuesday = new VacationDay.Builder(new Date(2017, 12, 26))
                .build();

        System.out.println(saturday.toString());
        System.out.println(sunday.toString());
        System.out.println(monday.toString());
        System.out.println(tuesday.toString());
    }

}
