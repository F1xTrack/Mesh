package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: gz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4064gz {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public C4064gz(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC7178tD.a.get()).format(new Date(j2));
                O90.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        O90.e(string, "toString()");
        return string;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4064gz) {
            C4064gz c4064gz = (C4064gz) obj;
            if (O90.a(c4064gz.a, this.a) && O90.a(c4064gz.b, this.b) && c4064gz.c == this.c && O90.a(c4064gz.d, this.d) && O90.a(c4064gz.e, this.e) && c4064gz.f == this.f && c4064gz.g == this.g && c4064gz.h == this.h && c4064gz.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = AbstractC1705Vq.e(AbstractC1705Vq.e(527, 31, this.a), 31, this.b);
        long j2 = this.c;
        return ((((((AbstractC1705Vq.e(AbstractC1705Vq.e((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        return a(false);
    }
}
