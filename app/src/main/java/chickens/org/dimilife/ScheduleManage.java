package chickens.org.dimilife;

/**
 * Created by JunHyeok on 2016. 12. 10..
 */
public class ScheduleManage {
    private static ScheduleManage ourInstance = new ScheduleManage();

    public static ScheduleManage getInstance() {
        return ourInstance;
    }

    private ScheduleManage() {
    }
}
