package p000;

import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* renamed from: lb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10158lb1 {

    /* renamed from: d */
    public static final Pattern f37180d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f37181a;

    /* renamed from: b */
    public final String f37182b;

    /* renamed from: c */
    public final String f37183c;

    public C10158lb1(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !f37180d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f37181a = strSubstring;
        this.f37182b = str;
        this.f37183c = AbstractC1374Vq.m8589h(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10158lb1)) {
            return false;
        }
        C10158lb1 c10158lb1 = (C10158lb1) obj;
        return this.f37181a.equals(c10158lb1.f37181a) && this.f37182b.equals(c10158lb1.f37182b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37182b, this.f37181a);
    }
}
