package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class WE0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public final /* synthetic */ int f13082b;

    /* renamed from: c */
    public int f13083c;

    /* renamed from: d */
    public List f13084d;

    public /* synthetic */ WE0(int i) {
        this.f13082b = i;
    }

    public final Object clone() {
        switch (this.f13082b) {
            case 0:
                WE0 we0 = new WE0(0);
                we0.f13084d = Collections.emptyList();
                we0.m8713o(m8709k());
                return we0;
            case 1:
                WE0 we02 = new WE0(1);
                we02.f13084d = Collections.emptyList();
                we02.m8714p(m8710l());
                return we02;
            case 2:
                WE0 we03 = new WE0(2);
                we03.f13084d = Collections.emptyList();
                we03.m8716r(m8712n());
                return we03;
            default:
                WE0 we04 = new WE0(3);
                we04.f13084d = C8886bi0.f17124b;
                we04.m8715q(m8711m());
                return we04;
        }
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        switch (this.f13082b) {
            case 0:
                XE0 xe0M8709k = m8709k();
                if (xe0M8709k.mo131e()) {
                    return xe0M8709k;
                }
                throw new C6838sg();
            case 1:
                C11265uF0 c11265uF0M8710l = m8710l();
                if (c11265uF0M8710l.mo131e()) {
                    return c11265uF0M8710l;
                }
                throw new C6838sg();
            case 2:
                NF0 nf0M8712n = m8712n();
                if (nf0M8712n.mo131e()) {
                    return nf0M8712n;
                }
                throw new C6838sg();
            default:
                C11393vF0 c11393vF0M8711m = m8711m();
                if (c11393vF0M8711m.mo131e()) {
                    return c11393vF0M8711m;
                }
                throw new C6838sg();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0020  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r3, p000.C0217DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f13082b
            switch(r0) {
                case 0: goto L62;
                case 1: goto L43;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            xd0 r0 = p000.C11393vF0.f44300f     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            vF0 r0 = new vF0     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 p000.Y90 -> L16
            r2.m8715q(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            K0 r0 = r3.f14178a     // Catch: java.lang.Throwable -> L14
            vF0 r0 = (p000.C11393vF0) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.m8715q(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            xd0 r1 = p000.NF0.f7671f     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            NF0 r1 = new NF0     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 p000.Y90 -> L35
            r2.m8716r(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> L33
            NF0 r4 = (p000.NF0) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.m8716r(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            xd0 r1 = p000.C11265uF0.f43622f     // Catch: java.lang.Throwable -> L52 p000.Y90 -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L52 p000.Y90 -> L54
            uF0 r1 = new uF0     // Catch: java.lang.Throwable -> L52 p000.Y90 -> L54
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L52 p000.Y90 -> L54
            r2.m8714p(r1)
            return r2
        L52:
            r3 = move-exception
            goto L5c
        L54:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> L52
            uF0 r4 = (p000.C11265uF0) r4     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r3 = move-exception
            r0 = r4
        L5c:
            if (r0 == 0) goto L61
            r2.m8714p(r0)
        L61:
            throw r3
        L62:
            r0 = 0
            xd0 r1 = p000.XE0.f13627f     // Catch: java.lang.Throwable -> L71 p000.Y90 -> L73
            r1.getClass()     // Catch: java.lang.Throwable -> L71 p000.Y90 -> L73
            XE0 r1 = new XE0     // Catch: java.lang.Throwable -> L71 p000.Y90 -> L73
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L71 p000.Y90 -> L73
            r2.m8713o(r1)
            return r2
        L71:
            r3 = move-exception
            goto L7b
        L73:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> L71
            XE0 r4 = (p000.XE0) r4     // Catch: java.lang.Throwable -> L71
            throw r3     // Catch: java.lang.Throwable -> L79
        L79:
            r3 = move-exception
            r0 = r4
        L7b:
            if (r0 == 0) goto L80
            r2.m8713o(r0)
        L80:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.WE0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        switch (this.f13082b) {
            case 0:
                m8713o((XE0) a00);
                break;
            case 1:
                m8714p((C11265uF0) a00);
                break;
            case 2:
                m8716r((NF0) a00);
                break;
            default:
                m8715q((C11393vF0) a00);
                break;
        }
        return this;
    }

    /* renamed from: k */
    public XE0 m8709k() {
        XE0 xe0 = new XE0(this);
        if ((this.f13083c & 1) == 1) {
            this.f13084d = Collections.unmodifiableList(this.f13084d);
            this.f13083c &= -2;
        }
        xe0.f13629b = this.f13084d;
        return xe0;
    }

    /* renamed from: l */
    public C11265uF0 m8710l() {
        C11265uF0 c11265uF0 = new C11265uF0(this);
        if ((this.f13083c & 1) == 1) {
            this.f13084d = Collections.unmodifiableList(this.f13084d);
            this.f13083c &= -2;
        }
        c11265uF0.f43624b = this.f13084d;
        return c11265uF0;
    }

    /* renamed from: m */
    public C11393vF0 m8711m() {
        C11393vF0 c11393vF0 = new C11393vF0(this);
        if ((this.f13083c & 1) == 1) {
            this.f13084d = ((InterfaceC9275ei0) this.f13084d).mo10488o();
            this.f13083c &= -2;
        }
        c11393vF0.f44302b = (InterfaceC9275ei0) this.f13084d;
        return c11393vF0;
    }

    /* renamed from: n */
    public NF0 m8712n() {
        NF0 nf0 = new NF0(this);
        if ((this.f13083c & 1) == 1) {
            this.f13084d = Collections.unmodifiableList(this.f13084d);
            this.f13083c &= -2;
        }
        nf0.f7673b = this.f13084d;
        return nf0;
    }

    /* renamed from: o */
    public void m8713o(XE0 xe0) {
        if (xe0 == XE0.f13626e) {
            return;
        }
        if (!xe0.f13629b.isEmpty()) {
            if (this.f13084d.isEmpty()) {
                this.f13084d = xe0.f13629b;
                this.f13083c &= -2;
            } else {
                if ((this.f13083c & 1) != 1) {
                    this.f13084d = new ArrayList(this.f13084d);
                    this.f13083c |= 1;
                }
                this.f13084d.addAll(xe0.f13629b);
            }
        }
        this.f41281a = this.f41281a.m3573d(xe0.f13628a);
    }

    /* renamed from: p */
    public void m8714p(C11265uF0 c11265uF0) {
        if (c11265uF0 == C11265uF0.f43621e) {
            return;
        }
        if (!c11265uF0.f43624b.isEmpty()) {
            if (this.f13084d.isEmpty()) {
                this.f13084d = c11265uF0.f43624b;
                this.f13083c &= -2;
            } else {
                if ((this.f13083c & 1) != 1) {
                    this.f13084d = new ArrayList(this.f13084d);
                    this.f13083c |= 1;
                }
                this.f13084d.addAll(c11265uF0.f43624b);
            }
        }
        this.f41281a = this.f41281a.m3573d(c11265uF0.f43623a);
    }

    /* renamed from: q */
    public void m8715q(C11393vF0 c11393vF0) {
        if (c11393vF0 == C11393vF0.f44299e) {
            return;
        }
        if (!c11393vF0.f44302b.isEmpty()) {
            if (((InterfaceC9275ei0) this.f13084d).isEmpty()) {
                this.f13084d = c11393vF0.f44302b;
                this.f13083c &= -2;
            } else {
                if ((this.f13083c & 1) != 1) {
                    this.f13084d = new C8886bi0((InterfaceC9275ei0) this.f13084d);
                    this.f13083c |= 1;
                }
                ((InterfaceC9275ei0) this.f13084d).addAll(c11393vF0.f44302b);
            }
        }
        this.f41281a = this.f41281a.m3573d(c11393vF0.f44301a);
    }

    /* renamed from: r */
    public void m8716r(NF0 nf0) {
        if (nf0 == NF0.f7670e) {
            return;
        }
        if (!nf0.f7673b.isEmpty()) {
            if (this.f13084d.isEmpty()) {
                this.f13084d = nf0.f7673b;
                this.f13083c &= -2;
            } else {
                if ((this.f13083c & 1) != 1) {
                    this.f13084d = new ArrayList(this.f13084d);
                    this.f13083c |= 1;
                }
                this.f13084d.addAll(nf0.f7673b);
            }
        }
        this.f41281a = this.f41281a.m3573d(nf0.f7672a);
    }
}
