package p000;

/* loaded from: classes.dex */
public abstract class K12 {
    /* renamed from: a */
    public static void m4520a(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(AbstractC7433Ch1.m1281j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    /* renamed from: b */
    public static void m4521b(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC7433Ch1.m1281j("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                sb.append(AbstractC7433Ch1.m1289r(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* renamed from: c */
    public static K20 m4522c(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = AbstractC11374v51.m25350Y(str).toString();
        }
        int iM24880a = AbstractC11152tM1.m24880a(0, strArr2.length - 1, 2);
        if (iM24880a >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                m4520a(str2);
                m4521b(str3, str2);
                if (i == iM24880a) {
                    break;
                }
                i += 2;
            }
        }
        return new K20(strArr2);
    }

    /* renamed from: d */
    public static void m4523d(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC11153tN0.m24909u(i2, "at index "));
            }
        }
    }
}
