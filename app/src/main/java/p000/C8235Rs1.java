package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Rs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8235Rs1 {

    /* renamed from: c */
    public static final Pattern f10465c = Pattern.compile("P(\\d+)(\\S+)");

    /* renamed from: a */
    public final int f10466a;

    /* renamed from: b */
    public final int f10467b;

    public C8235Rs1(int i, int i2) {
        this.f10466a = i;
        this.f10467b = i2;
    }

    /* renamed from: a */
    public static C8235Rs1 m7125a(String str) {
        Matcher matcher = f10465c.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        int i = 1;
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        if (strGroup == null || strGroup2 == null) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(strGroup);
            char cCharAt = strGroup2.charAt(0);
            if (cCharAt == 'D') {
                i = 2;
            } else if (cCharAt == 'M') {
                i = 4;
            } else if (cCharAt == 'W') {
                i = 3;
            } else if (cCharAt == 'Y') {
                i = 5;
            }
            return new C8235Rs1(i2, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8235Rs1.class != obj.getClass()) {
            return false;
        }
        C8235Rs1 c8235Rs1 = (C8235Rs1) obj;
        return this.f10466a == c8235Rs1.f10466a && this.f10467b == c8235Rs1.f10467b;
    }

    public final int hashCode() {
        return AbstractC7222ym.m26247x(this.f10467b) + (this.f10466a * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Period{number=");
        sb.append(this.f10466a);
        sb.append("timeUnit=");
        int i = this.f10467b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "YEAR" : "MONTH" : "WEEK" : "DAY" : "TIME_UNIT_UNKNOWN");
        sb.append("}");
        return sb.toString();
    }
}
