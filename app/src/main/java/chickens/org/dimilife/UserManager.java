package chickens.org.dimilife;

/**
 * Created by JunHyeok on 2016. 12. 10..
 */
public class UserManager {
    private int serial;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    private static UserManager ourInstance = new UserManager();

    public static UserManager getInstance() {
        return ourInstance;
    }

    private UserManager() {
    }
}
