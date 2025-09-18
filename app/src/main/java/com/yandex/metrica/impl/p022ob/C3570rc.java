package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.impl.p022ob.C3128ac;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.rc */
/* loaded from: classes2.dex */
public class C3570rc implements InterfaceC3180cc {

    /* renamed from: a */
    private final String f24610a;

    /* renamed from: b */
    private final C3544qc f24611b;

    public C3570rc(String str) {
        this(str, new C3544qc());
    }

    /* renamed from: b */
    private C3154bc m16685b(Context context) throws Throwable {
        Method method = Class.forName("com.yandex.metrica.identifiers.AdsIdentifiersProvider").getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.identifiers.extra.PROVIDER", this.f24610a);
        C3544qc c3544qc = this.f24611b;
        Object[] objArr = {context, bundle};
        C3128ac c3128ac = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        c3544qc.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            C3128ac.a aVar = C3518pc.f24441a.get(bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
            if (aVar == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            c3128ac = new C3128ac(aVar, bundle3.getString("com.yandex.metrica.identifiers.extra.ID"), bundle3.containsKey("com.yandex.metrica.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("com.yandex.metrica.identifiers.extra.LIMITED")) : null);
        }
        return new C3154bc(c3128ac, EnumC3221e1.m15810a(bundle2.getString("com.yandex.metrica.identifiers.extra.STATUS")), bundle2.getString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE"));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3180cc
    /* renamed from: a */
    public C3154bc mo15706a(Context context) {
        return mo15707a(context, new C3440mc());
    }

    public C3570rc(String str, C3544qc c3544qc) {
        this.f24610a = str;
        this.f24611b = c3544qc;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3180cc
    /* renamed from: a */
    public C3154bc mo15707a(Context context, InterfaceC3466nc interfaceC3466nc) throws InterruptedException {
        C3154bc c3154bc;
        interfaceC3466nc.mo16487c();
        C3154bc c3154bc2 = null;
        while (interfaceC3466nc.mo16486b()) {
            try {
                return m16685b(context);
            } catch (InvocationTargetException e) {
                c3154bc = new C3154bc(null, EnumC3221e1.UNKNOWN, AbstractC11153tN0.m24914z(new StringBuilder("exception while fetching "), this.f24610a, " adv_id: ", e.getTargetException() != null ? e.getTargetException().getMessage() : null));
                c3154bc2 = c3154bc;
                try {
                    Thread.sleep(interfaceC3466nc.mo16485a());
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                c3154bc = new C3154bc(null, EnumC3221e1.UNKNOWN, "exception while fetching " + this.f24610a + " adv_id: " + th.getMessage());
                c3154bc2 = c3154bc;
                Thread.sleep(interfaceC3466nc.mo16485a());
            }
        }
        return c3154bc2 == null ? new C3154bc() : c3154bc2;
    }
}
