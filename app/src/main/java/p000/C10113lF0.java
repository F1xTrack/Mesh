package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10113lF0 extends AbstractC11359v00 {

    /* renamed from: d */
    public int f36982d;

    /* renamed from: e */
    public List f36983e;

    /* renamed from: f */
    public List f36984f;

    /* renamed from: g */
    public List f36985g;

    /* renamed from: h */
    public GF0 f36986h;

    /* renamed from: i */
    public NF0 f36987i;

    /* renamed from: m */
    public static C10113lF0 m22369m() {
        C10113lF0 c10113lF0 = new C10113lF0();
        c10113lF0.f36983e = Collections.emptyList();
        c10113lF0.f36984f = Collections.emptyList();
        c10113lF0.f36985g = Collections.emptyList();
        c10113lF0.f36986h = GF0.f3648g;
        c10113lF0.f36987i = NF0.f7670e;
        return c10113lF0;
    }

    public final Object clone() {
        C10113lF0 c10113lF0M22369m = m22369m();
        c10113lF0M22369m.m22371n(m22370l());
        return c10113lF0M22369m;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C10241mF0 c10241mF0M22370l = m22370l();
        if (c10241mF0M22370l.mo131e()) {
            return c10241mF0M22370l;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
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
            xd0 r1 = p000.C10241mF0.f37590l     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            mF0 r1 = new mF0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m22371n(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            mF0 r4 = (p000.C10241mF0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m22371n(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10113lF0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m22371n((C10241mF0) a00);
        return this;
    }

    /* renamed from: l */
    public final C10241mF0 m22370l() {
        C10241mF0 c10241mF0 = new C10241mF0(this);
        int i = this.f36982d;
        if ((i & 1) == 1) {
            this.f36983e = Collections.unmodifiableList(this.f36983e);
            this.f36982d &= -2;
        }
        c10241mF0.f37593d = this.f36983e;
        if ((this.f36982d & 2) == 2) {
            this.f36984f = Collections.unmodifiableList(this.f36984f);
            this.f36982d &= -3;
        }
        c10241mF0.f37594e = this.f36984f;
        if ((this.f36982d & 4) == 4) {
            this.f36985g = Collections.unmodifiableList(this.f36985g);
            this.f36982d &= -5;
        }
        c10241mF0.f37595f = this.f36985g;
        int i2 = (i & 8) != 8 ? 0 : 1;
        c10241mF0.f37596g = this.f36986h;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        c10241mF0.f37597h = this.f36987i;
        c10241mF0.f37592c = i2;
        return c10241mF0;
    }

    /* renamed from: n */
    public final void m22371n(C10241mF0 c10241mF0) {
        NF0 nf0;
        GF0 gf0;
        if (c10241mF0 == C10241mF0.f37589k) {
            return;
        }
        if (!c10241mF0.f37593d.isEmpty()) {
            if (this.f36983e.isEmpty()) {
                this.f36983e = c10241mF0.f37593d;
                this.f36982d &= -2;
            } else {
                if ((this.f36982d & 1) != 1) {
                    this.f36983e = new ArrayList(this.f36983e);
                    this.f36982d |= 1;
                }
                this.f36983e.addAll(c10241mF0.f37593d);
            }
        }
        if (!c10241mF0.f37594e.isEmpty()) {
            if (this.f36984f.isEmpty()) {
                this.f36984f = c10241mF0.f37594e;
                this.f36982d &= -3;
            } else {
                if ((this.f36982d & 2) != 2) {
                    this.f36984f = new ArrayList(this.f36984f);
                    this.f36982d |= 2;
                }
                this.f36984f.addAll(c10241mF0.f37594e);
            }
        }
        if (!c10241mF0.f37595f.isEmpty()) {
            if (this.f36985g.isEmpty()) {
                this.f36985g = c10241mF0.f37595f;
                this.f36982d &= -5;
            } else {
                if ((this.f36982d & 4) != 4) {
                    this.f36985g = new ArrayList(this.f36985g);
                    this.f36982d |= 4;
                }
                this.f36985g.addAll(c10241mF0.f37595f);
            }
        }
        if ((c10241mF0.f37592c & 1) == 1) {
            GF0 gf02 = c10241mF0.f37596g;
            if ((this.f36982d & 8) != 8 || (gf0 = this.f36986h) == GF0.f3648g) {
                this.f36986h = gf02;
            } else {
                PE0 pe0M3016i = GF0.m3016i(gf0);
                pe0M3016i.m6278q(gf02);
                this.f36986h = pe0M3016i.m6275m();
            }
            this.f36982d |= 8;
        }
        if ((c10241mF0.f37592c & 2) == 2) {
            NF0 nf02 = c10241mF0.f37597h;
            if ((this.f36982d & 16) != 16 || (nf0 = this.f36987i) == NF0.f7670e) {
                this.f36987i = nf02;
            } else {
                WE0 we0 = new WE0(2);
                we0.f13084d = Collections.emptyList();
                we0.m8716r(nf0);
                we0.m8716r(nf02);
                this.f36987i = we0.m8712n();
            }
            this.f36982d |= 16;
        }
        m25292k(c10241mF0);
        this.f41281a = this.f41281a.m3573d(c10241mF0.f37591b);
    }
}
