package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class YE0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public int b;
    public ZE0 c;
    public List d;
    public C3927gF0 e;
    public EnumC2098aF0 f;

    public static YE0 l() {
        YE0 ye0 = new YE0();
        ye0.c = ZE0.RETURNS_CONSTANT;
        ye0.d = Collections.emptyList();
        ye0.e = C3927gF0.l;
        ye0.f = EnumC2098aF0.AT_MOST_ONCE;
        return ye0;
    }

    public final Object clone() {
        YE0 ye0L = l();
        ye0L.m(k());
        return ye0L;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C2289bF0 c2289bF0K = k();
        if (c2289bF0K.e()) {
            return c2289bF0K;
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
            xd0 r1 = defpackage.C2289bF0.j     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            bF0 r1 = new bF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            bF0 r4 = (defpackage.C2289bF0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YE0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        m((C2289bF0) a00);
        return this;
    }

    public final C2289bF0 k() {
        C2289bF0 c2289bF0 = new C2289bF0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c2289bF0.c = this.c;
        if ((i & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
            this.b &= -3;
        }
        c2289bF0.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        c2289bF0.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c2289bF0.f = this.f;
        c2289bF0.b = i2;
        return c2289bF0;
    }

    public final void m(C2289bF0 c2289bF0) {
        C3927gF0 c3927gF0;
        if (c2289bF0 == C2289bF0.i) {
            return;
        }
        if ((c2289bF0.b & 1) == 1) {
            ZE0 ze0 = c2289bF0.c;
            ze0.getClass();
            this.b |= 1;
            this.c = ze0;
        }
        if (!c2289bF0.d.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = c2289bF0.d;
                this.b &= -3;
            } else {
                if ((this.b & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.b |= 2;
                }
                this.d.addAll(c2289bF0.d);
            }
        }
        if ((c2289bF0.b & 2) == 2) {
            C3927gF0 c3927gF02 = c2289bF0.e;
            if ((this.b & 4) != 4 || (c3927gF0 = this.e) == C3927gF0.l) {
                this.e = c3927gF02;
            } else {
                C3545eF0 c3545eF0L = C3545eF0.l();
                c3545eF0L.m(c3927gF0);
                c3545eF0L.m(c3927gF02);
                this.e = c3545eF0L.k();
            }
            this.b |= 4;
        }
        if ((c2289bF0.b & 4) == 4) {
            EnumC2098aF0 enumC2098aF0 = c2289bF0.f;
            enumC2098aF0.getClass();
            this.b |= 8;
            this.f = enumC2098aF0;
        }
        this.a = this.a.d(c2289bF0.a);
    }
}
