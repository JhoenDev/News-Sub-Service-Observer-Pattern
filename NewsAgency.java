import java.util.*;

public class NewsAgency {
	private final ServiceProvider service;

	public NewsAgency() {
		service = new ServiceProvider();

	}

	public void breakingNewsUpdate() {
		service.notifyUsers();
	}

	public SubscriberServiceProvider getService() {
		return service;
	}

}