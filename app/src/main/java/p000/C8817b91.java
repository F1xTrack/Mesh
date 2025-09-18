package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* renamed from: b91 */
/* loaded from: classes2.dex */
public final class C8817b91 {

    /* renamed from: h */
    public static final C8817b91 f16828h;

    /* renamed from: i */
    public static final Logger f16829i;

    /* renamed from: a */
    public final C10641pN0 f16830a;

    /* renamed from: c */
    public boolean f16832c;

    /* renamed from: d */
    public long f16833d;

    /* renamed from: b */
    public int f16831b = 10000;

    /* renamed from: e */
    public final ArrayList f16834e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f16835f = new ArrayList();

    /* renamed from: g */
    public final RunnableC10431nk0 f16836g = new RunnableC10431nk0(8, this);

    static {
        String str = AbstractC7433Ch1.f1583g + " TaskRunner";
        O90.m5968f(str, "name");
        f16828h = new C8817b91(new C10641pN0(new ThreadFactoryC11577wh1(str, true)));
        Logger logger = Logger.getLogger(C8817b91.class.getName());
        O90.m5967e(logger, "getLogger(TaskRunner::class.java.name)");
        f16829i = logger;
    }

    public C8817b91(C10641pN0 c10641pN0) {
        this.f16830a = c10641pN0;
    }

    /* renamed from: a */
    public static final void m10425a(C8817b91 c8817b91, P81 p81) {
        c8817b91.getClass();
        byte[] bArr = AbstractC7433Ch1.f1577a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(p81.f8871a);
        try {
            long jMo4621a = p81.mo4621a();
            synchronized (c8817b91) {
                c8817b91.m10426b(p81, jMo4621a);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (c8817b91) {
                c8817b91.m10426b(p81, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m10426b(P81 p81, long j) {
        byte[] bArr = AbstractC7433Ch1.f1577a;
        C8689a91 c8689a91 = p81.f8873c;
        O90.m5965c(c8689a91);
        if (c8689a91.f15336d != p81) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = c8689a91.f15338f;
        c8689a91.f15338f = false;
        c8689a91.f15336d = null;
        this.f16834e.remove(c8689a91);
        if (j != -1 && !z && !c8689a91.f15335c) {
            c8689a91.m9680e(p81, j, true);
        }
        if (c8689a91.f15337e.isEmpty()) {
            return;
        }
        this.f16835f.add(c8689a91);
    }

    /* renamed from: c */
    public final P81 m10427c() {
        boolean z;
        C8817b91 c8817b91 = this;
        byte[] bArr = AbstractC7433Ch1.f1577a;
        while (true) {
            ArrayList arrayList = c8817b91.f16835f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C10641pN0 c10641pN0 = c8817b91.f16830a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            P81 p81 = null;
            while (true) {
                if (!it.hasNext()) {
                    c8817b91 = this;
                    z = false;
                    break;
                }
                P81 p812 = (P81) ((C8689a91) it.next()).f15337e.get(0);
                long jMax = Math.max(0L, p812.f8874d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (p81 != null) {
                        c8817b91 = this;
                        z = true;
                        break;
                    }
                    p81 = p812;
                }
            }
            ArrayList arrayList2 = c8817b91.f16834e;
            if (p81 != null) {
                byte[] bArr2 = AbstractC7433Ch1.f1577a;
                p81.f8874d = -1L;
                C8689a91 c8689a91 = p81.f8873c;
                O90.m5965c(c8689a91);
                c8689a91.f15337e.remove(p81);
                arrayList.remove(c8689a91);
                c8689a91.f15336d = p81;
                arrayList2.add(c8689a91);
                if (z || (!c8817b91.f16832c && !arrayList.isEmpty())) {
                    RunnableC10431nk0 runnableC10431nk0 = c8817b91.f16836g;
                    O90.m5968f(runnableC10431nk0, "runnable");
                    ((ThreadPoolExecutor) c10641pN0.f40042b).execute(runnableC10431nk0);
                }
                return p81;
            }
            if (c8817b91.f16832c) {
                if (jMin < c8817b91.f16833d - jNanoTime) {
                    notify();
                }
                return null;
            }
            c8817b91.f16832c = true;
            c8817b91.f16833d = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    Long.signum(j);
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        c8817b91.wait(j, (int) j2);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((C8689a91) arrayList2.get(size)).m9678b();
                    }
                    int i = -1;
                    for (int size2 = arrayList.size() - 1; i < size2; size2--) {
                        C8689a91 c8689a912 = (C8689a91) arrayList.get(size2);
                        c8689a912.m9678b();
                        if (c8689a912.f15337e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i = -1;
                    }
                }
            } finally {
                c8817b91.f16832c = false;
            }
        }
    }

    /* renamed from: d */
    public final void m10428d(C8689a91 c8689a91) {
        O90.m5968f(c8689a91, "taskQueue");
        byte[] bArr = AbstractC7433Ch1.f1577a;
        if (c8689a91.f15336d == null) {
            boolean zIsEmpty = c8689a91.f15337e.isEmpty();
            ArrayList arrayList = this.f16835f;
            if (zIsEmpty) {
                arrayList.remove(c8689a91);
            } else {
                O90.m5968f(arrayList, "<this>");
                if (!arrayList.contains(c8689a91)) {
                    arrayList.add(c8689a91);
                }
            }
        }
        boolean z = this.f16832c;
        C10641pN0 c10641pN0 = this.f16830a;
        if (z) {
            notify();
            return;
        }
        RunnableC10431nk0 runnableC10431nk0 = this.f16836g;
        O90.m5968f(runnableC10431nk0, "runnable");
        ((ThreadPoolExecutor) c10641pN0.f40042b).execute(runnableC10431nk0);
    }

    /* renamed from: e */
    public final C8689a91 m10429e() {
        int i;
        synchronized (this) {
            i = this.f16831b;
            this.f16831b = i + 1;
        }
        return new C8689a91(this, AbstractC11153tN0.m24909u(i, "Q"));
    }
}
