package com.yandex.metrica;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.yandex.metrica.impl.p022ob.AbstractC2489Am;
import com.yandex.metrica.impl.p022ob.C2493B1;
import com.yandex.metrica.impl.p022ob.C2569E2;
import com.yandex.metrica.impl.p022ob.C2842P0;
import com.yandex.metrica.impl.p022ob.C3767z1;

/* loaded from: classes2.dex */
public class MetricaService extends Service {

    /* renamed from: c */
    public static C3767z1 f20732c;

    /* renamed from: a */
    public final C2460e f20733a = new C2460e(this);

    /* renamed from: b */
    public final BinderC2461f f20734b;

    public MetricaService() {
        BinderC2461f binderC2461f = new BinderC2461f();
        binderC2461f.attachInterface(binderC2461f, "com.yandex.metrica.IMetricaService");
        this.f20734b = binderC2461f;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC2462g = ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action) || "com.yandex.metrica.ACTION_C_BG_L".equals(action)) ? new BinderC2462g() : this.f20734b;
        f20732c.mo13893a(intent);
        return binderC2462g;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f20732c.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C2842P0.m14727a(getApplicationContext());
        AbstractC2489Am.m13871a(getApplicationContext());
        C3767z1 c3767z1 = f20732c;
        C2460e c2460e = this.f20733a;
        if (c3767z1 == null) {
            f20732c = new C3767z1(new C2493B1(getApplicationContext(), c2460e));
        } else {
            c3767z1.mo13897a(c2460e);
        }
        f20732c.mo13891a();
        C2842P0.m14728i().m14730a(new C2569E2(f20732c));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        f20732c.mo13900b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        super.onRebind(intent);
        f20732c.mo13903c(intent);
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        f20732c.mo13894a(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        f20732c.mo13895a(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        f20732c.mo13901b(intent);
        String action = intent.getAction();
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action)) {
            return false;
        }
        return "com.yandex.metrica.ACTION_C_BG_L".equals(action) || intent.getData() != null;
    }
}
