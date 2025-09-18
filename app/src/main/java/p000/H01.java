package p000;

import java.io.Serializable;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class H01 implements Serializable {

    /* renamed from: a */
    public C11637xA0 f3981a;

    /* renamed from: b */
    public final C7990Na0 f3982b;

    /* renamed from: c */
    public final String f3983c;

    /* renamed from: d */
    public final C0734Lf f3984d;

    /* renamed from: e */
    public final AtomicReference f3985e;

    /* renamed from: f */
    public C8094Pa0 f3986f;

    public H01(C0734Lf c0734Lf, C0734Lf c0734Lf2, C0734Lf c0734Lf3) throws ParseException {
        String string;
        byte[] bytes;
        byte[] bytes2;
        C11637xA0 c11637xA0 = new C11637xA0(c0734Lf2);
        this.f3981a = null;
        AtomicReference atomicReference = new AtomicReference();
        this.f3985e = atomicReference;
        if (c0734Lf == null) {
            throw new IllegalArgumentException("The first part must not be null");
        }
        try {
            C7990Na0 c7990Na0M5783a = C7990Na0.m5783a(c0734Lf);
            this.f3982b = c7990Na0M5783a;
            this.f3986f = null;
            this.f3981a = c11637xA0;
            C0734Lf c0734Lf4 = c7990Na0M5783a.f11055f;
            boolean z = c7990Na0M5783a.f7893o;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append((c0734Lf4 == null ? C0734Lf.m5051c(c7990Na0M5783a.toString().getBytes(AbstractC9964k41.f36286a)) : c0734Lf4).f6248a);
                sb.append('.');
                C11637xA0 c11637xA02 = this.f3981a;
                C0734Lf c0734LfM5051c = c11637xA02.f45430a;
                if (c0734LfM5051c == null) {
                    if (c0734LfM5051c != null) {
                        bytes2 = c0734LfM5051c.m4698a();
                    } else {
                        String string2 = c11637xA02.toString();
                        bytes2 = string2 != null ? string2.getBytes(AbstractC9964k41.f36286a) : null;
                    }
                    c0734LfM5051c = C0734Lf.m5051c(bytes2);
                }
                sb.append(c0734LfM5051c.f6248a);
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((c0734Lf4 == null ? C0734Lf.m5051c(c7990Na0M5783a.toString().getBytes(AbstractC9964k41.f36286a)) : c0734Lf4).f6248a);
                sb2.append('.');
                sb2.append(this.f3981a.toString());
                string = sb2.toString();
            }
            this.f3983c = string;
            if (c0734Lf3 == null) {
                throw new IllegalArgumentException("The third part must not be null");
            }
            if (c0734Lf3.f6248a.trim().isEmpty()) {
                throw new ParseException("The signature must not be empty", 0);
            }
            this.f3984d = c0734Lf3;
            atomicReference.set(EnumC8042Oa0.f8497a);
            if (z && c0734Lf2 == null) {
                if (c0734Lf2 != null) {
                    bytes = c0734Lf2.m4698a();
                } else {
                    String string3 = c11637xA0.toString();
                    bytes = string3 != null ? string3.getBytes(AbstractC9964k41.f36286a) : null;
                }
                C0734Lf.m5051c(bytes);
            }
        } catch (ParseException e) {
            throw new ParseException("Invalid JWS header: " + e.getMessage(), 0);
        }
    }

    /* renamed from: b */
    public static H01 m3205b(String str) throws ParseException {
        C0734Lf[] c0734LfArr;
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
            c0734LfArr = new C0734Lf[]{new C0734Lf(strTrim.substring(0, iIndexOf)), new C0734Lf(strTrim.substring(i, iIndexOf2)), new C0734Lf(strTrim.substring(i2))};
        } else {
            int i3 = iIndexOf3 + 1;
            int iIndexOf4 = strTrim.indexOf(".", i3);
            if (iIndexOf4 == -1) {
                throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
            }
            if (iIndexOf4 != -1 && strTrim.indexOf(".", iIndexOf4 + 1) != -1) {
                throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
            }
            c0734LfArr = new C0734Lf[]{new C0734Lf(strTrim.substring(0, iIndexOf)), new C0734Lf(strTrim.substring(i, iIndexOf2)), new C0734Lf(strTrim.substring(i2, iIndexOf3)), new C0734Lf(strTrim.substring(i3, iIndexOf4)), new C0734Lf(strTrim.substring(iIndexOf4 + 1))};
        }
        if (c0734LfArr.length == 3) {
            return new H01(c0734LfArr[0], c0734LfArr[1], c0734LfArr[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C8094Pa0 m3206a() throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.H01.m3206a():Pa0");
    }

    /* renamed from: c */
    public final synchronized boolean m3207c(ZI0 zi0) {
        boolean zM9521b;
        AtomicReference atomicReference = this.f3985e;
        if (atomicReference.get() != EnumC8042Oa0.f8497a && atomicReference.get() != EnumC8042Oa0.f8498b) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
        try {
            zM9521b = zi0.m9521b(this.f3982b, this.f3983c.getBytes(AbstractC9964k41.f36286a), this.f3984d);
            if (zM9521b) {
                this.f3985e.set(EnumC8042Oa0.f8498b);
            }
        } catch (C11179ta0 e) {
            throw e;
        } catch (Exception e2) {
            throw new C11179ta0(e2.getMessage(), e2);
        }
        return zM9521b;
    }
}
