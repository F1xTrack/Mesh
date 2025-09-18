package p000;

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
public abstract class AbstractC8017Nn1 extends C8277Sn1 {

    /* renamed from: h */
    public static boolean f7997h = false;

    /* renamed from: i */
    public static Method f7998i;

    /* renamed from: j */
    public static Class f7999j;

    /* renamed from: k */
    public static Field f8000k;

    /* renamed from: l */
    public static Field f8001l;

    /* renamed from: c */
    public final WindowInsets f8002c;

    /* renamed from: d */
    public J80[] f8003d;

    /* renamed from: e */
    public J80 f8004e;

    /* renamed from: f */
    public C8433Vn1 f8005f;

    /* renamed from: g */
    public J80 f8006g;

    public AbstractC8017Nn1(C8433Vn1 c8433Vn1, WindowInsets windowInsets) {
        super(c8433Vn1);
        this.f8004e = null;
        this.f8002c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: s */
    private J80 m5832s(int i, boolean z) {
        J80 j80M4200a = J80.f5351e;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                j80M4200a = J80.m4200a(j80M4200a, m5844t(i2, z));
            }
        }
        return j80M4200a;
    }

    /* renamed from: u */
    private J80 m5833u() {
        C8433Vn1 c8433Vn1 = this.f8005f;
        return c8433Vn1 != null ? c8433Vn1.f12756a.mo6141h() : J80.f5351e;
    }

    /* renamed from: v */
    private J80 m5834v(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f7997h) {
            m5835x();
        }
        Method method = f7998i;
        if (method != null && f7999j != null && f8000k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    return null;
                }
                Rect rect = (Rect) f8000k.get(f8001l.get(objInvoke));
                if (rect != null) {
                    return J80.m4201b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: x */
    private static void m5835x() throws ClassNotFoundException, SecurityException {
        try {
            f7998i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f7999j = cls;
            f8000k = cls.getDeclaredField("mVisibleInsets");
            f8001l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f8000k.setAccessible(true);
            f8001l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        f7997h = true;
    }

    @Override // p000.C8277Sn1
    /* renamed from: d */
    public void mo5836d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        J80 j80M5834v = m5834v(view);
        if (j80M5834v == null) {
            j80M5834v = J80.f5351e;
        }
        m5846y(j80M5834v);
    }

    @Override // p000.C8277Sn1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f8006g, ((AbstractC8017Nn1) obj).f8006g);
        }
        return false;
    }

    @Override // p000.C8277Sn1
    /* renamed from: f */
    public J80 mo5837f(int i) {
        return m5832s(i, false);
    }

    @Override // p000.C8277Sn1
    /* renamed from: j */
    public final J80 mo5838j() {
        if (this.f8004e == null) {
            WindowInsets windowInsets = this.f8002c;
            this.f8004e = J80.m4201b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f8004e;
    }

    @Override // p000.C8277Sn1
    /* renamed from: l */
    public C8433Vn1 mo5839l(int i, int i2, int i3, int i4) {
        C8433Vn1 c8433Vn1M8551h = C8433Vn1.m8551h(null, this.f8002c);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC7965Mn1 c7913Ln1 = i5 >= 30 ? new C7913Ln1(c8433Vn1M8551h) : i5 >= 29 ? new C7861Kn1(c8433Vn1M8551h) : new C7809Jn1(c8433Vn1M8551h);
        c7913Ln1.mo4416g(C8433Vn1.m8550e(mo5838j(), i, i2, i3, i4));
        c7913Ln1.mo4415e(C8433Vn1.m8550e(mo6141h(), i, i2, i3, i4));
        return c7913Ln1.mo4414b();
    }

    @Override // p000.C8277Sn1
    /* renamed from: n */
    public boolean mo5840n() {
        return this.f8002c.isRound();
    }

    @Override // p000.C8277Sn1
    @SuppressLint({"WrongConstant"})
    /* renamed from: o */
    public boolean mo5841o(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0 && !m5845w(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.C8277Sn1
    /* renamed from: p */
    public void mo5842p(J80[] j80Arr) {
        this.f8003d = j80Arr;
    }

    @Override // p000.C8277Sn1
    /* renamed from: q */
    public void mo5843q(C8433Vn1 c8433Vn1) {
        this.f8005f = c8433Vn1;
    }

    /* renamed from: t */
    public J80 m5844t(int i, boolean z) {
        J80 j80Mo6141h;
        int i2;
        if (i == 1) {
            return z ? J80.m4201b(0, Math.max(m5833u().f5353b, mo5838j().f5353b), 0, 0) : J80.m4201b(0, mo5838j().f5353b, 0, 0);
        }
        if (i == 2) {
            if (z) {
                J80 j80M5833u = m5833u();
                J80 j80Mo6141h2 = mo6141h();
                return J80.m4201b(Math.max(j80M5833u.f5352a, j80Mo6141h2.f5352a), 0, Math.max(j80M5833u.f5354c, j80Mo6141h2.f5354c), Math.max(j80M5833u.f5355d, j80Mo6141h2.f5355d));
            }
            J80 j80Mo5838j = mo5838j();
            C8433Vn1 c8433Vn1 = this.f8005f;
            j80Mo6141h = c8433Vn1 != null ? c8433Vn1.f12756a.mo6141h() : null;
            int iMin = j80Mo5838j.f5355d;
            if (j80Mo6141h != null) {
                iMin = Math.min(iMin, j80Mo6141h.f5355d);
            }
            return J80.m4201b(j80Mo5838j.f5352a, 0, j80Mo5838j.f5354c, iMin);
        }
        J80 j80 = J80.f5351e;
        if (i == 8) {
            J80[] j80Arr = this.f8003d;
            j80Mo6141h = j80Arr != null ? j80Arr[AbstractC9444g12.m18381a(8)] : null;
            if (j80Mo6141h != null) {
                return j80Mo6141h;
            }
            J80 j80Mo5838j2 = mo5838j();
            J80 j80M5833u2 = m5833u();
            int i3 = j80Mo5838j2.f5355d;
            if (i3 > j80M5833u2.f5355d) {
                return J80.m4201b(0, 0, 0, i3);
            }
            J80 j802 = this.f8006g;
            return (j802 == null || j802.equals(j80) || (i2 = this.f8006g.f5355d) <= j80M5833u2.f5355d) ? j80 : J80.m4201b(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo6786i();
        }
        if (i == 32) {
            return mo6785g();
        }
        if (i == 64) {
            return mo6787k();
        }
        if (i != 128) {
            return j80;
        }
        C8433Vn1 c8433Vn12 = this.f8005f;
        C0525IK c0525ikMo6431e = c8433Vn12 != null ? c8433Vn12.f12756a.mo6431e() : mo6431e();
        if (c0525ikMo6431e == null) {
            return j80;
        }
        int i4 = Build.VERSION.SDK_INT;
        return J80.m4201b(i4 >= 28 ? AbstractC0462HK.m3348d(c0525ikMo6431e.f4896a) : 0, i4 >= 28 ? AbstractC0462HK.m3350f(c0525ikMo6431e.f4896a) : 0, i4 >= 28 ? AbstractC0462HK.m3349e(c0525ikMo6431e.f4896a) : 0, i4 >= 28 ? AbstractC0462HK.m3347c(c0525ikMo6431e.f4896a) : 0);
    }

    /* renamed from: w */
    public boolean m5845w(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m5844t(i, false).equals(J80.f5351e);
    }

    /* renamed from: y */
    public void m5846y(J80 j80) {
        this.f8006g = j80;
    }
}
