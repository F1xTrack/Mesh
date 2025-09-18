package p000;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: gz */
/* loaded from: classes2.dex */
public final class C4150gz {

    /* renamed from: j */
    public static final Pattern f28124j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f28125k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f28126l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f28127m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f28128a;

    /* renamed from: b */
    public final String f28129b;

    /* renamed from: c */
    public final long f28130c;

    /* renamed from: d */
    public final String f28131d;

    /* renamed from: e */
    public final String f28132e;

    /* renamed from: f */
    public final boolean f28133f;

    /* renamed from: g */
    public final boolean f28134g;

    /* renamed from: h */
    public final boolean f28135h;

    /* renamed from: i */
    public final boolean f28136i;

    public C4150gz(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f28128a = str;
        this.f28129b = str2;
        this.f28130c = j;
        this.f28131d = str3;
        this.f28132e = str4;
        this.f28133f = z;
        this.f28134g = z2;
        this.f28135h = z3;
        this.f28136i = z4;
    }

    /* renamed from: a */
    public final String m18678a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28128a);
        sb.append('=');
        sb.append(this.f28129b);
        if (this.f28135h) {
            long j = this.f28130c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC6872tD.f42950a.get()).format(new Date(j));
                O90.m5967e(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f28136i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f28131d);
        }
        sb.append("; path=");
        sb.append(this.f28132e);
        if (this.f28133f) {
            sb.append("; secure");
        }
        if (this.f28134g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        O90.m5967e(string, "toString()");
        return string;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4150gz) {
            C4150gz c4150gz = (C4150gz) obj;
            if (O90.m5963a(c4150gz.f28128a, this.f28128a) && O90.m5963a(c4150gz.f28129b, this.f28129b) && c4150gz.f28130c == this.f28130c && O90.m5963a(c4150gz.f28131d, this.f28131d) && O90.m5963a(c4150gz.f28132e, this.f28132e) && c4150gz.f28133f == this.f28133f && c4150gz.f28134g == this.f28134g && c4150gz.f28135h == this.f28135h && c4150gz.f28136i == this.f28136i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM8586e = AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e(527, 31, this.f28128a), 31, this.f28129b);
        long j = this.f28130c;
        return ((((((AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e((iM8586e + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f28131d), 31, this.f28132e) + (this.f28133f ? 1231 : 1237)) * 31) + (this.f28134g ? 1231 : 1237)) * 31) + (this.f28135h ? 1231 : 1237)) * 31) + (this.f28136i ? 1231 : 1237);
    }

    public final String toString() {
        return m18678a(false);
    }
}
