package com.yandex.metrica.impl.p022ob;

import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.k2 */
/* loaded from: classes2.dex */
public class C3378k2 extends C2944T3 {

    /* renamed from: c */
    protected C2642H0 f23900c;

    /* renamed from: d */
    protected C2856Pe f23901d;

    /* renamed from: e */
    private boolean f23902e;

    /* renamed from: f */
    private final String f23903f;

    public C3378k2(C2969U3 c2969u3, CounterConfiguration counterConfiguration) {
        this(c2969u3, counterConfiguration, null);
    }

    /* renamed from: a */
    public void m16252a(C2765Ln c2765Ln) {
        this.f23900c = new C2642H0(c2765Ln);
    }

    /* renamed from: c */
    public Bundle m16254c() {
        Bundle bundle = new Bundle();
        CounterConfiguration counterConfigurationM15168b = m15168b();
        synchronized (counterConfigurationM15168b) {
            bundle.putParcelable("COUNTER_CFG_OBJ", counterConfigurationM15168b);
        }
        C2969U3 c2969u3M15167a = m15167a();
        synchronized (c2969u3M15167a) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c2969u3M15167a);
        }
        return bundle;
    }

    /* renamed from: d */
    public String m16255d() {
        return this.f23900c.m14214a();
    }

    /* renamed from: e */
    public String m16256e() {
        return this.f23903f;
    }

    /* renamed from: f */
    public boolean mo15660f() {
        return this.f23902e;
    }

    /* renamed from: g */
    public void m16257g() {
        this.f23902e = true;
    }

    /* renamed from: h */
    public void m16258h() {
        this.f23902e = false;
    }

    public C3378k2(C2969U3 c2969u3, CounterConfiguration counterConfiguration, String str) {
        super(c2969u3, counterConfiguration);
        this.f23902e = true;
        this.f23903f = str;
    }

    /* renamed from: a */
    public void m16251a(InterfaceC2735Ki interfaceC2735Ki) {
        if (interfaceC2735Ki != null) {
            CounterConfiguration counterConfigurationM15168b = m15168b();
            String strM14364e = ((C2685Ii) interfaceC2735Ki).m14364e();
            synchronized (counterConfigurationM15168b) {
                counterConfigurationM15168b.f20731a.put("CFG_UUID", strM14364e);
            }
        }
    }

    /* renamed from: a */
    public void m16253a(C2856Pe c2856Pe) {
        this.f23901d = c2856Pe;
    }
}
