package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PowerManager;
import java.io.IOException;

/* renamed from: qb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6680qb1 implements Runnable {
    public static final Object g = new Object();
    public static Boolean h;
    public static Boolean i;
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public /* synthetic */ RunnableC6680qb1(Object obj, Object obj2, Object obj3, Object obj4, long j, int i2) {
        this.a = i2;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.b = j;
        this.f = obj;
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = i;
                zBooleanValue = (bool == null && bool == null) ? context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                i = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = h;
                zBooleanValue = (bool == null && bool == null) ? context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                h = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.c     // Catch: java.lang.Throwable -> L14
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC6680qb1.c():boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C6298ob1 c6298ob1 = (C6298ob1) this.f;
                Context context = (Context) this.c;
                boolean zB = b(context);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.e;
                if (zB) {
                    wakeLock.acquire(AbstractC0401Ex.a);
                }
                try {
                    try {
                        c6298ob1.g(true);
                        if (!((C0462Fr0) this.d).h()) {
                            c6298ob1.g(false);
                            if (!b(context)) {
                                return;
                            }
                        } else if (!a(context) || c()) {
                            if (c6298ob1.i()) {
                                c6298ob1.g(false);
                            } else {
                                c6298ob1.j(this.b);
                            }
                            if (!b(context)) {
                                return;
                            }
                        } else {
                            C6489pb1 c6489pb1 = new C6489pb1();
                            c6489pb1.a = this;
                            context.registerReceiver(c6489pb1, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            if (!b(context)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        e.getMessage();
                        c6298ob1.g(false);
                        if (!b(context)) {
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
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                    throw th;
                }
            case 1:
                String str = (String) this.d;
                BinderC5880mP1 binderC5880mP1 = (BinderC5880mP1) this.f;
                String str2 = (String) this.c;
                if (str2 == null) {
                    C5716lY1 c5716lY1 = binderC5880mP1.a;
                    c5716lY1.p0().v1();
                    String str3 = c5716lY1.G;
                    if (str3 == null || str3.equals(str)) {
                        c5716lY1.G = str;
                        c5716lY1.F = null;
                        return;
                    }
                    return;
                }
                CU1 cu1 = new CU1((String) this.e, str2, this.b);
                C5716lY1 c5716lY12 = binderC5880mP1.a;
                c5716lY12.p0().v1();
                String str4 = c5716lY12.G;
                if (str4 != null) {
                    str4.equals(str);
                }
                c5716lY12.G = str;
                c5716lY12.F = cu1;
                return;
            case 2:
                Object obj = this.e;
                ((FR1) this.f).D1(this.b, obj, (String) this.c, (String) this.d);
                return;
            default:
                Bundle bundle = (Bundle) this.c;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                JU1 ju1 = (JU1) this.f;
                ju1.F1((CU1) this.d, (CU1) this.e, this.b, true, ju1.u1().G1("screen_view", bundle, null, false));
                return;
        }
    }

    public RunnableC6680qb1(C6298ob1 c6298ob1, Context context, C0462Fr0 c0462Fr0, long j) {
        this.a = 0;
        this.f = c6298ob1;
        this.c = context;
        this.b = j;
        this.d = c0462Fr0;
        this.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
