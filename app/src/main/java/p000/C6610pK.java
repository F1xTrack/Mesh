package p000;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: pK */
/* loaded from: classes2.dex */
public final class C6610pK extends P81 {

    /* renamed from: e */
    public final /* synthetic */ int f40017e;

    /* renamed from: f */
    public final /* synthetic */ Object f40018f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6610pK(Object obj, String str, int i) {
        super(str, true);
        this.f40017e = i;
        this.f40018f = obj;
    }

    /* renamed from: b */
    private final long m23737b() throws IOException {
        C0974PT c0974pt = (C0974PT) this.f40018f;
        long jNanoTime = System.nanoTime();
        Iterator it = ((ConcurrentLinkedQueue) c0974pt.f9081e).iterator();
        int i = 0;
        long j = Long.MIN_VALUE;
        FN0 fn0 = null;
        int i2 = 0;
        while (it.hasNext()) {
            FN0 fn02 = (FN0) it.next();
            O90.m5967e(fn02, "connection");
            synchronized (fn02) {
                if (c0974pt.m6369b(fn02, jNanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = jNanoTime - fn02.f3189q;
                    if (j2 > j) {
                        fn0 = fn02;
                        j = j2;
                    }
                }
            }
        }
        long j3 = c0974pt.f9078b;
        if (j < j3 && i <= 5) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        O90.m5965c(fn0);
        synchronized (fn0) {
            if (!fn0.f3188p.isEmpty()) {
                return 0L;
            }
            if (fn0.f3189q + j != jNanoTime) {
                return 0L;
            }
            fn0.f3182j = true;
            ((ConcurrentLinkedQueue) c0974pt.f9081e).remove(fn0);
            Socket socket = fn0.f3176d;
            O90.m5965c(socket);
            AbstractC7433Ch1.m1276e(socket);
            if (!((ConcurrentLinkedQueue) c0974pt.f9081e).isEmpty()) {
                return 0L;
            }
            ((C8689a91) c0974pt.f9079c).m9677a();
            return 0L;
        }
    }

    @Override // p000.P81
    /* renamed from: a */
    public final long mo4621a() throws IOException {
        switch (this.f40017e) {
            case 0:
                C6673qK c6673qK = (C6673qK) this.f40018f;
                synchronized (c6673qK) {
                    if (c6673qK.f40787l && !c6673qK.f40788m) {
                        try {
                            c6673qK.m23972X();
                        } catch (IOException unused) {
                            c6673qK.f40789n = true;
                        }
                        try {
                            if (c6673qK.m23978x()) {
                                c6673qK.m23970U();
                                c6673qK.f40784i = 0;
                            }
                        } catch (IOException unused2) {
                            c6673qK.f40790o = true;
                            c6673qK.f40782g = JI1.m4273a(new C6903ti());
                        }
                    }
                }
                return -1L;
            case 1:
                C9579h40 c9579h40 = (C9579h40) this.f40018f;
                c9579h40.getClass();
                try {
                    c9579h40.f28236w.m23602j(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    c9579h40.m18713a(2, 2, e);
                    return -1L;
                }
            case 2:
                return m23737b();
            default:
                ((C6526o1) this.f40018f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6610pK(String str, Object obj, int i) {
        super(str, true);
        this.f40017e = i;
        this.f40018f = obj;
    }
}
