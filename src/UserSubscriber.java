public class UserSubscriber implements Subscriber {
    private final String name;
    

    private final String preferredCategory; 

    public UserSubscriber(String name, String preferredCategory) {
        this.name = name;
        this.preferredCategory = preferredCategory;
    }

    @Override
    public void update(String newsCategory, String newsHeadline) {
        
        if (preferredCategory.equals("All") || preferredCategory.equals(newsCategory)) {
            System.out.println("> Notification to " + name + ": " + newsHeadline);
        }
    }
    
    public String getName() {
        return name;
    }
}