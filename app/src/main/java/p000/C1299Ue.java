package p000;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Ue */
/* loaded from: classes.dex */
public final class C1299Ue implements Comparable {

    /* renamed from: e */
    public static final C1299Ue f11944e = new C1299Ue(1, 0, 0, "");

    /* renamed from: f */
    public static final C1299Ue f11945f = new C1299Ue(1, 1, 0, "");

    /* renamed from: g */
    public static final C1299Ue f11946g = new C1299Ue(1, 2, 0, "");

    /* renamed from: h */
    public static final C1299Ue f11947h = new C1299Ue(1, 3, 0, "");

    /* renamed from: i */
    public static final C1299Ue f11948i = new C1299Ue(1, 4, 0, "");

    /* renamed from: j */
    public static final Pattern f11949j = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    /* renamed from: a */
    public final int f11950a;

    /* renamed from: b */
    public final int f11951b;

    /* renamed from: c */
    public final int f11952c;

    /* renamed from: d */
    public final String f11953d;

    public C1299Ue(int i, int i2, int i3, String str) {
        this.f11950a = i;
        this.f11951b = i2;
        this.f11952c = i3;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f11953d = str;
    }

    /* renamed from: c */
    public static BigInteger m8098c(C1299Ue c1299Ue) {
        return BigInteger.valueOf(c1299Ue.f11950a).shiftLeft(32).or(BigInteger.valueOf(c1299Ue.f11951b)).shiftLeft(32).or(BigInteger.valueOf(c1299Ue.f11952c));
    }

    /* renamed from: e */
    public static C1299Ue m8099e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f11949j.matcher(str);
        if (matcher.matches()) {
            return new C1299Ue(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    /* renamed from: a */
    public final int m8100a(int i, int i2) {
        int i3 = this.f11950a;
        return i3 == i ? Integer.compare(this.f11951b, i2) : Integer.compare(i3, i);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1299Ue c1299Ue) {
        return m8098c(this).compareTo(m8098c(c1299Ue));
    }

    /* renamed from: d */
    public final int m8102d() {
        return this.f11950a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1299Ue)) {
            return false;
        }
        C1299Ue c1299Ue = (C1299Ue) obj;
        return Integer.valueOf(this.f11950a).equals(Integer.valueOf(c1299Ue.f11950a)) && Integer.valueOf(this.f11951b).equals(Integer.valueOf(c1299Ue.f11951b)) && Integer.valueOf(this.f11952c).equals(Integer.valueOf(c1299Ue.f11952c));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11950a), Integer.valueOf(this.f11951b), Integer.valueOf(this.f11952c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f11950a + "." + this.f11951b + "." + this.f11952c);
        String str = this.f11953d;
        if (!TextUtils.isEmpty(str)) {
            sb.append("-" + str);
        }
        return sb.toString();
    }
}
