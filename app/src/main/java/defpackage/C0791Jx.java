package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: Jx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791Jx {
    public final C3488dy b;
    public final int c;
    public C0791Jx d;
    public P21 g;
    public HashSet a = null;
    public int e = 0;
    public int f = -1;

    public C0791Jx(C3488dy c3488dy, int i) {
        this.b = c3488dy;
        this.c = i;
    }

    public final void a(C0791Jx c0791Jx, int i) {
        b(c0791Jx, i, -1, false);
    }

    public final boolean b(C0791Jx c0791Jx, int i, int i2, boolean z) {
        if (c0791Jx == null) {
            h();
            return true;
        }
        if (!z && !g(c0791Jx)) {
            return false;
        }
        this.d = c0791Jx;
        if (c0791Jx.a == null) {
            c0791Jx.a = new HashSet();
        }
        this.d.a.add(this);
        if (i > 0) {
            this.e = i;
        } else {
            this.e = 0;
        }
        this.f = i2;
        return true;
    }

    public final int c() {
        C0791Jx c0791Jx;
        if (this.b.V == 8) {
            return 0;
        }
        int i = this.f;
        return (i <= -1 || (c0791Jx = this.d) == null || c0791Jx.b.V != 8) ? this.e : i;
    }

    public final C0791Jx d() {
        int i = this.c;
        int iX = AbstractC8235ym.x(i);
        C3488dy c3488dy = this.b;
        switch (iX) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c3488dy.z;
            case 2:
                return c3488dy.A;
            case 3:
                return c3488dy.x;
            case 4:
                return c3488dy.y;
            default:
                throw new AssertionError(AbstractC1705Vq.s(i));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0791Jx) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.d != null;
    }

    public final boolean g(C0791Jx c0791Jx) {
        if (c0791Jx == null) {
            return false;
        }
        int i = this.c;
        C3488dy c3488dy = c0791Jx.b;
        int i2 = c0791Jx.c;
        if (i2 == i) {
            return i != 6 || (c3488dy.w && this.b.w);
        }
        switch (AbstractC8235ym.x(i)) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = i2 == 2 || i2 == 4;
                if (c3488dy instanceof C4077h20) {
                    return z || i2 == 8;
                }
                return z;
            case 2:
            case 4:
                boolean z2 = i2 == 3 || i2 == 5;
                if (c3488dy instanceof C4077h20) {
                    return z2 || i2 == 9;
                }
                return z2;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC1705Vq.s(i));
        }
    }

    public final void h() {
        HashSet hashSet;
        C0791Jx c0791Jx = this.d;
        if (c0791Jx != null && (hashSet = c0791Jx.a) != null) {
            hashSet.remove(this);
        }
        this.d = null;
        this.e = 0;
        this.f = -1;
    }

    public final void i() {
        P21 p21 = this.g;
        if (p21 == null) {
            this.g = new P21(1);
        } else {
            p21.c();
        }
    }

    public final String toString() {
        return this.b.W + StringUtils.PROCESS_POSTFIX_DELIMITER + AbstractC1705Vq.s(this.c);
    }
}
