package defpackage;

import android.graphics.RectF;
import java.lang.ref.WeakReference;

/* renamed from: iB */
/* loaded from: classes2.dex */
public final class RunnableC4296iB implements Runnable {
    public final WeakReference a;
    public final long b;
    public final long c = System.currentTimeMillis();
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final boolean j;

    public RunnableC4296iB(AbstractC5454kB abstractC5454kB, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.a = new WeakReference(abstractC5454kB);
        this.b = j;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5454kB abstractC5454kB = (AbstractC5454kB) this.a.get();
        if (abstractC5454kB == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
        long j = this.b;
        float fMin = Math.min(j, jCurrentTimeMillis);
        float f = j;
        float f2 = (fMin / f) - 1.0f;
        float f3 = (f2 * f2 * f2) + 1.0f;
        float f4 = (this.f * f3) + 0.0f;
        float f5 = (f3 * this.g) + 0.0f;
        float fA = KY1.a(fMin, this.i, f);
        if (fMin < f) {
            float[] fArr = abstractC5454kB.e;
            abstractC5454kB.d(f4 - (fArr[0] - this.d), f5 - (fArr[1] - this.e));
            if (!this.j) {
                float f6 = this.h + fA;
                RectF rectF = abstractC5454kB.s;
                abstractC5454kB.i(f6, rectF.centerX(), rectF.centerY());
            }
            if (abstractC5454kB.g(abstractC5454kB.d)) {
                return;
            }
            abstractC5454kB.post(this);
        }
    }
}
