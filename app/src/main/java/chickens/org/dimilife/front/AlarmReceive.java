package chickens.org.dimilife.front;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import chickens.org.dimilife.LoginActivity;

/**
 * Created by JunHyeok on 2016. 12. 10..
 */

public class AlarmReceive extends BroadcastReceiver {

    String INTENT_ACTION = Intent.ACTION_BOOT_COMPLETED;
    final String TAG = "BOOT_START_SERVICE";

    @Override
    public void onReceive(Context context, Intent intent) {//알람 시간이 되었을때 onReceive를 호출함

        NotificationManager nm = (NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);
//NotificationManager 안드로이드 상태바에 메세지를 던지기위한 서비스 불러오고

        Intent intentActivity = new Intent(context, LoginActivity.class); //그메세지를 클릭했을때 불러올엑티비티를 설정함
        intentActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_SINGLE_TOP);//플레그부분은 옵션인데 나도 자세하게 몰르겠음
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intentActivity, PendingIntent.FLAG_UPDATE_CURRENT);
        String ticker = "ticker";//여긴 알림바에 등록될 글이랑 타이틀 적는곳.
        String title = "title";
        String text = "알림";
        // Create Notification Object

        Notification.Builder builder = new Notification.Builder(context).setContentIntent(pendingIntent).setSmallIcon(android.R.drawable.ic_input_add).setContentTitle(title).setContentText(text)
                .setTicker(ticker);
        Notification notification = builder.build();
        nm.notify(1, notification);//노티피에 1주는건 왜지??? 그것도 모르겠음.

    }

}
