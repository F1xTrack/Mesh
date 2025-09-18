package defpackage;

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

/* loaded from: classes.dex */
public final class MU {
    public static final Object k = new Object();
    public static final C7925x8 l = new C7925x8();
    public final Context a;
    public final String b;
    public final C3783fV c;
    public final C1252Pv d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final C6697qh0 g;
    public final InterfaceC3739fG0 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public MU(C3783fV c3783fV, Context context, String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = (Context) Preconditions.checkNotNull(context);
        this.b = Preconditions.checkNotEmpty(str);
        this.c = (C3783fV) Preconditions.checkNotNull(c3783fV);
        C8401ze c8401ze = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListM0 = new CC0(context, 9, new C0136Bm1(9, ComponentDiscoveryService.class)).M0();
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC0427Ff1 enumC0427Ff1 = EnumC0427Ff1.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListM0);
        arrayList.add(new C0863Kv(1, new FirebaseCommonRegistrar()));
        arrayList.add(new C0863Kv(1, new ExecutorsRegistrar()));
        arrayList2.add(C7119sv.c(context, Context.class, new Class[0]));
        arrayList2.add(C7119sv.c(this, MU.class, new Class[0]));
        arrayList2.add(C7119sv.c(c3783fV, C3783fV.class, new Class[0]));
        C5806m12 c5806m12 = new C5806m12(9);
        if ((Build.VERSION.SDK_INT >= 24 ? AbstractC6125nh1.a(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(C7119sv.c(c8401ze, C8401ze.class, new Class[0]));
        }
        C1252Pv c1252Pv = new C1252Pv(enumC0427Ff1, arrayList, arrayList2, c5806m12);
        this.d = c1252Pv;
        Trace.endSection();
        this.g = new C6697qh0(new C1174Ov(this, 2, context));
        this.h = c1252Pv.c(BF.class);
        JU ju = new JU(this);
        a();
        if (atomicBoolean.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        copyOnWriteArrayList.add(ju);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                Iterator it = ((C7545v8) l.values()).iterator();
                while (it.hasNext()) {
                    MU mu = (MU) it.next();
                    mu.a();
                    arrayList.add(mu.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static MU d() {
        MU mu;
        synchronized (k) {
            try {
                mu = (MU) l.getOrDefault("[DEFAULT]", null);
                if (mu == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((BF) mu.h.get()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return mu;
    }

    public static MU e(String str) {
        MU mu;
        String str2;
        synchronized (k) {
            try {
                mu = (MU) l.getOrDefault(str.trim(), null);
                if (mu == null) {
                    ArrayList arrayListC = c();
                    if (arrayListC.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListC);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((BF) mu.h.get()).c();
            } finally {
            }
        }
        return mu;
    }

    public static MU h(C3783fV c3783fV, Context context, String str) {
        MU mu;
        AtomicReference atomicReference = KU.a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = KU.a;
            if (atomicReference2.get() == null) {
                KU ku = new KU();
                while (true) {
                    if (atomicReference2.compareAndSet(null, ku)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(ku);
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
        synchronized (k) {
            C7925x8 c7925x8 = l;
            Preconditions.checkState(!c7925x8.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            mu = new MU(c3783fV, context, strTrim);
            c7925x8.put(strTrim, mu);
        }
        mu.g();
        return mu;
    }

    public static void i(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    d();
                    return;
                }
                C3783fV c3783fVA = C3783fV.a(context);
                if (c3783fVA == null) {
                    return;
                }
                h(c3783fVA, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MU)) {
            return false;
        }
        MU mu = (MU) obj;
        mu.a();
        return this.b.equals(mu.b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 24 ? AbstractC6125nh1.a(context) : true) {
            a();
            a();
            this.d.s("[DEFAULT]".equals(this.b));
            ((BF) this.h.get()).c();
            return;
        }
        a();
        AtomicReference atomicReference = LU.b;
        if (atomicReference.get() == null) {
            LU lu = new LU(context);
            while (!atomicReference.compareAndSet(null, lu)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(lu, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean j() {
        boolean z;
        a();
        EC ec = (EC) this.g.get();
        synchronized (ec) {
            z = ec.d;
        }
        return z;
    }

    public final void k(boolean z) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            MU mu = ((JU) it.next()).a;
            if (z) {
                mu.getClass();
            } else {
                ((BF) mu.h.get()).c();
            }
        }
    }

    public final void l(Boolean bool) {
        a();
        EC ec = (EC) this.g.get();
        synchronized (ec) {
            try {
                if (bool == null) {
                    ec.b.edit().remove("firebase_data_collection_default_enabled").apply();
                    ec.b(ec.a());
                } else {
                    boolean zEquals = Boolean.TRUE.equals(bool);
                    ec.b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                    ec.b(zEquals);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.b).add("options", this.c).toString();
    }
}
