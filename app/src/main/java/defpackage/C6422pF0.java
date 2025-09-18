package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6422pF0 extends AbstractC7518v00 {
    public int d;
    public int e;
    public int f;
    public int g;
    public AF0 h;
    public int i;
    public List j;
    public AF0 k;
    public int l;
    public List m;
    public List n;
    public IF0 o;
    public int p;
    public int q;
    public List r;

    public static C6422pF0 m() {
        C6422pF0 c6422pF0 = new C6422pF0();
        c6422pF0.e = 518;
        c6422pF0.f = 2054;
        AF0 af0 = AF0.t;
        c6422pF0.h = af0;
        c6422pF0.j = Collections.emptyList();
        c6422pF0.k = af0;
        c6422pF0.m = Collections.emptyList();
        c6422pF0.n = Collections.emptyList();
        c6422pF0.o = IF0.l;
        c6422pF0.r = Collections.emptyList();
        return c6422pF0;
    }

    public final Object clone() {
        C6422pF0 c6422pF0M = m();
        c6422pF0M.n(l());
        return c6422pF0M;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C6613qF0 c6613qF0L = l();
        if (c6613qF0L.e()) {
            return c6613qF0L;
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
            xd0 r1 = defpackage.C6613qF0.v     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            qF0 r1 = new qF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            qF0 r4 = (defpackage.C6613qF0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6422pF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        n((C6613qF0) a00);
        return this;
    }

    public final C6613qF0 l() {
        C6613qF0 c6613qF0 = new C6613qF0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c6613qF0.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c6613qF0.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c6613qF0.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c6613qF0.g = this.h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c6613qF0.h = this.i;
        if ((i & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
            this.d &= -33;
        }
        c6613qF0.i = this.j;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c6613qF0.j = this.k;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c6613qF0.k = this.l;
        if ((this.d & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
            this.d &= -257;
        }
        c6613qF0.l = this.m;
        if ((this.d & 512) == 512) {
            this.n = Collections.unmodifiableList(this.n);
            this.d &= -513;
        }
        c6613qF0.m = this.n;
        if ((i & 1024) == 1024) {
            i2 |= 128;
        }
        c6613qF0.o = this.o;
        if ((i & 2048) == 2048) {
            i2 |= 256;
        }
        c6613qF0.p = this.p;
        if ((i & 4096) == 4096) {
            i2 |= 512;
        }
        c6613qF0.q = this.q;
        if ((this.d & 8192) == 8192) {
            this.r = Collections.unmodifiableList(this.r);
            this.d &= -8193;
        }
        c6613qF0.r = this.r;
        c6613qF0.c = i2;
        return c6613qF0;
    }

    public final void n(C6613qF0 c6613qF0) {
        IF0 if0;
        AF0 af0;
        AF0 af02;
        if (c6613qF0 == C6613qF0.u) {
            return;
        }
        int i = c6613qF0.c;
        if ((i & 1) == 1) {
            int i2 = c6613qF0.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c6613qF0.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c6613qF0.f;
            this.d = 4 | this.d;
            this.g = i4;
        }
        if ((i & 8) == 8) {
            AF0 af03 = c6613qF0.g;
            if ((this.d & 8) != 8 || (af02 = this.h) == AF0.t) {
                this.h = af03;
            } else {
                C8327zF0 c8327zF0R = AF0.r(af02);
                c8327zF0R.n(af03);
                this.h = c8327zF0R.l();
            }
            this.d |= 8;
        }
        if ((c6613qF0.c & 16) == 16) {
            int i5 = c6613qF0.h;
            this.d = 16 | this.d;
            this.i = i5;
        }
        if (!c6613qF0.i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = c6613qF0.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
                this.j.addAll(c6613qF0.i);
            }
        }
        if (c6613qF0.p()) {
            AF0 af04 = c6613qF0.j;
            if ((this.d & 64) != 64 || (af0 = this.k) == AF0.t) {
                this.k = af04;
            } else {
                C8327zF0 c8327zF0R2 = AF0.r(af0);
                c8327zF0R2.n(af04);
                this.k = c8327zF0R2.l();
            }
            this.d |= 64;
        }
        if ((c6613qF0.c & 64) == 64) {
            int i6 = c6613qF0.k;
            this.d |= 128;
            this.l = i6;
        }
        if (!c6613qF0.l.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = c6613qF0.l;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
                this.m.addAll(c6613qF0.l);
            }
        }
        if (!c6613qF0.m.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = c6613qF0.m;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.n = new ArrayList(this.n);
                    this.d |= 512;
                }
                this.n.addAll(c6613qF0.m);
            }
        }
        if ((c6613qF0.c & 128) == 128) {
            IF0 if02 = c6613qF0.o;
            if ((this.d & 1024) != 1024 || (if0 = this.o) == IF0.l) {
                this.o = if02;
            } else {
                HF0 hf0 = new HF0();
                AF0 af05 = AF0.t;
                hf0.g = af05;
                hf0.i = af05;
                hf0.m(if0);
                hf0.m(if02);
                this.o = hf0.l();
            }
            this.d |= 1024;
        }
        int i7 = c6613qF0.c;
        if ((i7 & 256) == 256) {
            int i8 = c6613qF0.p;
            this.d |= 2048;
            this.p = i8;
        }
        if ((i7 & 512) == 512) {
            int i9 = c6613qF0.q;
            this.d |= 4096;
            this.q = i9;
        }
        if (!c6613qF0.r.isEmpty()) {
            if (this.r.isEmpty()) {
                this.r = c6613qF0.r;
                this.d &= -8193;
            } else {
                if ((this.d & 8192) != 8192) {
                    this.r = new ArrayList(this.r);
                    this.d |= 8192;
                }
                this.r.addAll(c6613qF0.r);
            }
        }
        k(c6613qF0);
        this.a = this.a.d(c6613qF0.b);
    }
}
