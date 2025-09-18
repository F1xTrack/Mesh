package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.io.EOFException;

/* renamed from: d02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3308d02 {
    public static ColorStateList a(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !B1.t(drawable)) {
            return null;
        }
        return B1.d(drawable).getColorStateList();
    }

    public static final boolean b(C6129nj c6129nj) {
        O90.f(c6129nj, "<this>");
        try {
            C6129nj c6129nj2 = new C6129nj();
            c6129nj.p(c6129nj2, 0L, AbstractC5686lO1.b(c6129nj.b, 64L));
            int i = 0;
            while (i < 16) {
                i++;
                if (c6129nj2.w()) {
                    return true;
                }
                int iH0 = c6129nj2.h0();
                if (Character.isISOControl(iH0) && !Character.isWhitespace(iH0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
