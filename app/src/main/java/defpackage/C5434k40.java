package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: k40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5434k40 implements Closeable {
    public static final Logger d;
    public final C8351zN0 a;
    public final C5243j40 b;
    public final P30 c;

    static {
        Logger logger = Logger.getLogger(Z30.class.getName());
        O90.e(logger, "getLogger(Http2::class.java.name)");
        d = logger;
    }

    public C5434k40(C8351zN0 c8351zN0) {
        O90.f(c8351zN0, "source");
        this.a = c8351zN0;
        C5243j40 c5243j40 = new C5243j40(c8351zN0);
        this.b = c5243j40;
        this.c = new P30(c5243j40);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x014a, code lost:
    
        throw new java.io.IOException(defpackage.AbstractC7209tN0.u(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r20, defpackage.C6185o1 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5434k40.a(boolean, o1):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x012f, code lost:
    
        if (r8 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
    
        r18.j(defpackage.AbstractC0199Ch1.b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.C6185o1 r17, int r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5434k40.c(o1, int, int, int):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final void e(C6185o1 c6185o1, int i, int i2) throws IOException {
        int i3;
        Object[] array;
        if (i < 8) {
            throw new IOException(AbstractC7209tN0.u(i, "TYPE_GOAWAY length < 8: "));
        }
        if (i2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int iJ = this.a.J();
        int iJ2 = this.a.J();
        int i4 = i - 8;
        int[] iArrC = AbstractC8235ym.C(14);
        int length = iArrC.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i3 = 0;
                break;
            }
            i3 = iArrC[i5];
            if (AbstractC8235ym.x(i3) == iJ2) {
                break;
            } else {
                i5++;
            }
        }
        if (i3 == 0) {
            throw new IOException(AbstractC7209tN0.u(iJ2, "TYPE_GOAWAY unexpected error code: "));
        }
        C0674Ik c0674IkW = C0674Ik.d;
        if (i4 > 0) {
            c0674IkW = this.a.w(i4);
        }
        c6185o1.getClass();
        O90.f(c0674IkW, "debugData");
        c0674IkW.c();
        C4085h40 c4085h40 = (C4085h40) c6185o1.c;
        synchronized (c4085h40) {
            array = c4085h40.b.values().toArray(new C6198o40[0]);
            c4085h40.f = true;
        }
        for (C6198o40 c6198o40 : (C6198o40[]) array) {
            if (c6198o40.a > iJ && c6198o40.h()) {
                c6198o40.k(8);
                ((C4085h40) c6185o1.c).f(c6198o40.a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        throw new java.io.IOException(defpackage.AbstractC7209tN0.u(r7, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List f(int r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5434k40.f(int, int, int, int):java.util.List");
    }

    public final void g(C6185o1 c6185o1, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte bP = this.a.p();
            byte[] bArr = AbstractC0199Ch1.a;
            i4 = bP & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            C8351zN0 c8351zN0 = this.a;
            c8351zN0.J();
            c8351zN0.p();
            byte[] bArr2 = AbstractC0199Ch1.a;
            c6185o1.getClass();
            i -= 5;
        }
        List listF = f(O12.a(i, i2, i4), i4, i2, i3);
        c6185o1.getClass();
        ((C4085h40) c6185o1.c).getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            C4085h40 c4085h40 = (C4085h40) c6185o1.c;
            c4085h40.getClass();
            c4085h40.i.c(new C3703f40(c4085h40.c + '[' + i3 + "] onHeaders", c4085h40, i3, listF, z2), 0L);
            return;
        }
        C4085h40 c4085h402 = (C4085h40) c6185o1.c;
        synchronized (c4085h402) {
            C6198o40 c6198o40C = c4085h402.c(i3);
            if (c6198o40C != null) {
                c6198o40C.j(AbstractC0199Ch1.w(listF), z2);
                return;
            }
            if (c4085h402.f) {
                return;
            }
            if (i3 <= c4085h402.d) {
                return;
            }
            if (i3 % 2 == c4085h402.e % 2) {
                return;
            }
            C6198o40 c6198o40 = new C6198o40(i3, c4085h402, false, z2, AbstractC0199Ch1.w(listF));
            c4085h402.d = i3;
            c4085h402.b.put(Integer.valueOf(i3), c6198o40);
            c4085h402.g.e().c(new C2446c40(1, c4085h402, c6198o40, c4085h402.c + '[' + i3 + "] onStream"), 0L);
        }
    }

    public final void j(C6185o1 c6185o1, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(AbstractC7209tN0.u(i, "TYPE_PING length != 8: "));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int iJ = this.a.J();
        int iJ2 = this.a.J();
        if ((i2 & 1) == 0) {
            ((C4085h40) c6185o1.c).h.c(new C3322d40(AbstractC1705Vq.l(new StringBuilder(), ((C4085h40) c6185o1.c).c, " ping"), (C4085h40) c6185o1.c, iJ, iJ2, 0), 0L);
            return;
        }
        C4085h40 c4085h40 = (C4085h40) c6185o1.c;
        synchronized (c4085h40) {
            try {
                if (iJ == 1) {
                    c4085h40.l++;
                } else if (iJ == 2) {
                    c4085h40.n++;
                } else if (iJ == 3) {
                    c4085h40.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(C6185o1 c6185o1, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte bP = this.a.p();
            byte[] bArr = AbstractC0199Ch1.a;
            i4 = bP & 255;
        } else {
            i4 = 0;
        }
        int iJ = this.a.J() & Integer.MAX_VALUE;
        List listF = f(O12.a(i - 4, i2, i4), i4, i2, i3);
        c6185o1.getClass();
        C4085h40 c4085h40 = (C4085h40) c6185o1.c;
        c4085h40.getClass();
        synchronized (c4085h40) {
            if (c4085h40.y.contains(Integer.valueOf(iJ))) {
                c4085h40.m(iJ, 2);
                return;
            }
            c4085h40.y.add(Integer.valueOf(iJ));
            c4085h40.i.c(new C3703f40(c4085h40.c + '[' + iJ + "] onRequest", c4085h40, iJ, listF), 0L);
        }
    }
}
