package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* renamed from: b91 */
/* loaded from: classes2.dex */
public final class C2272b91 {
    public static final C2272b91 h;
    public static final Logger i;
    public final C6446pN0 a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final RunnableC6133nk0 g = new RunnableC6133nk0(8, this);

    static {
        String str = AbstractC0199Ch1.g + " TaskRunner";
        O90.f(str, "name");
        h = new C2272b91(new C6446pN0(new ThreadFactoryC7842wh1(str, true)));
        Logger logger = Logger.getLogger(C2272b91.class.getName());
        O90.e(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public C2272b91(C6446pN0 c6446pN0) {
        this.a = c6446pN0;
    }

    public static final void a(C2272b91 c2272b91, P81 p81) {
        c2272b91.getClass();
        byte[] bArr = AbstractC0199Ch1.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(p81.a);
        try {
            long jA = p81.a();
            synchronized (c2272b91) {
                c2272b91.b(p81, jA);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (c2272b91) {
                c2272b91.b(p81, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(P81 p81, long j) {
        byte[] bArr = AbstractC0199Ch1.a;
        C2081a91 c2081a91 = p81.c;
        O90.c(c2081a91);
        if (c2081a91.d != p81) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = c2081a91.f;
        c2081a91.f = false;
        c2081a91.d = null;
        this.e.remove(c2081a91);
        if (j != -1 && !z && !c2081a91.c) {
            c2081a91.e(p81, j, true);
        }
        if (c2081a91.e.isEmpty()) {
            return;
        }
        this.f.add(c2081a91);
    }

    public final P81 c() {
        boolean z;
        C2272b91 c2272b91 = this;
        byte[] bArr = AbstractC0199Ch1.a;
        while (true) {
            ArrayList arrayList = c2272b91.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C6446pN0 c6446pN0 = c2272b91.a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            P81 p81 = null;
            while (true) {
                if (!it.hasNext()) {
                    c2272b91 = this;
                    z = false;
                    break;
                }
                P81 p812 = (P81) ((C2081a91) it.next()).e.get(0);
                long jMax = Math.max(0L, p812.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (p81 != null) {
                        c2272b91 = this;
                        z = true;
                        break;
                    }
                    p81 = p812;
                }
            }
            ArrayList arrayList2 = c2272b91.e;
            if (p81 != null) {
                byte[] bArr2 = AbstractC0199Ch1.a;
                p81.d = -1L;
                C2081a91 c2081a91 = p81.c;
                O90.c(c2081a91);
                c2081a91.e.remove(p81);
                arrayList.remove(c2081a91);
                c2081a91.d = p81;
                arrayList2.add(c2081a91);
                if (z || (!c2272b91.c && !arrayList.isEmpty())) {
                    RunnableC6133nk0 runnableC6133nk0 = c2272b91.g;
                    O90.f(runnableC6133nk0, "runnable");
                    ((ThreadPoolExecutor) c6446pN0.b).execute(runnableC6133nk0);
                }
                return p81;
            }
            if (c2272b91.c) {
                if (jMin < c2272b91.d - jNanoTime) {
                    notify();
                }
                return null;
            }
            c2272b91.c = true;
            c2272b91.d = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    Long.signum(j);
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        c2272b91.wait(j, (int) j2);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((C2081a91) arrayList2.get(size)).b();
                    }
                    int i2 = -1;
                    for (int size2 = arrayList.size() - 1; i2 < size2; size2--) {
                        C2081a91 c2081a912 = (C2081a91) arrayList.get(size2);
                        c2081a912.b();
                        if (c2081a912.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                        i2 = -1;
                    }
                }
            } finally {
                c2272b91.c = false;
            }
        }
    }

    public final void d(C2081a91 c2081a91) {
        O90.f(c2081a91, "taskQueue");
        byte[] bArr = AbstractC0199Ch1.a;
        if (c2081a91.d == null) {
            boolean zIsEmpty = c2081a91.e.isEmpty();
            ArrayList arrayList = this.f;
            if (zIsEmpty) {
                arrayList.remove(c2081a91);
            } else {
                O90.f(arrayList, "<this>");
                if (!arrayList.contains(c2081a91)) {
                    arrayList.add(c2081a91);
                }
            }
        }
        boolean z = this.c;
        C6446pN0 c6446pN0 = this.a;
        if (z) {
            notify();
            return;
        }
        RunnableC6133nk0 runnableC6133nk0 = this.g;
        O90.f(runnableC6133nk0, "runnable");
        ((ThreadPoolExecutor) c6446pN0.b).execute(runnableC6133nk0);
    }

    public final C2081a91 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new C2081a91(this, AbstractC7209tN0.u(i2, "Q"));
    }
}
