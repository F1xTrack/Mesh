package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: i40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9707i40 implements InterfaceC1473XP {

    /* renamed from: g */
    public static final List f28802g = AbstractC7433Ch1.m1284m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List f28803h = AbstractC7433Ch1.m1284m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final FN0 f28804a;

    /* renamed from: b */
    public final GN0 f28805b;

    /* renamed from: c */
    public final C9579h40 f28806c;

    /* renamed from: d */
    public volatile C10475o40 f28807d;

    /* renamed from: e */
    public final EnumC9219eG0 f28808e;

    /* renamed from: f */
    public volatile boolean f28809f;

    public C9707i40(C10585ox0 c10585ox0, FN0 fn0, GN0 gn0, C9579h40 c9579h40) {
        O90.m5968f(c10585ox0, "client");
        O90.m5968f(fn0, "connection");
        O90.m5968f(c9579h40, "http2Connection");
        this.f28804a = fn0;
        this.f28805b = gn0;
        this.f28806c = c9579h40;
        EnumC9219eG0 enumC9219eG0 = EnumC9219eG0.H2_PRIOR_KNOWLEDGE;
        this.f28808e = c10585ox0.f39390t.contains(enumC9219eG0) ? enumC9219eG0 : EnumC9219eG0.HTTP_2;
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: a */
    public final U21 mo8995a(HS0 hs0) {
        C10475o40 c10475o40 = this.f28807d;
        O90.m5965c(c10475o40);
        return c10475o40.f38764i;
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: b */
    public final void mo8996b(C10777qR0 c10777qR0) throws IOException {
        int i;
        C10475o40 c10475o40;
        O90.m5968f(c10777qR0, "request");
        if (this.f28807d != null) {
            return;
        }
        boolean z = true;
        boolean z2 = c10777qR0.f40873d != null;
        K20 k20 = c10777qR0.f40872c;
        ArrayList arrayList = new ArrayList(k20.size() + 4);
        arrayList.add(new I20(I20.f4663f, c10777qR0.f40871b));
        C0551Ik c0551Ik = I20.f4664g;
        D40 d40 = c10777qR0.f40870a;
        O90.m5968f(d40, "url");
        String strM1529b = d40.m1529b();
        String strM1531d = d40.m1531d();
        if (strM1531d != null) {
            strM1529b = strM1529b + '?' + strM1531d;
        }
        arrayList.add(new I20(c0551Ik, strM1529b));
        String strM4524b = c10777qR0.f40872c.m4524b("Host");
        if (strM4524b != null) {
            arrayList.add(new I20(I20.f4666i, strM4524b));
        }
        arrayList.add(new I20(I20.f4665h, d40.f1828a));
        int size = k20.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strM4525d = k20.m4525d(i2);
            Locale locale = Locale.US;
            O90.m5967e(locale, "US");
            String lowerCase = strM4525d.toLowerCase(locale);
            O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f28802g.contains(lowerCase) || (lowerCase.equals("te") && O90.m5963a(k20.m4528q(i2), "trailers"))) {
                arrayList.add(new I20(lowerCase, k20.m4528q(i2)));
            }
        }
        C9579h40 c9579h40 = this.f28806c;
        c9579h40.getClass();
        boolean z3 = !z2;
        synchronized (c9579h40.f28236w) {
            synchronized (c9579h40) {
                try {
                    if (c9579h40.f28218e > 1073741823) {
                        c9579h40.m18717g(8);
                    }
                    if (c9579h40.f28219f) {
                        throw new C6586ox();
                    }
                    i = c9579h40.f28218e;
                    c9579h40.f28218e = i + 2;
                    c10475o40 = new C10475o40(i, c9579h40, z3, false, null);
                    if (z2 && c9579h40.f28233t < c9579h40.f28234u && c10475o40.f38760e < c10475o40.f38761f) {
                        z = false;
                    }
                    if (c10475o40.m23337i()) {
                        c9579h40.f28215b.put(Integer.valueOf(i), c10475o40);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c9579h40.f28236w.m23601g(z3, i, arrayList);
        }
        if (z) {
            c9579h40.f28236w.flush();
        }
        this.f28807d = c10475o40;
        if (this.f28809f) {
            C10475o40 c10475o402 = this.f28807d;
            O90.m5965c(c10475o402);
            c10475o402.m23333e(9);
            throw new IOException("Canceled");
        }
        C10475o40 c10475o403 = this.f28807d;
        O90.m5965c(c10475o403);
        C10347n40 c10347n40 = c10475o403.f38766k;
        long j = this.f28805b.f3717g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c10347n40.mo1730g(j, timeUnit);
        C10475o40 c10475o404 = this.f28807d;
        O90.m5965c(c10475o404);
        c10475o404.f38767l.mo1730g(this.f28805b.f3718h, timeUnit);
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: c */
    public final void mo8997c() throws SocketTimeoutException {
        C10475o40 c10475o40 = this.f28807d;
        O90.m5965c(c10475o40);
        c10475o40.m23335g().close();
    }

    @Override // p000.InterfaceC1473XP
    public final void cancel() {
        this.f28809f = true;
        C10475o40 c10475o40 = this.f28807d;
        if (c10475o40 != null) {
            c10475o40.m23333e(9);
        }
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: d */
    public final long mo8998d(HS0 hs0) {
        if (AbstractC11498w40.m25558a(hs0)) {
            return AbstractC7433Ch1.m1283l(hs0);
        }
        return 0L;
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: e */
    public final Z11 mo8999e(C10777qR0 c10777qR0, long j) {
        O90.m5968f(c10777qR0, "request");
        C10475o40 c10475o40 = this.f28807d;
        O90.m5965c(c10475o40);
        return c10475o40.m23335g();
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: f */
    public final GS0 mo9000f(boolean z) throws IOException {
        K20 k20;
        C10475o40 c10475o40 = this.f28807d;
        if (c10475o40 == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c10475o40) {
            c10475o40.f38766k.m25369i();
            while (c10475o40.f38762g.isEmpty() && c10475o40.f38768m == 0) {
                try {
                    c10475o40.m23340l();
                } catch (Throwable th) {
                    c10475o40.f38766k.m23068l();
                    throw th;
                }
            }
            c10475o40.f38766k.m23068l();
            if (c10475o40.f38762g.isEmpty()) {
                IOException iOException = c10475o40.f38769n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = c10475o40.f38768m;
                AbstractC0852NX.m5763l(i);
                throw new C9710i51(i);
            }
            Object objRemoveFirst = c10475o40.f38762g.removeFirst();
            O90.m5967e(objRemoveFirst, "headersQueue.removeFirst()");
            k20 = (K20) objRemoveFirst;
        }
        EnumC9219eG0 enumC9219eG0 = this.f28808e;
        O90.m5968f(enumC9219eG0, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = k20.size();
        C1356VY c1356vyM8031O = null;
        for (int i2 = 0; i2 < size; i2++) {
            String strM4525d = k20.m4525d(i2);
            String strM4528q = k20.m4528q(i2);
            if (O90.m5963a(strM4525d, ":status")) {
                c1356vyM8031O = US1.m8031O("HTTP/1.1 " + strM4528q);
            } else if (!f28803h.contains(strM4525d)) {
                O90.m5968f(strM4525d, "name");
                O90.m5968f(strM4528q, "value");
                arrayList.add(strM4525d);
                arrayList.add(AbstractC11374v51.m25350Y(strM4528q).toString());
            }
        }
        if (c1356vyM8031O == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        GS0 gs0 = new GS0();
        gs0.f3742b = enumC9219eG0;
        gs0.f3743c = c1356vyM8031O.f12611b;
        gs0.f3744d = (String) c1356vyM8031O.f12613d;
        gs0.m3067c(new K20((String[]) arrayList.toArray(new String[0])));
        if (z && gs0.f3743c == 100) {
            return null;
        }
        return gs0;
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: g */
    public final FN0 mo9001g() {
        return this.f28804a;
    }

    @Override // p000.InterfaceC1473XP
    /* renamed from: h */
    public final void mo9002h() {
        this.f28806c.f28236w.flush();
    }
}
