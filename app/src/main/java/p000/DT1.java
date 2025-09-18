package p000;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class DT1 {
    /* renamed from: a */
    public static final boolean m1703a(InterfaceC6976us interfaceC6976us) {
        LinkedHashSet linkedHashSet = C1815bv.f17224a;
        if (AbstractC6814sI.m24700l(interfaceC6976us)) {
            LinkedHashSet linkedHashSet2 = C1815bv.f17224a;
            C0055As c0055AsM25153f = AbstractC6940uI.m25153f(interfaceC6976us);
            if (AbstractC7167xu.m25994v(linkedHashSet2, c0055AsM25153f != null ? c0055AsM25153f.m362f() : null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m1704b(C6870tB c6870tB) {
        c6870tB.f42911k = -3.4028235E38f;
        c6870tB.f42910j = Integer.MIN_VALUE;
        CharSequence charSequence = c6870tB.f42901a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c6870tB.f42901a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c6870tB.f42901a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* renamed from: c */
    public static float m1705c(int i, int i2, int i3, float f) {
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
