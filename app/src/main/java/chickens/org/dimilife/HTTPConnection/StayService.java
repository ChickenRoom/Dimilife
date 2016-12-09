package chickens.org.dimilife.HTTPConnection;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by JunHyeok on 2016. 12. 9..
 */

public interface StayService {
    @GET("/v1/user-students/search-stay")
    Call<List<Stay>> getStay (@Query("stay_date") String date);
}
