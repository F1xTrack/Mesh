package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class NS extends AbstractC6466pU {
    public String c;
    public C8372zU0 d;
    public C8372zU0 e;

    @Override // defpackage.AbstractC6466pU
    public final Bitmap l(HashMap map, Bitmap bitmap) {
        Bitmap bitmapM = AbstractC6466pU.m(map, bitmap, this.c);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        C8372zU0 c8372zU0 = this.d;
        float fRelativeOnWidth = c8372zU0 != null ? (float) relativeOnWidth(c8372zU0) : 0.0f;
        C8372zU0 c8372zU02 = this.e;
        RectF rectF = new RectF(0.0f, 0.0f, fRelativeOnWidth, c8372zU02 != null ? (float) relativeOnHeight(c8372zU02) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        canvas.drawBitmap(bitmapM, rectF.width(), rectF.height(), (Paint) null);
        return bitmapCreateBitmap;
    }
}
