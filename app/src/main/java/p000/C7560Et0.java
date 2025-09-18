package p000;

import androidx.lifecycle.AbstractC1743b;

/* renamed from: Et0 */
/* loaded from: classes.dex */
public class C7560Et0 extends AbstractC1743b {
    @Override // androidx.lifecycle.AbstractC1743b
    /* renamed from: j */
    public void mo2439j(Object obj) {
        AbstractC1743b.m10130a("setValue");
        this.f16322g++;
        this.f16320e = obj;
        m10132c(null);
    }

    /* renamed from: k */
    public final void m2440k(Object obj) {
        boolean z;
        synchronized (this.f16316a) {
            z = this.f16321f == AbstractC1743b.f16315k;
            this.f16321f = obj;
        }
        if (z) {
            C4223i8.m18971c().m18972d(this.f16325j);
        }
    }
}
