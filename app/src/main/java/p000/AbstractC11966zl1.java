package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: zl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11966zl1 {

    /* renamed from: a */
    public static final C7597Fl1 f46983a;

    /* renamed from: b */
    public static final C4016er f46984b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f46983a = new C7649Gl1();
        } else {
            f46983a = new C7597Fl1();
        }
        f46984b = new C4016er("translationAlpha", 6, Float.class);
        new C4016er("clipBounds", 7, Rect.class);
    }

    /* renamed from: a */
    public static void m26532a(View view, int i, int i2, int i3, int i4) {
        f46983a.mo2767e(view, i, i2, i3, i4);
    }

    /* renamed from: b */
    public static void m26533b(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f46983a.mo2766d(view, i);
    }
}
