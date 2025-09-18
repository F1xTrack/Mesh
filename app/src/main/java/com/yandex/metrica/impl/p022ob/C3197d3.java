package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.impl.p022ob.C3350j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d3 */
/* loaded from: classes2.dex */
public class C3197d3 implements InterfaceC2594F2 {

    /* renamed from: a */
    private final List<InterfaceC2963Tm<Context, Intent, Void>> f23207a;

    /* renamed from: b */
    private boolean f23208b;

    /* renamed from: c */
    private boolean f23209c;

    /* renamed from: d */
    private final Context f23210d;

    /* renamed from: e */
    private final C3350j0 f23211e;

    /* renamed from: com.yandex.metrica.impl.ob.d3$a */
    public class a implements InterfaceC2938Sm<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2938Sm
        /* renamed from: a */
        public void mo14454a(Context context, Intent intent) {
            C3197d3.m15734a(C3197d3.this, context, intent);
        }
    }

    public C3197d3(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(context, interfaceExecutorC3607sn, new C3350j0.a());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: a */
    public synchronized void mo14019a() {
        this.f23209c = true;
        if (!this.f23207a.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f23211e.m16105a(this.f23210d, intentFilter);
            this.f23208b = true;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: b */
    public synchronized void mo14021b() {
        this.f23209c = false;
        if (this.f23208b) {
            this.f23211e.m16106a(this.f23210d);
            this.f23208b = false;
        }
    }

    public C3197d3(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3350j0.a aVar) {
        this.f23207a = new ArrayList();
        this.f23208b = false;
        this.f23209c = false;
        this.f23210d = context;
        this.f23211e = aVar.m16107a(new C3528pm(new a(), interfaceExecutorC3607sn));
    }

    /* renamed from: b */
    public synchronized void m15736b(InterfaceC2963Tm<Context, Intent, Void> interfaceC2963Tm) {
        this.f23207a.remove(interfaceC2963Tm);
        if (this.f23207a.isEmpty() && this.f23208b) {
            this.f23211e.m16106a(this.f23210d);
            this.f23208b = false;
        }
    }

    /* renamed from: a */
    public synchronized void m15735a(InterfaceC2963Tm<Context, Intent, Void> interfaceC2963Tm) {
        this.f23207a.add(interfaceC2963Tm);
        if (this.f23209c && !this.f23208b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f23211e.m16105a(this.f23210d, intentFilter);
            this.f23208b = true;
        }
    }

    /* renamed from: a */
    public static void m15734a(C3197d3 c3197d3, Context context, Intent intent) {
        synchronized (c3197d3) {
            Iterator<InterfaceC2963Tm<Context, Intent, Void>> it = c3197d3.f23207a.iterator();
            while (it.hasNext()) {
                it.next().mo13979a(context, intent);
            }
        }
    }
}
