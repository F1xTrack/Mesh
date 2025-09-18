package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.io.EOFException;

/* renamed from: d02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9057d02 {
    /* renamed from: a */
    public static ColorStateList m17462a(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0065B1.m457t(drawable)) {
            return null;
        }
        return AbstractC0065B1.m441d(drawable).getColorStateList();
    }

    /* renamed from: b */
    public static final boolean m17463b(C6507nj c6507nj) {
        O90.m5968f(c6507nj, "<this>");
        try {
            C6507nj c6507nj2 = new C6507nj();
            c6507nj.m23192p(c6507nj2, 0L, AbstractC10132lO1.m22417b(c6507nj.f38488b, 64L));
            int i = 0;
            while (i < 16) {
                i++;
                if (c6507nj2.m23200w()) {
                    return true;
                }
                int iM23184h0 = c6507nj2.m23184h0();
                if (Character.isISOControl(iM23184h0) && !Character.isWhitespace(iM23184h0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
