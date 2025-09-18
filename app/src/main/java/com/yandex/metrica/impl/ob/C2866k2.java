package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.k2 */
/* loaded from: classes2.dex */
public class C2866k2 extends T3 {
    protected H0 c;
    protected Pe d;
    private boolean e;
    private final String f;

    public C2866k2(U3 u3, CounterConfiguration counterConfiguration) {
        this(u3, counterConfiguration, null);
    }

    public void a(Ln ln) {
        this.c = new H0(ln);
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        CounterConfiguration counterConfigurationB = b();
        synchronized (counterConfigurationB) {
            bundle.putParcelable("COUNTER_CFG_OBJ", counterConfigurationB);
        }
        U3 u3A = a();
        synchronized (u3A) {
            bundle.putParcelable("PROCESS_CFG_OBJ", u3A);
        }
        return bundle;
    }

    public String d() {
        return this.c.a();
    }

    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public void g() {
        this.e = true;
    }

    public void h() {
        this.e = false;
    }

    public C2866k2(U3 u3, CounterConfiguration counterConfiguration, String str) {
        super(u3, counterConfiguration);
        this.e = true;
        this.f = str;
    }

    public void a(Ki ki) {
        if (ki != null) {
            CounterConfiguration counterConfigurationB = b();
            String strE = ((Ii) ki).e();
            synchronized (counterConfigurationB) {
                counterConfigurationB.a.put("CFG_UUID", strE);
            }
        }
    }

    public void a(Pe pe) {
        this.d = pe;
    }
}
