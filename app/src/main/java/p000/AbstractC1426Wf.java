package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: Wf */
/* loaded from: classes.dex */
public abstract class AbstractC1426Wf implements InterfaceC1586ZC {

    /* renamed from: a */
    public final boolean f13310a;

    /* renamed from: b */
    public final ArrayList f13311b = new ArrayList(1);

    /* renamed from: c */
    public int f13312c;

    /* renamed from: d */
    public C3976eD f13313d;

    public AbstractC1426Wf(boolean z) {
        this.f13310a = z;
    }

    /* renamed from: a */
    public final void m8825a(int i) {
        C3976eD c3976eD = this.f13313d;
        int i2 = AbstractC7485Dh1.f2166a;
        for (int i3 = 0; i3 < this.f13312c; i3++) {
            InterfaceC9648hc1 interfaceC9648hc1 = (InterfaceC9648hc1) this.f13311b.get(i3);
            boolean z = this.f13310a;
            C0959PE c0959pe = (C0959PE) interfaceC9648hc1;
            synchronized (c0959pe) {
                C9367fQ0 c9367fQ0 = C0959PE.f8910n;
                if (z && !c3976eD.m17880c(8)) {
                    c0959pe.f8924h += i;
                }
            }
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: d */
    public final void mo5255d(InterfaceC9648hc1 interfaceC9648hc1) {
        interfaceC9648hc1.getClass();
        ArrayList arrayList = this.f13311b;
        if (arrayList.contains(interfaceC9648hc1)) {
            return;
        }
        arrayList.add(interfaceC9648hc1);
        this.f13312c++;
    }

    /* renamed from: e */
    public final void m8826e() {
        C3976eD c3976eD = this.f13313d;
        int i = AbstractC7485Dh1.f2166a;
        for (int i2 = 0; i2 < this.f13312c; i2++) {
            InterfaceC9648hc1 interfaceC9648hc1 = (InterfaceC9648hc1) this.f13311b.get(i2);
            boolean z = this.f13310a;
            C0959PE c0959pe = (C0959PE) interfaceC9648hc1;
            synchronized (c0959pe) {
                try {
                    C9367fQ0 c9367fQ0 = C0959PE.f8910n;
                    if (z && !c3976eD.m17880c(8)) {
                        YN1.m9281f(c0959pe.f8922f > 0);
                        c0959pe.f8919c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (jElapsedRealtime - c0959pe.f8923g);
                        c0959pe.f8925i += i3;
                        long j = c0959pe.f8926j;
                        long j2 = c0959pe.f8924h;
                        c0959pe.f8926j = j + j2;
                        if (i3 > 0) {
                            c0959pe.f8921e.m21962b((j2 * 8000.0f) / i3, (int) Math.sqrt(j2));
                            if (c0959pe.f8925i >= 2000 || c0959pe.f8926j >= 524288) {
                                c0959pe.f8927k = (long) c0959pe.f8921e.m21965e();
                            }
                            c0959pe.m6271c(i3, c0959pe.f8924h, c0959pe.f8927k);
                            c0959pe.f8923g = jElapsedRealtime;
                            c0959pe.f8924h = 0L;
                        }
                        c0959pe.f8922f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f13313d = null;
    }

    /* renamed from: g */
    public final void m8827g() {
        for (int i = 0; i < this.f13312c; i++) {
            ((InterfaceC9648hc1) this.f13311b.get(i)).getClass();
        }
    }

    /* renamed from: h */
    public final void m8828h(C3976eD c3976eD) {
        this.f13313d = c3976eD;
        for (int i = 0; i < this.f13312c; i++) {
            InterfaceC9648hc1 interfaceC9648hc1 = (InterfaceC9648hc1) this.f13311b.get(i);
            boolean z = this.f13310a;
            C0959PE c0959pe = (C0959PE) interfaceC9648hc1;
            synchronized (c0959pe) {
                try {
                    C9367fQ0 c9367fQ0 = C0959PE.f8910n;
                    if (z && !c3976eD.m17880c(8)) {
                        if (c0959pe.f8922f == 0) {
                            c0959pe.f8919c.getClass();
                            c0959pe.f8923g = SystemClock.elapsedRealtime();
                        }
                        c0959pe.f8922f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: l */
    public Map mo3793l() {
        return Collections.emptyMap();
    }
}
