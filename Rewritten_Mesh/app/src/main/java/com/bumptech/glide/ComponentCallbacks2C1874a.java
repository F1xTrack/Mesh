package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.A10;
import p000.AbstractC0323F7;
import p000.AbstractC7381Bh1;
import p000.B10;
import p000.C0277EO;
import p000.C10;
import p000.C11490w10;
import p000.C11617x10;
import p000.C11721xq0;
import p000.C11840ym0;
import p000.C11967zm0;
import p000.C1210TE;
import p000.C1271UC;
import p000.C1338VG;
import p000.C3916dF;
import p000.C4049fN;
import p000.C7112x1;
import p000.C7119x8;
import p000.C7338Am0;
import p000.C7391Bm1;
import p000.C7494Dm0;
import p000.C7616Fv0;
import p000.C7978Mu0;
import p000.CC0;
import p000.IL1;
import p000.InterfaceC6443mi;
import p000.JR0;
import p000.NR0;
import p000.OJ1;
import p000.ThreadFactoryC7050w2;

/* renamed from: com.bumptech.glide.a */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1874a implements ComponentCallbacks2 {

    /* renamed from: i */
    public static volatile ComponentCallbacks2C1874a f17771i;

    /* renamed from: j */
    public static volatile boolean f17772j;

    /* renamed from: a */
    public final C0277EO f17773a;

    /* renamed from: b */
    public final InterfaceC6443mi f17774b;

    /* renamed from: c */
    public final C7494Dm0 f17775c;

    /* renamed from: d */
    public final C11617x10 f17776d;

    /* renamed from: e */
    public final C11967zm0 f17777e;

    /* renamed from: f */
    public final NR0 f17778f;

    /* renamed from: g */
    public final C1210TE f17779g;

    /* renamed from: h */
    public final ArrayList f17780h = new ArrayList();

    public ComponentCallbacks2C1874a(Context context, C0277EO c0277eo, C7494Dm0 c7494Dm0, InterfaceC6443mi interfaceC6443mi, C11967zm0 c11967zm0, NR0 nr0, C1210TE c1210te, int i, C4049fN c4049fN, C7119x8 c7119x8, List list, List list2, AbstractC0323F7 abstractC0323F7, C7978Mu0 c7978Mu0) {
        this.f17773a = c0277eo;
        this.f17774b = interfaceC6443mi;
        this.f17777e = c11967zm0;
        this.f17775c = c7494Dm0;
        this.f17778f = nr0;
        this.f17779g = c1210te;
        this.f17776d = new C11617x10(context, c11967zm0, new C1338VG(this, list2, abstractC0323F7), new OJ1(15), c4049fN, c7119x8, list, c0277eo, c7978Mu0, i);
    }

    /* renamed from: a */
    public static ComponentCallbacks2C1874a m10883a(Context context) {
        if (f17771i == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM10884b = m10884b(context.getApplicationContext());
            synchronized (ComponentCallbacks2C1874a.class) {
                if (f17771i == null) {
                    if (f17772j) {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                    f17772j = true;
                    m10886d(context, new C11490w10(), generatedAppGlideModuleM10884b);
                    f17772j = false;
                }
            }
        }
        return f17771i;
    }

    /* renamed from: b */
    public static GeneratedAppGlideModule m10884b(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
        } catch (NoSuchMethodException e3) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
        }
    }

    /* renamed from: c */
    public static NR0 m10885c(Context context) {
        IL1.m3830d(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m10883a(context).f17778f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [F7, com.bumptech.glide.GeneratedAppGlideModule] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* renamed from: d */
    public static void m10886d(Context context, C11490w10 c11490w10, GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        Context applicationContext = context.getApplicationContext();
        if (generatedAppGlideModule == 0 || generatedAppGlideModule.isManifestParsingEnabled()) {
            EmptyList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            EmptyList.add(C3916dF.m17514d(str));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        }
        List list = EmptyList;
        if (generatedAppGlideModule != 0 && !generatedAppGlideModule.mo10881a().isEmpty()) {
            Set setMo10881a = generatedAppGlideModule.mo10881a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C10 c10 = (C10) it.next();
                if (setMo10881a.contains(c10.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        c10.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((C10) it2.next()).getClass().toString();
            }
        }
        c11490w10.f44650n = generatedAppGlideModule != 0 ? generatedAppGlideModule.mo10882b() : null;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((C10) it3.next()).getClass();
        }
        if (generatedAppGlideModule != 0) {
            generatedAppGlideModule.applyOptions(applicationContext, c11490w10);
        }
        if (c11490w10.f44643g == null) {
            ThreadFactoryC7050w2 threadFactoryC7050w2 = new ThreadFactoryC7050w2(1);
            if (B10.f516c == 0) {
                B10.f516c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = B10.f516c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            c11490w10.f44643g = new B10(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new A10(threadFactoryC7050w2, "source", false)));
        }
        if (c11490w10.f44644h == null) {
            int i2 = B10.f516c;
            ThreadFactoryC7050w2 threadFactoryC7050w22 = new ThreadFactoryC7050w2(1);
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            c11490w10.f44644h = new B10(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new A10(threadFactoryC7050w22, "disk-cache", true)));
        }
        if (c11490w10.f44651o == null) {
            if (B10.f516c == 0) {
                B10.f516c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i3 = B10.f516c >= 4 ? 2 : 1;
            ThreadFactoryC7050w2 threadFactoryC7050w23 = new ThreadFactoryC7050w2(1);
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            c11490w10.f44651o = new B10(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new A10(threadFactoryC7050w23, "animation", true)));
        }
        if (c11490w10.f44646j == null) {
            C11721xq0 c11721xq0 = new C11721xq0(applicationContext);
            C7112x1 c7112x1 = new C7112x1();
            Context context2 = c11721xq0.f45846a;
            ActivityManager activityManager = c11721xq0.f45847b;
            int i4 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            c7112x1.f45259c = i4;
            int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) c11721xq0.f45848c.f11590b;
            float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            float f2 = c11721xq0.f45849d;
            int iRound2 = Math.round(f * f2);
            int iRound3 = Math.round(f * 2.0f);
            int i5 = iRound - i4;
            if (iRound3 + iRound2 <= i5) {
                c7112x1.f45258b = iRound3;
                c7112x1.f45257a = iRound2;
            } else {
                float f3 = i5 / (f2 + 2.0f);
                c7112x1.f45258b = Math.round(2.0f * f3);
                c7112x1.f45257a = Math.round(f3 * f2);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                Formatter.formatFileSize(context2, c7112x1.f45258b);
                Formatter.formatFileSize(context2, c7112x1.f45257a);
                Formatter.formatFileSize(context2, i4);
                Formatter.formatFileSize(context2, iRound);
                activityManager.getMemoryClass();
                activityManager.isLowRamDevice();
            }
            c11490w10.f44646j = c7112x1;
        }
        if (c11490w10.f44647k == null) {
            c11490w10.f44647k = new C1210TE(12);
        }
        if (c11490w10.f44640d == null) {
            int i6 = c11490w10.f44646j.f45257a;
            if (i6 > 0) {
                c11490w10.f44640d = new C7338Am0(i6);
            } else {
                c11490w10.f44640d = new C7616Fv0(8);
            }
        }
        if (c11490w10.f44641e == null) {
            int i7 = c11490w10.f44646j.f45259c;
            C11967zm0 c11967zm0 = new C11967zm0();
            c11967zm0.f46990c = new CC0(16);
            c11967zm0.f46991d = new C11840ym0(0);
            c11967zm0.f46992e = new HashMap();
            c11967zm0.f46993f = new HashMap();
            c11967zm0.f46988a = i7;
            c11490w10.f44641e = c11967zm0;
        }
        if (c11490w10.f44642f == null) {
            c11490w10.f44642f = new C7494Dm0(c11490w10.f44646j.f45258b);
        }
        if (c11490w10.f44645i == null) {
            c11490w10.f44645i = new C7391Bm1(applicationContext);
        }
        if (c11490w10.f44639c == null) {
            c11490w10.f44639c = new C0277EO(c11490w10.f44642f, c11490w10.f44645i, c11490w10.f44644h, c11490w10.f44643g, new B10(new ThreadPoolExecutor(0, Integer.MAX_VALUE, B10.f515b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new A10(new ThreadFactoryC7050w2(1), "source-unlimited", false))), c11490w10.f44651o);
        }
        List list2 = c11490w10.f44652p;
        if (list2 == null) {
            c11490w10.f44652p = Collections.emptyList();
        } else {
            c11490w10.f44652p = Collections.unmodifiableList(list2);
        }
        C1271UC c1271uc = c11490w10.f44638b;
        c1271uc.getClass();
        C7978Mu0 c7978Mu0 = new C7978Mu0(c1271uc);
        ComponentCallbacks2C1874a componentCallbacks2C1874a = new ComponentCallbacks2C1874a(applicationContext, c11490w10.f44639c, c11490w10.f44642f, c11490w10.f44640d, c11490w10.f44641e, new NR0(c11490w10.f44650n, c7978Mu0), c11490w10.f44647k, c11490w10.f44648l, c11490w10.f44649m, c11490w10.f44637a, c11490w10.f44652p, list, generatedAppGlideModule, c7978Mu0);
        applicationContext.registerComponentCallbacks(componentCallbacks2C1874a);
        f17771i = componentCallbacks2C1874a;
    }

    /* renamed from: f */
    public static void m10887f() {
        synchronized (ComponentCallbacks2C1874a.class) {
            try {
                if (f17771i != null) {
                    f17771i.f17776d.getBaseContext().getApplicationContext().unregisterComponentCallbacks(f17771i);
                    f17771i.f17773a.m2207g();
                }
                f17771i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public static JR0 m10888h(Context context) {
        return m10885c(context).m5682g(context);
    }

    /* renamed from: e */
    public final void m10889e(JR0 jr0) {
        synchronized (this.f17780h) {
            try {
                if (this.f17780h.contains(jr0)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f17780h.add(jr0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m10890g(JR0 jr0) {
        synchronized (this.f17780h) {
            try {
                if (!this.f17780h.contains(jr0)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f17780h.remove(jr0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC7381Bh1.m802a();
        this.f17775c.m26538g(0L);
        this.f17774b.mo322r();
        this.f17777e.m26539a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        AbstractC7381Bh1.m802a();
        synchronized (this.f17780h) {
            try {
                Iterator it = this.f17780h.iterator();
                while (it.hasNext()) {
                    ((JR0) it.next()).onTrimMemory(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17775c.m1874h(i);
        this.f17774b.mo321q(i);
        this.f17777e.m26547i(i);
    }
}
