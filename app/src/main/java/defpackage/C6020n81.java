package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* renamed from: n81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6020n81 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public C6020n81(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        Locale locale = Locale.US;
        O90.e(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        O90.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.g = AbstractC7538v51.p(upperCase, "INT", false) ? 3 : (AbstractC7538v51.p(upperCase, "CHAR", false) || AbstractC7538v51.p(upperCase, "CLOB", false) || AbstractC7538v51.p(upperCase, "TEXT", false)) ? 2 : AbstractC7538v51.p(upperCase, "BLOB", false) ? 5 : (AbstractC7538v51.p(upperCase, "REAL", false) || AbstractC7538v51.p(upperCase, "FLOA", false) || AbstractC7538v51.p(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6020n81)) {
            return false;
        }
        C6020n81 c6020n81 = (C6020n81) obj;
        if (this.d != c6020n81.d) {
            return false;
        }
        if (!this.a.equals(c6020n81.a) || this.c != c6020n81.c) {
            return false;
        }
        int i = c6020n81.f;
        String str = c6020n81.e;
        String str2 = this.e;
        int i2 = this.f;
        if (i2 == 1 && i == 2 && str2 != null && !OT1.a(str2, str)) {
            return false;
        }
        if (i2 != 2 || i != 1 || str == null || OT1.a(str, str2)) {
            return (i2 == 0 || i2 != i || (str2 == null ? str == null : OT1.a(str2, str))) && this.g == c6020n81.g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.g);
        sb.append("', notNull=");
        sb.append(this.c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.e;
        if (str == null) {
            str = StringUtils.UNDEFINED;
        }
        return AbstractC1705Vq.l(sb, str, "'}");
    }
}
