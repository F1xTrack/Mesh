package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: Fl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0445Fl1 extends T02 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;

    @Override // defpackage.T02
    public void d(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.d(view, i);
        } else if (g) {
            try {
                AbstractC0367El1.a(view, i);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    public void e(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                AbstractC0289Dl1.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public void f(View view, Matrix matrix) {
        if (d) {
            try {
                AbstractC0211Cl1.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void g(View view, Matrix matrix) {
        if (e) {
            try {
                AbstractC0211Cl1.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
