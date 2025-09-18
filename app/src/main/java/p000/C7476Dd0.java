package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Dd0 */
/* loaded from: classes2.dex */
public final class C7476Dd0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public int f2089b;

    /* renamed from: c */
    public List f2090c;

    /* renamed from: d */
    public List f2091d;

    /* renamed from: l */
    public static C7476Dd0 m1736l() {
        C7476Dd0 c7476Dd0 = new C7476Dd0();
        c7476Dd0.f2090c = Collections.emptyList();
        c7476Dd0.f2091d = Collections.emptyList();
        return c7476Dd0;
    }

    public final Object clone() {
        C7476Dd0 c7476Dd0M1736l = m1736l();
        c7476Dd0M1736l.m1738m(m1737k());
        return c7476Dd0M1736l;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C7684Hd0 c7684Hd0M1737k = m1737k();
        if (c7684Hd0M1737k.mo131e()) {
            return c7684Hd0M1737k;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r3, p000.C0217DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = p000.C7684Hd0.f4380h     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            Hd0 r1 = new Hd0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m1738m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            Hd0 r4 = (p000.C7684Hd0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m1738m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7476Dd0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m1738m((C7684Hd0) a00);
        return this;
    }

    /* renamed from: k */
    public final C7684Hd0 m1737k() {
        C7684Hd0 c7684Hd0 = new C7684Hd0(this);
        if ((this.f2089b & 1) == 1) {
            this.f2090c = Collections.unmodifiableList(this.f2090c);
            this.f2089b &= -2;
        }
        c7684Hd0.f4382b = this.f2090c;
        if ((this.f2089b & 2) == 2) {
            this.f2091d = Collections.unmodifiableList(this.f2091d);
            this.f2089b &= -3;
        }
        c7684Hd0.f4383c = this.f2091d;
        return c7684Hd0;
    }

    /* renamed from: m */
    public final void m1738m(C7684Hd0 c7684Hd0) {
        if (c7684Hd0 == C7684Hd0.f4379g) {
            return;
        }
        if (!c7684Hd0.f4382b.isEmpty()) {
            if (this.f2090c.isEmpty()) {
                this.f2090c = c7684Hd0.f4382b;
                this.f2089b &= -2;
            } else {
                if ((this.f2089b & 1) != 1) {
                    this.f2090c = new ArrayList(this.f2090c);
                    this.f2089b |= 1;
                }
                this.f2090c.addAll(c7684Hd0.f4382b);
            }
        }
        if (!c7684Hd0.f4383c.isEmpty()) {
            if (this.f2091d.isEmpty()) {
                this.f2091d = c7684Hd0.f4383c;
                this.f2089b &= -3;
            } else {
                if ((this.f2089b & 2) != 2) {
                    this.f2091d = new ArrayList(this.f2091d);
                    this.f2089b |= 2;
                }
                this.f2091d.addAll(c7684Hd0.f4383c);
            }
        }
        this.f41281a = this.f41281a.m3573d(c7684Hd0.f4381a);
    }
}
