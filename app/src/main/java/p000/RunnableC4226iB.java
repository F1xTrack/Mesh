package p000;

import android.graphics.RectF;
import java.lang.ref.WeakReference;

/* renamed from: iB */
/* loaded from: classes2.dex */
public final class RunnableC4226iB implements Runnable {

    /* renamed from: a */
    public final WeakReference f28873a;

    /* renamed from: b */
    public final long f28874b;

    /* renamed from: c */
    public final long f28875c = System.currentTimeMillis();

    /* renamed from: d */
    public final float f28876d;

    /* renamed from: e */
    public final float f28877e;

    /* renamed from: f */
    public final float f28878f;

    /* renamed from: g */
    public final float f28879g;

    /* renamed from: h */
    public final float f28880h;

    /* renamed from: i */
    public final float f28881i;

    /* renamed from: j */
    public final boolean f28882j;

    public RunnableC4226iB(AbstractC6284kB abstractC6284kB, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.f28873a = new WeakReference(abstractC6284kB);
        this.f28874b = j;
        this.f28876d = f;
        this.f28877e = f2;
        this.f28878f = f3;
        this.f28879g = f4;
        this.f28880h = f5;
        this.f28881i = f6;
        this.f28882j = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC6284kB abstractC6284kB = (AbstractC6284kB) this.f28873a.get();
        if (abstractC6284kB == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f28875c;
        long j = this.f28874b;
        float fMin = Math.min(j, jCurrentTimeMillis);
        float f = j;
        float f2 = (fMin / f) - 1.0f;
        float f3 = (f2 * f2 * f2) + 1.0f;
        float f4 = (this.f28878f * f3) + 0.0f;
        float f5 = (f3 * this.f28879g) + 0.0f;
        float fM4671a = KY1.m4671a(fMin, this.f28881i, f);
        if (fMin < f) {
            float[] fArr = abstractC6284kB.f41758e;
            abstractC6284kB.m24433d(f4 - (fArr[0] - this.f28876d), f5 - (fArr[1] - this.f28877e));
            if (!this.f28882j) {
                float f6 = this.f28880h + fM4671a;
                RectF rectF = abstractC6284kB.f36338s;
                abstractC6284kB.m22164i(f6, rectF.centerX(), rectF.centerY());
            }
            if (abstractC6284kB.m22162g(abstractC6284kB.f41757d)) {
                return;
            }
            abstractC6284kB.post(this);
        }
    }
}
