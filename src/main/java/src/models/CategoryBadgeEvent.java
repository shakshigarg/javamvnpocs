package src.models;

import java.util.List;

public class CategoryBadgeEvent extends BadgingEvent {
    private final String category;
    private final List<String> accountIds;

    public CategoryBadgeEvent(String event, UGCBadges ugcBadges, String category, List<String> accountIds) {
        super(event, ugcBadges);
        this.category = category;
        this.accountIds = accountIds;
    }


    public String getCategory() {
        return category;
    }

    public List<String> getAccountIds() {
        return accountIds;
    }

}
