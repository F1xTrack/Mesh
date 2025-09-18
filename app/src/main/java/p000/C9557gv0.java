package p000;

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
public final class C9557gv0 implements InterfaceC10864r61 {

    /* renamed from: e */
    public static C9557gv0 f28084e;

    /* renamed from: b */
    public Object f28086b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public Object f28087c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public Object f28088d = new Object();

    /* renamed from: a */
    public int f28085a = 0;

    public C9557gv0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C0196D6(3, this), intentFilter);
    }

    /* renamed from: a */
    public static void m18671a(C9557gv0 c9557gv0, int i) {
        synchronized (c9557gv0.f28088d) {
            try {
                if (c9557gv0.f28085a == i) {
                    return;
                }
                c9557gv0.f28085a = i;
                Iterator it = ((CopyOnWriteArrayList) c9557gv0.f28087c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0896OE c0896oe = (C0896OE) weakReference.get();
                    if (c0896oe != null) {
                        c0896oe.m5998a(i);
                    } else {
                        ((CopyOnWriteArrayList) c9557gv0.f28087c).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public static synchronized C9557gv0 m18672b(Context context) {
        try {
            if (f28084e == null) {
                f28084e = new C9557gv0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f28084e;
    }

    /* renamed from: c */
    public int m18673c() {
        int i;
        synchronized (this.f28088d) {
            i = this.f28085a;
        }
        return i;
    }

    @Override // p000.InterfaceC10864r61, javax.inject.Provider
    public Object get() {
        Range range = ((C6897tc) this.f28087c).f43167a;
        AbstractC7806Jm0.m4412f("AudioEncCfgDefaultRslvr");
        C6834sc c6834sc = (C6834sc) this.f28088d;
        int iM17923b = AbstractC9236eO1.m17923b(156000, c6834sc.f42498c, 2, c6834sc.f42497b, 48000, range);
        U41 u41 = new U41();
        u41.f11645b = -1;
        u41.f11644a = (String) this.f28086b;
        u41.f11645b = Integer.valueOf(this.f28085a);
        u41.f11646c = EnumC11690xa1.f45684a;
        u41.f11649f = Integer.valueOf(c6834sc.f42498c);
        u41.f11648e = Integer.valueOf(c6834sc.f42497b);
        u41.f11647d = Integer.valueOf(iM17923b);
        return u41.m7882o();
    }
}
