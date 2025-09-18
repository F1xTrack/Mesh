package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.horcrux.svg.CustomFilter;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class JS extends AbstractC6466pU {
    public String c;
    public String d;
    public EnumC6847rU e;

    @Override // defpackage.AbstractC6466pU
    public final Bitmap l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapM = AbstractC6466pU.m(map, bitmap, this.c);
        Bitmap bitmapM2 = AbstractC6466pU.m(map, bitmap, this.d);
        if (this.e == EnumC6847rU.MULTIPLY) {
            return CustomFilter.apply(bitmapM, bitmapM2, new C6799rE(27));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM.getWidth(), bitmapM.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapM, 0.0f, 0.0f, paint);
        int iOrdinal = this.e.ordinal();
        if (iOrdinal == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (iOrdinal == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (iOrdinal == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        } else if (iOrdinal == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        }
        canvas.drawBitmap(bitmapM2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
