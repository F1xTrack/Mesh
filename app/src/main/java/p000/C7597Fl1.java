package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: Fl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7597Fl1 extends T02 {

    /* renamed from: d */
    public static boolean f3407d = true;

    /* renamed from: e */
    public static boolean f3408e = true;

    /* renamed from: f */
    public static boolean f3409f = true;

    /* renamed from: g */
    public static boolean f3410g = true;

    @Override // p000.T02
    /* renamed from: d */
    public void mo2766d(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo2766d(view, i);
        } else if (f3410g) {
            try {
                AbstractC7545El1.m2386a(view, i);
            } catch (NoSuchMethodError unused) {
                f3410g = false;
            }
        }
    }

    /* renamed from: e */
    public void mo2767e(View view, int i, int i2, int i3, int i4) {
        if (f3409f) {
            try {
                AbstractC7493Dl1.m1867a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f3409f = false;
            }
        }
    }

    /* renamed from: f */
    public void mo2768f(View view, Matrix matrix) {
        if (f3407d) {
            try {
                AbstractC7441Cl1.m1309b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3407d = false;
            }
        }
    }

    /* renamed from: g */
    public void mo2769g(View view, Matrix matrix) {
        if (f3408e) {
            try {
                AbstractC7441Cl1.m1310c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f3408e = false;
            }
        }
    }
}
