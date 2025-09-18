package p000;

import android.os.SystemClock;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: Xb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8512Xb0 {

    /* renamed from: a */
    public final ExecutorService f13858a;

    /* renamed from: b */
    public final InterfaceC8460Wb0 f13859b;

    /* renamed from: c */
    public final RunnableC8408Vb0 f13860c = new RunnableC8408Vb0(this, 0);

    /* renamed from: d */
    public final RunnableC8408Vb0 f13861d = new RunnableC8408Vb0(this, 1);

    /* renamed from: e */
    public EncodedImage f13862e = null;

    /* renamed from: f */
    public int f13863f = 0;

    /* renamed from: g */
    public int f13864g = 1;

    /* renamed from: h */
    public long f13865h = 0;

    /* renamed from: i */
    public long f13866i = 0;

    public C8512Xb0(ExecutorService executorService, InterfaceC8460Wb0 interfaceC8460Wb0) {
        this.f13858a = executorService;
        this.f13859b = interfaceC8460Wb0;
    }

    /* renamed from: e */
    public static boolean m9092e(EncodedImage encodedImage, int i) {
        return AbstractC1237Tf.m7714a(i) || AbstractC1237Tf.m7716l(i, 4) || EncodedImage.isValid(encodedImage);
    }

    /* renamed from: a */
    public final void m9093a() {
        EncodedImage encodedImage;
        synchronized (this) {
            encodedImage = this.f13862e;
            this.f13862e = null;
            this.f13863f = 0;
        }
        EncodedImage.closeSafely(encodedImage);
    }

    /* renamed from: b */
    public final void m9094b(long j) {
        RunnableC8408Vb0 runnableC8408Vb0 = this.f13861d;
        if (j <= 0) {
            runnableC8408Vb0.run();
            return;
        }
        if (N22.f7476a == null) {
            N22.f7476a = Executors.newSingleThreadScheduledExecutor();
        }
        N22.f7476a.schedule(runnableC8408Vb0, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public final void m9095c() {
        boolean z;
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                z = true;
                if (this.f13864g == 4) {
                    jMax = Math.max(this.f13866i + 100, jUptimeMillis);
                    this.f13865h = jUptimeMillis;
                    this.f13864g = 2;
                } else {
                    this.f13864g = 1;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m9094b(jMax - jUptimeMillis);
        }
    }

    /* renamed from: d */
    public final void m9096d() {
        boolean z;
        long j;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (m9092e(this.f13862e, this.f13863f)) {
                    int iM26247x = AbstractC7222ym.m26247x(this.f13864g);
                    if (iM26247x != 0) {
                        if (iM26247x == 2) {
                            this.f13864g = 4;
                        }
                        z = false;
                        j = 0;
                    } else {
                        long jMax = Math.max(this.f13866i + 100, jUptimeMillis);
                        this.f13865h = jUptimeMillis;
                        this.f13864g = 2;
                        z = true;
                        j = jMax;
                    }
                    if (z) {
                        m9094b(j - jUptimeMillis);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final boolean m9097f(EncodedImage encodedImage, int i) {
        EncodedImage encodedImage2;
        if (!m9092e(encodedImage, i)) {
            return false;
        }
        synchronized (this) {
            encodedImage2 = this.f13862e;
            this.f13862e = EncodedImage.cloneOrNull(encodedImage);
            this.f13863f = i;
        }
        EncodedImage.closeSafely(encodedImage2);
        return true;
    }
}
