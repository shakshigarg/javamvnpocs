package src.models;

// WHAT DOES THIS MEAN AND WHEN WILL IT GET USED
public class BadgingEvent extends FDPEvent {

    public BadgingEvent(String event, UGCBadges ugcBadges) {
        super(event);
        this.ugcBadges = ugcBadges;
    }

    public UGCBadges getUgcBadges() {
        return ugcBadges;
    }

    private UGCBadges ugcBadges;

}
