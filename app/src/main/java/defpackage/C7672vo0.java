package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: vo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7672vo0 implements InputFilter {
    public final int a;

    public C7672vo0(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
