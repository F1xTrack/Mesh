package p000;

import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: oM */
/* loaded from: classes2.dex */
public final class C6547oM implements Comparable {

    /* renamed from: b */
    public static final long f38964b;

    /* renamed from: c */
    public static final long f38965c;

    /* renamed from: d */
    public static final /* synthetic */ int f38966d = 0;

    /* renamed from: a */
    public final long f38967a;

    static {
        int i = AbstractC6612pM.f40031a;
        f38964b = AbstractC9313f02.m18148a(4611686018427387903L);
        f38965c = AbstractC9313f02.m18148a(-4611686018427387903L);
    }

    /* renamed from: a */
    public static final void m23368a(StringBuilder sb, int i, int i2, int i3, String str) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            O90.m5968f(strValueOf, "<this>");
            if (i3 < 0) {
                throw new IllegalArgumentException(AbstractC7222ym.m26230g(i3, "Desired length ", " is less than zero."));
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i5 = length2;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (i7 < 3) {
                sb.append((CharSequence) string, 0, i7);
            } else {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    /* renamed from: b */
    public static final long m23369b(long j) {
        return ((((int) j) & 1) != 1 || m23370c(j)) ? m23371d(j, EnumC6738rM.f41610c) : j >> 1;
    }

    /* renamed from: c */
    public static final boolean m23370c(long j) {
        return j == f38964b || j == f38965c;
    }

    /* renamed from: d */
    public static final long m23371d(long j, EnumC6738rM enumC6738rM) {
        O90.m5968f(enumC6738rM, "unit");
        if (j == f38964b) {
            return Long.MAX_VALUE;
        }
        if (j == f38965c) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        EnumC6738rM enumC6738rM2 = (((int) j) & 1) == 0 ? EnumC6738rM.f41609b : EnumC6738rM.f41610c;
        O90.m5968f(enumC6738rM2, "sourceUnit");
        return enumC6738rM.f41616a.convert(j2, enumC6738rM2.f41616a);
    }

    /* renamed from: e */
    public static String m23372e(long j) {
        boolean z;
        int iM23371d;
        int i;
        int i2;
        long j2 = j;
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == f38964b) {
            return "Infinity";
        }
        if (j2 == f38965c) {
            return "-Infinity";
        }
        boolean z2 = j2 < 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        if (j2 < 0) {
            j2 = (((int) j2) & 1) + ((-(j2 >> 1)) << 1);
            int i3 = AbstractC6612pM.f40031a;
        }
        long jM23371d = m23371d(j2, EnumC6738rM.f41614g);
        int iM23371d2 = m23370c(j2) ? 0 : (int) (m23371d(j2, EnumC6738rM.f41613f) % 24);
        if (m23370c(j2)) {
            z = z2;
            iM23371d = 0;
        } else {
            z = z2;
            iM23371d = (int) (m23371d(j2, EnumC6738rM.f41612e) % 60);
        }
        int iM23371d3 = m23370c(j2) ? 0 : (int) (m23371d(j2, EnumC6738rM.f41611d) % 60);
        if (m23370c(j2)) {
            i = 0;
        } else {
            i = (int) ((((int) j2) & 1) == 1 ? ((j2 >> 1) % 1000) * 1000000 : (j2 >> 1) % 1000000000);
        }
        boolean z3 = jM23371d != 0;
        boolean z4 = iM23371d2 != 0;
        boolean z5 = iM23371d != 0;
        boolean z6 = (iM23371d3 == 0 && i == 0) ? false : true;
        if (z3) {
            sb.append(jM23371d);
            sb.append('d');
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iM23371d2);
            sb.append('h');
            i2 = i4;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iM23371d);
            sb.append('m');
            i2 = i5;
        }
        if (z6) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iM23371d3 != 0 || z3 || z4 || z5) {
                m23368a(sb, iM23371d3, i, 9, UcumUtils.UCUM_SECONDS);
            } else if (i >= 1000000) {
                m23368a(sb, i / 1000000, i % 1000000, 6, UcumUtils.UCUM_MILLISECODS);
            } else if (i >= 1000) {
                m23368a(sb, i / 1000, i % 1000, 3, UcumUtils.UCUM_MICROSECONDS);
            } else {
                sb.append(i);
                sb.append(UcumUtils.UCUM_NANOSECONDS);
            }
            i2 = i6;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C6547oM) obj).f38967a;
        long j2 = this.f38967a;
        long j3 = j2 ^ j;
        int i = 1;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i2 = (((int) j2) & 1) - (((int) j) & 1);
            return j2 < 0 ? -i2 : i2;
        }
        if (j2 < j) {
            i = -1;
        } else if (j2 == j) {
            i = 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6547oM) {
            return this.f38967a == ((C6547oM) obj).f38967a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f38967a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return m23372e(this.f38967a);
    }
}
