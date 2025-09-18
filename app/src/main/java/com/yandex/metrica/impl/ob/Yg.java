package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes2.dex */
public class Yg {
    private final Mg a;

    public class a implements Mg {
        @Override // com.yandex.metrica.impl.ob.Mg
        public void a(Xg xg) throws Throwable {
            throw new IllegalStateException("No class: com.android.installreferrer.api.InstallReferrerClient");
        }
    }

    public Yg(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(a(context, interfaceExecutorC3086sn));
    }

    public void a(Xg xg) {
        try {
            this.a.a(xg);
        } catch (Throwable th) {
            xg.a(th);
        }
    }

    public Yg(Mg mg) {
        this.a = mg;
    }

    private static Mg a(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        Sg sg;
        if (B2.a("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                sg = new Sg(InstallReferrerClient.newBuilder(context).build(), interfaceExecutorC3086sn);
            } catch (Throwable unused) {
            }
        } else {
            sg = null;
        }
        return sg == null ? new a() : sg;
    }
}
