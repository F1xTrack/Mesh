package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* renamed from: MS */
/* loaded from: classes.dex */
public final class C0784MS extends AbstractC6620pU {

    /* renamed from: c */
    public ReadableArray f7169c;

    @Override // p000.AbstractC6620pU
    /* renamed from: l */
    public final Bitmap mo4327l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = this.f7169c.size();
        for (int i = 0; i < size; i++) {
            String string = this.f7169c.getString(i);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : (Bitmap) map.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return bitmapCreateBitmap;
    }
}
