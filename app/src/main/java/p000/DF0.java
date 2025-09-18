package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class DF0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f1917d;

    /* renamed from: e */
    public int f1918e;

    /* renamed from: f */
    public int f1919f;

    /* renamed from: g */
    public boolean f1920g;

    /* renamed from: h */
    public EF0 f1921h;

    /* renamed from: i */
    public List f1922i;

    /* renamed from: j */
    public List f1923j;

    /* renamed from: m */
    public static DF0 m1603m() {
        DF0 df0 = new DF0();
        df0.f1921h = EF0.INV;
        df0.f1922i = Collections.emptyList();
        df0.f1923j = Collections.emptyList();
        return df0;
    }

    public final Object clone() {
        DF0 df0M1603m = m1603m();
        df0M1603m.m1605n(m1604l());
        return df0M1603m;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        FF0 ff0M1604l = m1604l();
        if (ff0M1604l.mo131e()) {
            return ff0M1604l;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
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
            xd0 r1 = p000.FF0.f3112n     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            FF0 r1 = new FF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m1605n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            FF0 r4 = (p000.FF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m1605n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m1605n((FF0) a00);
        return this;
    }

    /* renamed from: l */
    public final FF0 m1604l() {
        FF0 ff0 = new FF0(this);
        int i = this.f1917d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ff0.f3115d = this.f1918e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ff0.f3116e = this.f1919f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ff0.f3117f = this.f1920g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ff0.f3118g = this.f1921h;
        if ((i & 16) == 16) {
            this.f1922i = Collections.unmodifiableList(this.f1922i);
            this.f1917d &= -17;
        }
        ff0.f3119h = this.f1922i;
        if ((this.f1917d & 32) == 32) {
            this.f1923j = Collections.unmodifiableList(this.f1923j);
            this.f1917d &= -33;
        }
        ff0.f3120i = this.f1923j;
        ff0.f3114c = i2;
        return ff0;
    }

    /* renamed from: n */
    public final void m1605n(FF0 ff0) {
        if (ff0 == FF0.f3111m) {
            return;
        }
        int i = ff0.f3114c;
        if ((i & 1) == 1) {
            int i2 = ff0.f3115d;
            this.f1917d = 1 | this.f1917d;
            this.f1918e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ff0.f3116e;
            this.f1917d = 2 | this.f1917d;
            this.f1919f = i3;
        }
        if ((i & 4) == 4) {
            boolean z = ff0.f3117f;
            this.f1917d = 4 | this.f1917d;
            this.f1920g = z;
        }
        if ((i & 8) == 8) {
            EF0 ef0 = ff0.f3118g;
            ef0.getClass();
            this.f1917d = 8 | this.f1917d;
            this.f1921h = ef0;
        }
        if (!ff0.f3119h.isEmpty()) {
            if (this.f1922i.isEmpty()) {
                this.f1922i = ff0.f3119h;
                this.f1917d &= -17;
            } else {
                if ((this.f1917d & 16) != 16) {
                    this.f1922i = new ArrayList(this.f1922i);
                    this.f1917d |= 16;
                }
                this.f1922i.addAll(ff0.f3119h);
            }
        }
        if (!ff0.f3120i.isEmpty()) {
            if (this.f1923j.isEmpty()) {
                this.f1923j = ff0.f3120i;
                this.f1917d &= -33;
            } else {
                if ((this.f1917d & 32) != 32) {
                    this.f1923j = new ArrayList(this.f1923j);
                    this.f1917d |= 32;
                }
                this.f1923j.addAll(ff0.f3120i);
            }
        }
        m25292k(ff0);
        this.f41281a = this.f41281a.m3573d(ff0.f3113b);
    }
}
