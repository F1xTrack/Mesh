package p000;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: x71 */
/* loaded from: classes.dex */
public final class RunnableC11632x71 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f45411a;

    /* renamed from: b */
    public final long f45412b;

    /* renamed from: c */
    public final Object f45413c;

    /* renamed from: d */
    public final Object f45414d;

    /* renamed from: e */
    public final Object f45415e;

    public /* synthetic */ RunnableC11632x71(C10218m32 c10218m32, C8965cJ1 c8965cJ1, long j, C10339n11 c10339n11) {
        this.f45411a = 1;
        EnumC10593p02 enumC10593p02 = EnumC10593p02.UNKNOWN_EVENT;
        this.f45413c = c10218m32;
        this.f45414d = c8965cJ1;
        this.f45412b = j;
        this.f45415e = c10339n11;
    }

    /* renamed from: a */
    public boolean m25773a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f45414d).f18469b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    public boolean m25774b() throws IOException {
        try {
            return ((FirebaseMessaging) this.f45414d).m11309a() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45411a) {
            case 0:
                C10919rY0 c10919rY0M24401x = C10919rY0.m24401x();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f45414d;
                boolean zM24426z = c10919rY0M24401x.m24426z(firebaseMessaging.f18469b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f45413c;
                if (zM24426z) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f18477j = true;
                        }
                        if (!firebaseMessaging.f18476i.m2804h()) {
                            firebaseMessaging.m11313h(false);
                            if (!C10919rY0.m24401x().m24426z(firebaseMessaging.f18469b)) {
                                return;
                            }
                        } else if (!C10919rY0.m24401x().m24425y(firebaseMessaging.f18469b) || m25773a()) {
                            if (m25774b()) {
                                firebaseMessaging.m11313h(false);
                            } else {
                                firebaseMessaging.m11316k(this.f45412b);
                            }
                            if (!C10919rY0.m24401x().m24426z(firebaseMessaging.f18469b)) {
                                return;
                            }
                        } else {
                            C0196D6 c0196d6 = new C0196D6();
                            c0196d6.f1842b = this;
                            ((FirebaseMessaging) ((RunnableC11632x71) c0196d6.f1842b).f45414d).f18469b.registerReceiver(c0196d6, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            if (!C10919rY0.m24401x().m24426z(firebaseMessaging.f18469b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        e.getMessage();
                        firebaseMessaging.m11313h(false);
                        if (!C10919rY0.m24401x().m24426z(firebaseMessaging.f18469b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (C10919rY0.m24401x().m24426z(firebaseMessaging.f18469b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                C10218m32 c10218m32 = (C10218m32) this.f45413c;
                HashMap map = c10218m32.f37459j;
                EnumC10593p02 enumC10593p02 = EnumC10593p02.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                if (!map.containsKey(enumC10593p02)) {
                    map.put(enumC10593p02, new C10492oC1());
                }
                C10492oC1 c10492oC1 = (C10492oC1) map.get(enumC10593p02);
                Long lValueOf = Long.valueOf(this.f45412b);
                C8965cJ1 c8965cJ1 = (C8965cJ1) this.f45414d;
                C1752av c1752av = c10492oC1.f38885c;
                Collection collection = (Collection) c1752av.get(c8965cJ1);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    c1752av.put(c8965cJ1, arrayList);
                } else {
                    collection.add(lValueOf);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (c10218m32.m22650d(enumC10593p02, jElapsedRealtime)) {
                    c10218m32.f37458i.put(enumC10593p02, Long.valueOf(jElapsedRealtime));
                    MM1.f7115a.execute(new RO1(c10218m32, (C10339n11) this.f45415e));
                    return;
                }
                return;
        }
    }

    public RunnableC11632x71(FirebaseMessaging firebaseMessaging, long j) {
        this.f45411a = 0;
        this.f45415e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f45414d = firebaseMessaging;
        this.f45412b = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f18469b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f45413c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
