package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: eF0 */
/* loaded from: classes2.dex */
public final class C3545eF0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public int b;
    public int c;
    public int d;
    public EnumC3736fF0 e;
    public AF0 f;
    public int g;
    public List h;
    public List i;

    public static C3545eF0 l() {
        C3545eF0 c3545eF0 = new C3545eF0();
        c3545eF0.e = EnumC3736fF0.TRUE;
        c3545eF0.f = AF0.t;
        c3545eF0.h = Collections.emptyList();
        c3545eF0.i = Collections.emptyList();
        return c3545eF0;
    }

    public final Object clone() {
        C3545eF0 c3545eF0L = l();
        c3545eF0L.m(k());
        return c3545eF0L;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C3927gF0 c3927gF0K = k();
        if (c3927gF0K.e()) {
            return c3927gF0K;
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
            xd0 r1 = defpackage.C3927gF0.m     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            gF0 r1 = new gF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            gF0 r4 = (defpackage.C3927gF0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3545eF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((C3927gF0) a00);
        return this;
    }

    public final C3927gF0 k() {
        C3927gF0 c3927gF0 = new C3927gF0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c3927gF0.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c3927gF0.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c3927gF0.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c3927gF0.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c3927gF0.g = this.g;
        if ((i & 32) == 32) {
            this.h = Collections.unmodifiableList(this.h);
            this.b &= -33;
        }
        c3927gF0.h = this.h;
        if ((this.b & 64) == 64) {
            this.i = Collections.unmodifiableList(this.i);
            this.b &= -65;
        }
        c3927gF0.i = this.i;
        c3927gF0.b = i2;
        return c3927gF0;
    }

    public final void m(C3927gF0 c3927gF0) {
        AF0 af0;
        if (c3927gF0 == C3927gF0.l) {
            return;
        }
        int i = c3927gF0.b;
        if ((i & 1) == 1) {
            int i2 = c3927gF0.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c3927gF0.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            EnumC3736fF0 enumC3736fF0 = c3927gF0.e;
            enumC3736fF0.getClass();
            this.b = 4 | this.b;
            this.e = enumC3736fF0;
        }
        if ((c3927gF0.b & 8) == 8) {
            AF0 af02 = c3927gF0.f;
            if ((this.b & 8) != 8 || (af0 = this.f) == AF0.t) {
                this.f = af02;
            } else {
                C8327zF0 c8327zF0R = AF0.r(af0);
                c8327zF0R.n(af02);
                this.f = c8327zF0R.l();
            }
            this.b |= 8;
        }
        if ((c3927gF0.b & 16) == 16) {
            int i4 = c3927gF0.g;
            this.b = 16 | this.b;
            this.g = i4;
        }
        if (!c3927gF0.h.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = c3927gF0.h;
                this.b &= -33;
            } else {
                if ((this.b & 32) != 32) {
                    this.h = new ArrayList(this.h);
                    this.b |= 32;
                }
                this.h.addAll(c3927gF0.h);
            }
        }
        if (!c3927gF0.i.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = c3927gF0.i;
                this.b &= -65;
            } else {
                if ((this.b & 64) != 64) {
                    this.i = new ArrayList(this.i);
                    this.b |= 64;
                }
                this.i.addAll(c3927gF0.i);
            }
        }
        this.a = this.a.d(c3927gF0.a);
    }
}
