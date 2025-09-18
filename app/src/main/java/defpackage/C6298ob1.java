package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ob1 */
/* loaded from: classes.dex */
public final class C6298ob1 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final C0462Fr0 b;
    public final C1241Pr0 c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final C5916mb1 h;
    public final C7925x8 e = new C7925x8();
    public boolean g = false;

    public C6298ob1(FirebaseMessaging firebaseMessaging, C0462Fr0 c0462Fr0, C5916mb1 c5916mb1, C1241Pr0 c1241Pr0, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = c0462Fr0;
        this.h = c5916mb1;
        this.c = c1241Pr0;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void b(C3892g32 c3892g32) throws IOException {
        try {
            AbstractC3782fU1.b(c3892g32, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void a(C5725lb1 c5725lb1, S81 s81) {
        ArrayDeque arrayDeque;
        synchronized (this.e) {
            try {
                String str = c5725lb1.c;
                if (this.e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.e.getOrDefault(str, null);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(s81);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        C1241Pr0 c1241Pr0 = this.c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        b(c1241Pr0.o(c1241Pr0.B(strA, "/topics/" + str, bundle)));
    }

    public final void d(String str) throws IOException {
        String strA = this.d.a();
        C1241Pr0 c1241Pr0 = this.c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        b(c1241Pr0.o(c1241Pr0.B(strA, "/topics/" + str, bundle)));
    }

    public final void e(C5725lb1 c5725lb1) {
        synchronized (this.e) {
            try {
                String str = c5725lb1.c;
                if (this.e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.getOrDefault(str, null);
                    S81 s81 = (S81) arrayDeque.poll();
                    if (s81 != null) {
                        s81.b(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C3892g32 f(C5725lb1 c5725lb1) {
        C5916mb1 c5916mb1 = this.h;
        synchronized (c5916mb1) {
            c5916mb1.b.d(c5725lb1.c);
        }
        S81 s81 = new S81();
        a(c5725lb1, s81);
        return s81.a;
    }

    public final synchronized void g(boolean z) {
        this.g = z;
    }

    public final void h() {
        boolean z;
        if (this.h.a() != null) {
            synchronized (this) {
                z = this.g;
            }
            if (z) {
                return;
            }
            j(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() throws java.io.IOException {
        /*
            r6 = this;
        L0:
            monitor-enter(r6)
            mb1 r0 = r6.h     // Catch: java.lang.Throwable -> Lc
            lb1 r0 = r0.a()     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            if (r0 != 0) goto Lf
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r0 = move-exception
            goto L7f
        Lf:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            java.lang.String r3 = r0.b     // Catch: java.io.IOException -> L2a
            int r4 = r3.hashCode()     // Catch: java.io.IOException -> L2a
            r5 = 83
            if (r4 == r5) goto L2c
            r5 = 85
            if (r4 == r5) goto L20
            goto L36
        L20:
            java.lang.String r4 = "U"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L2a
            if (r3 == 0) goto L36
            r3 = r1
            goto L37
        L2a:
            r0 = move-exception
            goto L4e
        L2c:
            java.lang.String r4 = "S"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L2a
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = -1
        L37:
            java.lang.String r4 = r0.a
            if (r3 == 0) goto L42
            if (r3 == r1) goto L3e
            goto L45
        L3e:
            r6.d(r4)     // Catch: java.io.IOException -> L2a
            goto L45
        L42:
            r6.c(r4)     // Catch: java.io.IOException -> L2a
        L45:
            mb1 r1 = r6.h
            r1.c(r0)
            r6.e(r0)
            goto L0
        L4e:
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r0.getMessage()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L7b
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r0.getMessage()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L7b
            java.lang.String r1 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r3 = r0.getMessage()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L73
            goto L7b
        L73:
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L7a
            goto L7e
        L7a:
            throw r0
        L7b:
            r0.getMessage()
        L7e:
            return r2
        L7f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6298ob1.i():boolean");
    }

    public final void j(long j2) {
        long jMin = Math.min(Math.max(30L, 2 * j2), i);
        this.f.schedule(new RunnableC6680qb1(this, this.a, this.b, jMin), j2, TimeUnit.SECONDS);
        g(true);
    }
}
