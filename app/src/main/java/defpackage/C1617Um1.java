package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import com.bumptech.glide.integration.webp.WebpFrame;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: Um1 */
/* loaded from: classes.dex */
public final class C1617Um1 implements InterfaceC3310d10 {
    public ByteBuffer a;
    public WebpImage b;
    public final C0999Mo1 c;
    public final int[] e;
    public final C1929Ym1[] f;
    public final int g;
    public final int h;
    public final int i;
    public final Paint j;
    public final C1851Xm1 k;
    public final C1539Tm1 m;
    public int d = -1;
    public final Bitmap.Config l = Bitmap.Config.ARGB_8888;

    public C1617Um1(C0999Mo1 c0999Mo1, WebpImage webpImage, ByteBuffer byteBuffer, int i, C1851Xm1 c1851Xm1) {
        this.c = c0999Mo1;
        this.b = webpImage;
        this.e = webpImage.getFrameDurations();
        this.f = new C1929Ym1[webpImage.getFrameCount()];
        for (int i2 = 0; i2 < this.b.getFrameCount(); i2++) {
            this.f[i2] = this.b.getFrameInfo(i2);
            if (Log.isLoggable("WebpDecoder", 3)) {
                this.f[i2].toString();
            }
        }
        this.k = c1851Xm1;
        Paint paint = new Paint();
        this.j = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.m = new C1539Tm1(this, c1851Xm1.a == 4 ? webpImage.getFrameCount() : Math.max(5, 0));
        new ArrayList();
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Sample size must be >=0, not: "));
        }
        int iHighestOneBit = Integer.highestOneBit(i);
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.g = iHighestOneBit;
        this.i = this.b.getWidth() / iHighestOneBit;
        this.h = this.b.getHeight() / iHighestOneBit;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x00ac -> B:96:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x00ae -> B:96:0x00b1). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC3310d10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1617Um1.a():android.graphics.Bitmap");
    }

    public final void b() {
        this.d = (this.d + 1) % this.b.getFrameCount();
    }

    public final void c() {
        this.b.dispose();
        this.b = null;
        this.m.evictAll();
        this.a = null;
    }

    public final void d(Canvas canvas, C1929Ym1 c1929Ym1) {
        int i = this.g;
        int i2 = c1929Ym1.b;
        int i3 = c1929Ym1.c;
        canvas.drawRect(i2 / i, i3 / i, (i2 + c1929Ym1.d) / i, (i3 + c1929Ym1.e) / i, this.j);
    }

    public final boolean e(C1929Ym1 c1929Ym1) {
        if (c1929Ym1.b == 0 && c1929Ym1.c == 0) {
            if (c1929Ym1.d == this.b.getWidth()) {
                if (c1929Ym1.e == this.b.getHeight()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(int i) {
        if (i == 0) {
            return true;
        }
        C1929Ym1[] c1929Ym1Arr = this.f;
        C1929Ym1 c1929Ym1 = c1929Ym1Arr[i];
        C1929Ym1 c1929Ym12 = c1929Ym1Arr[i - 1];
        if (c1929Ym1.g || !e(c1929Ym1)) {
            return c1929Ym12.h && e(c1929Ym12);
        }
        return true;
    }

    public final void g(Canvas canvas, int i) {
        C0999Mo1 c0999Mo1 = this.c;
        C1929Ym1 c1929Ym1 = this.f[i];
        int i2 = c1929Ym1.d;
        int i3 = this.g;
        int i4 = i2 / i3;
        int i5 = c1929Ym1.e / i3;
        int i6 = c1929Ym1.b / i3;
        int i7 = c1929Ym1.c / i3;
        if (i4 == 0 || i5 == 0) {
            return;
        }
        WebpFrame frame = this.b.getFrame(i);
        try {
            Bitmap bitmapH = ((InterfaceC5935mi) c0999Mo1.a).h(i4, i5, this.l);
            bitmapH.eraseColor(0);
            bitmapH.setDensity(canvas.getDensity());
            frame.renderFrame(i4, i5, bitmapH);
            canvas.drawBitmap(bitmapH, i6, i7, (Paint) null);
            ((InterfaceC5935mi) c0999Mo1.a).i(bitmapH);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        } catch (Throwable th) {
            frame.dispose();
            throw th;
        }
        frame.dispose();
    }
}
