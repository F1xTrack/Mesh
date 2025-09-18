package defpackage;

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
public final class C8162yN1 implements JN1 {
    public static final C7925x8 h = new C7925x8();
    public static final String[] i = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final F1 d;
    public final Object e;
    public volatile Map f;
    public final ArrayList g;

    public C8162yN1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        F1 f1 = new F1(4, this);
        this.d = f1;
        this.e = new Object();
        this.g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, f1);
    }

    public static C8162yN1 c(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C8162yN1 c8162yN1;
        synchronized (C8162yN1.class) {
            C7925x8 c7925x8 = h;
            c8162yN1 = (C8162yN1) c7925x8.getOrDefault(uri, null);
            if (c8162yN1 == null) {
                try {
                    C8162yN1 c8162yN12 = new C8162yN1(contentResolver, uri, runnable);
                    try {
                        c7925x8.put(uri, c8162yN12);
                    } catch (SecurityException unused) {
                    }
                    c8162yN1 = c8162yN12;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c8162yN1;
    }

    public static synchronized void d() {
        try {
            Iterator it = ((C7545v8) h.values()).iterator();
            while (it.hasNext()) {
                C8162yN1 c8162yN1 = (C8162yN1) it.next();
                c8162yN1.a.unregisterContentObserver(c8162yN1.d);
            }
            h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    public final Map a() {
        Map mapEmptyMap;
        Object objL;
        Map map = this.f;
        Map map2 = map;
        if (map == null) {
            synchronized (this.e) {
                try {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = this.f;
                    Map map3 = threadPolicyAllowThreadDiskReads;
                    if (threadPolicyAllowThreadDiskReads == 0) {
                        try {
                            threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            C7409uQ0 c7409uQ0 = new C7409uQ0();
                            c7409uQ0.a = this;
                            try {
                                objL = c7409uQ0.l();
                            } catch (SecurityException unused) {
                                long jClearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    objL = c7409uQ0.l();
                                } finally {
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                }
                            }
                            mapEmptyMap = (Map) objL;
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            mapEmptyMap = Collections.emptyMap();
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        this.f = mapEmptyMap;
                        map3 = mapEmptyMap;
                    }
                } finally {
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    @Override // defpackage.JN1
    public final /* synthetic */ Object b(String str) {
        return (String) a().get(str);
    }
}
