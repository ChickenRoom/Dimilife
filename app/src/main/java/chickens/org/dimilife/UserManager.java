package chickens.org.dimilife;

/**
 * Created by JunHyeok on 2016. 12. 10..
 */
public class UserManager {
    private static UserManager ourInstance = new UserManager();

    public static UserManager getInstance() {
        return ourInstance;
    }

    private UserManager() {
    }
}
