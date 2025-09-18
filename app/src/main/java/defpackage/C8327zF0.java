package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: zF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8327zF0 extends AbstractC7518v00 {
    public int d;
    public List e;
    public boolean f;
    public int g;
    public AF0 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public AF0 n;
    public int o;
    public AF0 p;
    public int q;
    public int r;

    public static C8327zF0 m() {
        C8327zF0 c8327zF0 = new C8327zF0();
        c8327zF0.e = Collections.emptyList();
        AF0 af0 = AF0.t;
        c8327zF0.h = af0;
        c8327zF0.n = af0;
        c8327zF0.p = af0;
        return c8327zF0;
    }

    public final Object clone() {
        C8327zF0 c8327zF0M = m();
        c8327zF0M.n(l());
        return c8327zF0M;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        AF0 af0L = l();
        if (af0L.e()) {
            return af0L;
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
            xd0 r1 = defpackage.AF0.u     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            AF0 r1 = new AF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            AF0 r4 = (defpackage.AF0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8327zF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        n((AF0) a00);
        return this;
    }

    public final AF0 l() {
        AF0 af0 = new AF0(this);
        int i = this.d;
        if ((i & 1) == 1) {
            this.e = Collections.unmodifiableList(this.e);
            this.d &= -2;
        }
        af0.d = this.e;
        int i2 = (i & 2) != 2 ? 0 : 1;
        af0.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        af0.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        af0.g = this.h;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        af0.h = this.i;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        af0.i = this.j;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        af0.j = this.k;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        af0.k = this.l;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        af0.l = this.m;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        af0.m = this.n;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        af0.n = this.o;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        af0.o = this.p;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        af0.p = this.q;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        af0.q = this.r;
        af0.c = i2;
        return af0;
    }

    public final C8327zF0 n(AF0 af0) {
        AF0 af02;
        AF0 af03;
        AF0 af04;
        AF0 af05 = AF0.t;
        if (af0 == af05) {
            return this;
        }
        if (!af0.d.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = af0.d;
                this.d &= -2;
            } else {
                if ((this.d & 1) != 1) {
                    this.e = new ArrayList(this.e);
                    this.d |= 1;
                }
                this.e.addAll(af0.d);
            }
        }
        int i = af0.c;
        if ((i & 1) == 1) {
            boolean z = af0.e;
            this.d |= 2;
            this.f = z;
        }
        if ((i & 2) == 2) {
            int i2 = af0.f;
            this.d |= 4;
            this.g = i2;
        }
        if ((i & 4) == 4) {
            AF0 af06 = af0.g;
            if ((this.d & 8) != 8 || (af04 = this.h) == af05) {
                this.h = af06;
            } else {
                C8327zF0 c8327zF0R = AF0.r(af04);
                c8327zF0R.n(af06);
                this.h = c8327zF0R.l();
            }
            this.d |= 8;
        }
        if ((af0.c & 8) == 8) {
            int i3 = af0.h;
            this.d |= 16;
            this.i = i3;
        }
        if (af0.p()) {
            int i4 = af0.i;
            this.d |= 32;
            this.j = i4;
        }
        int i5 = af0.c;
        if ((i5 & 32) == 32) {
            int i6 = af0.j;
            this.d |= 64;
            this.k = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = af0.k;
            this.d |= 128;
            this.l = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = af0.l;
            this.d |= 256;
            this.m = i8;
        }
        if ((i5 & 256) == 256) {
            AF0 af07 = af0.m;
            if ((this.d & 512) != 512 || (af03 = this.n) == af05) {
                this.n = af07;
            } else {
                C8327zF0 c8327zF0R2 = AF0.r(af03);
                c8327zF0R2.n(af07);
                this.n = c8327zF0R2.l();
            }
            this.d |= 512;
        }
        int i9 = af0.c;
        if ((i9 & 512) == 512) {
            int i10 = af0.n;
            this.d |= 1024;
            this.o = i10;
        }
        if ((i9 & 1024) == 1024) {
            AF0 af08 = af0.o;
            if ((this.d & 2048) != 2048 || (af02 = this.p) == af05) {
                this.p = af08;
            } else {
                C8327zF0 c8327zF0R3 = AF0.r(af02);
                c8327zF0R3.n(af08);
                this.p = c8327zF0R3.l();
            }
            this.d |= 2048;
        }
        int i11 = af0.c;
        if ((i11 & 2048) == 2048) {
            int i12 = af0.p;
            this.d |= 4096;
            this.q = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = af0.q;
            this.d |= 8192;
            this.r = i13;
        }
        k(af0);
        this.a = this.a.d(af0.b);
        return this;
    }
}
