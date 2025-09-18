package p000;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: MU */
/* loaded from: classes.dex */
public final class C0786MU {

    /* renamed from: k */
    public static final Object f7172k = new Object();

    /* renamed from: l */
    public static final C7119x8 f7173l = new C7119x8();

    /* renamed from: a */
    public final Context f7174a;

    /* renamed from: b */
    public final String f7175b;

    /* renamed from: c */
    public final C4057fV f7176c;

    /* renamed from: d */
    public final C1002Pv f7177d;

    /* renamed from: e */
    public final AtomicBoolean f7178e;

    /* renamed from: f */
    public final AtomicBoolean f7179f;

    /* renamed from: g */
    public final C10809qh0 f7180g;

    /* renamed from: h */
    public final InterfaceC9347fG0 f7181h;

    /* renamed from: i */
    public final CopyOnWriteArrayList f7182i;

    /* renamed from: j */
    public final CopyOnWriteArrayList f7183j;

    public C0786MU(C4057fV c4057fV, Context context, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f7178e = atomicBoolean;
        this.f7179f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f7182i = copyOnWriteArrayList;
        this.f7183j = new CopyOnWriteArrayList();
        this.f7174a = (Context) Preconditions.checkNotNull(context);
        this.f7175b = Preconditions.checkNotEmpty(str);
        this.f7176c = (C4057fV) Preconditions.checkNotNull(c4057fV);
        C7277ze c7277ze = FirebaseInitProvider.f18518a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListM1029M0 = new CC0(context, 9, new C7391Bm1(9, ComponentDiscoveryService.class)).m1029M0();
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC7585Ff1 enumC7585Ff1 = EnumC7585Ff1.f3379a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListM1029M0);
        arrayList.add(new C0688Kv(1, new FirebaseCommonRegistrar()));
        arrayList.add(new C0688Kv(1, new ExecutorsRegistrar()));
        arrayList2.add(C6853sv.m24811c(context, Context.class, new Class[0]));
        arrayList2.add(C6853sv.m24811c(this, C0786MU.class, new Class[0]));
        arrayList2.add(C6853sv.m24811c(c4057fV, C4057fV.class, new Class[0]));
        C10212m12 c10212m12 = new C10212m12(9);
        if ((Build.VERSION.SDK_INT >= 24 ? AbstractC10426nh1.m23170a(context) : true) && FirebaseInitProvider.f18519b.get()) {
            arrayList2.add(C6853sv.m24811c(c7277ze, C7277ze.class, new Class[0]));
        }
        C1002Pv c1002Pv = new C1002Pv(enumC7585Ff1, arrayList, arrayList2, c10212m12);
        this.f7177d = c1002Pv;
        Trace.endSection();
        this.f7180g = new C10809qh0(new C0939Ov(this, 2, context));
        this.f7181h = c1002Pv.mo4068c(C0079BF.class);
        C0598JU c0598ju = new C0598JU(this);
        m5379a();
        if (atomicBoolean.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        copyOnWriteArrayList.add(c0598ju);
        Trace.endSection();
    }

    /* renamed from: c */
    public static ArrayList m5374c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f7172k) {
            try {
                Iterator it = ((C6993v8) f7173l.values()).iterator();
                while (it.hasNext()) {
                    C0786MU c0786mu = (C0786MU) it.next();
                    c0786mu.m5379a();
                    arrayList.add(c0786mu.f7175b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static C0786MU m5375d() {
        C0786MU c0786mu;
        synchronized (f7172k) {
            try {
                c0786mu = (C0786MU) f7173l.getOrDefault("[DEFAULT]", null);
                if (c0786mu == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C0079BF) c0786mu.f7181h.get()).m564c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0786mu;
    }

    /* renamed from: e */
    public static C0786MU m5376e(String str) {
        C0786MU c0786mu;
        String str2;
        synchronized (f7172k) {
            try {
                c0786mu = (C0786MU) f7173l.getOrDefault(str.trim(), null);
                if (c0786mu == null) {
                    ArrayList arrayListM5374c = m5374c();
                    if (arrayListM5374c.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListM5374c);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((C0079BF) c0786mu.f7181h.get()).m564c();
            } finally {
            }
        }
        return c0786mu;
    }

    /* renamed from: h */
    public static C0786MU m5377h(C4057fV c4057fV, Context context, String str) {
        C0786MU c0786mu;
        AtomicReference atomicReference = C0661KU.f6124a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C0661KU.f6124a;
            if (atomicReference2.get() == null) {
                C0661KU c0661ku = new C0661KU();
                while (true) {
                    if (atomicReference2.compareAndSet(null, c0661ku)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(c0661ku);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7172k) {
            C7119x8 c7119x8 = f7173l;
            Preconditions.checkState(!c7119x8.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            c0786mu = new C0786MU(c4057fV, context, strTrim);
            c7119x8.put(strTrim, c0786mu);
        }
        c0786mu.m5382g();
        return c0786mu;
    }

    /* renamed from: i */
    public static void m5378i(Context context) {
        synchronized (f7172k) {
            try {
                if (f7173l.containsKey("[DEFAULT]")) {
                    m5375d();
                    return;
                }
                C4057fV c4057fVM18249a = C4057fV.m18249a(context);
                if (c4057fVM18249a == null) {
                    return;
                }
                m5377h(c4057fVM18249a, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m5379a() {
        Preconditions.checkState(!this.f7179f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: b */
    public final Object m5380b(Class cls) {
        m5379a();
        return this.f7177d.mo4066a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0786MU)) {
            return false;
        }
        C0786MU c0786mu = (C0786MU) obj;
        c0786mu.m5379a();
        return this.f7175b.equals(c0786mu.f7175b);
    }

    /* renamed from: f */
    public final String m5381f() {
        StringBuilder sb = new StringBuilder();
        m5379a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f7175b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        m5379a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f7176c.f27219b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    /* renamed from: g */
    public final void m5382g() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f7174a;
        if (i >= 24 ? AbstractC10426nh1.m23170a(context) : true) {
            m5379a();
            m5379a();
            this.f7177d.m6483s("[DEFAULT]".equals(this.f7175b));
            ((C0079BF) this.f7181h.get()).m564c();
            return;
        }
        m5379a();
        AtomicReference atomicReference = C0723LU.f6661b;
        if (atomicReference.get() == null) {
            C0723LU c0723lu = new C0723LU(context);
            while (!atomicReference.compareAndSet(null, c0723lu)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(c0723lu, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final int hashCode() {
        return this.f7175b.hashCode();
    }

    /* renamed from: j */
    public final boolean m5383j() {
        boolean z;
        m5379a();
        C0265EC c0265ec = (C0265EC) this.f7180g.get();
        synchronized (c0265ec) {
            z = c0265ec.f2538d;
        }
        return z;
    }

    /* renamed from: k */
    public final void m5384k(boolean z) {
        Iterator it = this.f7182i.iterator();
        while (it.hasNext()) {
            C0786MU c0786mu = ((C0598JU) it.next()).f5546a;
            if (z) {
                c0786mu.getClass();
            } else {
                ((C0079BF) c0786mu.f7181h.get()).m564c();
            }
        }
    }

    /* renamed from: l */
    public final void m5385l(Boolean bool) {
        m5379a();
        C0265EC c0265ec = (C0265EC) this.f7180g.get();
        synchronized (c0265ec) {
            try {
                if (bool == null) {
                    c0265ec.f2536b.edit().remove("firebase_data_collection_default_enabled").apply();
                    c0265ec.m2066b(c0265ec.m2065a());
                } else {
                    boolean zEquals = Boolean.TRUE.equals(bool);
                    c0265ec.f2536b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                    c0265ec.m2066b(zEquals);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f7175b).add("options", this.f7176c).toString();
    }
}
