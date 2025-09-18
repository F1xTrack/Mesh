package p000;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: vo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11463vo0 implements InputFilter {

    /* renamed from: a */
    public final int f44542a;

    public C11463vo0(int i) {
        this.f44542a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f44542a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
