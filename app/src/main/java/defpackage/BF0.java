package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class BF0 extends AbstractC7518v00 {
    public int d;
    public int e;
    public int f;
    public List g;
    public AF0 h;
    public int i;
    public AF0 j;
    public int k;
    public List l;
    public List m;

    public static BF0 m() {
        BF0 bf0 = new BF0();
        bf0.e = 6;
        bf0.g = Collections.emptyList();
        AF0 af0 = AF0.t;
        bf0.h = af0;
        bf0.j = af0;
        bf0.l = Collections.emptyList();
        bf0.m = Collections.emptyList();
        return bf0;
    }

    public final Object clone() {
        BF0 bf0M = m();
        bf0M.n(l());
        return bf0M;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        CF0 cf0L = l();
        if (cf0L.e()) {
            return cf0L;
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
            xd0 r1 = defpackage.CF0.p     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            CF0 r1 = new CF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            CF0 r4 = (defpackage.CF0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        n((CF0) a00);
        return this;
    }

    public final CF0 l() {
        CF0 cf0 = new CF0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cf0.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        cf0.e = this.f;
        if ((i & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            this.d &= -5;
        }
        cf0.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        cf0.g = this.h;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        cf0.h = this.i;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        cf0.i = this.j;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        cf0.j = this.k;
        if ((this.d & 128) == 128) {
            this.l = Collections.unmodifiableList(this.l);
            this.d &= -129;
        }
        cf0.k = this.l;
        if ((this.d & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
            this.d &= -257;
        }
        cf0.l = this.m;
        cf0.c = i2;
        return cf0;
    }

    public final void n(CF0 cf0) {
        AF0 af0;
        AF0 af02;
        if (cf0 == CF0.o) {
            return;
        }
        int i = cf0.c;
        if ((i & 1) == 1) {
            int i2 = cf0.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = cf0.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if (!cf0.f.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = cf0.f;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(cf0.f);
            }
        }
        if ((cf0.c & 4) == 4) {
            AF0 af03 = cf0.g;
            if ((this.d & 8) != 8 || (af02 = this.h) == AF0.t) {
                this.h = af03;
            } else {
                C8327zF0 c8327zF0R = AF0.r(af02);
                c8327zF0R.n(af03);
                this.h = c8327zF0R.l();
            }
            this.d |= 8;
        }
        int i4 = cf0.c;
        if ((i4 & 8) == 8) {
            int i5 = cf0.h;
            this.d |= 16;
            this.i = i5;
        }
        if ((i4 & 16) == 16) {
            AF0 af04 = cf0.i;
            if ((this.d & 32) != 32 || (af0 = this.j) == AF0.t) {
                this.j = af04;
            } else {
                C8327zF0 c8327zF0R2 = AF0.r(af0);
                c8327zF0R2.n(af04);
                this.j = c8327zF0R2.l();
            }
            this.d |= 32;
        }
        if ((cf0.c & 32) == 32) {
            int i6 = cf0.j;
            this.d |= 64;
            this.k = i6;
        }
        if (!cf0.k.isEmpty()) {
            if (this.l.isEmpty()) {
                this.l = cf0.k;
                this.d &= -129;
            } else {
                if ((this.d & 128) != 128) {
                    this.l = new ArrayList(this.l);
                    this.d |= 128;
                }
                this.l.addAll(cf0.k);
            }
        }
        if (!cf0.l.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = cf0.l;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
                this.m.addAll(cf0.l);
            }
        }
        k(cf0);
        this.a = this.a.d(cf0.b);
    }
}
