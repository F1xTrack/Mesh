package defpackage;

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

/* renamed from: bA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2273bA {
    public static final C7533v4 g = C7533v4.d();
    public static final long h = TimeUnit.SECONDS.toMicros(1);
    public ScheduledFuture e = null;
    public long f = -1;
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public final String c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j, C0646Ia1 c0646Ia1) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new RunnableC2082aA(this, c0646Ia1, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C7533v4 c7533v4 = g;
            e.getMessage();
            c7533v4.f();
        }
    }

    public final C3339dA b(C0646Ia1 c0646Ia1) {
        long j;
        long j2;
        C2463cA c2463cAX;
        double d;
        long j3;
        long j4 = this.d;
        C7533v4 c7533v4 = g;
        if (c0646Ia1 == null) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
                try {
                    long jA = c0646Ia1.a() + c0646Ia1.a;
                    String[] strArrSplit = bufferedReader.readLine().split(" ");
                    j = Long.parseLong(strArrSplit[13]);
                    j2 = Long.parseLong(strArrSplit[15]);
                    long j5 = Long.parseLong(strArrSplit[14]);
                    long j6 = Long.parseLong(strArrSplit[16]);
                    c2463cAX = C3339dA.x();
                    c2463cAX.n();
                    C3339dA.u((C3339dA) c2463cAX.b, jA);
                    d = (j5 + j6) / j4;
                    j3 = h;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    long jRound = Math.round(d * j3);
                    c2463cAX.n();
                    C3339dA.w((C3339dA) c2463cAX.b, jRound);
                    long jRound2 = Math.round(((j + j2) / j4) * j3);
                    c2463cAX.n();
                    C3339dA.v((C3339dA) c2463cAX.b, jRound2);
                    C3339dA c3339dA = (C3339dA) c2463cAX.l();
                    bufferedReader.close();
                    return c3339dA;
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
                c7533v4.f();
                return null;
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                e.getMessage();
                c7533v4.f();
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                e.getMessage();
                c7533v4.f();
                return null;
            } catch (NumberFormatException e4) {
                e = e4;
                e.getMessage();
                c7533v4.f();
                return null;
            }
        } catch (IOException e5) {
            e = e5;
            e.getMessage();
            c7533v4.f();
            return null;
        } catch (ArrayIndexOutOfBoundsException e6) {
            e = e6;
            e.getMessage();
            c7533v4.f();
            return null;
        } catch (NullPointerException e7) {
            e = e7;
            e.getMessage();
            c7533v4.f();
            return null;
        } catch (NumberFormatException e8) {
            e = e8;
            e.getMessage();
            c7533v4.f();
            return null;
        }
    }
}
