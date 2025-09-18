package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: nF0 */
/* loaded from: classes2.dex */
public final class C6040nF0 extends AbstractC7518v00 {
    public int d;
    public C7567vF0 e;
    public C7376uF0 f;
    public C5849mF0 g;
    public List h;

    public static C6040nF0 m() {
        C6040nF0 c6040nF0 = new C6040nF0();
        c6040nF0.e = C7567vF0.e;
        c6040nF0.f = C7376uF0.e;
        c6040nF0.g = C5849mF0.k;
        c6040nF0.h = Collections.emptyList();
        return c6040nF0;
    }

    public final Object clone() {
        C6040nF0 c6040nF0M = m();
        c6040nF0M.n(l());
        return c6040nF0M;
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        C6231oF0 c6231oF0L = l();
        if (c6231oF0L.e()) {
            return c6231oF0L;
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
            xd0 r1 = defpackage.C6231oF0.k     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            oF0 r1 = new oF0     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.Y90 -> L11
            r2.n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> Lf
            oF0 r4 = (defpackage.C6231oF0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6040nF0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        n((C6231oF0) a00);
        return this;
    }

    public final C6231oF0 l() {
        C6231oF0 c6231oF0 = new C6231oF0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c6231oF0.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c6231oF0.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c6231oF0.f = this.g;
        if ((i & 8) == 8) {
            this.h = Collections.unmodifiableList(this.h);
            this.d &= -9;
        }
        c6231oF0.g = this.h;
        c6231oF0.c = i2;
        return c6231oF0;
    }

    public final void n(C6231oF0 c6231oF0) {
        C5849mF0 c5849mF0;
        C7376uF0 c7376uF0;
        C7567vF0 c7567vF0;
        if (c6231oF0 == C6231oF0.j) {
            return;
        }
        if ((c6231oF0.c & 1) == 1) {
            C7567vF0 c7567vF02 = c6231oF0.d;
            if ((this.d & 1) != 1 || (c7567vF0 = this.e) == C7567vF0.e) {
                this.e = c7567vF02;
            } else {
                WE0 we0 = new WE0(3);
                we0.d = C2376bi0.b;
                we0.q(c7567vF0);
                we0.q(c7567vF02);
                this.e = we0.m();
            }
            this.d |= 1;
        }
        if ((c6231oF0.c & 2) == 2) {
            C7376uF0 c7376uF02 = c6231oF0.e;
            if ((this.d & 2) != 2 || (c7376uF0 = this.f) == C7376uF0.e) {
                this.f = c7376uF02;
            } else {
                WE0 we02 = new WE0(1);
                we02.d = Collections.emptyList();
                we02.p(c7376uF0);
                we02.p(c7376uF02);
                this.f = we02.l();
            }
            this.d |= 2;
        }
        if ((c6231oF0.c & 4) == 4) {
            C5849mF0 c5849mF02 = c6231oF0.f;
            if ((this.d & 4) != 4 || (c5849mF0 = this.g) == C5849mF0.k) {
                this.g = c5849mF02;
            } else {
                C5658lF0 c5658lF0M = C5658lF0.m();
                c5658lF0M.n(c5849mF0);
                c5658lF0M.n(c5849mF02);
                this.g = c5658lF0M.l();
            }
            this.d |= 4;
        }
        if (!c6231oF0.g.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = c6231oF0.g;
                this.d &= -9;
            } else {
                if ((this.d & 8) != 8) {
                    this.h = new ArrayList(this.h);
                    this.d |= 8;
                }
                this.h.addAll(c6231oF0.g);
            }
        }
        k(c6231oF0);
        this.a = this.a.d(c6231oF0.b);
    }
}
