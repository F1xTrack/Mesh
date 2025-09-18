package p000;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: Wk */
/* loaded from: classes2.dex */
public final class C1431Wk {

    /* renamed from: k */
    public static final String f13356k;

    /* renamed from: l */
    public static final String f13357l;

    /* renamed from: a */
    public final D40 f13358a;

    /* renamed from: b */
    public final K20 f13359b;

    /* renamed from: c */
    public final String f13360c;

    /* renamed from: d */
    public final EnumC9219eG0 f13361d;

    /* renamed from: e */
    public final int f13362e;

    /* renamed from: f */
    public final String f13363f;

    /* renamed from: g */
    public final K20 f13364g;

    /* renamed from: h */
    public final E20 f13365h;

    /* renamed from: i */
    public final long f13366i;

    /* renamed from: j */
    public final long f13367j;

    static {
        C10745qB0 c10745qB0 = C10745qB0.f40658a;
        C10745qB0.f40658a.getClass();
        f13356k = "OkHttp-Sent-Millis";
        C10745qB0.f40658a.getClass();
        f13357l = "OkHttp-Received-Millis";
    }

    public C1431Wk(U21 u21) {
        D40 d40M970c;
        O90.m5968f(u21, "rawSource");
        try {
            C11917zN0 c11917zN0M4274b = JI1.m4274b(u21);
            String strM26384W = c11917zN0M4274b.m26384W(Long.MAX_VALUE);
            try {
                C40 c40 = new C40();
                c40.m973f(null, strM26384W);
                d40M970c = c40.m970c();
            } catch (IllegalArgumentException unused) {
                d40M970c = null;
            }
            if (d40M970c == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strM26384W));
                C10745qB0 c10745qB0 = C10745qB0.f40658a;
                C10745qB0.f40658a.getClass();
                C10745qB0.m23946i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.f13358a = d40M970c;
            this.f13360c = c11917zN0M4274b.m26384W(Long.MAX_VALUE);
            J20 j20 = new J20();
            int iM7691c = TP1.m7691c(c11917zN0M4274b);
            for (int i = 0; i < iM7691c; i++) {
                j20.m4136c(c11917zN0M4274b.m26384W(Long.MAX_VALUE));
            }
            this.f13359b = j20.m4140g();
            C1356VY c1356vyM8031O = US1.m8031O(c11917zN0M4274b.m26384W(Long.MAX_VALUE));
            this.f13361d = (EnumC9219eG0) c1356vyM8031O.f12612c;
            this.f13362e = c1356vyM8031O.f12611b;
            this.f13363f = (String) c1356vyM8031O.f12613d;
            J20 j202 = new J20();
            int iM7691c2 = TP1.m7691c(c11917zN0M4274b);
            for (int i2 = 0; i2 < iM7691c2; i2++) {
                j202.m4136c(c11917zN0M4274b.m26384W(Long.MAX_VALUE));
            }
            String str = f13356k;
            String strM4141h = j202.m4141h(str);
            String str2 = f13357l;
            String strM4141h2 = j202.m4141h(str2);
            j202.m4142i(str);
            j202.m4142i(str2);
            this.f13366i = strM4141h != null ? Long.parseLong(strM4141h) : 0L;
            this.f13367j = strM4141h2 != null ? Long.parseLong(strM4141h2) : 0L;
            this.f13364g = j202.m4140g();
            if (O90.m5963a(this.f13358a.f1828a, "https")) {
                String strM26384W2 = c11917zN0M4274b.m26384W(Long.MAX_VALUE);
                if (strM26384W2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strM26384W2 + '\"');
                }
                this.f13365h = new E20(!c11917zN0M4274b.m26387m() ? IY1.m3933b(c11917zN0M4274b.m26384W(Long.MAX_VALUE)) : EnumC8043Oa1.SSL_3_0, C4080fs.f27420b.m1946s(c11917zN0M4274b.m26384W(Long.MAX_VALUE)), AbstractC7433Ch1.m1296y(m8840a(c11917zN0M4274b)), new D20(AbstractC7433Ch1.m1296y(m8840a(c11917zN0M4274b)), 0));
            } else {
                this.f13365h = null;
            }
            AbstractC8729aT1.m9749a(u21, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC8729aT1.m9749a(u21, th);
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public static List m8840a(C11917zN0 c11917zN0) throws IOException, CertificateException {
        int iM7691c = TP1.m7691c(c11917zN0);
        if (iM7691c == -1) {
            return C0779MN.f7117a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM7691c);
            for (int i = 0; i < iM7691c; i++) {
                String strM26384W = c11917zN0.m26384W(Long.MAX_VALUE);
                C6507nj c6507nj = new C6507nj();
                C0551Ik c0551Ik = C0551Ik.f5116d;
                C0551Ik c0551IkM7629B = C1210TE.m7629B(strM26384W);
                if (c0551IkM7629B == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                c6507nj.m23191o0(c0551IkM7629B);
                arrayList.add(certificateFactory.generateCertificate(new C6381lj(c6507nj, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m8841b(C11790yN0 c11790yN0, List list) throws IOException, CertificateEncodingException {
        try {
            c11790yN0.mo4394f0(list.size());
            c11790yN0.mo4397k(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                C0551Ik c0551Ik = C0551Ik.f5116d;
                O90.m5967e(encoded, "bytes");
                c11790yN0.mo4391L(C1210TE.m7636L(encoded).mo3981a());
                c11790yN0.mo4397k(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: c */
    public final void m8842c(C1338VG c1338vg) {
        D40 d40 = this.f13358a;
        E20 e20 = this.f13365h;
        K20 k20 = this.f13364g;
        K20 k202 = this.f13359b;
        C11790yN0 c11790yN0M4273a = JI1.m4273a(c1338vg.m8347k(0));
        try {
            c11790yN0M4273a.mo4391L(d40.f1835h);
            c11790yN0M4273a.mo4397k(10);
            c11790yN0M4273a.mo4391L(this.f13360c);
            c11790yN0M4273a.mo4397k(10);
            c11790yN0M4273a.mo4394f0(k202.size());
            c11790yN0M4273a.mo4397k(10);
            int size = k202.size();
            for (int i = 0; i < size; i++) {
                c11790yN0M4273a.mo4391L(k202.m4525d(i));
                c11790yN0M4273a.mo4391L(": ");
                c11790yN0M4273a.mo4391L(k202.m4528q(i));
                c11790yN0M4273a.mo4397k(10);
            }
            EnumC9219eG0 enumC9219eG0 = this.f13361d;
            int i2 = this.f13362e;
            String str = this.f13363f;
            O90.m5968f(enumC9219eG0, "protocol");
            O90.m5968f(str, "message");
            StringBuilder sb = new StringBuilder();
            if (enumC9219eG0 == EnumC9219eG0.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            String string = sb.toString();
            O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
            c11790yN0M4273a.mo4391L(string);
            c11790yN0M4273a.mo4397k(10);
            c11790yN0M4273a.mo4394f0(k20.size() + 2);
            c11790yN0M4273a.mo4397k(10);
            int size2 = k20.size();
            for (int i3 = 0; i3 < size2; i3++) {
                c11790yN0M4273a.mo4391L(k20.m4525d(i3));
                c11790yN0M4273a.mo4391L(": ");
                c11790yN0M4273a.mo4391L(k20.m4528q(i3));
                c11790yN0M4273a.mo4397k(10);
            }
            c11790yN0M4273a.mo4391L(f13356k);
            c11790yN0M4273a.mo4391L(": ");
            c11790yN0M4273a.mo4394f0(this.f13366i);
            c11790yN0M4273a.mo4397k(10);
            c11790yN0M4273a.mo4391L(f13357l);
            c11790yN0M4273a.mo4391L(": ");
            c11790yN0M4273a.mo4394f0(this.f13367j);
            c11790yN0M4273a.mo4397k(10);
            if (O90.m5963a(d40.f1828a, "https")) {
                c11790yN0M4273a.mo4397k(10);
                O90.m5965c(e20);
                c11790yN0M4273a.mo4391L(e20.f2358b.f27439a);
                c11790yN0M4273a.mo4397k(10);
                m8841b(c11790yN0M4273a, e20.m1987a());
                m8841b(c11790yN0M4273a, e20.f2359c);
                c11790yN0M4273a.mo4391L(e20.f2357a.f8506a);
                c11790yN0M4273a.mo4397k(10);
            }
            AbstractC8729aT1.m9749a(c11790yN0M4273a, null);
        } finally {
        }
    }

    public C1431Wk(HS0 hs0) {
        K20 k20;
        C10777qR0 c10777qR0 = hs0.f4295a;
        this.f13358a = c10777qR0.f40870a;
        HS0 hs02 = hs0.f4302h;
        O90.m5965c(hs02);
        K20 k202 = hs02.f4295a.f40872c;
        K20 k203 = hs0.f4300f;
        Set setM7692d = TP1.m7692d(k203);
        if (setM7692d.isEmpty()) {
            k20 = AbstractC7433Ch1.f1578b;
        } else {
            ArrayList arrayList = new ArrayList(20);
            int size = k202.size();
            for (int i = 0; i < size; i++) {
                String strM4525d = k202.m4525d(i);
                if (setM7692d.contains(strM4525d)) {
                    String strM4528q = k202.m4528q(i);
                    O90.m5968f(strM4525d, "name");
                    O90.m5968f(strM4528q, "value");
                    K12.m4520a(strM4525d);
                    K12.m4521b(strM4528q, strM4525d);
                    arrayList.add(strM4525d);
                    arrayList.add(AbstractC11374v51.m25350Y(strM4528q).toString());
                }
            }
            k20 = new K20((String[]) arrayList.toArray(new String[0]));
        }
        this.f13359b = k20;
        this.f13360c = c10777qR0.f40871b;
        this.f13361d = hs0.f4296b;
        this.f13362e = hs0.f4298d;
        this.f13363f = hs0.f4297c;
        this.f13364g = k203;
        this.f13365h = hs0.f4299e;
        this.f13366i = hs0.f4305k;
        this.f13367j = hs0.f4306l;
    }
}
