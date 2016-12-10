package chickens.org.dimilife;

/**
 * Created by JunHyeok on 2016. 12. 10..
 */
public class UserManager {
    private int serial;
    private int isSnack;
    private int isStay;

    public int getIsStay() {
        return isStay;
    }

    public void setIsStay(int isStay) {
        this.isStay = isStay;
    }

    public int getIsSnack() {
        return isSnack;
    }

    public void setIsSnack(int isSnack) {
        this.isSnack = isSnack;
    }

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
