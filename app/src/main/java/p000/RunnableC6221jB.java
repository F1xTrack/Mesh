package p000;

import java.lang.ref.WeakReference;

/* renamed from: jB */
/* loaded from: classes2.dex */
public final class RunnableC6221jB implements Runnable {

    /* renamed from: a */
    public final WeakReference f34959a;

    /* renamed from: d */
    public final float f34962d;

    /* renamed from: e */
    public final float f34963e;

    /* renamed from: f */
    public final float f34964f;

    /* renamed from: g */
    public final float f34965g;

    /* renamed from: c */
    public final long f34961c = System.currentTimeMillis();

    /* renamed from: b */
    public final long f34960b = 200;

    public RunnableC6221jB(AbstractC6284kB abstractC6284kB, float f, float f2, float f3, float f4) {
        this.f34959a = new WeakReference(abstractC6284kB);
        this.f34962d = f;
        this.f34963e = f2;
        this.f34964f = f3;
        this.f34965g = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC6284kB abstractC6284kB = (AbstractC6284kB) this.f34959a.get();
        if (abstractC6284kB == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f34961c;
        long j = this.f34960b;
        float fMin = Math.min(j, jCurrentTimeMillis);
        float f = j;
        float fM4671a = KY1.m4671a(fMin, this.f34963e, f);
        if (fMin >= f) {
            abstractC6284kB.setImageToWrapCropBounds(true);
        } else {
            abstractC6284kB.m22164i(this.f34962d + fM4671a, this.f34964f, this.f34965g);
            abstractC6284kB.post(this);
        }
    }
}
