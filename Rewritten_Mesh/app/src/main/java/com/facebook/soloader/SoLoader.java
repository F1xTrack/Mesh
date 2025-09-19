package com.facebook.soloader;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.AbstractC11064sg1;
import p000.AbstractC1374Vq;
import p000.C0986Pf;
import p000.C11858yv0;
import p000.C1278UJ;
import p000.C3916dF;
import p000.C3971e8;
import p000.C4179hR;
import p000.C7215yf;
import p000.C7616Fv0;
import p000.CC0;
import p000.D21;
import p000.F21;
import p000.G21;
import p000.H21;
import p000.J71;
import p000.NV1;
import p000.O90;
import p000.T71;
import p000.Y71;

/* loaded from: classes.dex */
public class SoLoader {

    /* renamed from: b */
    public static T71 f17963b;

    /* renamed from: l */
    public static int f17973l;

    /* renamed from: c */
    public static final ReentrantReadWriteLock f17964c = new ReentrantReadWriteLock();

    /* renamed from: d */
    public static Context f17965d = null;

    /* renamed from: e */
    public static volatile H21[] f17966e = null;

    /* renamed from: f */
    public static final AtomicInteger f17967f = new AtomicInteger(0);

    /* renamed from: g */
    public static CC0 f17968g = null;

    /* renamed from: h */
    public static final HashSet f17969h = new HashSet();

    /* renamed from: i */
    public static final HashMap f17970i = new HashMap();

    /* renamed from: j */
    public static final Set f17971j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    public static boolean f17972k = true;

    /* renamed from: m */
    public static int f17974m = 0;

    /* renamed from: a */
    public static final boolean f17962a = true;

    /* renamed from: a */
    public static void m11067a(Context context, ArrayList arrayList) throws IOException {
        if ((f17973l & 8) != 0) {
            File fileM24765f = AbstractC11064sg1.m24765f(context, "lib-main");
            try {
                if (fileM24765f.exists()) {
                    J71.m4167b(fileM24765f);
                    return;
                }
                return;
            } catch (Throwable unused) {
                fileM24765f.getCanonicalPath();
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        C7215yf c7215yf = new C7215yf(context, "lib-main", file);
        arrayList2.add(c7215yf);
        c7215yf.toString();
        O90.m5973k(3, "SoLoader");
        if (context.getApplicationInfo().splitSourceDirs != null) {
            O90.m5973k(3, "SoLoader");
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                File file2 = new File(strArr[i]);
                StringBuilder sb = new StringBuilder("lib-");
                int i3 = i2 + 1;
                sb.append(i2);
                C7215yf c7215yf2 = new C7215yf(context, sb.toString(), file2);
                c7215yf2.toString();
                O90.m5973k(3, "SoLoader");
                C1933a c1933a = new C1933a(c7215yf2, c7215yf2, false);
                try {
                    boolean z = c1933a.m11081o().length != 0;
                    c1933a.close();
                    if (z) {
                        arrayList2.add(c7215yf2);
                    }
                    i++;
                    i2 = i3;
                } catch (Throwable th) {
                    try {
                        c1933a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        arrayList.addAll(0, arrayList2);
    }

    /* renamed from: b */
    public static void m11068b(ArrayList arrayList) {
        String strM8589h = SysUtil$MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strM8589h = AbstractC1374Vq.m8589h(str, StringUtils.PROCESS_POSTFIX_DELIMITER, strM8589h);
        }
        Iterator it = new HashSet(Arrays.asList(strM8589h.split(StringUtils.PROCESS_POSTFIX_DELIMITER))).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            O90.m5973k(3, "SoLoader");
            arrayList.add(new C1278UJ(new File(str2), 2));
        }
    }

    /* renamed from: c */
    public static void m11069c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = f17964c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f17966e == null) {
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            if (f17962a) {
                Api18TraceUtils.m11066a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (H21 h21 : f17966e) {
                            if (h21.mo3243c(str, i, threadPolicy) != 0) {
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw F21.m2489a(str, f17965d, f17966e);
                    } catch (IOException e) {
                        G21 g21 = new G21(str, e.toString());
                        g21.initCause(e);
                        throw g21;
                    }
                } finally {
                }
            } finally {
                if (f17962a) {
                    Trace.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    /* renamed from: d */
    public static synchronized C0986Pf m11070d() {
        CC0 cc0;
        cc0 = f17968g;
        return cc0 == null ? null : cc0.m1031N0();
    }

    /* renamed from: e */
    public static void m11071e(Context context, int i) {
        Bundle bundle;
        if (m11075i()) {
            return;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                throw th;
            }
        } catch (Exception unused) {
            bundle = null;
        }
        boolean z = false;
        boolean z2 = true;
        boolean z3 = bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
        f17972k = z3;
        if (z3) {
            int i2 = f17974m;
            if (i2 == 0) {
                if (context == null) {
                    O90.m5973k(3, "SoLoader");
                    i2 = 1;
                } else {
                    int i3 = context.getApplicationInfo().flags;
                    int i4 = (i3 & 1) == 0 ? 1 : (128 & i3) != 0 ? 3 : 2;
                    O90.m5973k(3, "SoLoader");
                    i2 = i4;
                }
            }
            f17974m = i2;
            if ((i & 128) == 0) {
                if (i2 != 2) {
                    if (context != null && (context.getApplicationInfo().flags & 268435456) == 0) {
                        z = true;
                    }
                    z2 = z;
                }
                if (z2) {
                    i |= 8;
                }
            }
            m11073g(context);
            m11074h(context, i);
            O90.m5973k(2, "SoLoader");
            C3916dF.m17511a(new C7616Fv0(17));
        } else {
            m11072f();
            O90.m5973k(2, "SoLoader");
            C3916dF.m17511a(new NV1(21));
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
    }

    /* renamed from: f */
    public static void m11072f() {
        if (f17966e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f17964c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f17966e != null) {
                reentrantReadWriteLock.writeLock().unlock();
            } else {
                f17966e = new H21[0];
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (Throwable th) {
            f17964c.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: g */
    public static synchronized void m11073g(Context context) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    String str = context.getApplicationInfo().nativeLibraryDir;
                } else {
                    context = applicationContext;
                }
                f17965d = context;
                f17968g = new CC0(context);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f17963b != null) {
            return;
        }
        f17963b = new T71(14);
    }

    /* renamed from: h */
    public static void m11074h(Context context, int i) {
        ReentrantReadWriteLock.WriteLock writeLock;
        int i2;
        int i3;
        if (f17966e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f17964c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f17966e != null) {
                return;
            }
            f17973l = i;
            ArrayList arrayList = new ArrayList();
            if ((i & 512) != 0) {
                Y71 y71 = new Y71();
                y71.toString();
                O90.m5973k(3, "SoLoader");
                arrayList.add(0, y71);
            } else {
                m11068b(arrayList);
                if (context != null) {
                    if ((i & 1) != 0) {
                        int i4 = f17974m;
                        if (i4 != 1) {
                            if (i4 != 2 && i4 != 3) {
                                throw new RuntimeException("Unsupported app type, we should not reach here");
                            }
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        C3971e8 c3971e8 = new C3971e8(f17965d, i3);
                        c3971e8.toString();
                        O90.m5973k(3, "SoLoader");
                        arrayList.add(0, c3971e8);
                        O90.m5973k(3, "SoLoader");
                        arrayList.add(0, new C4179hR(context, "lib-main"));
                    } else {
                        if (f17974m == 2 || (context.getApplicationInfo().flags & 268435456) == 0) {
                            C1934b c1934b = new C1934b(context);
                            c1934b.toString();
                            O90.m5973k(3, "SoLoader");
                            if (!c1934b.f17984c.isEmpty()) {
                                arrayList.add(0, c1934b);
                            }
                        }
                        int i5 = f17974m;
                        if (i5 != 1) {
                            if (i5 != 2 && i5 != 3) {
                                throw new RuntimeException("Unsupported app type, we should not reach here");
                            }
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        C3971e8 c3971e82 = new C3971e8(f17965d, i2);
                        c3971e82.toString();
                        O90.m5973k(3, "SoLoader");
                        arrayList.add(0, c3971e82);
                        m11067a(context, arrayList);
                    }
                }
            }
            H21[] h21Arr = (H21[]) arrayList.toArray(new H21[arrayList.size()]);
            reentrantReadWriteLock.writeLock().lock();
            try {
                int i6 = f17973l;
                int i7 = (i6 & 2) == 0 ? 0 : 1;
                if ((i6 & 256) != 0) {
                    i7 |= 4;
                }
                reentrantReadWriteLock.writeLock().unlock();
                int length = h21Arr.length;
                while (true) {
                    int i8 = length - 1;
                    if (length <= 0) {
                        f17966e = h21Arr;
                        f17967f.getAndIncrement();
                        int length2 = f17966e.length;
                        O90.m5973k(3, "SoLoader");
                        reentrantReadWriteLock = f17964c;
                        return;
                    }
                    Objects.toString(h21Arr[i8]);
                    O90.m5973k(3, "SoLoader");
                    boolean z = f17962a;
                    if (z) {
                        Api18TraceUtils.m11066a("SoLoader", "_", h21Arr[i8].getClass().getSimpleName());
                    }
                    h21Arr[i8].mo3244d(i7);
                    if (z) {
                        Trace.endSection();
                    }
                    length = i8;
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (Throwable th) {
            reentrantReadWriteLock = f17964c;
            throw th;
        }
    }

    /* renamed from: i */
    public static boolean m11075i() {
        if (f17966e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f17964c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z = f17966e != null;
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            f17964c.readLock().unlock();
            throw th;
        }
    }

    public static void init(Context context, int i) throws IOException {
        m11071e(context, i);
    }

    /* renamed from: j */
    public static void m11076j(String str) {
        if (f17972k) {
            m11077k(0, str);
        } else {
            C3916dF.m17513c(str);
        }
    }

    /* renamed from: k */
    public static boolean m11077k(int i, String str) {
        Boolean boolValueOf;
        if (f17966e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f17964c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (f17966e == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                boolean zContains = f17969h.contains(str);
                                boolean z = !zContains;
                                if (!zContains) {
                                    System.loadLibrary(str);
                                }
                                boolValueOf = Boolean.valueOf(z);
                            } finally {
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else if (!m11075i()) {
                        throw new IllegalStateException("SoLoader.init() not yet called");
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                boolValueOf = null;
            } catch (Throwable th) {
                f17964c.readLock().unlock();
                throw th;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if (!f17972k) {
            return C3916dF.m17513c(str);
        }
        if (f17974m != 2) {
        }
        String strMapLibraryName = System.mapLibraryName(str);
        C0986Pf c0986PfM11070d = null;
        while (true) {
            try {
                return m11078l(strMapLibraryName, str, i, null);
            } catch (UnsatisfiedLinkError e) {
                f17964c.writeLock().lock();
                if (c0986PfM11070d == null) {
                    try {
                        try {
                            c0986PfM11070d = m11070d();
                        } catch (C11858yv0 e2) {
                            throw e2;
                        } catch (Exception unused) {
                            throw e;
                        }
                    } catch (Throwable th2) {
                        f17964c.writeLock().unlock();
                        throw th2;
                    }
                }
                if (c0986PfM11070d == null || !c0986PfM11070d.mo1475v(e, f17966e)) {
                    f17964c.writeLock().unlock();
                    throw e;
                }
                f17967f.getAndIncrement();
                f17964c.writeLock().unlock();
            }
        }
        f17964c.writeLock().unlock();
        throw e;
    }

    /* renamed from: l */
    public static boolean m11078l(String str, String str2, int i, StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        if (!TextUtils.isEmpty(str2) && f17971j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                HashSet hashSet = f17969h;
                if (hashSet.contains(str)) {
                    return false;
                }
                HashMap map = f17970i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f17964c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                reentrantReadWriteLock.readLock().unlock();
                                return false;
                            }
                            try {
                                O90.m5973k(3, "SoLoader");
                                m11069c(str, i, threadPolicy);
                                O90.m5973k(3, "SoLoader");
                                synchronized (SoLoader.class) {
                                    hashSet.add(str);
                                }
                                if ((i & 16) == 0 && !TextUtils.isEmpty(str2)) {
                                    f17971j.contains(str2);
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return true;
                            } catch (UnsatisfiedLinkError e) {
                                String message = e.getMessage();
                                if (message == null || !message.contains("unexpected e_machine:")) {
                                    throw e;
                                }
                                D21 d21 = new D21("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil$MarshmallowSysdeps.getSupportedAbis()) + " error: " + message.substring(message.lastIndexOf("unexpected e_machine:")));
                                d21.initCause(e);
                                throw d21;
                            }
                        }
                    }
                } catch (Throwable th) {
                    f17964c.readLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
