package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: Vn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1698Vn1 {
    public static final C1698Vn1 b;
    public final C1464Sn1 a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = C1386Rn1.q;
        } else {
            b = C1464Sn1.b;
        }
    }

    public C1698Vn1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new C1386Rn1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new C1308Qn1(this, windowInsets);
        } else if (i >= 28) {
            this.a = new C1230Pn1(this, windowInsets);
        } else {
            this.a = new C1152On1(this, windowInsets);
        }
    }

    public static J80 e(J80 j80, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, j80.a - i);
        int iMax2 = Math.max(0, j80.b - i2);
        int iMax3 = Math.max(0, j80.c - i3);
        int iMax4 = Math.max(0, j80.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? j80 : J80.b(iMax, iMax2, iMax3, iMax4);
    }

    public static C1698Vn1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C1698Vn1 c1698Vn1 = new C1698Vn1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            C1698Vn1 c1698Vn1A = AbstractC4212hk1.a(view);
            C1464Sn1 c1464Sn1 = c1698Vn1.a;
            c1464Sn1.q(c1698Vn1A);
            c1464Sn1.d(view.getRootView());
        }
        return c1698Vn1;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1698Vn1)) {
            return false;
        }
        return Objects.equals(this.a, ((C1698Vn1) obj).a);
    }

    public final C1698Vn1 f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        AbstractC0996Mn1 c0919Ln1 = i5 >= 30 ? new C0919Ln1(this) : i5 >= 29 ? new C0841Kn1(this) : new C0763Jn1(this);
        c0919Ln1.g(J80.b(i, i2, i3, i4));
        return c0919Ln1.b();
    }

    public final WindowInsets g() {
        C1464Sn1 c1464Sn1 = this.a;
        if (c1464Sn1 instanceof AbstractC1074Nn1) {
            return ((AbstractC1074Nn1) c1464Sn1).c;
        }
        return null;
    }

    public final int hashCode() {
        C1464Sn1 c1464Sn1 = this.a;
        if (c1464Sn1 == null) {
            return 0;
        }
        return c1464Sn1.hashCode();
    }

    public C1698Vn1() {
        this.a = new C1464Sn1(this);
    }
}
