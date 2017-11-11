package Builder;

import java.util.Date;

/**
 * Created by leonardo on 11/11/17.
 */
public class VacationDay {

    private Date date;
    private Accommodation accommodation;
    private String reservationId;
    private SpecialEvent specialEvent;
    private PublicTransportTicket publicTransportTicket;

    private VacationDay(VacationDay.Builder builder) {
        this.date = builder.date;
        this.accommodation = builder.accommodation;
        this.reservationId = builder.reservationId;
        this.specialEvent = builder.specialEvent;
        this.publicTransportTicket = builder.publicTransportTicket;
    }

    public Date getDate() {
        return date;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public String getReservationId() {
        return reservationId;
    }

    public SpecialEvent getSpecialEvent() {
        return specialEvent;
    }

    public PublicTransportTicket getPublicTransportTicket() {
        return publicTransportTicket;
    }

    @Override
    public String toString() {
        return String.format(
                "VacationDay date info: \n\t* Date: %s\n\t* Accommodation: %s\n\t* Reservation ID: %s\n\t" +
                        "* Special Event: %s\n\t* Public Transport Ticket: %s\n\n",
                this.date.toString(),
                this.accommodation != null ? this.accommodation.name() : "Nothing booked, where are we gonna sleep?",
                this.reservationId != null ? this.reservationId : "No reservation available.",
                this.getSpecialEvent() != null ? this.getSpecialEvent().name() : "No events for this day.",
                this.publicTransportTicket != null ? this.publicTransportTicket.name() : "Today is walking day!"
        );
    }

    public static class Builder {

        private Date date;
        private Accommodation accommodation;
        private String reservationId;
        private SpecialEvent specialEvent;
        private PublicTransportTicket publicTransportTicket;

        public Builder(Date date) {
            if (date == null) {
                throw new IllegalArgumentException("date can not be null");
            }
            this.date = date;
        }

        public VacationDay.Builder addAccomodation(Accommodation accommodation) {
            this.accommodation = accommodation;
            return this;
        }

        public VacationDay.Builder addReservationId(String reservationId) {
            this.reservationId = reservationId;
            return this;
        }

        public VacationDay.Builder addSpecialEvent(SpecialEvent specialEvent) {
            this.specialEvent = specialEvent;
            return this;
        }

        public VacationDay.Builder addPublicTransportTicket(PublicTransportTicket publicTransportTicket) {
            this.publicTransportTicket = publicTransportTicket;
            return this;
        }

        public VacationDay build() {
            return new VacationDay(this);
        }
    }
}
