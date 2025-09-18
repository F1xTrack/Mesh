package p000;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bA */
/* loaded from: classes.dex */
public final class C1768bA {

    /* renamed from: g */
    public static final C6989v4 f16837g = C6989v4.m25319d();

    /* renamed from: h */
    public static final long f16838h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e */
    public ScheduledFuture f16843e = null;

    /* renamed from: f */
    public long f16844f = -1;

    /* renamed from: a */
    public final ConcurrentLinkedQueue f16839a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final ScheduledExecutorService f16840b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    public final String f16841c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d */
    public final long f16842d = Os.sysconf(OsConstants._SC_CLK_TCK);

    /* renamed from: a */
    public final synchronized void m10430a(long j, C7731Ia1 c7731Ia1) {
        this.f16844f = j;
        try {
            this.f16843e = this.f16840b.scheduleAtFixedRate(new RunnableC1647aA(this, c7731Ia1, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6989v4 c6989v4 = f16837g;
            e.getMessage();
            c6989v4.m25324f();
        }
    }

    /* renamed from: b */
    public final C3911dA m10431b(C7731Ia1 c7731Ia1) {
        long j;
        long j2;
        C1830cA c1830cAM17500x;
        double d;
        long j3;
        long j4 = this.f16842d;
        C6989v4 c6989v4 = f16837g;
        if (c7731Ia1 == null) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f16841c));
                try {
                    long jM3946a = c7731Ia1.m3946a() + c7731Ia1.f5021a;
                    String[] strArrSplit = bufferedReader.readLine().split(" ");
                    j = Long.parseLong(strArrSplit[13]);
                    j2 = Long.parseLong(strArrSplit[15]);
                    long j5 = Long.parseLong(strArrSplit[14]);
                    long j6 = Long.parseLong(strArrSplit[16]);
                    c1830cAM17500x = C3911dA.m17500x();
                    c1830cAM17500x.m23922n();
                    C3911dA.m17497u((C3911dA) c1830cAM17500x.f40483b, jM3946a);
                    d = (j5 + j6) / j4;
                    j3 = f16838h;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    long jRound = Math.round(d * j3);
                    c1830cAM17500x.m23922n();
                    C3911dA.m17499w((C3911dA) c1830cAM17500x.f40483b, jRound);
                    long jRound2 = Math.round(((j + j2) / j4) * j3);
                    c1830cAM17500x.m23922n();
                    C3911dA.m17498v((C3911dA) c1830cAM17500x.f40483b, jRound2);
                    C3911dA c3911dA = (C3911dA) c1830cAM17500x.m23920l();
                    bufferedReader.close();
                    return c3911dA;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        bufferedReader.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException e) {
                e = e;
                e.getMessage();
                c6989v4.m25324f();
                return null;
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                e.getMessage();
                c6989v4.m25324f();
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                e.getMessage();
                c6989v4.m25324f();
                return null;
            } catch (NumberFormatException e4) {
                e = e4;
                e.getMessage();
                c6989v4.m25324f();
                return null;
            }
        } catch (IOException e5) {
            e = e5;
            e.getMessage();
            c6989v4.m25324f();
            return null;
        } catch (ArrayIndexOutOfBoundsException e6) {
            e = e6;
            e.getMessage();
            c6989v4.m25324f();
            return null;
        } catch (NullPointerException e7) {
            e = e7;
            e.getMessage();
            c6989v4.m25324f();
            return null;
        } catch (NumberFormatException e8) {
            e = e8;
            e.getMessage();
            c6989v4.m25324f();
            return null;
        }
    }
}
