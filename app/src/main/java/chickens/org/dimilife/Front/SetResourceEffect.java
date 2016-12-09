package chickens.org.dimilife.Front;

import android.graphics.Bitmap;
import android.graphics.Color;

/**
 * Created by songhyemin on 2016. 12. 9..
 */

public class SetResourceEffect {
    public Bitmap setBrightness(Bitmap image, int value){
        int width = image.getWidth();
        int height = image.getHeight();
        Bitmap imageOut = Bitmap.createBitmap(width, height, image.getConfig());

        int A, R, G, B; // color information
        int pixel;


        for(int x = 0 ; x < width ; x++){
            for(int y = 0 ; y < height ; y++){
                pixel = image.getPixel(x, y);
                A = Color.alpha(pixel);
                R = Color.red(pixel);
                G = Color.green(pixel);
                B = Color.blue(pixel);

                R += value;
                if(R > 255) R = 255;
                else if(R < 0) R = 0;

                G += value;
                if(G > 255) G = 255;
                else if(R < 0) G = 0;

                B += value;
                if(B > 255) B = 255;
                else if(B < 0) B = 0;

                imageOut.setPixel(x, y, Color.argb(A, R, G, B));
            }

        }
        return imageOut;

    }


}
