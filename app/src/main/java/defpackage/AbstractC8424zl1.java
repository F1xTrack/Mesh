package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: zl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8424zl1 {
    public static final C0445Fl1 a;
    public static final C3658er b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new C0523Gl1();
        } else {
            a = new C0445Fl1();
        }
        b = new C3658er("translationAlpha", 6, Float.class);
        new C3658er("clipBounds", 7, Rect.class);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.e(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        a.d(view, i);
    }
}
