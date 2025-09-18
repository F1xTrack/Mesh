package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: eF0 */
/* loaded from: classes2.dex */
public final class C9217eF0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public int f26612b;

    /* renamed from: c */
    public int f26613c;

    /* renamed from: d */
    public int f26614d;

    /* renamed from: e */
    public EnumC9345fF0 f26615e;

    /* renamed from: f */
    public AF0 f26616f;

    /* renamed from: g */
    public int f26617g;

    /* renamed from: h */
    public List f26618h;

    /* renamed from: i */
    public List f26619i;

    /* renamed from: l */
    public static C9217eF0 m17884l() {
        C9217eF0 c9217eF0 = new C9217eF0();
        c9217eF0.f26615e = EnumC9345fF0.TRUE;
        c9217eF0.f26616f = AF0.f123t;
        c9217eF0.f26618h = Collections.emptyList();
        c9217eF0.f26619i = Collections.emptyList();
        return c9217eF0;
    }

    public final Object clone() {
        C9217eF0 c9217eF0M17884l = m17884l();
        c9217eF0M17884l.m17886m(m17885k());
        return c9217eF0M17884l;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C9473gF0 c9473gF0M17885k = m17885k();
        if (c9473gF0M17885k.mo131e()) {
            return c9473gF0M17885k;
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
            xd0 r1 = p000.C9473gF0.f27635m     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            gF0 r1 = new gF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m17886m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            gF0 r4 = (p000.C9473gF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m17886m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9217eF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m17886m((C9473gF0) a00);
        return this;
    }

    /* renamed from: k */
    public final C9473gF0 m17885k() {
        C9473gF0 c9473gF0 = new C9473gF0(this);
        int i = this.f26612b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c9473gF0.f27638c = this.f26613c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c9473gF0.f27639d = this.f26614d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c9473gF0.f27640e = this.f26615e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c9473gF0.f27641f = this.f26616f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c9473gF0.f27642g = this.f26617g;
        if ((i & 32) == 32) {
            this.f26618h = Collections.unmodifiableList(this.f26618h);
            this.f26612b &= -33;
        }
        c9473gF0.f27643h = this.f26618h;
        if ((this.f26612b & 64) == 64) {
            this.f26619i = Collections.unmodifiableList(this.f26619i);
            this.f26612b &= -65;
        }
        c9473gF0.f27644i = this.f26619i;
        c9473gF0.f27637b = i2;
        return c9473gF0;
    }

    /* renamed from: m */
    public final void m17886m(C9473gF0 c9473gF0) {
        AF0 af0;
        if (c9473gF0 == C9473gF0.f27634l) {
            return;
        }
        int i = c9473gF0.f27637b;
        if ((i & 1) == 1) {
            int i2 = c9473gF0.f27638c;
            this.f26612b = 1 | this.f26612b;
            this.f26613c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c9473gF0.f27639d;
            this.f26612b = 2 | this.f26612b;
            this.f26614d = i3;
        }
        if ((i & 4) == 4) {
            EnumC9345fF0 enumC9345fF0 = c9473gF0.f27640e;
            enumC9345fF0.getClass();
            this.f26612b = 4 | this.f26612b;
            this.f26615e = enumC9345fF0;
        }
        if ((c9473gF0.f27637b & 8) == 8) {
            AF0 af02 = c9473gF0.f27641f;
            if ((this.f26612b & 8) != 8 || (af0 = this.f26616f) == AF0.f123t) {
                this.f26616f = af02;
            } else {
                C11901zF0 c11901zF0M126r = AF0.m126r(af0);
                c11901zF0M126r.m26352n(af02);
                this.f26616f = c11901zF0M126r.m26351l();
            }
            this.f26612b |= 8;
        }
        if ((c9473gF0.f27637b & 16) == 16) {
            int i4 = c9473gF0.f27642g;
            this.f26612b = 16 | this.f26612b;
            this.f26617g = i4;
        }
        if (!c9473gF0.f27643h.isEmpty()) {
            if (this.f26618h.isEmpty()) {
                this.f26618h = c9473gF0.f27643h;
                this.f26612b &= -33;
            } else {
                if ((this.f26612b & 32) != 32) {
                    this.f26618h = new ArrayList(this.f26618h);
                    this.f26612b |= 32;
                }
                this.f26618h.addAll(c9473gF0.f27643h);
            }
        }
        if (!c9473gF0.f27644i.isEmpty()) {
            if (this.f26619i.isEmpty()) {
                this.f26619i = c9473gF0.f27644i;
                this.f26612b &= -65;
            } else {
                if ((this.f26612b & 64) != 64) {
                    this.f26619i = new ArrayList(this.f26619i);
                    this.f26612b |= 64;
                }
                this.f26619i.addAll(c9473gF0.f27644i);
            }
        }
        this.f41281a = this.f41281a.m3573d(c9473gF0.f27636a);
    }
}
