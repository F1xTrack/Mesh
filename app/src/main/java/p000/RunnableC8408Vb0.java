package p000;

import android.os.SystemClock;
import com.facebook.imagepipeline.image.EncodedImage;

/* renamed from: Vb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8408Vb0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f12629a;

    /* renamed from: b */
    public final /* synthetic */ C8512Xb0 f12630b;

    public /* synthetic */ RunnableC8408Vb0(C8512Xb0 c8512Xb0, int i) {
        this.f12629a = i;
        this.f12630b = c8512Xb0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncodedImage encodedImage;
        int i;
        switch (this.f12629a) {
            case 0:
                C8512Xb0 c8512Xb0 = this.f12630b;
                c8512Xb0.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                synchronized (c8512Xb0) {
                    encodedImage = c8512Xb0.f13862e;
                    i = c8512Xb0.f13863f;
                    c8512Xb0.f13862e = null;
                    c8512Xb0.f13863f = 0;
                    c8512Xb0.f13864g = 3;
                    c8512Xb0.f13866i = jUptimeMillis;
                }
                try {
                    if (C8512Xb0.m9092e(encodedImage, i)) {
                        c8512Xb0.f13859b.mo5831v(encodedImage, i);
                    }
                    return;
                } finally {
                    EncodedImage.closeSafely(encodedImage);
                    c8512Xb0.m9095c();
                }
            default:
                C8512Xb0 c8512Xb02 = this.f12630b;
                c8512Xb02.f13858a.execute(c8512Xb02.f13860c);
                return;
        }
    }
}
