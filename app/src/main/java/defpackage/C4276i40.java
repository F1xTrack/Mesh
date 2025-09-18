package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: i40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4276i40 implements XP {
    public static final List g = AbstractC0199Ch1.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = AbstractC0199Ch1.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final FN0 a;
    public final GN0 b;
    public final C4085h40 c;
    public volatile C6198o40 d;
    public final EnumC3548eG0 e;
    public volatile boolean f;

    public C4276i40(C6363ox0 c6363ox0, FN0 fn0, GN0 gn0, C4085h40 c4085h40) {
        O90.f(c6363ox0, "client");
        O90.f(fn0, "connection");
        O90.f(c4085h40, "http2Connection");
        this.a = fn0;
        this.b = gn0;
        this.c = c4085h40;
        EnumC3548eG0 enumC3548eG0 = EnumC3548eG0.H2_PRIOR_KNOWLEDGE;
        this.e = c6363ox0.t.contains(enumC3548eG0) ? enumC3548eG0 : EnumC3548eG0.HTTP_2;
    }

    @Override // defpackage.XP
    public final U21 a(HS0 hs0) {
        C6198o40 c6198o40 = this.d;
        O90.c(c6198o40);
        return c6198o40.i;
    }

    @Override // defpackage.XP
    public final void b(C6649qR0 c6649qR0) throws IOException {
        int i;
        C6198o40 c6198o40;
        O90.f(c6649qR0, "request");
        if (this.d != null) {
            return;
        }
        boolean z = true;
        boolean z2 = c6649qR0.d != null;
        K20 k20 = c6649qR0.c;
        ArrayList arrayList = new ArrayList(k20.size() + 4);
        arrayList.add(new I20(I20.f, c6649qR0.b));
        C0674Ik c0674Ik = I20.g;
        D40 d40 = c6649qR0.a;
        O90.f(d40, "url");
        String strB = d40.b();
        String strD = d40.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new I20(c0674Ik, strB));
        String strB2 = c6649qR0.c.b("Host");
        if (strB2 != null) {
            arrayList.add(new I20(I20.i, strB2));
        }
        arrayList.add(new I20(I20.h, d40.a));
        int size = k20.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strD2 = k20.d(i2);
            Locale locale = Locale.US;
            O90.e(locale, "US");
            String lowerCase = strD2.toLowerCase(locale);
            O90.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && O90.a(k20.q(i2), "trailers"))) {
                arrayList.add(new I20(lowerCase, k20.q(i2)));
            }
        }
        C4085h40 c4085h40 = this.c;
        c4085h40.getClass();
        boolean z3 = !z2;
        synchronized (c4085h40.w) {
            synchronized (c4085h40) {
                try {
                    if (c4085h40.e > 1073741823) {
                        c4085h40.g(8);
                    }
                    if (c4085h40.f) {
                        throw new C6362ox();
                    }
                    i = c4085h40.e;
                    c4085h40.e = i + 2;
                    c6198o40 = new C6198o40(i, c4085h40, z3, false, null);
                    if (z2 && c4085h40.t < c4085h40.u && c6198o40.e < c6198o40.f) {
                        z = false;
                    }
                    if (c6198o40.i()) {
                        c4085h40.b.put(Integer.valueOf(i), c6198o40);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c4085h40.w.g(z3, i, arrayList);
        }
        if (z) {
            c4085h40.w.flush();
        }
        this.d = c6198o40;
        if (this.f) {
            C6198o40 c6198o402 = this.d;
            O90.c(c6198o402);
            c6198o402.e(9);
            throw new IOException("Canceled");
        }
        C6198o40 c6198o403 = this.d;
        O90.c(c6198o403);
        C6007n40 c6007n40 = c6198o403.k;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6007n40.g(j, timeUnit);
        C6198o40 c6198o404 = this.d;
        O90.c(c6198o404);
        c6198o404.l.g(this.b.h, timeUnit);
    }

    @Override // defpackage.XP
    public final void c() throws SocketTimeoutException {
        C6198o40 c6198o40 = this.d;
        O90.c(c6198o40);
        c6198o40.g().close();
    }

    @Override // defpackage.XP
    public final void cancel() {
        this.f = true;
        C6198o40 c6198o40 = this.d;
        if (c6198o40 != null) {
            c6198o40.e(9);
        }
    }

    @Override // defpackage.XP
    public final long d(HS0 hs0) {
        if (AbstractC7724w40.a(hs0)) {
            return AbstractC0199Ch1.l(hs0);
        }
        return 0L;
    }

    @Override // defpackage.XP
    public final Z11 e(C6649qR0 c6649qR0, long j) {
        O90.f(c6649qR0, "request");
        C6198o40 c6198o40 = this.d;
        O90.c(c6198o40);
        return c6198o40.g();
    }

    @Override // defpackage.XP
    public final GS0 f(boolean z) throws IOException {
        K20 k20;
        C6198o40 c6198o40 = this.d;
        if (c6198o40 == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c6198o40) {
            c6198o40.k.i();
            while (c6198o40.g.isEmpty() && c6198o40.m == 0) {
                try {
                    c6198o40.l();
                } catch (Throwable th) {
                    c6198o40.k.l();
                    throw th;
                }
            }
            c6198o40.k.l();
            if (c6198o40.g.isEmpty()) {
                IOException iOException = c6198o40.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = c6198o40.m;
                NX.l(i);
                throw new C4280i51(i);
            }
            Object objRemoveFirst = c6198o40.g.removeFirst();
            O90.e(objRemoveFirst, "headersQueue.removeFirst()");
            k20 = (K20) objRemoveFirst;
        }
        EnumC3548eG0 enumC3548eG0 = this.e;
        O90.f(enumC3548eG0, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = k20.size();
        VY vyO = null;
        for (int i2 = 0; i2 < size; i2++) {
            String strD = k20.d(i2);
            String strQ = k20.q(i2);
            if (O90.a(strD, ":status")) {
                vyO = US1.O("HTTP/1.1 " + strQ);
            } else if (!h.contains(strD)) {
                O90.f(strD, "name");
                O90.f(strQ, "value");
                arrayList.add(strD);
                arrayList.add(AbstractC7538v51.Y(strQ).toString());
            }
        }
        if (vyO == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        GS0 gs0 = new GS0();
        gs0.b = enumC3548eG0;
        gs0.c = vyO.b;
        gs0.d = (String) vyO.d;
        gs0.c(new K20((String[]) arrayList.toArray(new String[0])));
        if (z && gs0.c == 100) {
            return null;
        }
        return gs0;
    }

    @Override // defpackage.XP
    public final FN0 g() {
        return this.a;
    }

    @Override // defpackage.XP
    public final void h() {
        this.c.w.flush();
    }
}
