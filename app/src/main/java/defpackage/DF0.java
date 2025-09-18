package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class DF0 extends AbstractC7518v00 {
    public int d;
    public int e;
    public int f;
    public boolean g;
    public EF0 h;
    public List i;
    public List j;

    public static DF0 m() {
        DF0 df0 = new DF0();
        df0.h = EF0.INV;
        df0.i = Collections.emptyList();
        df0.j = Collections.emptyList();
        return df0;
    }

    public final Object clone() {
        DF0 df0M = m();
        df0M.n(l());
        return df0M;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        FF0 ff0L = l();
        if (ff0L.e()) {
            return ff0L;
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
            xd0 r1 = defpackage.FF0.n     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            FF0 r1 = new FF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            FF0 r4 = (defpackage.FF0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        n((FF0) a00);
        return this;
    }

    public final FF0 l() {
        FF0 ff0 = new FF0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ff0.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ff0.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ff0.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ff0.g = this.h;
        if ((i & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
            this.d &= -17;
        }
        ff0.h = this.i;
        if ((this.d & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
            this.d &= -33;
        }
        ff0.i = this.j;
        ff0.c = i2;
        return ff0;
    }

    public final void n(FF0 ff0) {
        if (ff0 == FF0.m) {
            return;
        }
        int i = ff0.c;
        if ((i & 1) == 1) {
            int i2 = ff0.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ff0.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            boolean z = ff0.f;
            this.d = 4 | this.d;
            this.g = z;
        }
        if ((i & 8) == 8) {
            EF0 ef0 = ff0.g;
            ef0.getClass();
            this.d = 8 | this.d;
            this.h = ef0;
        }
        if (!ff0.h.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = ff0.h;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                this.i.addAll(ff0.h);
            }
        }
        if (!ff0.i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = ff0.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
                this.j.addAll(ff0.i);
            }
        }
        k(ff0);
        this.a = this.a.d(ff0.b);
    }
}
