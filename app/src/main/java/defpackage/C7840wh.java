package defpackage;

import java.util.Arrays;

/* renamed from: wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7840wh {
    public final int a;
    public final CharSequence b;

    public C7840wh(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7840wh)) {
            return false;
        }
        C7840wh c7840wh = (C7840wh) obj;
        if (this.a != c7840wh.a) {
            return false;
        }
        CharSequence charSequence = this.b;
        String string = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence2 = c7840wh.b;
        String string2 = charSequence2 != null ? charSequence2.toString() : null;
        return (string == null && string2 == null) || (string != null && string.equals(string2));
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
