package src.models;

import java.util.List;

// WHEN WILL IT GET USED

public class FkBadgingEvent extends BadgingEvent {

    private int tier;
    private List<String> accountIds;

    public FkBadgingEvent(String event, UGCBadges ugcBadges, int category, List<String> accountIds) {
        super(event, ugcBadges);
        this.tier = tier;
        this.accountIds = accountIds;
    }

    public int getTier() {
        return tier;
    }

    public List<String> getAccountIds() {
        return accountIds;
    }
}
