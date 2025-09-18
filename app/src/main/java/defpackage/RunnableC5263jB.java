package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: jB */
/* loaded from: classes2.dex */
public final class RunnableC5263jB implements Runnable {
    public final WeakReference a;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final long c = System.currentTimeMillis();
    public final long b = 200;

    public RunnableC5263jB(AbstractC5454kB abstractC5454kB, float f, float f2, float f3, float f4) {
        this.a = new WeakReference(abstractC5454kB);
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
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
        float fA = KY1.a(fMin, this.e, f);
        if (fMin >= f) {
            abstractC5454kB.setImageToWrapCropBounds(true);
        } else {
            abstractC5454kB.i(this.d + fA, this.f, this.g);
            abstractC5454kB.post(this);
        }
    }
}
