package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Rs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1401Rs1 {
    public static final Pattern c = Pattern.compile("P(\\d+)(\\S+)");
    public final int a;
    public final int b;

    public C1401Rs1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static C1401Rs1 a(String str) {
        Matcher matcher = c.matcher(str);
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
            return new C1401Rs1(i2, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1401Rs1.class != obj.getClass()) {
            return false;
        }
        C1401Rs1 c1401Rs1 = (C1401Rs1) obj;
        return this.a == c1401Rs1.a && this.b == c1401Rs1.b;
    }

    public final int hashCode() {
        return AbstractC8235ym.x(this.b) + (this.a * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Period{number=");
        sb.append(this.a);
        sb.append("timeUnit=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "YEAR" : "MONTH" : "WEEK" : "DAY" : "TIME_UNIT_UNKNOWN");
        sb.append("}");
        return sb.toString();
    }
}
