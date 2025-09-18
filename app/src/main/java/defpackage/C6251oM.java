package defpackage;

import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: oM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6251oM implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        int i = AbstractC6442pM.a;
        b = AbstractC3689f02.a(4611686018427387903L);
        c = AbstractC3689f02.a(-4611686018427387903L);
    }

    public static final void a(StringBuilder sb, int i, int i2, int i3, String str) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            O90.f(strValueOf, "<this>");
            if (i3 < 0) {
                throw new IllegalArgumentException(AbstractC8235ym.g(i3, "Desired length ", " is less than zero."));
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

    public static final long b(long j) {
        return ((((int) j) & 1) != 1 || c(j)) ? d(j, EnumC6823rM.c) : j >> 1;
    }

    public static final boolean c(long j) {
        return j == b || j == c;
    }

    public static final long d(long j, EnumC6823rM enumC6823rM) {
        O90.f(enumC6823rM, "unit");
        if (j == b) {
            return Long.MAX_VALUE;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        EnumC6823rM enumC6823rM2 = (((int) j) & 1) == 0 ? EnumC6823rM.b : EnumC6823rM.c;
        O90.f(enumC6823rM2, "sourceUnit");
        return enumC6823rM.a.convert(j2, enumC6823rM2.a);
    }

    public static String e(long j) {
        boolean z;
        int iD;
        int i;
        int i2;
        long j2 = j;
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == b) {
            return "Infinity";
        }
        if (j2 == c) {
            return "-Infinity";
        }
        boolean z2 = j2 < 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        if (j2 < 0) {
            j2 = (((int) j2) & 1) + ((-(j2 >> 1)) << 1);
            int i3 = AbstractC6442pM.a;
        }
        long jD = d(j2, EnumC6823rM.g);
        int iD2 = c(j2) ? 0 : (int) (d(j2, EnumC6823rM.f) % 24);
        if (c(j2)) {
            z = z2;
            iD = 0;
        } else {
            z = z2;
            iD = (int) (d(j2, EnumC6823rM.e) % 60);
        }
        int iD3 = c(j2) ? 0 : (int) (d(j2, EnumC6823rM.d) % 60);
        if (c(j2)) {
            i = 0;
        } else {
            i = (int) ((((int) j2) & 1) == 1 ? ((j2 >> 1) % 1000) * 1000000 : (j2 >> 1) % 1000000000);
        }
        boolean z3 = jD != 0;
        boolean z4 = iD2 != 0;
        boolean z5 = iD != 0;
        boolean z6 = (iD3 == 0 && i == 0) ? false : true;
        if (z3) {
            sb.append(jD);
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
            sb.append(iD2);
            sb.append('h');
            i2 = i4;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iD);
            sb.append('m');
            i2 = i5;
        }
        if (z6) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iD3 != 0 || z3 || z4 || z5) {
                a(sb, iD3, i, 9, UcumUtils.UCUM_SECONDS);
            } else if (i >= 1000000) {
                a(sb, i / 1000000, i % 1000000, 6, UcumUtils.UCUM_MILLISECODS);
            } else if (i >= 1000) {
                a(sb, i / 1000, i % 1000, 3, UcumUtils.UCUM_MICROSECONDS);
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
        O90.e(string, "toString(...)");
        return string;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C6251oM) obj).a;
        long j2 = this.a;
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
        if (obj instanceof C6251oM) {
            return this.a == ((C6251oM) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return e(this.a);
    }
}
