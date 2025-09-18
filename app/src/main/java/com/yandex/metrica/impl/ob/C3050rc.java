package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.impl.ob.C2627ac;
import defpackage.AbstractC7209tN0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.yandex.metrica.impl.ob.rc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3050rc implements InterfaceC2677cc {
    private final String a;
    private final C3026qc b;

    public C3050rc(String str) {
        this(str, new C3026qc());
    }

    private C2652bc b(Context context) throws Throwable {
        Method method = Class.forName("com.yandex.metrica.identifiers.AdsIdentifiersProvider").getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.identifiers.extra.PROVIDER", this.a);
        C3026qc c3026qc = this.b;
        Object[] objArr = {context, bundle};
        C2627ac c2627ac = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        c3026qc.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            C2627ac.a aVar = C3001pc.a.get(bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
            if (aVar == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            c2627ac = new C2627ac(aVar, bundle3.getString("com.yandex.metrica.identifiers.extra.ID"), bundle3.containsKey("com.yandex.metrica.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("com.yandex.metrica.identifiers.extra.LIMITED")) : null);
        }
        return new C2652bc(c2627ac, EnumC2716e1.a(bundle2.getString("com.yandex.metrica.identifiers.extra.STATUS")), bundle2.getString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE"));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2677cc
    public C2652bc a(Context context) {
        return a(context, new C2926mc());
    }

    public C3050rc(String str, C3026qc c3026qc) {
        this.a = str;
        this.b = c3026qc;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2677cc
    public C2652bc a(Context context, InterfaceC2951nc interfaceC2951nc) throws InterruptedException {
        C2652bc c2652bc;
        interfaceC2951nc.c();
        C2652bc c2652bc2 = null;
        while (interfaceC2951nc.b()) {
            try {
                return b(context);
            } catch (InvocationTargetException e) {
                c2652bc = new C2652bc(null, EnumC2716e1.UNKNOWN, AbstractC7209tN0.z(new StringBuilder("exception while fetching "), this.a, " adv_id: ", e.getTargetException() != null ? e.getTargetException().getMessage() : null));
                c2652bc2 = c2652bc;
                try {
                    Thread.sleep(interfaceC2951nc.a());
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                c2652bc = new C2652bc(null, EnumC2716e1.UNKNOWN, "exception while fetching " + this.a + " adv_id: " + th.getMessage());
                c2652bc2 = c2652bc;
                Thread.sleep(interfaceC2951nc.a());
            }
        }
        return c2652bc2 == null ? new C2652bc() : c2652bc2;
    }
}
