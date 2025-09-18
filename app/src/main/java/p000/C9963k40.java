package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: k40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9963k40 implements Closeable {

    /* renamed from: d */
    public static final Logger f36282d;

    /* renamed from: a */
    public final C11917zN0 f36283a;

    /* renamed from: b */
    public final C9835j40 f36284b;

    /* renamed from: c */
    public final P30 f36285c;

    static {
        Logger logger = Logger.getLogger(Z30.class.getName());
        O90.m5967e(logger, "getLogger(Http2::class.java.name)");
        f36282d = logger;
    }

    public C9963k40(C11917zN0 c11917zN0) {
        O90.m5968f(c11917zN0, "source");
        this.f36283a = c11917zN0;
        C9835j40 c9835j40 = new C9835j40(c11917zN0);
        this.f36284b = c9835j40;
        this.f36285c = new P30(c9835j40);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x014a, code lost:
    
        throw new java.io.IOException(p000.AbstractC11153tN0.m24909u(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m22145a(boolean r20, p000.C6526o1 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9963k40.m22145a(boolean, o1):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x012f, code lost:
    
        if (r8 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
    
        r18.m23338j(p000.AbstractC7433Ch1.f1578b, true);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22146c(p000.C6526o1 r17, int r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9963k40.m22146c(o1, int, int, int):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36283a.close();
    }

    /* renamed from: e */
    public final void m22147e(C6526o1 c6526o1, int i, int i2) throws IOException {
        int i3;
        Object[] array;
        if (i < 8) {
            throw new IOException(AbstractC11153tN0.m24909u(i, "TYPE_GOAWAY length < 8: "));
        }
        if (i2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int iM26381J = this.f36283a.m26381J();
        int iM26381J2 = this.f36283a.m26381J();
        int i4 = i - 8;
        int[] iArrM26223C = AbstractC7222ym.m26223C(14);
        int length = iArrM26223C.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i3 = 0;
                break;
            }
            i3 = iArrM26223C[i5];
            if (AbstractC7222ym.m26247x(i3) == iM26381J2) {
                break;
            } else {
                i5++;
            }
        }
        if (i3 == 0) {
            throw new IOException(AbstractC11153tN0.m24909u(iM26381J2, "TYPE_GOAWAY unexpected error code: "));
        }
        C0551Ik c0551IkM26391w = C0551Ik.f5116d;
        if (i4 > 0) {
            c0551IkM26391w = this.f36283a.m26391w(i4);
        }
        c6526o1.getClass();
        O90.m5968f(c0551IkM26391w, "debugData");
        c0551IkM26391w.mo3983c();
        C9579h40 c9579h40 = (C9579h40) c6526o1.f38686c;
        synchronized (c9579h40) {
            array = c9579h40.f28215b.values().toArray(new C10475o40[0]);
            c9579h40.f28219f = true;
        }
        for (C10475o40 c10475o40 : (C10475o40[]) array) {
            if (c10475o40.f38756a > iM26381J && c10475o40.m23336h()) {
                c10475o40.m23339k(8);
                ((C9579h40) c6526o1.f38686c).m18716f(c10475o40.f38756a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        throw new java.io.IOException(p000.AbstractC11153tN0.m24909u(r7, "Header index too large "));
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m22148f(int r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9963k40.m22148f(int, int, int, int):java.util.List");
    }

    /* renamed from: g */
    public final void m22149g(C6526o1 c6526o1, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte bM26390p = this.f36283a.m26390p();
            byte[] bArr = AbstractC7433Ch1.f1577a;
            i4 = bM26390p & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            C11917zN0 c11917zN0 = this.f36283a;
            c11917zN0.m26381J();
            c11917zN0.m26390p();
            byte[] bArr2 = AbstractC7433Ch1.f1577a;
            c6526o1.getClass();
            i -= 5;
        }
        List listM22148f = m22148f(O12.m5940a(i, i2, i4), i4, i2, i3);
        c6526o1.getClass();
        ((C9579h40) c6526o1.f38686c).getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            C9579h40 c9579h40 = (C9579h40) c6526o1.f38686c;
            c9579h40.getClass();
            c9579h40.f28222i.m9679c(new C9323f40(c9579h40.f28216c + '[' + i3 + "] onHeaders", c9579h40, i3, listM22148f, z2), 0L);
            return;
        }
        C9579h40 c9579h402 = (C9579h40) c6526o1.f38686c;
        synchronized (c9579h402) {
            C10475o40 c10475o40M18714c = c9579h402.m18714c(i3);
            if (c10475o40M18714c != null) {
                c10475o40M18714c.m23338j(AbstractC7433Ch1.m1294w(listM22148f), z2);
                return;
            }
            if (c9579h402.f28219f) {
                return;
            }
            if (i3 <= c9579h402.f28217d) {
                return;
            }
            if (i3 % 2 == c9579h402.f28218e % 2) {
                return;
            }
            C10475o40 c10475o40 = new C10475o40(i3, c9579h402, false, z2, AbstractC7433Ch1.m1294w(listM22148f));
            c9579h402.f28217d = i3;
            c9579h402.f28215b.put(Integer.valueOf(i3), c10475o40);
            c9579h402.f28220g.m10429e().m9679c(new C8934c40(1, c9579h402, c10475o40, c9579h402.f28216c + '[' + i3 + "] onStream"), 0L);
        }
    }

    /* renamed from: j */
    public final void m22150j(C6526o1 c6526o1, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(AbstractC11153tN0.m24909u(i, "TYPE_PING length != 8: "));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int iM26381J = this.f36283a.m26381J();
        int iM26381J2 = this.f36283a.m26381J();
        if ((i2 & 1) == 0) {
            ((C9579h40) c6526o1.f38686c).f28221h.m9679c(new C9067d40(AbstractC1374Vq.m8593l(new StringBuilder(), ((C9579h40) c6526o1.f38686c).f28216c, " ping"), (C9579h40) c6526o1.f38686c, iM26381J, iM26381J2, 0), 0L);
            return;
        }
        C9579h40 c9579h40 = (C9579h40) c6526o1.f38686c;
        synchronized (c9579h40) {
            try {
                if (iM26381J == 1) {
                    c9579h40.f28225l++;
                } else if (iM26381J == 2) {
                    c9579h40.f28227n++;
                } else if (iM26381J == 3) {
                    c9579h40.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final void m22151l(C6526o1 c6526o1, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte bM26390p = this.f36283a.m26390p();
            byte[] bArr = AbstractC7433Ch1.f1577a;
            i4 = bM26390p & 255;
        } else {
            i4 = 0;
        }
        int iM26381J = this.f36283a.m26381J() & Integer.MAX_VALUE;
        List listM22148f = m22148f(O12.m5940a(i - 4, i2, i4), i4, i2, i3);
        c6526o1.getClass();
        C9579h40 c9579h40 = (C9579h40) c6526o1.f38686c;
        c9579h40.getClass();
        synchronized (c9579h40) {
            if (c9579h40.f28238y.contains(Integer.valueOf(iM26381J))) {
                c9579h40.m18720m(iM26381J, 2);
                return;
            }
            c9579h40.f28238y.add(Integer.valueOf(iM26381J));
            c9579h40.f28222i.m9679c(new C9323f40(c9579h40.f28216c + '[' + iM26381J + "] onRequest", c9579h40, iM26381J, listM22148f), 0L);
        }
    }
}
