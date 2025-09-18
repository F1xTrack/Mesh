package p000;

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
public final class C8379Um1 implements InterfaceC9058d10 {

    /* renamed from: a */
    public ByteBuffer f12030a;

    /* renamed from: b */
    public WebpImage f12031b;

    /* renamed from: c */
    public final C7967Mo1 f12032c;

    /* renamed from: e */
    public final int[] f12034e;

    /* renamed from: f */
    public final C8587Ym1[] f12035f;

    /* renamed from: g */
    public final int f12036g;

    /* renamed from: h */
    public final int f12037h;

    /* renamed from: i */
    public final int f12038i;

    /* renamed from: j */
    public final Paint f12039j;

    /* renamed from: k */
    public final C8535Xm1 f12040k;

    /* renamed from: m */
    public final C8327Tm1 f12042m;

    /* renamed from: d */
    public int f12033d = -1;

    /* renamed from: l */
    public final Bitmap.Config f12041l = Bitmap.Config.ARGB_8888;

    public C8379Um1(C7967Mo1 c7967Mo1, WebpImage webpImage, ByteBuffer byteBuffer, int i, C8535Xm1 c8535Xm1) {
        this.f12032c = c7967Mo1;
        this.f12031b = webpImage;
        this.f12034e = webpImage.getFrameDurations();
        this.f12035f = new C8587Ym1[webpImage.getFrameCount()];
        for (int i2 = 0; i2 < this.f12031b.getFrameCount(); i2++) {
            this.f12035f[i2] = this.f12031b.getFrameInfo(i2);
            if (Log.isLoggable("WebpDecoder", 3)) {
                this.f12035f[i2].toString();
            }
        }
        this.f12040k = c8535Xm1;
        Paint paint = new Paint();
        this.f12039j = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f12042m = new C8327Tm1(this, c8535Xm1.f13969a == 4 ? webpImage.getFrameCount() : Math.max(5, 0));
        new ArrayList();
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Sample size must be >=0, not: "));
        }
        int iHighestOneBit = Integer.highestOneBit(i);
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f12030a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f12036g = iHighestOneBit;
        this.f12038i = this.f12031b.getWidth() / iHighestOneBit;
        this.f12037h = this.f12031b.getHeight() / iHighestOneBit;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x00ac -> B:96:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x00ae -> B:96:0x00b1). Please report as a decompilation issue!!! */
    @Override // p000.InterfaceC9058d10
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap mo8139a() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8379Um1.mo8139a():android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final void m8140b() {
        this.f12033d = (this.f12033d + 1) % this.f12031b.getFrameCount();
    }

    /* renamed from: c */
    public final void m8141c() {
        this.f12031b.dispose();
        this.f12031b = null;
        this.f12042m.evictAll();
        this.f12030a = null;
    }

    /* renamed from: d */
    public final void m8142d(Canvas canvas, C8587Ym1 c8587Ym1) {
        int i = this.f12036g;
        int i2 = c8587Ym1.f14516b;
        int i3 = c8587Ym1.f14517c;
        canvas.drawRect(i2 / i, i3 / i, (i2 + c8587Ym1.f14518d) / i, (i3 + c8587Ym1.f14519e) / i, this.f12039j);
    }

    /* renamed from: e */
    public final boolean m8143e(C8587Ym1 c8587Ym1) {
        if (c8587Ym1.f14516b == 0 && c8587Ym1.f14517c == 0) {
            if (c8587Ym1.f14518d == this.f12031b.getWidth()) {
                if (c8587Ym1.f14519e == this.f12031b.getHeight()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m8144f(int i) {
        if (i == 0) {
            return true;
        }
        C8587Ym1[] c8587Ym1Arr = this.f12035f;
        C8587Ym1 c8587Ym1 = c8587Ym1Arr[i];
        C8587Ym1 c8587Ym12 = c8587Ym1Arr[i - 1];
        if (c8587Ym1.f14521g || !m8143e(c8587Ym1)) {
            return c8587Ym12.f14522h && m8143e(c8587Ym12);
        }
        return true;
    }

    /* renamed from: g */
    public final void m8145g(Canvas canvas, int i) {
        C7967Mo1 c7967Mo1 = this.f12032c;
        C8587Ym1 c8587Ym1 = this.f12035f[i];
        int i2 = c8587Ym1.f14518d;
        int i3 = this.f12036g;
        int i4 = i2 / i3;
        int i5 = c8587Ym1.f14519e / i3;
        int i6 = c8587Ym1.f14516b / i3;
        int i7 = c8587Ym1.f14517c / i3;
        if (i4 == 0 || i5 == 0) {
            return;
        }
        WebpFrame frame = this.f12031b.getFrame(i);
        try {
            Bitmap bitmapMo318h = ((InterfaceC6443mi) c7967Mo1.f7362a).mo318h(i4, i5, this.f12041l);
            bitmapMo318h.eraseColor(0);
            bitmapMo318h.setDensity(canvas.getDensity());
            frame.renderFrame(i4, i5, bitmapMo318h);
            canvas.drawBitmap(bitmapMo318h, i6, i7, (Paint) null);
            ((InterfaceC6443mi) c7967Mo1.f7362a).mo319i(bitmapMo318h);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        } catch (Throwable th) {
            frame.dispose();
            throw th;
        }
        frame.dispose();
    }
}
