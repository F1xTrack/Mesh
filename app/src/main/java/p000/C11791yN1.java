package p000;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: yN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11791yN1 implements JN1 {

    /* renamed from: h */
    public static final C7119x8 f46239h = new C7119x8();

    /* renamed from: i */
    public static final String[] f46240i = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f46241a;

    /* renamed from: b */
    public final Uri f46242b;

    /* renamed from: c */
    public final Runnable f46243c;

    /* renamed from: d */
    public final C0317F1 f46244d;

    /* renamed from: e */
    public final Object f46245e;

    /* renamed from: f */
    public volatile Map f46246f;

    /* renamed from: g */
    public final ArrayList f46247g;

    public C11791yN1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C0317F1 c0317f1 = new C0317F1(4, this);
        this.f46244d = c0317f1;
        this.f46245e = new Object();
        this.f46247g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f46241a = contentResolver;
        this.f46242b = uri;
        this.f46243c = runnable;
        contentResolver.registerContentObserver(uri, false, c0317f1);
    }

    /* renamed from: c */
    public static C11791yN1 m26145c(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C11791yN1 c11791yN1;
        synchronized (C11791yN1.class) {
            C7119x8 c7119x8 = f46239h;
            c11791yN1 = (C11791yN1) c7119x8.getOrDefault(uri, null);
            if (c11791yN1 == null) {
                try {
                    C11791yN1 c11791yN12 = new C11791yN1(contentResolver, uri, runnable);
                    try {
                        c7119x8.put(uri, c11791yN12);
                    } catch (SecurityException unused) {
                    }
                    c11791yN1 = c11791yN12;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c11791yN1;
    }

    /* renamed from: d */
    public static synchronized void m26146d() {
        try {
            Iterator it = ((C6993v8) f46239h.values()).iterator();
            while (it.hasNext()) {
                C11791yN1 c11791yN1 = (C11791yN1) it.next();
                c11791yN1.f46241a.unregisterContentObserver(c11791yN1.f46244d);
            }
            f46239h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    /* renamed from: a */
    public final Map m26147a() {
        Map mapEmptyMap;
        Object objM25192l;
        Map map = this.f46246f;
        Map map2 = map;
        if (map == null) {
            synchronized (this.f46245e) {
                try {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = this.f46246f;
                    Map map3 = threadPolicyAllowThreadDiskReads;
                    if (threadPolicyAllowThreadDiskReads == 0) {
                        try {
                            threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            C11287uQ0 c11287uQ0 = new C11287uQ0();
                            c11287uQ0.f43693a = this;
                            try {
                                objM25192l = c11287uQ0.m25192l();
                            } catch (SecurityException unused) {
                                long jClearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    objM25192l = c11287uQ0.m25192l();
                                } finally {
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                }
                            }
                            mapEmptyMap = (Map) objM25192l;
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            mapEmptyMap = Collections.emptyMap();
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        this.f46246f = mapEmptyMap;
                        map3 = mapEmptyMap;
                    }
                } finally {
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    @Override // p000.JN1
    /* renamed from: b */
    public final /* synthetic */ Object mo4301b(String str) {
        return (String) m26147a().get(str);
    }
}
