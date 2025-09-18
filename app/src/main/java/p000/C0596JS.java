package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.horcrux.svg.CustomFilter;
import java.util.HashMap;

/* renamed from: JS */
/* loaded from: classes.dex */
public final class C0596JS extends AbstractC6620pU {

    /* renamed from: c */
    public String f5521c;

    /* renamed from: d */
    public String f5522d;

    /* renamed from: e */
    public EnumC6746rU f5523e;

    @Override // p000.AbstractC6620pU
    /* renamed from: l */
    public final Bitmap mo4327l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapM23802m = AbstractC6620pU.m23802m(map, bitmap, this.f5521c);
        Bitmap bitmapM23802m2 = AbstractC6620pU.m23802m(map, bitmap, this.f5522d);
        if (this.f5523e == EnumC6746rU.MULTIPLY) {
            return CustomFilter.apply(bitmapM23802m, bitmapM23802m2, new C6730rE(27));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM23802m.getWidth(), bitmapM23802m.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapM23802m, 0.0f, 0.0f, paint);
        int iOrdinal = this.f5523e.ordinal();
        if (iOrdinal == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (iOrdinal == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (iOrdinal == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        } else if (iOrdinal == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        }
        canvas.drawBitmap(bitmapM23802m2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
