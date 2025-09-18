package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5658lF0 extends AbstractC7518v00 {
    public int d;
    public List e;
    public List f;
    public List g;
    public GF0 h;
    public NF0 i;

    public static C5658lF0 m() {
        C5658lF0 c5658lF0 = new C5658lF0();
        c5658lF0.e = Collections.emptyList();
        c5658lF0.f = Collections.emptyList();
        c5658lF0.g = Collections.emptyList();
        c5658lF0.h = GF0.g;
        c5658lF0.i = NF0.e;
        return c5658lF0;
    }

    public final Object clone() {
        C5658lF0 c5658lF0M = m();
        c5658lF0M.n(l());
        return c5658lF0M;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C5849mF0 c5849mF0L = l();
        if (c5849mF0L.e()) {
            return c5849mF0L;
        }
        throw new C7074sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r3, defpackage.DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = defpackage.C5849mF0.l     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            mF0 r1 = new mF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            mF0 r4 = (defpackage.C5849mF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5658lF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        n((C5849mF0) a00);
        return this;
    }

    public final C5849mF0 l() {
        C5849mF0 c5849mF0 = new C5849mF0(this);
        int i = this.d;
        if ((i & 1) == 1) {
            this.e = Collections.unmodifiableList(this.e);
            this.d &= -2;
        }
        c5849mF0.d = this.e;
        if ((this.d & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
            this.d &= -3;
        }
        c5849mF0.e = this.f;
        if ((this.d & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            this.d &= -5;
        }
        c5849mF0.f = this.g;
        int i2 = (i & 8) != 8 ? 0 : 1;
        c5849mF0.g = this.h;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        c5849mF0.h = this.i;
        c5849mF0.c = i2;
        return c5849mF0;
    }

    public final void n(C5849mF0 c5849mF0) {
        NF0 nf0;
        GF0 gf0;
        if (c5849mF0 == C5849mF0.k) {
            return;
        }
        if (!c5849mF0.d.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = c5849mF0.d;
                this.d &= -2;
            } else {
                if ((this.d & 1) != 1) {
                    this.e = new ArrayList(this.e);
                    this.d |= 1;
                }
                this.e.addAll(c5849mF0.d);
            }
        }
        if (!c5849mF0.e.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = c5849mF0.e;
                this.d &= -3;
            } else {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.addAll(c5849mF0.e);
            }
        }
        if (!c5849mF0.f.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = c5849mF0.f;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(c5849mF0.f);
            }
        }
        if ((c5849mF0.c & 1) == 1) {
            GF0 gf02 = c5849mF0.g;
            if ((this.d & 8) != 8 || (gf0 = this.h) == GF0.g) {
                this.h = gf02;
            } else {
                PE0 pe0I = GF0.i(gf0);
                pe0I.q(gf02);
                this.h = pe0I.m();
            }
            this.d |= 8;
        }
        if ((c5849mF0.c & 2) == 2) {
            NF0 nf02 = c5849mF0.h;
            if ((this.d & 16) != 16 || (nf0 = this.i) == NF0.e) {
                this.i = nf02;
            } else {
                WE0 we0 = new WE0(2);
                we0.d = Collections.emptyList();
                we0.r(nf0);
                we0.r(nf02);
                this.i = we0.n();
            }
            this.d |= 16;
        }
        k(c5849mF0);
        this.a = this.a.d(c5849mF0.b);
    }
}
