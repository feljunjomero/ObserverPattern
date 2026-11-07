public interface NewsAgency {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String newsCategory, String newsHeadline);
}
