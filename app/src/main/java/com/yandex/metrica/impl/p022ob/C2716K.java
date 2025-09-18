package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.impl.p022ob.C3350j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.K */
/* loaded from: classes2.dex */
public class C2716K implements InterfaceC2594F2 {

    /* renamed from: a */
    private final List<InterfaceC2988Um<Intent>> f21561a;

    /* renamed from: b */
    private Intent f21562b;

    /* renamed from: c */
    private final Context f21563c;

    /* renamed from: d */
    private final C3350j0 f21564d;

    /* renamed from: com.yandex.metrica.impl.ob.K$a */
    public class a implements InterfaceC2938Sm<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2938Sm
        /* renamed from: a */
        public void mo14454a(Context context, Intent intent) {
            Intent intent2 = intent;
            synchronized (C2716K.this) {
                C2716K.this.f21562b = intent2;
                C2716K.this.m14451a(intent2);
            }
        }
    }

    public C2716K(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(context, interfaceExecutorC3607sn, new C3350j0.a());
    }

    /* renamed from: c */
    public synchronized Intent m14453c(InterfaceC2988Um<Intent> interfaceC2988Um) {
        this.f21561a.add(interfaceC2988Um);
        return this.f21562b;
    }

    public C2716K(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3350j0.a aVar) {
        this.f21561a = new ArrayList();
        this.f21562b = null;
        this.f21563c = context;
        this.f21564d = aVar.m16107a(new C3528pm(new a(), interfaceExecutorC3607sn));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: a */
    public synchronized void mo14019a() {
        Intent intentM16105a = this.f21564d.m16105a(this.f21563c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f21562b = intentM16105a;
        m14451a(intentM16105a);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: b */
    public synchronized void mo14021b() {
        this.f21562b = null;
        this.f21564d.m16106a(this.f21563c);
        m14451a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m14451a(Intent intent) {
        Iterator<InterfaceC2988Um<Intent>> it = this.f21561a.iterator();
        while (it.hasNext()) {
            it.next().mo13904b(intent);
        }
    }
}
