package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: Jx */
/* loaded from: classes.dex */
public final class C0627Jx {

    /* renamed from: b */
    public final C3960dy f5807b;

    /* renamed from: c */
    public final int f5808c;

    /* renamed from: d */
    public C0627Jx f5809d;

    /* renamed from: g */
    public P21 f5812g;

    /* renamed from: a */
    public HashSet f5806a = null;

    /* renamed from: e */
    public int f5810e = 0;

    /* renamed from: f */
    public int f5811f = -1;

    public C0627Jx(C3960dy c3960dy, int i) {
        this.f5807b = c3960dy;
        this.f5808c = i;
    }

    /* renamed from: a */
    public final void m4470a(C0627Jx c0627Jx, int i) {
        m4471b(c0627Jx, i, -1, false);
    }

    /* renamed from: b */
    public final boolean m4471b(C0627Jx c0627Jx, int i, int i2, boolean z) {
        if (c0627Jx == null) {
            m4477h();
            return true;
        }
        if (!z && !m4476g(c0627Jx)) {
            return false;
        }
        this.f5809d = c0627Jx;
        if (c0627Jx.f5806a == null) {
            c0627Jx.f5806a = new HashSet();
        }
        this.f5809d.f5806a.add(this);
        if (i > 0) {
            this.f5810e = i;
        } else {
            this.f5810e = 0;
        }
        this.f5811f = i2;
        return true;
    }

    /* renamed from: c */
    public final int m4472c() {
        C0627Jx c0627Jx;
        if (this.f5807b.f26423V == 8) {
            return 0;
        }
        int i = this.f5811f;
        return (i <= -1 || (c0627Jx = this.f5809d) == null || c0627Jx.f5807b.f26423V != 8) ? this.f5810e : i;
    }

    /* renamed from: d */
    public final C0627Jx m4473d() {
        int i = this.f5808c;
        int iM26247x = AbstractC7222ym.m26247x(i);
        C3960dy c3960dy = this.f5807b;
        switch (iM26247x) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c3960dy.f26456z;
            case 2:
                return c3960dy.f26402A;
            case 3:
                return c3960dy.f26454x;
            case 4:
                return c3960dy.f26455y;
            default:
                throw new AssertionError(AbstractC1374Vq.m8600s(i));
        }
    }

    /* renamed from: e */
    public final boolean m4474e() {
        HashSet hashSet = this.f5806a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0627Jx) it.next()).m4473d().m4475f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m4475f() {
        return this.f5809d != null;
    }

    /* renamed from: g */
    public final boolean m4476g(C0627Jx c0627Jx) {
        if (c0627Jx == null) {
            return false;
        }
        int i = this.f5808c;
        C3960dy c3960dy = c0627Jx.f5807b;
        int i2 = c0627Jx.f5808c;
        if (i2 == i) {
            return i != 6 || (c3960dy.f26453w && this.f5807b.f26453w);
        }
        switch (AbstractC7222ym.m26247x(i)) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = i2 == 2 || i2 == 4;
                if (c3960dy instanceof C9573h20) {
                    return z || i2 == 8;
                }
                return z;
            case 2:
            case 4:
                boolean z2 = i2 == 3 || i2 == 5;
                if (c3960dy instanceof C9573h20) {
                    return z2 || i2 == 9;
                }
                return z2;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC1374Vq.m8600s(i));
        }
    }

    /* renamed from: h */
    public final void m4477h() {
        HashSet hashSet;
        C0627Jx c0627Jx = this.f5809d;
        if (c0627Jx != null && (hashSet = c0627Jx.f5806a) != null) {
            hashSet.remove(this);
        }
        this.f5809d = null;
        this.f5810e = 0;
        this.f5811f = -1;
    }

    /* renamed from: i */
    public final void m4478i() {
        P21 p21 = this.f5812g;
        if (p21 == null) {
            this.f5812g = new P21(1);
        } else {
            p21.m6210c();
        }
    }

    public final String toString() {
        return this.f5807b.f26424W + StringUtils.PROCESS_POSTFIX_DELIMITER + AbstractC1374Vq.m8600s(this.f5808c);
    }
}
