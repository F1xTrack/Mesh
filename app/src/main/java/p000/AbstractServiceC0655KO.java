package p000;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: KO */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0655KO extends Service {

    /* renamed from: a */
    public final ExecutorService f6040a;

    /* renamed from: b */
    public BinderC11208to1 f6041b;

    /* renamed from: c */
    public final Object f6042c;

    /* renamed from: d */
    public int f6043d;

    /* renamed from: e */
    public int f6044e;

    public AbstractServiceC0655KO() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6040a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f6042c = new Object();
        this.f6044e = 0;
    }

    /* renamed from: a */
    public final void m4622a(Intent intent) {
        if (intent != null) {
            AbstractC10948rm1.m24486b(intent);
        }
        synchronized (this.f6042c) {
            try {
                int i = this.f6044e - 1;
                this.f6044e = i;
                if (i == 0) {
                    stopSelfResult(this.f6043d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public abstract void mo4623b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.f6041b == null) {
                this.f6041b = new BinderC11208to1(new C8170Qm0(16, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6041b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f6040a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f6042c) {
            this.f6043d = i2;
            this.f6044e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) C10919rY0.m24401x().f41731e).poll();
        if (intent2 == null) {
            m4622a(intent);
            return 2;
        }
        S81 s81 = new S81();
        this.f6040a.execute(new RunnableC8339Ts1(this, intent2, s81, 24));
        C9450g32 c9450g32 = s81.f10598a;
        if (c9450g32.mo11143j()) {
            m4622a(intent);
            return 2;
        }
        c9450g32.m18386m(new ExecutorC4160h8(2), new C0424Gj(this, 27, intent));
        return 3;
    }
}
