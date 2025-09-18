package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: Jn1 */
/* loaded from: classes.dex */
public final class C0763Jn1 extends AbstractC0996Mn1 {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public J80 d;

    public C0763Jn1() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC0996Mn1
    public C1698Vn1 b() {
        a();
        C1698Vn1 c1698Vn1H = C1698Vn1.h(null, this.c);
        J80[] j80Arr = this.b;
        C1464Sn1 c1464Sn1 = c1698Vn1H.a;
        c1464Sn1.p(j80Arr);
        c1464Sn1.r(this.d);
        return c1698Vn1H;
    }

    @Override // defpackage.AbstractC0996Mn1
    public void e(J80 j80) {
        this.d = j80;
    }

    @Override // defpackage.AbstractC0996Mn1
    public void g(J80 j80) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(j80.a, j80.b, j80.c, j80.d);
        }
    }

    public C0763Jn1(C1698Vn1 c1698Vn1) {
        super(c1698Vn1);
        this.c = c1698Vn1.g();
    }
}
