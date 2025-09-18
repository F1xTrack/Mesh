package com.yandex.metrica.impl.p022ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.yandex.metrica.BinderC2461f;
import com.yandex.metrica.C2459d;
import com.yandex.metrica.IMetricaService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.x1 */
/* loaded from: classes2.dex */
public class C3715x1 {

    /* renamed from: j */
    public static final long f25219j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private final Context f25220a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f25221b;

    /* renamed from: c */
    private boolean f25222c;

    /* renamed from: d */
    private final List<c> f25223d;

    /* renamed from: e */
    private IMetricaService f25224e;

    /* renamed from: f */
    private final Object f25225f;

    /* renamed from: g */
    private final C2743L1 f25226g;

    /* renamed from: h */
    private final Runnable f25227h;

    /* renamed from: i */
    private final ServiceConnection f25228i;

    /* renamed from: com.yandex.metrica.impl.ob.x1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3715x1.m17159a(C3715x1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x1$b */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IMetricaService iMetricaService;
            synchronized (C3715x1.this) {
                C3715x1 c3715x1 = C3715x1.this;
                int i = BinderC2461f.f20813a;
                if (iBinder == null) {
                    iMetricaService = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.metrica.IMetricaService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMetricaService)) {
                        C2459d c2459d = new C2459d();
                        c2459d.f20785a = iBinder;
                        iMetricaService = c2459d;
                    } else {
                        iMetricaService = (IMetricaService) iInterfaceQueryLocalInterface;
                    }
                }
                c3715x1.f25224e = iMetricaService;
            }
            C3715x1.m17160b(C3715x1.this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (C3715x1.this) {
                C3715x1.this.f25224e = null;
            }
            C3715x1.m17161c(C3715x1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x1$c */
    public interface c {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    public C3715x1(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(context, interfaceExecutorC3607sn, C3065Y.m15442g().m15450i());
    }

    /* renamed from: c */
    public static void m17161c(C3715x1 c3715x1) {
        Iterator<c> it = c3715x1.f25223d.iterator();
        while (it.hasNext()) {
            it.next().onServiceDisconnected();
        }
    }

    /* renamed from: b */
    public synchronized void m17164b() {
        if (this.f25224e == null) {
            Intent intentM14217b = C2644H2.m14217b(this.f25220a);
            try {
                this.f25226g.m14505a(this.f25220a);
                this.f25220a.bindService(intentM14217b, this.f25228i, 1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public synchronized IMetricaService m17166d() {
        return this.f25224e;
    }

    /* renamed from: e */
    public synchronized boolean m17167e() {
        return this.f25224e != null;
    }

    /* renamed from: f */
    public void m17168f() {
        synchronized (this.f25225f) {
            ((C3581rn) this.f25221b).m16703a(this.f25227h);
        }
    }

    /* renamed from: g */
    public void m17169g() {
        InterfaceExecutorC3607sn interfaceExecutorC3607sn = this.f25221b;
        synchronized (this.f25225f) {
            try {
                C3581rn c3581rn = (C3581rn) interfaceExecutorC3607sn;
                c3581rn.m16703a(this.f25227h);
                if (!this.f25222c) {
                    c3581rn.m16704a(this.f25227h, f25219j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m17159a(C3715x1 c3715x1) {
        synchronized (c3715x1) {
            if (c3715x1.f25220a != null && c3715x1.m17167e()) {
                try {
                    c3715x1.f25224e = null;
                    c3715x1.f25220a.unbindService(c3715x1.f25228i);
                } catch (Throwable unused) {
                }
            }
            c3715x1.f25224e = null;
            Iterator<c> it = c3715x1.f25223d.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected();
            }
        }
    }

    public C3715x1(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2743L1 c2743l1) {
        this.f25223d = new CopyOnWriteArrayList();
        this.f25224e = null;
        this.f25225f = new Object();
        this.f25227h = new a();
        this.f25228i = new b();
        this.f25220a = context.getApplicationContext();
        this.f25221b = interfaceExecutorC3607sn;
        this.f25222c = false;
        this.f25226g = c2743l1;
    }

    /* renamed from: c */
    public void m17165c() {
        synchronized (this.f25225f) {
            this.f25222c = true;
            m17168f();
        }
    }

    /* renamed from: b */
    public static void m17160b(C3715x1 c3715x1) {
        Iterator<c> it = c3715x1.f25223d.iterator();
        while (it.hasNext()) {
            it.next().onServiceConnected();
        }
    }

    /* renamed from: a */
    public void m17163a(c cVar) {
        this.f25223d.add(cVar);
    }

    /* renamed from: a */
    public void m17162a() {
        synchronized (this.f25225f) {
            this.f25222c = false;
            m17169g();
        }
    }
}
