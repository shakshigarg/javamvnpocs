package src.models;

public abstract class FDPEvent {

    private final String event;

    protected FDPEvent(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

}
