package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: Wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1750Wf implements ZC {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public C3538eD d;

    public AbstractC1750Wf(boolean z) {
        this.a = z;
    }

    public final void a(int i) {
        C3538eD c3538eD = this.d;
        int i2 = AbstractC0277Dh1.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            InterfaceC4188hc1 interfaceC4188hc1 = (InterfaceC4188hc1) this.b.get(i3);
            boolean z = this.a;
            PE pe = (PE) interfaceC4188hc1;
            synchronized (pe) {
                C3769fQ0 c3769fQ0 = PE.n;
                if (z && !c3538eD.c(8)) {
                    pe.h += i;
                }
            }
        }
    }

    @Override // defpackage.ZC
    public final void d(InterfaceC4188hc1 interfaceC4188hc1) {
        interfaceC4188hc1.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(interfaceC4188hc1)) {
            return;
        }
        arrayList.add(interfaceC4188hc1);
        this.c++;
    }

    public final void e() {
        C3538eD c3538eD = this.d;
        int i = AbstractC0277Dh1.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            InterfaceC4188hc1 interfaceC4188hc1 = (InterfaceC4188hc1) this.b.get(i2);
            boolean z = this.a;
            PE pe = (PE) interfaceC4188hc1;
            synchronized (pe) {
                try {
                    C3769fQ0 c3769fQ0 = PE.n;
                    if (z && !c3538eD.c(8)) {
                        YN1.f(pe.f > 0);
                        pe.c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (jElapsedRealtime - pe.g);
                        pe.i += i3;
                        long j = pe.j;
                        long j2 = pe.h;
                        pe.j = j + j2;
                        if (i3 > 0) {
                            pe.e.b((j2 * 8000.0f) / i3, (int) Math.sqrt(j2));
                            if (pe.i >= 2000 || pe.j >= 524288) {
                                pe.k = (long) pe.e.e();
                            }
                            pe.c(i3, pe.h, pe.k);
                            pe.g = jElapsedRealtime;
                            pe.h = 0L;
                        }
                        pe.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = null;
    }

    public final void g() {
        for (int i = 0; i < this.c; i++) {
            ((InterfaceC4188hc1) this.b.get(i)).getClass();
        }
    }

    public final void h(C3538eD c3538eD) {
        this.d = c3538eD;
        for (int i = 0; i < this.c; i++) {
            InterfaceC4188hc1 interfaceC4188hc1 = (InterfaceC4188hc1) this.b.get(i);
            boolean z = this.a;
            PE pe = (PE) interfaceC4188hc1;
            synchronized (pe) {
                try {
                    C3769fQ0 c3769fQ0 = PE.n;
                    if (z && !c3538eD.c(8)) {
                        if (pe.f == 0) {
                            pe.c.getClass();
                            pe.g = SystemClock.elapsedRealtime();
                        }
                        pe.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.ZC
    public Map l() {
        return Collections.emptyMap();
    }
}
