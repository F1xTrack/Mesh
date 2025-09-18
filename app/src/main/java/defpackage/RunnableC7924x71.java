package defpackage;

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
public final class RunnableC7924x71 implements Runnable {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ RunnableC7924x71(C5814m32 c5814m32, C2492cJ1 c2492cJ1, long j, C5996n11 c5996n11) {
        this.a = 1;
        EnumC6375p02 enumC6375p02 = EnumC6375p02.UNKNOWN_EVENT;
        this.c = c5814m32;
        this.d = c2492cJ1;
        this.b = j;
        this.e = c5996n11;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.d).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            return ((FirebaseMessaging) this.d).a() != null;
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
        switch (this.a) {
            case 0:
                C6860rY0 c6860rY0X = C6860rY0.x();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.d;
                boolean z = c6860rY0X.z(firebaseMessaging.b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                if (z) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.j = true;
                        }
                        if (!firebaseMessaging.i.h()) {
                            firebaseMessaging.h(false);
                            if (!C6860rY0.x().z(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!C6860rY0.x().y(firebaseMessaging.b) || a()) {
                            if (b()) {
                                firebaseMessaging.h(false);
                            } else {
                                firebaseMessaging.k(this.b);
                            }
                            if (!C6860rY0.x().z(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            D6 d6 = new D6();
                            d6.b = this;
                            ((FirebaseMessaging) ((RunnableC7924x71) d6.b).d).b.registerReceiver(d6, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            if (!C6860rY0.x().z(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        e.getMessage();
                        firebaseMessaging.h(false);
                        if (!C6860rY0.x().z(firebaseMessaging.b)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (C6860rY0.x().z(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            default:
                C5814m32 c5814m32 = (C5814m32) this.c;
                HashMap map = c5814m32.j;
                EnumC6375p02 enumC6375p02 = EnumC6375p02.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                if (!map.containsKey(enumC6375p02)) {
                    map.put(enumC6375p02, new C6223oC1());
                }
                C6223oC1 c6223oC1 = (C6223oC1) map.get(enumC6375p02);
                Long lValueOf = Long.valueOf(this.b);
                C2492cJ1 c2492cJ1 = (C2492cJ1) this.d;
                C2223av c2223av = c6223oC1.c;
                Collection collection = (Collection) c2223av.get(c2492cJ1);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    c2223av.put(c2492cJ1, arrayList);
                } else {
                    collection.add(lValueOf);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (c5814m32.d(enumC6375p02, jElapsedRealtime)) {
                    c5814m32.i.put(enumC6375p02, Long.valueOf(jElapsedRealtime));
                    MM1.a.execute(new RO1(c5814m32, (C5996n11) this.e));
                    return;
                }
                return;
        }
    }

    public RunnableC7924x71(FirebaseMessaging firebaseMessaging, long j) {
        this.a = 0;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
