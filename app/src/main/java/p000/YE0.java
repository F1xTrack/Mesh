package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class YE0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public int f14207b;

    /* renamed from: c */
    public ZE0 f14208c;

    /* renamed from: d */
    public List f14209d;

    /* renamed from: e */
    public C9473gF0 f14210e;

    /* renamed from: f */
    public EnumC8700aF0 f14211f;

    /* renamed from: l */
    public static YE0 m9242l() {
        YE0 ye0 = new YE0();
        ye0.f14208c = ZE0.RETURNS_CONSTANT;
        ye0.f14209d = Collections.emptyList();
        ye0.f14210e = C9473gF0.f27634l;
        ye0.f14211f = EnumC8700aF0.AT_MOST_ONCE;
        return ye0;
    }

    public final Object clone() {
        YE0 ye0M9242l = m9242l();
        ye0M9242l.m9244m(m9243k());
        return ye0M9242l;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C8828bF0 c8828bF0M9243k = m9243k();
        if (c8828bF0M9243k.mo131e()) {
            return c8828bF0M9243k;
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
            xd0 r1 = p000.C8828bF0.f16898j     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            bF0 r1 = new bF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m9244m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            bF0 r4 = (p000.C8828bF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9244m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.YE0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m9244m((C8828bF0) a00);
        return this;
    }

    /* renamed from: k */
    public final C8828bF0 m9243k() {
        C8828bF0 c8828bF0 = new C8828bF0(this);
        int i = this.f14207b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c8828bF0.f16901c = this.f14208c;
        if ((i & 2) == 2) {
            this.f14209d = Collections.unmodifiableList(this.f14209d);
            this.f14207b &= -3;
        }
        c8828bF0.f16902d = this.f14209d;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        c8828bF0.f16903e = this.f14210e;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c8828bF0.f16904f = this.f14211f;
        c8828bF0.f16900b = i2;
        return c8828bF0;
    }

    /* renamed from: m */
    public final void m9244m(C8828bF0 c8828bF0) {
        C9473gF0 c9473gF0;
        if (c8828bF0 == C8828bF0.f16897i) {
            return;
        }
        if ((c8828bF0.f16900b & 1) == 1) {
            ZE0 ze0 = c8828bF0.f16901c;
            ze0.getClass();
            this.f14207b |= 1;
            this.f14208c = ze0;
        }
        if (!c8828bF0.f16902d.isEmpty()) {
            if (this.f14209d.isEmpty()) {
                this.f14209d = c8828bF0.f16902d;
                this.f14207b &= -3;
            } else {
                if ((this.f14207b & 2) != 2) {
                    this.f14209d = new ArrayList(this.f14209d);
                    this.f14207b |= 2;
                }
                this.f14209d.addAll(c8828bF0.f16902d);
            }
        }
        if ((c8828bF0.f16900b & 2) == 2) {
            C9473gF0 c9473gF02 = c8828bF0.f16903e;
            if ((this.f14207b & 4) != 4 || (c9473gF0 = this.f14210e) == C9473gF0.f27634l) {
                this.f14210e = c9473gF02;
            } else {
                C9217eF0 c9217eF0M17884l = C9217eF0.m17884l();
                c9217eF0M17884l.m17886m(c9473gF0);
                c9217eF0M17884l.m17886m(c9473gF02);
                this.f14210e = c9217eF0M17884l.m17885k();
            }
            this.f14207b |= 4;
        }
        if ((c8828bF0.f16900b & 4) == 4) {
            EnumC8700aF0 enumC8700aF0 = c8828bF0.f16904f;
            enumC8700aF0.getClass();
            this.f14207b |= 8;
            this.f14211f = enumC8700aF0;
        }
        this.f41281a = this.f41281a.m3573d(c8828bF0.f16899a);
    }
}
