package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class WE0 extends AbstractC6754r00 implements InterfaceC6917rr0 {
    public final /* synthetic */ int b;
    public int c;
    public List d;

    public /* synthetic */ WE0(int i) {
        this.b = i;
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                WE0 we0 = new WE0(0);
                we0.d = Collections.emptyList();
                we0.o(k());
                return we0;
            case 1:
                WE0 we02 = new WE0(1);
                we02.d = Collections.emptyList();
                we02.p(l());
                return we02;
            case 2:
                WE0 we03 = new WE0(2);
                we03.d = Collections.emptyList();
                we03.r(n());
                return we03;
            default:
                WE0 we04 = new WE0(3);
                we04.d = C2376bi0.b;
                we04.q(m());
                return we04;
        }
    }

    @Override // defpackage.AbstractC6754r00
    public final K0 h() {
        switch (this.b) {
            case 0:
                XE0 xe0K = k();
                if (xe0K.e()) {
                    return xe0K;
                }
                throw new C7074sg();
            case 1:
                C7376uF0 c7376uF0L = l();
                if (c7376uF0L.e()) {
                    return c7376uF0L;
                }
                throw new C7074sg();
            case 2:
                NF0 nf0N = n();
                if (nf0N.e()) {
                    return nf0N;
                }
                throw new C7074sg();
            default:
                C7567vF0 c7567vF0M = m();
                if (c7567vF0M.e()) {
                    return c7567vF0M;
                }
                throw new C7074sg();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0020  */
    @Override // defpackage.AbstractC6754r00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC6754r00 i(defpackage.C5780lu r3, defpackage.DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.b
            switch(r0) {
                case 0: goto L62;
                case 1: goto L43;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            xd0 r0 = defpackage.C7567vF0.f     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            vF0 r0 = new vF0     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 defpackage.Y90 -> L16
            r2.q(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            K0 r0 = r3.a     // Catch: java.lang.Throwable -> L14
            vF0 r0 = (defpackage.C7567vF0) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.q(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            xd0 r1 = defpackage.NF0.f     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            NF0 r1 = new NF0     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 defpackage.Y90 -> L35
            r2.r(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> L33
            NF0 r4 = (defpackage.NF0) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.r(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            xd0 r1 = defpackage.C7376uF0.f     // Catch: java.lang.Throwable -> L52 defpackage.Y90 -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L52 defpackage.Y90 -> L54
            uF0 r1 = new uF0     // Catch: java.lang.Throwable -> L52 defpackage.Y90 -> L54
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L52 defpackage.Y90 -> L54
            r2.p(r1)
            return r2
        L52:
            r3 = move-exception
            goto L5c
        L54:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> L52
            uF0 r4 = (defpackage.C7376uF0) r4     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r3 = move-exception
            r0 = r4
        L5c:
            if (r0 == 0) goto L61
            r2.p(r0)
        L61:
            throw r3
        L62:
            r0 = 0
            xd0 r1 = defpackage.XE0.f     // Catch: java.lang.Throwable -> L71 defpackage.Y90 -> L73
            r1.getClass()     // Catch: java.lang.Throwable -> L71 defpackage.Y90 -> L73
            XE0 r1 = new XE0     // Catch: java.lang.Throwable -> L71 defpackage.Y90 -> L73
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L71 defpackage.Y90 -> L73
            r2.o(r1)
            return r2
        L71:
            r3 = move-exception
            goto L7b
        L73:
            r3 = move-exception
            K0 r4 = r3.a     // Catch: java.lang.Throwable -> L71
            XE0 r4 = (defpackage.XE0) r4     // Catch: java.lang.Throwable -> L71
            throw r3     // Catch: java.lang.Throwable -> L79
        L79:
            r3 = move-exception
            r0 = r4
        L7b:
            if (r0 == 0) goto L80
            r2.o(r0)
        L80:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WE0.i(lu, DR):r00");
    }

    @Override // defpackage.AbstractC6754r00
    public final /* bridge */ /* synthetic */ AbstractC6754r00 j(A00 a00) {
        switch (this.b) {
            case 0:
                o((XE0) a00);
                break;
            case 1:
                p((C7376uF0) a00);
                break;
            case 2:
                r((NF0) a00);
                break;
            default:
                q((C7567vF0) a00);
                break;
        }
        return this;
    }

    public XE0 k() {
        XE0 xe0 = new XE0(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        xe0.b = this.d;
        return xe0;
    }

    public C7376uF0 l() {
        C7376uF0 c7376uF0 = new C7376uF0(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        c7376uF0.b = this.d;
        return c7376uF0;
    }

    public C7567vF0 m() {
        C7567vF0 c7567vF0 = new C7567vF0(this);
        if ((this.c & 1) == 1) {
            this.d = ((InterfaceC3632ei0) this.d).o();
            this.c &= -2;
        }
        c7567vF0.b = (InterfaceC3632ei0) this.d;
        return c7567vF0;
    }

    public NF0 n() {
        NF0 nf0 = new NF0(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        nf0.b = this.d;
        return nf0;
    }

    public void o(XE0 xe0) {
        if (xe0 == XE0.e) {
            return;
        }
        if (!xe0.b.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = xe0.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(xe0.b);
            }
        }
        this.a = this.a.d(xe0.a);
    }

    public void p(C7376uF0 c7376uF0) {
        if (c7376uF0 == C7376uF0.e) {
            return;
        }
        if (!c7376uF0.b.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = c7376uF0.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(c7376uF0.b);
            }
        }
        this.a = this.a.d(c7376uF0.a);
    }

    public void q(C7567vF0 c7567vF0) {
        if (c7567vF0 == C7567vF0.e) {
            return;
        }
        if (!c7567vF0.b.isEmpty()) {
            if (((InterfaceC3632ei0) this.d).isEmpty()) {
                this.d = c7567vF0.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new C2376bi0((InterfaceC3632ei0) this.d);
                    this.c |= 1;
                }
                ((InterfaceC3632ei0) this.d).addAll(c7567vF0.b);
            }
        }
        this.a = this.a.d(c7567vF0.a);
    }

    public void r(NF0 nf0) {
        if (nf0 == NF0.e) {
            return;
        }
        if (!nf0.b.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = nf0.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(nf0.b);
            }
        }
        this.a = this.a.d(nf0.a);
    }
}
