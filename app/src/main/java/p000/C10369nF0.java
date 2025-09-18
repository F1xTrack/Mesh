package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: nF0 */
/* loaded from: classes2.dex */
public final class C10369nF0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f38214d;

    /* renamed from: e */
    public C11393vF0 f38215e;

    /* renamed from: f */
    public C11265uF0 f38216f;

    /* renamed from: g */
    public C10241mF0 f38217g;

    /* renamed from: h */
    public List f38218h;

    /* renamed from: m */
    public static C10369nF0 m23111m() {
        C10369nF0 c10369nF0 = new C10369nF0();
        c10369nF0.f38215e = C11393vF0.f44299e;
        c10369nF0.f38216f = C11265uF0.f43621e;
        c10369nF0.f38217g = C10241mF0.f37589k;
        c10369nF0.f38218h = Collections.emptyList();
        return c10369nF0;
    }

    public final Object clone() {
        C10369nF0 c10369nF0M23111m = m23111m();
        c10369nF0M23111m.m23113n(m23112l());
        return c10369nF0M23111m;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C10497oF0 c10497oF0M23112l = m23112l();
        if (c10497oF0M23112l.mo131e()) {
            return c10497oF0M23112l;
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
            xd0 r1 = p000.C10497oF0.f38905k     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            oF0 r1 = new oF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m23113n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            oF0 r4 = (p000.C10497oF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m23113n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10369nF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m23113n((C10497oF0) a00);
        return this;
    }

    /* renamed from: l */
    public final C10497oF0 m23112l() {
        C10497oF0 c10497oF0 = new C10497oF0(this);
        int i = this.f38214d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c10497oF0.f38908d = this.f38215e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c10497oF0.f38909e = this.f38216f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c10497oF0.f38910f = this.f38217g;
        if ((i & 8) == 8) {
            this.f38218h = Collections.unmodifiableList(this.f38218h);
            this.f38214d &= -9;
        }
        c10497oF0.f38911g = this.f38218h;
        c10497oF0.f38907c = i2;
        return c10497oF0;
    }

    /* renamed from: n */
    public final void m23113n(C10497oF0 c10497oF0) {
        C10241mF0 c10241mF0;
        C11265uF0 c11265uF0;
        C11393vF0 c11393vF0;
        if (c10497oF0 == C10497oF0.f38904j) {
            return;
        }
        if ((c10497oF0.f38907c & 1) == 1) {
            C11393vF0 c11393vF02 = c10497oF0.f38908d;
            if ((this.f38214d & 1) != 1 || (c11393vF0 = this.f38215e) == C11393vF0.f44299e) {
                this.f38215e = c11393vF02;
            } else {
                WE0 we0 = new WE0(3);
                we0.f13084d = C8886bi0.f17124b;
                we0.m8715q(c11393vF0);
                we0.m8715q(c11393vF02);
                this.f38215e = we0.m8711m();
            }
            this.f38214d |= 1;
        }
        if ((c10497oF0.f38907c & 2) == 2) {
            C11265uF0 c11265uF02 = c10497oF0.f38909e;
            if ((this.f38214d & 2) != 2 || (c11265uF0 = this.f38216f) == C11265uF0.f43621e) {
                this.f38216f = c11265uF02;
            } else {
                WE0 we02 = new WE0(1);
                we02.f13084d = Collections.emptyList();
                we02.m8714p(c11265uF0);
                we02.m8714p(c11265uF02);
                this.f38216f = we02.m8710l();
            }
            this.f38214d |= 2;
        }
        if ((c10497oF0.f38907c & 4) == 4) {
            C10241mF0 c10241mF02 = c10497oF0.f38910f;
            if ((this.f38214d & 4) != 4 || (c10241mF0 = this.f38217g) == C10241mF0.f37589k) {
                this.f38217g = c10241mF02;
            } else {
                C10113lF0 c10113lF0M22369m = C10113lF0.m22369m();
                c10113lF0M22369m.m22371n(c10241mF0);
                c10113lF0M22369m.m22371n(c10241mF02);
                this.f38217g = c10113lF0M22369m.m22370l();
            }
            this.f38214d |= 4;
        }
        if (!c10497oF0.f38911g.isEmpty()) {
            if (this.f38218h.isEmpty()) {
                this.f38218h = c10497oF0.f38911g;
                this.f38214d &= -9;
            } else {
                if ((this.f38214d & 8) != 8) {
                    this.f38218h = new ArrayList(this.f38218h);
                    this.f38214d |= 8;
                }
                this.f38218h.addAll(c10497oF0.f38911g);
            }
        }
        m25292k(c10497oF0);
        this.f41281a = this.f41281a.m3573d(c10497oF0.f38906b);
    }
}
