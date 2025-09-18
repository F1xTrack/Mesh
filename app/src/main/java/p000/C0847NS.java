package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.HashMap;

/* renamed from: NS */
/* loaded from: classes.dex */
public final class C0847NS extends AbstractC6620pU {

    /* renamed from: c */
    public String f7789c;

    /* renamed from: d */
    public C11931zU0 f7790d;

    /* renamed from: e */
    public C11931zU0 f7791e;

    @Override // p000.AbstractC6620pU
    /* renamed from: l */
    public final Bitmap mo4327l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapM23802m = AbstractC6620pU.m23802m(map, bitmap, this.f7789c);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        C11931zU0 c11931zU0 = this.f7790d;
        float fRelativeOnWidth = c11931zU0 != null ? (float) relativeOnWidth(c11931zU0) : 0.0f;
        C11931zU0 c11931zU02 = this.f7791e;
        RectF rectF = new RectF(0.0f, 0.0f, fRelativeOnWidth, c11931zU02 != null ? (float) relativeOnHeight(c11931zU02) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        canvas.drawBitmap(bitmapM23802m, rectF.width(), rectF.height(), (Paint) null);
        return bitmapCreateBitmap;
    }
}
