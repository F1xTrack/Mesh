package defpackage;

import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* renamed from: lb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5725lb1 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public C5725lb1(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(AbstractC8235ym.k("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = strSubstring;
        this.b = str;
        this.c = AbstractC1705Vq.h(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5725lb1)) {
            return false;
        }
        C5725lb1 c5725lb1 = (C5725lb1) obj;
        return this.a.equals(c5725lb1.a) && this.b.equals(c5725lb1.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.a);
    }
}
