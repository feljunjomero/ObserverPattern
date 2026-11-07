import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CentralNewsAgency implements NewsAgency {
    private final List<Subscriber> subscribers;
    
    public CentralNewsAgency() {
        this.subscribers = new CopyOnWriteArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("[System] A new subscriber joined. Total: " + subscribers.size());
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("[System] A subscriber left. Total: " + subscribers.size());
    }

    @Override
    public void notifySubscribers(String newsCategory, String newsHeadline) {
        System.out.println("\n=== BREAKING NEWS PUBLISHED: [" + newsCategory + "] " + newsHeadline + " ===");
        for (Subscriber subscriber : subscribers) {
            subscriber.update(newsCategory, newsHeadline);
        }
    }

    // Business logic method to publish news
    public void publishBreakingNews(String category, String headline) {
        notifySubscribers(category, headline);
    }
}