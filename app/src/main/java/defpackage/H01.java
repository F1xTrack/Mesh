package defpackage;

import java.io.Serializable;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class H01 implements Serializable {
    public C7932xA0 a;
    public final C1034Na0 b;
    public final String c;
    public final C0893Lf d;
    public final AtomicReference e;
    public C1190Pa0 f;

    public H01(C0893Lf c0893Lf, C0893Lf c0893Lf2, C0893Lf c0893Lf3) throws ParseException {
        String string;
        byte[] bytes;
        byte[] bytes2;
        C7932xA0 c7932xA0 = new C7932xA0(c0893Lf2);
        this.a = null;
        AtomicReference atomicReference = new AtomicReference();
        this.e = atomicReference;
        if (c0893Lf == null) {
            throw new IllegalArgumentException("The first part must not be null");
        }
        try {
            C1034Na0 c1034Na0A = C1034Na0.a(c0893Lf);
            this.b = c1034Na0A;
            this.f = null;
            this.a = c7932xA0;
            C0893Lf c0893Lf4 = c1034Na0A.f;
            boolean z = c1034Na0A.o;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append((c0893Lf4 == null ? C0893Lf.c(c1034Na0A.toString().getBytes(AbstractC5435k41.a)) : c0893Lf4).a);
                sb.append('.');
                C7932xA0 c7932xA02 = this.a;
                C0893Lf c0893LfC = c7932xA02.a;
                if (c0893LfC == null) {
                    if (c0893LfC != null) {
                        bytes2 = c0893LfC.a();
                    } else {
                        String string2 = c7932xA02.toString();
                        bytes2 = string2 != null ? string2.getBytes(AbstractC5435k41.a) : null;
                    }
                    c0893LfC = C0893Lf.c(bytes2);
                }
                sb.append(c0893LfC.a);
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((c0893Lf4 == null ? C0893Lf.c(c1034Na0A.toString().getBytes(AbstractC5435k41.a)) : c0893Lf4).a);
                sb2.append('.');
                sb2.append(this.a.toString());
                string = sb2.toString();
            }
            this.c = string;
            if (c0893Lf3 == null) {
                throw new IllegalArgumentException("The third part must not be null");
            }
            if (c0893Lf3.a.trim().isEmpty()) {
                throw new ParseException("The signature must not be empty", 0);
            }
            this.d = c0893Lf3;
            atomicReference.set(EnumC1112Oa0.a);
            if (z && c0893Lf2 == null) {
                if (c0893Lf2 != null) {
                    bytes = c0893Lf2.a();
                } else {
                    String string3 = c7932xA0.toString();
                    bytes = string3 != null ? string3.getBytes(AbstractC5435k41.a) : null;
                }
                C0893Lf.c(bytes);
            }
        } catch (ParseException e) {
            throw new ParseException("Invalid JWS header: " + e.getMessage(), 0);
        }
    }

    public static H01 b(String str) throws ParseException {
        C0893Lf[] c0893LfArr;
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(".");
        if (iIndexOf == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = strTrim.indexOf(".", i);
        if (iIndexOf2 == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        int i2 = iIndexOf2 + 1;
        int iIndexOf3 = strTrim.indexOf(".", i2);
        if (iIndexOf3 == -1) {
            c0893LfArr = new C0893Lf[]{new C0893Lf(strTrim.substring(0, iIndexOf)), new C0893Lf(strTrim.substring(i, iIndexOf2)), new C0893Lf(strTrim.substring(i2))};
        } else {
            int i3 = iIndexOf3 + 1;
            int iIndexOf4 = strTrim.indexOf(".", i3);
            if (iIndexOf4 == -1) {
                throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
            }
            if (iIndexOf4 != -1 && strTrim.indexOf(".", iIndexOf4 + 1) != -1) {
                throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
            }
            c0893LfArr = new C0893Lf[]{new C0893Lf(strTrim.substring(0, iIndexOf)), new C0893Lf(strTrim.substring(i, iIndexOf2)), new C0893Lf(strTrim.substring(i2, iIndexOf3)), new C0893Lf(strTrim.substring(i3, iIndexOf4)), new C0893Lf(strTrim.substring(iIndexOf4 + 1))};
        }
        if (c0893LfArr.length == 3) {
            return new H01(c0893LfArr[0], c0893LfArr[1], c0893LfArr[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C1190Pa0 a() throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H01.a():Pa0");
    }

    public final synchronized boolean c(ZI0 zi0) {
        boolean zB;
        AtomicReference atomicReference = this.e;
        if (atomicReference.get() != EnumC1112Oa0.a && atomicReference.get() != EnumC1112Oa0.b) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
        try {
            zB = zi0.b(this.b, this.c.getBytes(AbstractC5435k41.a), this.d);
            if (zB) {
                this.e.set(EnumC1112Oa0.b);
            }
        } catch (C7248ta0 e) {
            throw e;
        } catch (Exception e2) {
            throw new C7248ta0(e2.getMessage(), e2);
        }
        return zB;
    }
}
