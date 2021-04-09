package p06.textbook.exercise.ex18;

public class ShopService {
	private static ShopService shopService;
	
	private ShopService() {
		
	}

	public static ShopService getInstance() {
		if (shopService == null) {
			shopService = new ShopService();
		}
		
		return shopService;
	}

}
