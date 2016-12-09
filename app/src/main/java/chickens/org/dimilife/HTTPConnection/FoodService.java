package chickens.org.dimilife.HTTPConnection;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JunHyeok on 2016. 12. 9..
 */

public interface FoodService {
    @GET("/pages/dimibob_getdata.php?")
    Call<Food> getFood();
}
