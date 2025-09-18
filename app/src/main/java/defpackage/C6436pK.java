package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: pK */
/* loaded from: classes2.dex */
public final class C6436pK extends P81 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6436pK(Object obj, String str, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    private final long b() throws IOException {
        PT pt = (PT) this.f;
        long jNanoTime = System.nanoTime();
        Iterator it = ((ConcurrentLinkedQueue) pt.e).iterator();
        int i = 0;
        long j = Long.MIN_VALUE;
        FN0 fn0 = null;
        int i2 = 0;
        while (it.hasNext()) {
            FN0 fn02 = (FN0) it.next();
            O90.e(fn02, "connection");
            synchronized (fn02) {
                if (pt.b(fn02, jNanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = jNanoTime - fn02.q;
                    if (j2 > j) {
                        fn0 = fn02;
                        j = j2;
                    }
                }
            }
        }
        long j3 = pt.b;
        if (j < j3 && i <= 5) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        O90.c(fn0);
        synchronized (fn0) {
            if (!fn0.p.isEmpty()) {
                return 0L;
            }
            if (fn0.q + j != jNanoTime) {
                return 0L;
            }
            fn0.j = true;
            ((ConcurrentLinkedQueue) pt.e).remove(fn0);
            Socket socket = fn0.d;
            O90.c(socket);
            AbstractC0199Ch1.e(socket);
            if (!((ConcurrentLinkedQueue) pt.e).isEmpty()) {
                return 0L;
            }
            ((C2081a91) pt.c).a();
            return 0L;
        }
    }

    @Override // defpackage.P81
    public final long a() throws IOException {
        switch (this.e) {
            case 0:
                C6627qK c6627qK = (C6627qK) this.f;
                synchronized (c6627qK) {
                    if (c6627qK.l && !c6627qK.m) {
                        try {
                            c6627qK.X();
                        } catch (IOException unused) {
                            c6627qK.n = true;
                        }
                        try {
                            if (c6627qK.x()) {
                                c6627qK.U();
                                c6627qK.i = 0;
                            }
                        } catch (IOException unused2) {
                            c6627qK.o = true;
                            c6627qK.g = JI1.a(new C7271ti());
                        }
                    }
                }
                return -1L;
            case 1:
                C4085h40 c4085h40 = (C4085h40) this.f;
                c4085h40.getClass();
                try {
                    c4085h40.w.j(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    c4085h40.a(2, 2, e);
                    return -1L;
                }
            case 2:
                return b();
            default:
                ((C6185o1) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6436pK(String str, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }
}
