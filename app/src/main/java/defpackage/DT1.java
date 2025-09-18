package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class DT1 {
    public static final boolean a(InterfaceC7492us interfaceC7492us) {
        LinkedHashSet linkedHashSet = C2414bv.a;
        if (AbstractC7002sI.l(interfaceC7492us)) {
            LinkedHashSet linkedHashSet2 = C2414bv.a;
            C0074As c0074AsF = AbstractC7384uI.f(interfaceC7492us);
            if (AbstractC8069xu.v(linkedHashSet2, c0074AsF != null ? c0074AsF.f() : null)) {
                return true;
            }
        }
        return false;
    }

    public static void b(C7172tB c7172tB) {
        c7172tB.k = -3.4028235E38f;
        c7172tB.j = Integer.MIN_VALUE;
        CharSequence charSequence = c7172tB.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c7172tB.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c7172tB.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float c(int i, int i2, int i3, float f) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
