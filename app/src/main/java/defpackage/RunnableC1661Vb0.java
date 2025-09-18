package defpackage;

import android.os.SystemClock;
import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: Vb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1661Vb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1817Xb0 b;

    public /* synthetic */ RunnableC1661Vb0(C1817Xb0 c1817Xb0, int i) {
        this.a = i;
        this.b = c1817Xb0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncodedImage encodedImage;
        int i;
        switch (this.a) {
            case 0:
                C1817Xb0 c1817Xb0 = this.b;
                c1817Xb0.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                synchronized (c1817Xb0) {
                    encodedImage = c1817Xb0.e;
                    i = c1817Xb0.f;
                    c1817Xb0.e = null;
                    c1817Xb0.f = 0;
                    c1817Xb0.g = 3;
                    c1817Xb0.i = jUptimeMillis;
                }
                try {
                    if (C1817Xb0.e(encodedImage, i)) {
                        c1817Xb0.b.v(encodedImage, i);
                    }
                    return;
                } finally {
                    EncodedImage.closeSafely(encodedImage);
                    c1817Xb0.c();
                }
            default:
                C1817Xb0 c1817Xb02 = this.b;
                c1817Xb02.a.execute(c1817Xb02.c);
                return;
        }
    }
}
