package chickens.org.dimilife.HTTPConnection;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by JunHyeok on 2016. 12. 10..
 */

public interface GetUserInfo {
    @GET("/v1/user-students/{username}")
    Call<Users> getUsers (@Path("username") String username);
}
