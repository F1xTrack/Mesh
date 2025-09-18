package com.yandex.metrica;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.yandex.metrica.impl.p022ob.AbstractC2848P6;
import com.yandex.metrica.impl.p022ob.C2598F6;
import com.yandex.metrica.impl.p022ob.C2698J6;
import com.yandex.metrica.impl.p022ob.C2798N6;
import com.yandex.metrica.impl.p022ob.C2842P0;
import com.yandex.metrica.impl.p022ob.C2873Q6;
import com.yandex.metrica.impl.p022ob.C2897R6;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ConfigurationService extends Service {

    /* renamed from: a */
    public final HashMap f20729a = new HashMap();

    /* renamed from: b */
    public C2698J6 f20730b;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C2842P0.m14727a(getApplicationContext());
        getPackageName();
        this.f20730b = new C2698J6();
        Context applicationContext = getApplicationContext();
        C2798N6 c2798n6 = new C2798N6(applicationContext, this.f20730b.m14418a(), new C2598F6(applicationContext));
        HashMap map = this.f20729a;
        map.put("com.yandex.metrica.configuration.ACTION_INIT", new C2897R6(getApplicationContext(), c2798n6));
        map.put("com.yandex.metrica.configuration.ACTION_SCHEDULED_START", new C2873Q6(getApplicationContext(), c2798n6));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        AbstractC2848P6 abstractC2848P6 = (AbstractC2848P6) this.f20729a.get(intent == null ? null : intent.getAction());
        if (abstractC2848P6 == null) {
            return 2;
        }
        this.f20730b.m14419a(abstractC2848P6, intent != null ? intent.getExtras() : null);
        return 2;
    }
}
