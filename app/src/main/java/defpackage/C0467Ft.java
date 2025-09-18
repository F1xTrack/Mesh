package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.yandex.runtime.image.ImageProvider;

/* renamed from: Ft */
/* loaded from: classes2.dex */
public final class C0467Ft extends ImageProvider {
    public final String a;
    public final /* synthetic */ C0545Gt b;

    public C0467Ft(C0545Gt c0545Gt, String str) {
        O90.f(str, "text");
        this.b = c0545Gt;
        this.a = str;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final String getId() {
        return "text_" + this.a;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final Bitmap getImage() {
        Paint paint = new Paint();
        paint.setTextSize(45.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        String str = this.a;
        float fMeasureText = paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float fAbs = (float) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        float f = 2;
        float fSqrt = (((float) Math.sqrt((fAbs * fAbs) + (fMeasureText * fMeasureText))) / f) + 9.0f;
        int i = (int) ((f * r7) + 0.5d);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        O90.e(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(this.b.m);
        float f2 = i / 2;
        canvas.drawCircle(f2, f2, 9.0f + fSqrt, paint2);
        paint2.setColor(-1);
        canvas.drawCircle(f2, f2, fSqrt, paint2);
        canvas.drawText(str, f2, f2 - ((fontMetrics.ascent + fontMetrics.descent) / f), paint);
        return bitmapCreateBitmap;
    }
}
