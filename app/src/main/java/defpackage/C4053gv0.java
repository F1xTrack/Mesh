package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: gv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4053gv0 implements InterfaceC6777r61 {
    public static C4053gv0 e;
    public Object b = new Handler(Looper.getMainLooper());
    public Object c = new CopyOnWriteArrayList();
    public Object d = new Object();
    public int a = 0;

    public C4053gv0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new D6(3, this), intentFilter);
    }

    public static void a(C4053gv0 c4053gv0, int i) {
        synchronized (c4053gv0.d) {
            try {
                if (c4053gv0.a == i) {
                    return;
                }
                c4053gv0.a = i;
                Iterator it = ((CopyOnWriteArrayList) c4053gv0.c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    OE oe = (OE) weakReference.get();
                    if (oe != null) {
                        oe.a(i);
                    } else {
                        ((CopyOnWriteArrayList) c4053gv0.c).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized C4053gv0 b(Context context) {
        try {
            if (e == null) {
                e = new C4053gv0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public int c() {
        int i;
        synchronized (this.d) {
            i = this.a;
        }
        return i;
    }

    @Override // defpackage.InterfaceC6777r61, javax.inject.Provider
    public Object get() {
        Range range = ((C7253tc) this.c).a;
        AbstractC0759Jm0.f("AudioEncCfgDefaultRslvr");
        C7062sc c7062sc = (C7062sc) this.d;
        int iB = AbstractC3573eO1.b(156000, c7062sc.c, 2, c7062sc.b, 48000, range);
        U41 u41 = new U41();
        u41.b = -1;
        u41.a = (String) this.b;
        u41.b = Integer.valueOf(this.a);
        u41.c = EnumC8011xa1.a;
        u41.f = Integer.valueOf(c7062sc.c);
        u41.e = Integer.valueOf(c7062sc.b);
        u41.d = Integer.valueOf(iB);
        return u41.o();
    }
}
