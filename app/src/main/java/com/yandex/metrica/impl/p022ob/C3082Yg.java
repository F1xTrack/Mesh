package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* renamed from: com.yandex.metrica.impl.ob.Yg */
/* loaded from: classes2.dex */
public class C3082Yg {

    /* renamed from: a */
    private final InterfaceC2783Mg f22895a;

    /* renamed from: com.yandex.metrica.impl.ob.Yg$a */
    public class a implements InterfaceC2783Mg {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2783Mg
        /* renamed from: a */
        public void mo14626a(InterfaceC3057Xg interfaceC3057Xg) throws Throwable {
            throw new IllegalStateException("No class: com.android.installreferrer.api.InstallReferrerClient");
        }
    }

    public C3082Yg(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(m15510a(context, interfaceExecutorC3607sn));
    }

    /* renamed from: a */
    public void m15511a(InterfaceC3057Xg interfaceC3057Xg) {
        try {
            this.f22895a.mo14626a(interfaceC3057Xg);
        } catch (Throwable th) {
            interfaceC3057Xg.mo14790a(th);
        }
    }

    public C3082Yg(InterfaceC2783Mg interfaceC2783Mg) {
        this.f22895a = interfaceC2783Mg;
    }

    /* renamed from: a */
    private static InterfaceC2783Mg m15510a(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        C2932Sg c2932Sg;
        if (C2494B2.m13908a("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c2932Sg = new C2932Sg(InstallReferrerClient.newBuilder(context).build(), interfaceExecutorC3607sn);
            } catch (Throwable unused) {
            }
        } else {
            c2932Sg = null;
        }
        return c2932Sg == null ? new a() : c2932Sg;
    }
}
