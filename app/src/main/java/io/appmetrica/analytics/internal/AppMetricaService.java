package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.impl.BinderC5285m1;
import io.appmetrica.analytics.impl.C4408C1;
import io.appmetrica.analytics.impl.C4450Di;
import io.appmetrica.analytics.impl.C4475Ei;
import io.appmetrica.analytics.impl.C4482F1;
import io.appmetrica.analytics.impl.C5244ka;
import io.appmetrica.analytics.impl.C5260l1;
import io.appmetrica.analytics.impl.C5289m5;
import io.appmetrica.analytics.impl.C5360p1;
import io.appmetrica.analytics.impl.C5378pj;
import io.appmetrica.analytics.impl.C5410r1;
import io.appmetrica.analytics.impl.C5435s1;
import io.appmetrica.analytics.impl.C5460t1;
import io.appmetrica.analytics.impl.C5485u1;
import io.appmetrica.analytics.impl.C5510v1;
import io.appmetrica.analytics.impl.C5610z1;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class AppMetricaService extends Service {

    /* renamed from: c */
    private static C5610z1 f32942c;

    /* renamed from: a */
    private final C5260l1 f32943a = new C5260l1(this);

    /* renamed from: b */
    private final BinderC5633a f32944b = new BinderC5633a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC5285m1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.f32944b : new BinderC5285m1();
        C5610z1 c5610z1 = f32942c;
        c5610z1.f32900a.execute(new C5460t1(c5610z1, intent));
        return binderC5285m1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5610z1 c5610z1 = f32942c;
        c5610z1.f32900a.execute(new C5360p1(c5610z1, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C5244ka.m20613a(getApplicationContext());
        BaseReleaseLogger.init(getApplicationContext());
        C5610z1 c5610z1 = f32942c;
        if (c5610z1 == null) {
            Context applicationContext = getApplicationContext();
            C4408C1 c4408c1 = new C4408C1(applicationContext, this.f32943a, new C5289m5(applicationContext));
            C5378pj c5378pj = C5244ka.f32038C.f32062v;
            C4482F1 c4482f1 = new C4482F1(c4408c1);
            LinkedHashMap linkedHashMap = c5378pj.f32403a;
            Object arrayList = linkedHashMap.get(1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(1, arrayList);
            }
            ((List) arrayList).add(c4482f1);
            f32942c = new C5610z1(C5244ka.f32038C.f32044d.m21139b(), c4408c1);
        } else {
            c5610z1.f32901b.mo19253a(this.f32943a);
        }
        C5244ka c5244ka = C5244ka.f32038C;
        C4475Ei c4475Ei = new C4475Ei(f32942c);
        synchronized (c5244ka) {
            c5244ka.f32046f = new C4450Di(c5244ka.f32041a, c4475Ei);
        }
        f32942c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f32942c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        C5610z1 c5610z1 = f32942c;
        c5610z1.f32900a.execute(new C5485u1(c5610z1, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        C5610z1 c5610z1 = f32942c;
        c5610z1.f32900a.execute(new C5410r1(c5610z1, intent, i));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C5610z1 c5610z1 = f32942c;
        c5610z1.f32900a.execute(new C5435s1(c5610z1, intent, i, i2));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        C5610z1 c5610z1 = f32942c;
        c5610z1.f32900a.execute(new C5510v1(c5610z1, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
