package chickens.org.dimilife.Widget;

/**
 * Created by JunHyeok on 2016. 12. 9..
 */

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by JunHyeok on 2016. 11. 21..
 */

public class NotoBoldButton extends Button {
    public NotoBoldButton(Context context) {
        super(context);
        setType(context);
    }

    public NotoBoldButton(Context context, AttributeSet attrs){
        super(context, attrs);
        setType(context);
    }

    public NotoBoldButton(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
        setType(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public NotoBoldButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setType(context);
    }

    private void setType(Context context) {
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"NotoSans-Bold.ttf"));
    }
}