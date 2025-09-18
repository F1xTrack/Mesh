package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: Nn1 */
/* loaded from: classes.dex */
public abstract class AbstractC1074Nn1 extends C1464Sn1 {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public J80[] d;
    public J80 e;
    public C1698Vn1 f;
    public J80 g;

    public AbstractC1074Nn1(C1698Vn1 c1698Vn1, WindowInsets windowInsets) {
        super(c1698Vn1);
        this.e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private J80 s(int i2, boolean z) {
        J80 j80A = J80.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                j80A = J80.a(j80A, t(i3, z));
            }
        }
        return j80A;
    }

    private J80 u() {
        C1698Vn1 c1698Vn1 = this.f;
        return c1698Vn1 != null ? c1698Vn1.a.h() : J80.e;
    }

    private J80 v(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            x();
        }
        Method method = i;
        if (method != null && j != null && k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    return null;
                }
                Rect rect = (Rect) k.get(l.get(objInvoke));
                if (rect != null) {
                    return J80.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void x() throws ClassNotFoundException, SecurityException {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        h = true;
    }

    @Override // defpackage.C1464Sn1
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        J80 j80V = v(view);
        if (j80V == null) {
            j80V = J80.e;
        }
        y(j80V);
    }

    @Override // defpackage.C1464Sn1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.g, ((AbstractC1074Nn1) obj).g);
        }
        return false;
    }

    @Override // defpackage.C1464Sn1
    public J80 f(int i2) {
        return s(i2, false);
    }

    @Override // defpackage.C1464Sn1
    public final J80 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = J80.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.C1464Sn1
    public C1698Vn1 l(int i2, int i3, int i4, int i5) {
        C1698Vn1 c1698Vn1H = C1698Vn1.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        AbstractC0996Mn1 c0919Ln1 = i6 >= 30 ? new C0919Ln1(c1698Vn1H) : i6 >= 29 ? new C0841Kn1(c1698Vn1H) : new C0763Jn1(c1698Vn1H);
        c0919Ln1.g(C1698Vn1.e(j(), i2, i3, i4, i5));
        c0919Ln1.e(C1698Vn1.e(h(), i2, i3, i4, i5));
        return c0919Ln1.b();
    }

    @Override // defpackage.C1464Sn1
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.C1464Sn1
    @SuppressLint({"WrongConstant"})
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !w(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.C1464Sn1
    public void p(J80[] j80Arr) {
        this.d = j80Arr;
    }

    @Override // defpackage.C1464Sn1
    public void q(C1698Vn1 c1698Vn1) {
        this.f = c1698Vn1;
    }

    public J80 t(int i2, boolean z) {
        J80 j80H;
        int i3;
        if (i2 == 1) {
            return z ? J80.b(0, Math.max(u().b, j().b), 0, 0) : J80.b(0, j().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                J80 j80U = u();
                J80 j80H2 = h();
                return J80.b(Math.max(j80U.a, j80H2.a), 0, Math.max(j80U.c, j80H2.c), Math.max(j80U.d, j80H2.d));
            }
            J80 j80J = j();
            C1698Vn1 c1698Vn1 = this.f;
            j80H = c1698Vn1 != null ? c1698Vn1.a.h() : null;
            int iMin = j80J.d;
            if (j80H != null) {
                iMin = Math.min(iMin, j80H.d);
            }
            return J80.b(j80J.a, 0, j80J.c, iMin);
        }
        J80 j80 = J80.e;
        if (i2 == 8) {
            J80[] j80Arr = this.d;
            j80H = j80Arr != null ? j80Arr[AbstractC3884g12.a(8)] : null;
            if (j80H != null) {
                return j80H;
            }
            J80 j80J2 = j();
            J80 j80U2 = u();
            int i4 = j80J2.d;
            if (i4 > j80U2.d) {
                return J80.b(0, 0, 0, i4);
            }
            J80 j802 = this.g;
            return (j802 == null || j802.equals(j80) || (i3 = this.g.d) <= j80U2.d) ? j80 : J80.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return j80;
        }
        C1698Vn1 c1698Vn12 = this.f;
        IK ikE = c1698Vn12 != null ? c1698Vn12.a.e() : e();
        if (ikE == null) {
            return j80;
        }
        int i5 = Build.VERSION.SDK_INT;
        return J80.b(i5 >= 28 ? HK.d(ikE.a) : 0, i5 >= 28 ? HK.f(ikE.a) : 0, i5 >= 28 ? HK.e(ikE.a) : 0, i5 >= 28 ? HK.c(ikE.a) : 0);
    }

    public boolean w(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !t(i2, false).equals(J80.e);
    }

    public void y(J80 j80) {
        this.g = j80;
    }
}
