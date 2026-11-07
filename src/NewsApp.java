public class NewsApp {
    public static void main(String[] args) {
        CentralNewsAgency agency = new CentralNewsAgency();

        UserSubscriber alice = new UserSubscriber("Alice", "Technology");
        UserSubscriber bob = new UserSubscriber("Bob", "Sports");
        UserSubscriber charlie = new UserSubscriber("Charlie", "All");

        agency.subscribe(alice);
        agency.subscribe(bob);
        agency.subscribe(charlie);


        agency.publishBreakingNews("Technology", "New AI model breaks records!");
        agency.publishBreakingNews("Sports", "Local team wins the championship!");

        agency.unsubscribe(bob);

        agency.publishBreakingNews("Sports", "Trade deadline updates...");
    }
}