import java.util.*;

public class ServiceProvider {
	private final List<Subscriber> subscribers;

	public ServiceProvider() {
		subscribers = new ArrayList<>();
	}

	public void addSubcriber(Subscriber user) {
		subscribers.add(user);
	}

	public void removeSubcriber(Subscriber user) {
		subscribers.remove(user);
	}

	public void notifyUsers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.notifySubscriber();
		}
	}
}