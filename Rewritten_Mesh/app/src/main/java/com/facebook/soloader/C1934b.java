package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000.AbstractC0852NX;
import p000.C6819sN;
import p000.H21;
import p000.InterfaceC9747iO0;
import p000.O90;

/* renamed from: com.facebook.soloader.b */
/* loaded from: classes.dex */
public final class C1934b extends H21 implements InterfaceC9747iO0 {

    /* renamed from: a */
    public final HashMap f17982a = new HashMap();

    /* renamed from: b */
    public final HashMap f17983b = new HashMap();

    /* renamed from: c */
    public final HashSet f17984c;

    public C1934b(Context context) {
        HashSet hashSet = new HashSet();
        String strM11083h = m11083h(context.getApplicationInfo().sourceDir);
        if (strM11083h != null) {
            hashSet.add(strM11083h);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String strM11083h2 = m11083h(str);
                if (strM11083h2 != null) {
                    hashSet.add(strM11083h2);
                }
            }
        }
        this.f17984c = hashSet;
    }

    /* renamed from: h */
    public static String m11083h(String str) {
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        if (str == null || str.isEmpty() || supportedAbis == null || supportedAbis.length == 0) {
            return null;
        }
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, "!/lib/");
        sbM5762k.append(supportedAbis[0]);
        return sbM5762k.toString();
    }

    @Override // p000.InterfaceC9747iO0
    /* renamed from: a */
    public final H21 mo11084a(Context context) {
        C1934b c1934b = new C1934b(context);
        try {
            c1934b.m11088i();
            return c1934b;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.H21
    /* renamed from: b */
    public final String mo3242b() {
        throw null;
    }

    @Override // p000.H21
    /* renamed from: c */
    public final int mo3243c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws NoSuchAlgorithmException, IOException {
        if (SoLoader.f17963b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        Iterator it = this.f17984c.iterator();
        int i2 = i;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Set set = (Set) this.f17982a.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                O90.m5973k(2, "SoLoader");
            } else {
                Set setM11087g = m11087g(str2, str);
                if (setM11087g == null) {
                    ZipFile zipFile = new ZipFile(str2.substring(0, str2.indexOf(33)));
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            if (zipEntryNextElement != null) {
                                if (zipEntryNextElement.getName().endsWith("/" + str)) {
                                    C6819sN c6819sN = new C6819sN(zipFile, zipEntryNextElement);
                                    try {
                                        for (String str3 : AbstractC1936d.m11089a(str, c6819sN)) {
                                            if (!str3.startsWith("/")) {
                                                m11085e(str2, str, str3);
                                            }
                                        }
                                        c6819sN.close();
                                    } catch (Throwable th) {
                                        try {
                                            c6819sN.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        zipFile.close();
                        setM11087g = m11087g(str2, str);
                    } finally {
                    }
                }
                if (setM11087g != null) {
                    Iterator it2 = setM11087g.iterator();
                    while (it2.hasNext()) {
                        SoLoader.m11078l((String) it2.next(), null, i2 | 1, threadPolicy);
                    }
                }
                try {
                    i2 |= 4;
                    SoLoader.f17963b.m7562L(i2, str2 + File.separator + str);
                    O90.m5973k(3, "SoLoader");
                    return 1;
                } catch (UnsatisfiedLinkError unused) {
                    continue;
                }
            }
        }
        return 0;
    }

    @Override // p000.H21
    /* renamed from: d */
    public final void mo3244d(int i) throws IOException {
        m11088i();
    }

    /* renamed from: e */
    public final void m11085e(String str, String str2, String str3) {
        synchronized (this.f17983b) {
            try {
                String str4 = str + str2;
                if (!this.f17983b.containsKey(str4)) {
                    this.f17983b.put(str4, new HashSet());
                }
                ((Set) this.f17983b.get(str4)).add(str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public final void m11086f(String str, String str2) {
        synchronized (this.f17982a) {
            try {
                if (!this.f17982a.containsKey(str)) {
                    this.f17982a.put(str, new HashSet());
                }
                ((Set) this.f17982a.get(str)).add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final Set m11087g(String str, String str2) {
        Set set;
        synchronized (this.f17983b) {
            set = (Set) this.f17983b.get(str + str2);
        }
        return set;
    }

    /* renamed from: i */
    public final void m11088i() throws IOException {
        int iIndexOf;
        int i;
        Iterator it = this.f17984c.iterator();
        String strSubstring = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(33)) >= 0 && (i = iIndexOf + 2) < str.length()) {
                strSubstring = str.substring(i);
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                ZipFile zipFile = new ZipFile(str.substring(0, str.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null && zipEntryNextElement.getMethod() == 0 && zipEntryNextElement.getName().startsWith(strSubstring) && zipEntryNextElement.getName().endsWith(".so")) {
                            m11086f(str, zipEntryNextElement.getName().substring(strSubstring.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // p000.H21
    public final String toString() {
        return "DirectApkSoSource[root = " + this.f17984c.toString() + ']';
    }
}
