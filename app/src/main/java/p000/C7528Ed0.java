package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Ed0 */
/* loaded from: classes2.dex */
public final class C7528Ed0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public int f2808b;

    /* renamed from: c */
    public int f2809c;

    /* renamed from: d */
    public int f2810d;

    /* renamed from: e */
    public Object f2811e;

    /* renamed from: f */
    public EnumC7580Fd0 f2812f;

    /* renamed from: g */
    public List f2813g;

    /* renamed from: h */
    public List f2814h;

    /* renamed from: l */
    public static C7528Ed0 m2361l() {
        C7528Ed0 c7528Ed0 = new C7528Ed0();
        c7528Ed0.f2809c = 1;
        c7528Ed0.f2811e = "";
        c7528Ed0.f2812f = EnumC7580Fd0.NONE;
        c7528Ed0.f2813g = Collections.emptyList();
        c7528Ed0.f2814h = Collections.emptyList();
        return c7528Ed0;
    }

    public final Object clone() {
        C7528Ed0 c7528Ed0M2361l = m2361l();
        c7528Ed0M2361l.m2363m(m2362k());
        return c7528Ed0M2361l;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        C7632Gd0 c7632Gd0M2362k = m2362k();
        if (c7632Gd0M2362k.mo131e()) {
            return c7632Gd0M2362k;
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
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r2, p000.C0217DR r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            xd0 r0 = p000.C7632Gd0.f3825n     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            Gd0 r0 = new Gd0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.m2363m(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            K0 r0 = r2.f14178a     // Catch: java.lang.Throwable -> Lf
            Gd0 r0 = (p000.C7632Gd0) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.m2363m(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7528Ed0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m2363m((C7632Gd0) a00);
        return this;
    }

    /* renamed from: k */
    public final C7632Gd0 m2362k() {
        C7632Gd0 c7632Gd0 = new C7632Gd0(this);
        int i = this.f2808b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c7632Gd0.f3828c = this.f2809c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c7632Gd0.f3829d = this.f2810d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c7632Gd0.f3830e = this.f2811e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c7632Gd0.f3831f = this.f2812f;
        if ((i & 16) == 16) {
            this.f2813g = Collections.unmodifiableList(this.f2813g);
            this.f2808b &= -17;
        }
        c7632Gd0.f3832g = this.f2813g;
        if ((this.f2808b & 32) == 32) {
            this.f2814h = Collections.unmodifiableList(this.f2814h);
            this.f2808b &= -33;
        }
        c7632Gd0.f3834i = this.f2814h;
        c7632Gd0.f3827b = i2;
        return c7632Gd0;
    }

    /* renamed from: m */
    public final void m2363m(C7632Gd0 c7632Gd0) {
        if (c7632Gd0 == C7632Gd0.f3824m) {
            return;
        }
        int i = c7632Gd0.f3827b;
        if ((i & 1) == 1) {
            int i2 = c7632Gd0.f3828c;
            this.f2808b = 1 | this.f2808b;
            this.f2809c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c7632Gd0.f3829d;
            this.f2808b = 2 | this.f2808b;
            this.f2810d = i3;
        }
        if ((i & 4) == 4) {
            this.f2808b |= 4;
            this.f2811e = c7632Gd0.f3830e;
        }
        if ((i & 8) == 8) {
            EnumC7580Fd0 enumC7580Fd0 = c7632Gd0.f3831f;
            enumC7580Fd0.getClass();
            this.f2808b = 8 | this.f2808b;
            this.f2812f = enumC7580Fd0;
        }
        if (!c7632Gd0.f3832g.isEmpty()) {
            if (this.f2813g.isEmpty()) {
                this.f2813g = c7632Gd0.f3832g;
                this.f2808b &= -17;
            } else {
                if ((this.f2808b & 16) != 16) {
                    this.f2813g = new ArrayList(this.f2813g);
                    this.f2808b |= 16;
                }
                this.f2813g.addAll(c7632Gd0.f3832g);
            }
        }
        if (!c7632Gd0.f3834i.isEmpty()) {
            if (this.f2814h.isEmpty()) {
                this.f2814h = c7632Gd0.f3834i;
                this.f2808b &= -33;
            } else {
                if ((this.f2808b & 32) != 32) {
                    this.f2814h = new ArrayList(this.f2814h);
                    this.f2808b |= 32;
                }
                this.f2814h.addAll(c7632Gd0.f3834i);
            }
        }
        this.f41281a = this.f41281a.m3573d(c7632Gd0.f3826a);
    }
}
