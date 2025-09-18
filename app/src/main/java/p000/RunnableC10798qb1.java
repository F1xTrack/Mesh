package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PowerManager;
import java.io.IOException;

/* renamed from: qb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10798qb1 implements Runnable {

    /* renamed from: g */
    public static final Object f41047g = new Object();

    /* renamed from: h */
    public static Boolean f41048h;

    /* renamed from: i */
    public static Boolean f41049i;

    /* renamed from: a */
    public final /* synthetic */ int f41050a;

    /* renamed from: b */
    public final long f41051b;

    /* renamed from: c */
    public final Object f41052c;

    /* renamed from: d */
    public final Object f41053d;

    /* renamed from: e */
    public final Object f41054e;

    /* renamed from: f */
    public final Object f41055f;

    public /* synthetic */ RunnableC10798qb1(Object obj, Object obj2, Object obj3, Object obj4, long j, int i) {
        this.f41050a = i;
        this.f41052c = obj2;
        this.f41053d = obj3;
        this.f41054e = obj4;
        this.f41051b = j;
        this.f41055f = obj;
    }

    /* renamed from: a */
    public static boolean m24025a(Context context) {
        boolean zBooleanValue;
        synchronized (f41047g) {
            try {
                Boolean bool = f41049i;
                zBooleanValue = (bool == null && bool == null) ? context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                f41049i = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* renamed from: b */
    public static boolean m24026b(Context context) {
        boolean zBooleanValue;
        synchronized (f41047g) {
            try {
                Boolean bool = f41048h;
                zBooleanValue = (bool == null && bool == null) ? context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                f41048h = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m24027c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.f41052c     // Catch: java.lang.Throwable -> L14
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L14
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            goto L24
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L21
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            monitor-exit(r2)
            return r0
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC10798qb1.m24027c():boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41050a) {
            case 0:
                C10542ob1 c10542ob1 = (C10542ob1) this.f41055f;
                Context context = (Context) this.f41052c;
                boolean zM24026b = m24026b(context);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f41054e;
                if (zM24026b) {
                    wakeLock.acquire(AbstractC0312Ex.f2980a);
                }
                try {
                    try {
                        c10542ob1.m23511g(true);
                        if (!((C7608Fr0) this.f41053d).m2804h()) {
                            c10542ob1.m23511g(false);
                            if (!m24026b(context)) {
                                return;
                            }
                        } else if (!m24025a(context) || m24027c()) {
                            if (c10542ob1.m23513i()) {
                                c10542ob1.m23511g(false);
                            } else {
                                c10542ob1.m23514j(this.f41051b);
                            }
                            if (!m24026b(context)) {
                                return;
                            }
                        } else {
                            C10670pb1 c10670pb1 = new C10670pb1();
                            c10670pb1.f40230a = this;
                            context.registerReceiver(c10670pb1, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            if (!m24026b(context)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        e.getMessage();
                        c10542ob1.m23511g(false);
                        if (!m24026b(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        return;
                    }
                } catch (Throwable th) {
                    if (m24026b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                    throw th;
                }
            case 1:
                String str = (String) this.f41053d;
                BinderC10262mP1 binderC10262mP1 = (BinderC10262mP1) this.f41055f;
                String str2 = (String) this.f41052c;
                if (str2 == null) {
                    C10152lY1 c10152lY1 = binderC10262mP1.f37671a;
                    c10152lY1.mo6071p0().mo7681v1();
                    String str3 = c10152lY1.f37119G;
                    if (str3 == null || str3.equals(str)) {
                        c10152lY1.f37119G = str;
                        c10152lY1.f37118F = null;
                        return;
                    }
                    return;
                }
                CU1 cu1 = new CU1((String) this.f41054e, str2, this.f41051b);
                C10152lY1 c10152lY12 = binderC10262mP1.f37671a;
                c10152lY12.mo6071p0().mo7681v1();
                String str4 = c10152lY12.f37119G;
                if (str4 != null) {
                    str4.equals(str);
                }
                c10152lY12.f37119G = str;
                c10152lY12.f37118F = cu1;
                return;
            case 2:
                Object obj = this.f41054e;
                ((FR1) this.f41055f).m2634D1(this.f41051b, obj, (String) this.f41052c, (String) this.f41053d);
                return;
            default:
                Bundle bundle = (Bundle) this.f41052c;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                JU1 ju1 = (JU1) this.f41055f;
                ju1.m4332F1((CU1) this.f41053d, (CU1) this.f41054e, this.f41051b, true, ju1.m7852u1().m22866G1("screen_view", bundle, null, false));
                return;
        }
    }

    public RunnableC10798qb1(C10542ob1 c10542ob1, Context context, C7608Fr0 c7608Fr0, long j) {
        this.f41050a = 0;
        this.f41055f = c10542ob1;
        this.f41052c = context;
        this.f41051b = j;
        this.f41053d = c7608Fr0;
        this.f41054e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
