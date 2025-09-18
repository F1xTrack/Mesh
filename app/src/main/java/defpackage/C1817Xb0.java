package defpackage;

import android.os.SystemClock;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: Xb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1817Xb0 {
    public final ExecutorService a;
    public final InterfaceC1739Wb0 b;
    public final RunnableC1661Vb0 c = new RunnableC1661Vb0(this, 0);
    public final RunnableC1661Vb0 d = new RunnableC1661Vb0(this, 1);
    public EncodedImage e = null;
    public int f = 0;
    public int g = 1;
    public long h = 0;
    public long i = 0;

    public C1817Xb0(ExecutorService executorService, InterfaceC1739Wb0 interfaceC1739Wb0) {
        this.a = executorService;
        this.b = interfaceC1739Wb0;
    }

    public static boolean e(EncodedImage encodedImage, int i) {
        return AbstractC1516Tf.a(i) || AbstractC1516Tf.l(i, 4) || EncodedImage.isValid(encodedImage);
    }

    public final void a() {
        EncodedImage encodedImage;
        synchronized (this) {
            encodedImage = this.e;
            this.e = null;
            this.f = 0;
        }
        EncodedImage.closeSafely(encodedImage);
    }

    public final void b(long j) {
        RunnableC1661Vb0 runnableC1661Vb0 = this.d;
        if (j <= 0) {
            runnableC1661Vb0.run();
            return;
        }
        if (N22.a == null) {
            N22.a = Executors.newSingleThreadScheduledExecutor();
        }
        N22.a.schedule(runnableC1661Vb0, j, TimeUnit.MILLISECONDS);
    }

    public final void c() {
        boolean z;
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                z = true;
                if (this.g == 4) {
                    jMax = Math.max(this.i + 100, jUptimeMillis);
                    this.h = jUptimeMillis;
                    this.g = 2;
                } else {
                    this.g = 1;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            b(jMax - jUptimeMillis);
        }
    }

    public final void d() {
        boolean z;
        long j;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (e(this.e, this.f)) {
                    int iX = AbstractC8235ym.x(this.g);
                    if (iX != 0) {
                        if (iX == 2) {
                            this.g = 4;
                        }
                        z = false;
                        j = 0;
                    } else {
                        long jMax = Math.max(this.i + 100, jUptimeMillis);
                        this.h = jUptimeMillis;
                        this.g = 2;
                        z = true;
                        j = jMax;
                    }
                    if (z) {
                        b(j - jUptimeMillis);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(EncodedImage encodedImage, int i) {
        EncodedImage encodedImage2;
        if (!e(encodedImage, i)) {
            return false;
        }
        synchronized (this) {
            encodedImage2 = this.e;
            this.e = EncodedImage.cloneOrNull(encodedImage);
            this.f = i;
        }
        EncodedImage.closeSafely(encodedImage2);
        return true;
    }
}
