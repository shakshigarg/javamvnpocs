//package src.models;
//
//import com.flipkart.ugc.dao.badges.UserBadgeDataAccess;
//import com.flipkart.ugc.fdp.EventHandler;
//
//public class CategoryBadgingEventHandler extends EventHandler<CategoryBadgeEvent> {
//    private final UserBadgeDataAccess userBadgeDataAccess;
//
//    public CategoryBadgingEventHandler(UserBadgeDataAccess userBadgeDataAccess) {
//        this.userBadgeDataAccess = userBadgeDataAccess;
//    }
//
//    @Override
//    public boolean canHandle(FDPEvent event) {
//        //This key is being sent from fdp job param
//        return "CategoryBadge".equalsIgnoreCase(event.getEvent());
//    }
//
//    @Override
//    public void handle(CategoryBadgeEvent event) {
//        //TODO: [Badging] implement
//        userBadgeDataAccess.storeCategoryUserBadges(event.getCategory(), event.getAccountIds());
//    }
//}
