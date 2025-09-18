package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.yandex.metrica.IMetricaService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3194x1 {
    public static final long j = TimeUnit.SECONDS.toMillis(10);
    private final Context a;
    private final InterfaceExecutorC3086sn b;
    private boolean c;
    private final List<c> d;
    private IMetricaService e;
    private final Object f;
    private final L1 g;
    private final Runnable h;
    private final ServiceConnection i;

    /* renamed from: com.yandex.metrica.impl.ob.x1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3194x1.a(C3194x1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x1$b */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IMetricaService iMetricaService;
            synchronized (C3194x1.this) {
                C3194x1 c3194x1 = C3194x1.this;
                int i = com.yandex.metrica.f.a;
                if (iBinder == null) {
                    iMetricaService = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.metrica.IMetricaService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMetricaService)) {
                        com.yandex.metrica.d dVar = new com.yandex.metrica.d();
                        dVar.a = iBinder;
                        iMetricaService = dVar;
                    } else {
                        iMetricaService = (IMetricaService) iInterfaceQueryLocalInterface;
                    }
                }
                c3194x1.e = iMetricaService;
            }
            C3194x1.b(C3194x1.this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (C3194x1.this) {
                C3194x1.this.e = null;
            }
            C3194x1.c(C3194x1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x1$c */
    public interface c {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    public C3194x1(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(context, interfaceExecutorC3086sn, Y.g().i());
    }

    public static void c(C3194x1 c3194x1) {
        Iterator<c> it = c3194x1.d.iterator();
        while (it.hasNext()) {
            it.next().onServiceDisconnected();
        }
    }

    public synchronized void b() {
        if (this.e == null) {
            Intent intentB = H2.b(this.a);
            try {
                this.g.a(this.a);
                this.a.bindService(intentB, this.i, 1);
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized IMetricaService d() {
        return this.e;
    }

    public synchronized boolean e() {
        return this.e != null;
    }

    public void f() {
        synchronized (this.f) {
            ((C3061rn) this.b).a(this.h);
        }
    }

    public void g() {
        InterfaceExecutorC3086sn interfaceExecutorC3086sn = this.b;
        synchronized (this.f) {
            try {
                C3061rn c3061rn = (C3061rn) interfaceExecutorC3086sn;
                c3061rn.a(this.h);
                if (!this.c) {
                    c3061rn.a(this.h, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(C3194x1 c3194x1) {
        synchronized (c3194x1) {
            if (c3194x1.a != null && c3194x1.e()) {
                try {
                    c3194x1.e = null;
                    c3194x1.a.unbindService(c3194x1.i);
                } catch (Throwable unused) {
                }
            }
            c3194x1.e = null;
            Iterator<c> it = c3194x1.d.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected();
            }
        }
    }

    public C3194x1(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn, L1 l1) {
        this.d = new CopyOnWriteArrayList();
        this.e = null;
        this.f = new Object();
        this.h = new a();
        this.i = new b();
        this.a = context.getApplicationContext();
        this.b = interfaceExecutorC3086sn;
        this.c = false;
        this.g = l1;
    }

    public void c() {
        synchronized (this.f) {
            this.c = true;
            f();
        }
    }

    public static void b(C3194x1 c3194x1) {
        Iterator<c> it = c3194x1.d.iterator();
        while (it.hasNext()) {
            it.next().onServiceConnected();
        }
    }

    public void a(c cVar) {
        this.d.add(cVar);
    }

    public void a() {
        synchronized (this.f) {
            this.c = false;
            g();
        }
    }
}
