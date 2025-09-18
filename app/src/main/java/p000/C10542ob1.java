package p000;

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
public final class C10542ob1 {

    /* renamed from: i */
    public static final long f39112i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    public static final /* synthetic */ int f39113j = 0;

    /* renamed from: a */
    public final Context f39114a;

    /* renamed from: b */
    public final C7608Fr0 f39115b;

    /* renamed from: c */
    public final C8128Pr0 f39116c;

    /* renamed from: d */
    public final FirebaseMessaging f39117d;

    /* renamed from: f */
    public final ScheduledThreadPoolExecutor f39119f;

    /* renamed from: h */
    public final C10286mb1 f39121h;

    /* renamed from: e */
    public final C7119x8 f39118e = new C7119x8();

    /* renamed from: g */
    public boolean f39120g = false;

    public C10542ob1(FirebaseMessaging firebaseMessaging, C7608Fr0 c7608Fr0, C10286mb1 c10286mb1, C8128Pr0 c8128Pr0, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f39117d = firebaseMessaging;
        this.f39115b = c7608Fr0;
        this.f39121h = c10286mb1;
        this.f39116c = c8128Pr0;
        this.f39114a = context;
        this.f39119f = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static void m23505b(C9450g32 c9450g32) throws IOException {
        try {
            AbstractC9376fU1.m18241b(c9450g32, 30L, TimeUnit.SECONDS);
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

    /* renamed from: a */
    public final void m23506a(C10158lb1 c10158lb1, S81 s81) {
        ArrayDeque arrayDeque;
        synchronized (this.f39118e) {
            try {
                String str = c10158lb1.f37183c;
                if (this.f39118e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.f39118e.getOrDefault(str, null);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f39118e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(s81);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m23507c(String str) throws IOException {
        String strM11309a = this.f39117d.m11309a();
        C8128Pr0 c8128Pr0 = this.f39116c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        m23505b(c8128Pr0.m6452o(c8128Pr0.m6445B(strM11309a, "/topics/" + str, bundle)));
    }

    /* renamed from: d */
    public final void m23508d(String str) throws IOException {
        String strM11309a = this.f39117d.m11309a();
        C8128Pr0 c8128Pr0 = this.f39116c;
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        m23505b(c8128Pr0.m6452o(c8128Pr0.m6445B(strM11309a, "/topics/" + str, bundle)));
    }

    /* renamed from: e */
    public final void m23509e(C10158lb1 c10158lb1) {
        synchronized (this.f39118e) {
            try {
                String str = c10158lb1.f37183c;
                if (this.f39118e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f39118e.getOrDefault(str, null);
                    S81 s81 = (S81) arrayDeque.poll();
                    if (s81 != null) {
                        s81.m7184b(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f39118e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final C9450g32 m23510f(C10158lb1 c10158lb1) {
        C10286mb1 c10286mb1 = this.f39121h;
        synchronized (c10286mb1) {
            c10286mb1.f37786b.m25138d(c10158lb1.f37183c);
        }
        S81 s81 = new S81();
        m23506a(c10158lb1, s81);
        return s81.f10598a;
    }

    /* renamed from: g */
    public final synchronized void m23511g(boolean z) {
        this.f39120g = z;
    }

    /* renamed from: h */
    public final void m23512h() {
        boolean z;
        if (this.f39121h.m22903a() != null) {
            synchronized (this) {
                z = this.f39120g;
            }
            if (z) {
                return;
            }
            m23514j(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0036  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m23513i() throws java.io.IOException {
        /*
            r6 = this;
        L0:
            monitor-enter(r6)
            mb1 r0 = r6.f39121h     // Catch: java.lang.Throwable -> Lc
            lb1 r0 = r0.m22903a()     // Catch: java.lang.Throwable -> Lc
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
            java.lang.String r3 = r0.f37182b     // Catch: java.io.IOException -> L2a
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
            java.lang.String r4 = r0.f37181a
            if (r3 == 0) goto L42
            if (r3 == r1) goto L3e
            goto L45
        L3e:
            r6.m23508d(r4)     // Catch: java.io.IOException -> L2a
            goto L45
        L42:
            r6.m23507c(r4)     // Catch: java.io.IOException -> L2a
        L45:
            mb1 r1 = r6.f39121h
            r1.m22905c(r0)
            r6.m23509e(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C10542ob1.m23513i():boolean");
    }

    /* renamed from: j */
    public final void m23514j(long j) {
        long jMin = Math.min(Math.max(30L, 2 * j), f39112i);
        this.f39119f.schedule(new RunnableC10798qb1(this, this.f39114a, this.f39115b, jMin), j, TimeUnit.SECONDS);
        m23511g(true);
    }
}
