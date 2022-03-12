import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

public class Database {
    JsonObject restaurant;

    public Database(JsonObject data) {
        this.restaurant = data;
    }

    public JsonObject getRestaurant(String name) {
        JsonArray restaurants = (JsonArray) this.restaurant.get("restaurants");
        JsonObject found = new JsonObject();
        for (Object o : restaurants) {
            JsonObject restaurant = (JsonObject) o;
            if (name.equals(restaurant.get("name"))) {
                found = restaurant;
                break;
            }
        }
        return found;
    }


    public double getAvgReviews(String name) {
        restaurant = getRestaurant(name);
        JsonArray reviews = (JsonArray) restaurant.get("reviews");
        int reviewCount = 0;
        double totalRate = 0.0;
        for (Object p : reviews) {
            reviewCount += 1;
            JsonObject review = (JsonObject) p;
            totalRate += Double.parseDouble(review.get("rating").toString());
        }
        return (totalRate / reviewCount);
    }
}

