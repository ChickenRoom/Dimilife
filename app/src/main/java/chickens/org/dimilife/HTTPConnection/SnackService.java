package chickens.org.dimilife.HTTPConnection;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by JunHyeok on 2016. 12. 9..
 */

public interface SnackService {
    @GET("v1/snack-recipients/search")
    Call<List<Snack>> getSnack (@Query("year") int year,
                                @Query("month") int month);
}
