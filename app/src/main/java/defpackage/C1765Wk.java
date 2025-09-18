package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: Wk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1765Wk {
    public static final String k;
    public static final String l;
    public final D40 a;
    public final K20 b;
    public final String c;
    public final EnumC3548eG0 d;
    public final int e;
    public final String f;
    public final K20 g;
    public final E20 h;
    public final long i;
    public final long j;

    static {
        C6601qB0 c6601qB0 = C6601qB0.a;
        C6601qB0.a.getClass();
        k = "OkHttp-Sent-Millis";
        C6601qB0.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public C1765Wk(U21 u21) {
        D40 d40C;
        O90.f(u21, "rawSource");
        try {
            C8351zN0 c8351zN0B = JI1.b(u21);
            String strW = c8351zN0B.W(Long.MAX_VALUE);
            try {
                C40 c40 = new C40();
                c40.f(null, strW);
                d40C = c40.c();
            } catch (IllegalArgumentException unused) {
                d40C = null;
            }
            if (d40C == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strW));
                C6601qB0 c6601qB0 = C6601qB0.a;
                C6601qB0.a.getClass();
                C6601qB0.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.a = d40C;
            this.c = c8351zN0B.W(Long.MAX_VALUE);
            J20 j20 = new J20();
            int iC = TP1.c(c8351zN0B);
            for (int i = 0; i < iC; i++) {
                j20.c(c8351zN0B.W(Long.MAX_VALUE));
            }
            this.b = j20.g();
            VY vyO = US1.O(c8351zN0B.W(Long.MAX_VALUE));
            this.d = (EnumC3548eG0) vyO.c;
            this.e = vyO.b;
            this.f = (String) vyO.d;
            J20 j202 = new J20();
            int iC2 = TP1.c(c8351zN0B);
            for (int i2 = 0; i2 < iC2; i2++) {
                j202.c(c8351zN0B.W(Long.MAX_VALUE));
            }
            String str = k;
            String strH = j202.h(str);
            String str2 = l;
            String strH2 = j202.h(str2);
            j202.i(str);
            j202.i(str2);
            this.i = strH != null ? Long.parseLong(strH) : 0L;
            this.j = strH2 != null ? Long.parseLong(strH2) : 0L;
            this.g = j202.g();
            if (O90.a(this.a.a, "https")) {
                String strW2 = c8351zN0B.W(Long.MAX_VALUE);
                if (strW2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strW2 + '\"');
                }
                this.h = new E20(!c8351zN0B.m() ? IY1.b(c8351zN0B.W(Long.MAX_VALUE)) : EnumC1113Oa1.SSL_3_0, C3852fs.b.s(c8351zN0B.W(Long.MAX_VALUE)), AbstractC0199Ch1.y(a(c8351zN0B)), new D20(AbstractC0199Ch1.y(a(c8351zN0B)), 0));
            } else {
                this.h = null;
            }
            AbstractC2141aT1.a(u21, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2141aT1.a(u21, th);
                throw th2;
            }
        }
    }

    public static List a(C8351zN0 c8351zN0) throws IOException, CertificateException {
        int iC = TP1.c(c8351zN0);
        if (iC == -1) {
            return MN.a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iC);
            for (int i = 0; i < iC; i++) {
                String strW = c8351zN0.W(Long.MAX_VALUE);
                C6129nj c6129nj = new C6129nj();
                C0674Ik c0674Ik = C0674Ik.d;
                C0674Ik c0674IkB = TE.B(strW);
                if (c0674IkB == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                c6129nj.o0(c0674IkB);
                arrayList.add(certificateFactory.generateCertificate(new C5747lj(c6129nj, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static void b(C8161yN0 c8161yN0, List list) throws IOException, CertificateEncodingException {
        try {
            c8161yN0.f0(list.size());
            c8161yN0.k(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                C0674Ik c0674Ik = C0674Ik.d;
                O90.e(encoded, "bytes");
                c8161yN0.L(TE.L(encoded).a());
                c8161yN0.k(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final void c(VG vg) {
        D40 d40 = this.a;
        E20 e20 = this.h;
        K20 k20 = this.g;
        K20 k202 = this.b;
        C8161yN0 c8161yN0A = JI1.a(vg.k(0));
        try {
            c8161yN0A.L(d40.h);
            c8161yN0A.k(10);
            c8161yN0A.L(this.c);
            c8161yN0A.k(10);
            c8161yN0A.f0(k202.size());
            c8161yN0A.k(10);
            int size = k202.size();
            for (int i = 0; i < size; i++) {
                c8161yN0A.L(k202.d(i));
                c8161yN0A.L(": ");
                c8161yN0A.L(k202.q(i));
                c8161yN0A.k(10);
            }
            EnumC3548eG0 enumC3548eG0 = this.d;
            int i2 = this.e;
            String str = this.f;
            O90.f(enumC3548eG0, "protocol");
            O90.f(str, "message");
            StringBuilder sb = new StringBuilder();
            if (enumC3548eG0 == EnumC3548eG0.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            String string = sb.toString();
            O90.e(string, "StringBuilder().apply(builderAction).toString()");
            c8161yN0A.L(string);
            c8161yN0A.k(10);
            c8161yN0A.f0(k20.size() + 2);
            c8161yN0A.k(10);
            int size2 = k20.size();
            for (int i3 = 0; i3 < size2; i3++) {
                c8161yN0A.L(k20.d(i3));
                c8161yN0A.L(": ");
                c8161yN0A.L(k20.q(i3));
                c8161yN0A.k(10);
            }
            c8161yN0A.L(k);
            c8161yN0A.L(": ");
            c8161yN0A.f0(this.i);
            c8161yN0A.k(10);
            c8161yN0A.L(l);
            c8161yN0A.L(": ");
            c8161yN0A.f0(this.j);
            c8161yN0A.k(10);
            if (O90.a(d40.a, "https")) {
                c8161yN0A.k(10);
                O90.c(e20);
                c8161yN0A.L(e20.b.a);
                c8161yN0A.k(10);
                b(c8161yN0A, e20.a());
                b(c8161yN0A, e20.c);
                c8161yN0A.L(e20.a.a);
                c8161yN0A.k(10);
            }
            AbstractC2141aT1.a(c8161yN0A, null);
        } finally {
        }
    }

    public C1765Wk(HS0 hs0) {
        K20 k20;
        C6649qR0 c6649qR0 = hs0.a;
        this.a = c6649qR0.a;
        HS0 hs02 = hs0.h;
        O90.c(hs02);
        K20 k202 = hs02.a.c;
        K20 k203 = hs0.f;
        Set setD = TP1.d(k203);
        if (setD.isEmpty()) {
            k20 = AbstractC0199Ch1.b;
        } else {
            ArrayList arrayList = new ArrayList(20);
            int size = k202.size();
            for (int i = 0; i < size; i++) {
                String strD = k202.d(i);
                if (setD.contains(strD)) {
                    String strQ = k202.q(i);
                    O90.f(strD, "name");
                    O90.f(strQ, "value");
                    K12.a(strD);
                    K12.b(strQ, strD);
                    arrayList.add(strD);
                    arrayList.add(AbstractC7538v51.Y(strQ).toString());
                }
            }
            k20 = new K20((String[]) arrayList.toArray(new String[0]));
        }
        this.b = k20;
        this.c = c6649qR0.b;
        this.d = hs0.b;
        this.e = hs0.d;
        this.f = hs0.c;
        this.g = k203;
        this.h = hs0.e;
        this.i = hs0.k;
        this.j = hs0.l;
    }
}
