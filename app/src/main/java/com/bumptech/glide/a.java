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
import defpackage.A10;
import defpackage.AbstractC0121Bh1;
import defpackage.B10;
import defpackage.C0057Am0;
import defpackage.C0136Bm1;
import defpackage.C0291Dm0;
import defpackage.C0474Fv0;
import defpackage.C10;
import defpackage.C1016Mu0;
import defpackage.C3354dF;
import defpackage.C3759fN;
import defpackage.C7713w10;
import defpackage.C7902x1;
import defpackage.C7903x10;
import defpackage.C7925x8;
import defpackage.C8058xq0;
import defpackage.C8236ym0;
import defpackage.C8426zm0;
import defpackage.CC0;
import defpackage.EO;
import defpackage.F7;
import defpackage.IL1;
import defpackage.InterfaceC5935mi;
import defpackage.JR0;
import defpackage.NR0;
import defpackage.OJ1;
import defpackage.TE;
import defpackage.ThreadFactoryC7716w2;
import defpackage.UC;
import defpackage.VG;
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

/* loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a i;
    public static volatile boolean j;
    public final EO a;
    public final InterfaceC5935mi b;
    public final C0291Dm0 c;
    public final C7903x10 d;
    public final C8426zm0 e;
    public final NR0 f;
    public final TE g;
    public final ArrayList h = new ArrayList();

    public a(Context context, EO eo, C0291Dm0 c0291Dm0, InterfaceC5935mi interfaceC5935mi, C8426zm0 c8426zm0, NR0 nr0, TE te, int i2, C3759fN c3759fN, C7925x8 c7925x8, List list, List list2, F7 f7, C1016Mu0 c1016Mu0) {
        this.a = eo;
        this.b = interfaceC5935mi;
        this.e = c8426zm0;
        this.c = c0291Dm0;
        this.f = nr0;
        this.g = te;
        this.d = new C7903x10(context, c8426zm0, new VG(this, list2, f7), new OJ1(15), c3759fN, c7925x8, list, eo, c1016Mu0, i2);
    }

    public static a a(Context context) {
        if (i == null) {
            GeneratedAppGlideModule generatedAppGlideModuleB = b(context.getApplicationContext());
            synchronized (a.class) {
                if (i == null) {
                    if (j) {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                    j = true;
                    d(context, new C7713w10(), generatedAppGlideModuleB);
                    j = false;
                }
            }
        }
        return i;
    }

    public static GeneratedAppGlideModule b(Context context) {
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

    public static NR0 c(Context context) {
        IL1.d(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [F7, com.bumptech.glide.GeneratedAppGlideModule] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public static void d(Context context, C7713w10 c7713w10, GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException {
        Context applicationContext = context.getApplicationContext();
        ?? EmptyList = Collections.emptyList();
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
                            EmptyList.add(C3354dF.d(str));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        }
        List list = EmptyList;
        if (generatedAppGlideModule != 0 && !generatedAppGlideModule.a().isEmpty()) {
            Set setA = generatedAppGlideModule.a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C10 c10 = (C10) it.next();
                if (setA.contains(c10.getClass())) {
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
        c7713w10.n = generatedAppGlideModule != 0 ? generatedAppGlideModule.b() : null;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((C10) it3.next()).getClass();
        }
        if (generatedAppGlideModule != 0) {
            generatedAppGlideModule.applyOptions(applicationContext, c7713w10);
        }
        if (c7713w10.g == null) {
            ThreadFactoryC7716w2 threadFactoryC7716w2 = new ThreadFactoryC7716w2(1);
            if (B10.c == 0) {
                B10.c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = B10.c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            c7713w10.g = new B10(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new A10(threadFactoryC7716w2, "source", false)));
        }
        if (c7713w10.h == null) {
            int i3 = B10.c;
            ThreadFactoryC7716w2 threadFactoryC7716w22 = new ThreadFactoryC7716w2(1);
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            c7713w10.h = new B10(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new A10(threadFactoryC7716w22, "disk-cache", true)));
        }
        if (c7713w10.o == null) {
            if (B10.c == 0) {
                B10.c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i4 = B10.c >= 4 ? 2 : 1;
            ThreadFactoryC7716w2 threadFactoryC7716w23 = new ThreadFactoryC7716w2(1);
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            c7713w10.o = new B10(new ThreadPoolExecutor(i4, i4, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new A10(threadFactoryC7716w23, "animation", true)));
        }
        if (c7713w10.j == null) {
            C8058xq0 c8058xq0 = new C8058xq0(applicationContext);
            C7902x1 c7902x1 = new C7902x1();
            Context context2 = c8058xq0.a;
            ActivityManager activityManager = c8058xq0.b;
            int i5 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            c7902x1.c = i5;
            int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) c8058xq0.c.b;
            float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            float f2 = c8058xq0.d;
            int iRound2 = Math.round(f * f2);
            int iRound3 = Math.round(f * 2.0f);
            int i6 = iRound - i5;
            if (iRound3 + iRound2 <= i6) {
                c7902x1.b = iRound3;
                c7902x1.a = iRound2;
            } else {
                float f3 = i6 / (f2 + 2.0f);
                c7902x1.b = Math.round(2.0f * f3);
                c7902x1.a = Math.round(f3 * f2);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                Formatter.formatFileSize(context2, c7902x1.b);
                Formatter.formatFileSize(context2, c7902x1.a);
                Formatter.formatFileSize(context2, i5);
                Formatter.formatFileSize(context2, iRound);
                activityManager.getMemoryClass();
                activityManager.isLowRamDevice();
            }
            c7713w10.j = c7902x1;
        }
        if (c7713w10.k == null) {
            c7713w10.k = new TE(12);
        }
        if (c7713w10.d == null) {
            int i7 = c7713w10.j.a;
            if (i7 > 0) {
                c7713w10.d = new C0057Am0(i7);
            } else {
                c7713w10.d = new C0474Fv0(8);
            }
        }
        if (c7713w10.e == null) {
            int i8 = c7713w10.j.c;
            C8426zm0 c8426zm0 = new C8426zm0();
            c8426zm0.c = new CC0(16);
            c8426zm0.d = new C8236ym0(0);
            c8426zm0.e = new HashMap();
            c8426zm0.f = new HashMap();
            c8426zm0.a = i8;
            c7713w10.e = c8426zm0;
        }
        if (c7713w10.f == null) {
            c7713w10.f = new C0291Dm0(c7713w10.j.b);
        }
        if (c7713w10.i == null) {
            c7713w10.i = new C0136Bm1(applicationContext);
        }
        if (c7713w10.c == null) {
            c7713w10.c = new EO(c7713w10.f, c7713w10.i, c7713w10.h, c7713w10.g, new B10(new ThreadPoolExecutor(0, Integer.MAX_VALUE, B10.b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new A10(new ThreadFactoryC7716w2(1), "source-unlimited", false))), c7713w10.o);
        }
        List list2 = c7713w10.p;
        if (list2 == null) {
            c7713w10.p = Collections.emptyList();
        } else {
            c7713w10.p = Collections.unmodifiableList(list2);
        }
        UC uc = c7713w10.b;
        uc.getClass();
        C1016Mu0 c1016Mu0 = new C1016Mu0(uc);
        a aVar = new a(applicationContext, c7713w10.c, c7713w10.f, c7713w10.d, c7713w10.e, new NR0(c7713w10.n, c1016Mu0), c7713w10.k, c7713w10.l, c7713w10.m, c7713w10.a, c7713w10.p, list, generatedAppGlideModule, c1016Mu0);
        applicationContext.registerComponentCallbacks(aVar);
        i = aVar;
    }

    public static void f() {
        synchronized (a.class) {
            try {
                if (i != null) {
                    i.d.getBaseContext().getApplicationContext().unregisterComponentCallbacks(i);
                    i.a.g();
                }
                i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static JR0 h(Context context) {
        return c(context).g(context);
    }

    public final void e(JR0 jr0) {
        synchronized (this.h) {
            try {
                if (this.h.contains(jr0)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.h.add(jr0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(JR0 jr0) {
        synchronized (this.h) {
            try {
                if (!this.h.contains(jr0)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.h.remove(jr0);
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
        AbstractC0121Bh1.a();
        this.c.g(0L);
        this.b.r();
        this.e.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        AbstractC0121Bh1.a();
        synchronized (this.h) {
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ((JR0) it.next()).onTrimMemory(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.h(i2);
        this.b.q(i2);
        this.e.i(i2);
    }
}
