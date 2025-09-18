package p000;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10820qm1 {

    /* renamed from: n */
    public static final long f41137n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o */
    public static volatile ScheduledExecutorService f41138o = null;

    /* renamed from: p */
    public static final Object f41139p = new Object();

    /* renamed from: a */
    public final Object f41140a;

    /* renamed from: b */
    public final PowerManager.WakeLock f41141b;

    /* renamed from: c */
    public int f41142c;

    /* renamed from: d */
    public ScheduledFuture f41143d;

    /* renamed from: e */
    public long f41144e;

    /* renamed from: f */
    public final HashSet f41145f;

    /* renamed from: g */
    public boolean f41146g;

    /* renamed from: h */
    public CA1 f41147h;

    /* renamed from: i */
    public final Clock f41148i;

    /* renamed from: j */
    public final String f41149j;

    /* renamed from: k */
    public final HashMap f41150k;

    /* renamed from: l */
    public final AtomicInteger f41151l;

    /* renamed from: m */
    public final ScheduledExecutorService f41152m;

    public C10820qm1(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String packageName = context.getPackageName();
        this.f41140a = new Object();
        this.f41142c = 0;
        this.f41145f = new HashSet();
        this.f41146g = true;
        this.f41148i = DefaultClock.getInstance();
        this.f41150k = new HashMap();
        this.f41151l = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f41147h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f41149j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f41149j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new C6838sg(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        this.f41141b = wakeLockNewWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            if (workSourceFromPackage != null) {
                try {
                    wakeLockNewWakeLock.setWorkSource(workSourceFromPackage);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    e.toString();
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f41138o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f41139p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f41138o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f41138o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f41152m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* renamed from: a */
    public final void m24059a(long j) {
        this.f41151l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f41137n), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f41140a) {
            try {
                if (!m24060b()) {
                    this.f41147h = CA1.f1236a;
                    this.f41141b.acquire();
                    this.f41148i.elapsedRealtime();
                }
                this.f41142c++;
                if (this.f41146g) {
                    TextUtils.isEmpty(null);
                }
                BC1 bc1 = (BC1) this.f41150k.get(null);
                if (bc1 == null) {
                    bc1 = new BC1();
                    this.f41150k.put(null, bc1);
                }
                bc1.f654a++;
                long jElapsedRealtime = this.f41148i.elapsedRealtime();
                long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j2 > this.f41144e) {
                    this.f41144e = j2;
                    ScheduledFuture scheduledFuture = this.f41143d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f41143d = this.f41152m.schedule(new RunnableC10431nk0(15, this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean m24060b() {
        boolean z;
        synchronized (this.f41140a) {
            z = this.f41142c > 0;
        }
        return z;
    }

    /* renamed from: c */
    public final void m24061c() {
        if (this.f41151l.decrementAndGet() < 0) {
            String.valueOf(this.f41149j).concat(" release without a matched acquire!");
        }
        synchronized (this.f41140a) {
            try {
                if (this.f41146g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f41150k.containsKey(null)) {
                    BC1 bc1 = (BC1) this.f41150k.get(null);
                    if (bc1 != null) {
                        int i = bc1.f654a - 1;
                        bc1.f654a = i;
                        if (i == 0) {
                            this.f41150k.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f41149j).concat(" counter does not exist");
                }
                m24063e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m24062d() {
        HashSet hashSet = this.f41145f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* renamed from: e */
    public final void m24063e() {
        synchronized (this.f41140a) {
            try {
                if (m24060b()) {
                    if (this.f41146g) {
                        int i = this.f41142c - 1;
                        this.f41142c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f41142c = 0;
                    }
                    m24062d();
                    Iterator it = this.f41150k.values().iterator();
                    while (it.hasNext()) {
                        ((BC1) it.next()).f654a = 0;
                    }
                    this.f41150k.clear();
                    ScheduledFuture scheduledFuture = this.f41143d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f41143d = null;
                        this.f41144e = 0L;
                    }
                    if (this.f41141b.isHeld()) {
                        try {
                            try {
                                this.f41141b.release();
                                if (this.f41147h != null) {
                                    this.f41147h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.f41149j).concat(" failed to release!");
                                if (this.f41147h != null) {
                                    this.f41147h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f41147h != null) {
                                this.f41147h = null;
                            }
                            throw th;
                        }
                    } else {
                        String.valueOf(this.f41149j).concat(" should be held!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
