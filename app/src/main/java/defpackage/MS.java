package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class MS extends AbstractC6466pU {
    public ReadableArray c;

    @Override // defpackage.AbstractC6466pU
    public final Bitmap l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            String string = this.c.getString(i);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : (Bitmap) map.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return bitmapCreateBitmap;
    }
}
