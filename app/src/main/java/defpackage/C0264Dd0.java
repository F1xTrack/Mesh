package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Dd0 */
/* loaded from: classes2.dex */
public final class C0264Dd0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public int b;
    public List c;
    public List d;

    public static C0264Dd0 l() {
        C0264Dd0 c0264Dd0 = new C0264Dd0();
        c0264Dd0.c = Collections.emptyList();
        c0264Dd0.d = Collections.emptyList();
        return c0264Dd0;
    }

    public final Object clone() {
        C0264Dd0 c0264Dd0L = l();
        c0264Dd0L.m(k());
        return c0264Dd0L;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C0576Hd0 c0576Hd0K = k();
        if (c0576Hd0K.e()) {
            return c0576Hd0K;
        }
        throw new C7074sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r3, defpackage.DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = defpackage.C0576Hd0.h     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            Hd0 r1 = new Hd0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            Hd0 r4 = (defpackage.C0576Hd0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0264Dd0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((C0576Hd0) a00);
        return this;
    }

    public final C0576Hd0 k() {
        C0576Hd0 c0576Hd0 = new C0576Hd0(this);
        if ((this.b & 1) == 1) {
            this.c = Collections.unmodifiableList(this.c);
            this.b &= -2;
        }
        c0576Hd0.b = this.c;
        if ((this.b & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
            this.b &= -3;
        }
        c0576Hd0.c = this.d;
        return c0576Hd0;
    }

    public final void m(C0576Hd0 c0576Hd0) {
        if (c0576Hd0 == C0576Hd0.g) {
            return;
        }
        if (!c0576Hd0.b.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c = c0576Hd0.b;
                this.b &= -2;
            } else {
                if ((this.b & 1) != 1) {
                    this.c = new ArrayList(this.c);
                    this.b |= 1;
                }
                this.c.addAll(c0576Hd0.b);
            }
        }
        if (!c0576Hd0.c.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = c0576Hd0.c;
                this.b &= -3;
            } else {
                if ((this.b & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.b |= 2;
                }
                this.d.addAll(c0576Hd0.c);
            }
        }
        this.a = this.a.d(c0576Hd0.a);
    }
}
