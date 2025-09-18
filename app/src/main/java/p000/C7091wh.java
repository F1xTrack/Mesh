package p000;

import java.util.Arrays;

/* renamed from: wh */
/* loaded from: classes.dex */
public final class C7091wh {

    /* renamed from: a */
    public final int f45026a;

    /* renamed from: b */
    public final CharSequence f45027b;

    public C7091wh(int i, CharSequence charSequence) {
        this.f45026a = i;
        this.f45027b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7091wh)) {
            return false;
        }
        C7091wh c7091wh = (C7091wh) obj;
        if (this.f45026a != c7091wh.f45026a) {
            return false;
        }
        CharSequence charSequence = this.f45027b;
        String string = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence2 = c7091wh.f45027b;
        String string2 = charSequence2 != null ? charSequence2.toString() : null;
        return (string == null && string2 == null) || (string != null && string.equals(string2));
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f45026a);
        CharSequence charSequence = this.f45027b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
