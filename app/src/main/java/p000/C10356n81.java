package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* renamed from: n81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10356n81 {

    /* renamed from: a */
    public final String f38140a;

    /* renamed from: b */
    public final String f38141b;

    /* renamed from: c */
    public final boolean f38142c;

    /* renamed from: d */
    public final int f38143d;

    /* renamed from: e */
    public final String f38144e;

    /* renamed from: f */
    public final int f38145f;

    /* renamed from: g */
    public final int f38146g;

    public C10356n81(int i, int i2, String str, String str2, String str3, boolean z) {
        this.f38140a = str;
        this.f38141b = str2;
        this.f38142c = z;
        this.f38143d = i;
        this.f38144e = str3;
        this.f38145f = i2;
        Locale locale = Locale.US;
        O90.m5967e(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        O90.m5967e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f38146g = AbstractC11374v51.m25351p(upperCase, "INT", false) ? 3 : (AbstractC11374v51.m25351p(upperCase, "CHAR", false) || AbstractC11374v51.m25351p(upperCase, "CLOB", false) || AbstractC11374v51.m25351p(upperCase, "TEXT", false)) ? 2 : AbstractC11374v51.m25351p(upperCase, "BLOB", false) ? 5 : (AbstractC11374v51.m25351p(upperCase, "REAL", false) || AbstractC11374v51.m25351p(upperCase, "FLOA", false) || AbstractC11374v51.m25351p(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10356n81)) {
            return false;
        }
        C10356n81 c10356n81 = (C10356n81) obj;
        if (this.f38143d != c10356n81.f38143d) {
            return false;
        }
        if (!this.f38140a.equals(c10356n81.f38140a) || this.f38142c != c10356n81.f38142c) {
            return false;
        }
        int i = c10356n81.f38145f;
        String str = c10356n81.f38144e;
        String str2 = this.f38144e;
        int i2 = this.f38145f;
        if (i2 == 1 && i == 2 && str2 != null && !OT1.m6074a(str2, str)) {
            return false;
        }
        if (i2 != 2 || i != 1 || str == null || OT1.m6074a(str, str2)) {
            return (i2 == 0 || i2 != i || (str2 == null ? str == null : OT1.m6074a(str2, str))) && this.f38146g == c10356n81.f38146g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f38140a.hashCode() * 31) + this.f38146g) * 31) + (this.f38142c ? 1231 : 1237)) * 31) + this.f38143d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f38140a);
        sb.append("', type='");
        sb.append(this.f38141b);
        sb.append("', affinity='");
        sb.append(this.f38146g);
        sb.append("', notNull=");
        sb.append(this.f38142c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f38143d);
        sb.append(", defaultValue='");
        String str = this.f38144e;
        if (str == null) {
            str = StringUtils.UNDEFINED;
        }
        return AbstractC1374Vq.m8593l(sb, str, "'}");
    }
}
