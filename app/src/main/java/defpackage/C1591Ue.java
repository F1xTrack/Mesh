package defpackage;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1591Ue implements Comparable {
    public static final C1591Ue e = new C1591Ue(1, 0, 0, "");
    public static final C1591Ue f = new C1591Ue(1, 1, 0, "");
    public static final C1591Ue g = new C1591Ue(1, 2, 0, "");
    public static final C1591Ue h = new C1591Ue(1, 3, 0, "");
    public static final C1591Ue i = new C1591Ue(1, 4, 0, "");
    public static final Pattern j = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public C1591Ue(int i2, int i3, int i4, String str) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.d = str;
    }

    public static BigInteger c(C1591Ue c1591Ue) {
        return BigInteger.valueOf(c1591Ue.a).shiftLeft(32).or(BigInteger.valueOf(c1591Ue.b)).shiftLeft(32).or(BigInteger.valueOf(c1591Ue.c));
    }

    public static C1591Ue e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = j.matcher(str);
        if (matcher.matches()) {
            return new C1591Ue(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public final int a(int i2, int i3) {
        int i4 = this.a;
        return i4 == i2 ? Integer.compare(this.b, i3) : Integer.compare(i4, i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1591Ue c1591Ue) {
        return c(this).compareTo(c(c1591Ue));
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1591Ue)) {
            return false;
        }
        C1591Ue c1591Ue = (C1591Ue) obj;
        return Integer.valueOf(this.a).equals(Integer.valueOf(c1591Ue.a)) && Integer.valueOf(this.b).equals(Integer.valueOf(c1591Ue.b)) && Integer.valueOf(this.c).equals(Integer.valueOf(c1591Ue.c));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a + "." + this.b + "." + this.c);
        String str = this.d;
        if (!TextUtils.isEmpty(str)) {
            sb.append("-" + str);
        }
        return sb.toString();
    }
}
