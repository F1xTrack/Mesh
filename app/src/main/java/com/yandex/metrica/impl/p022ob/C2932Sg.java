package com.yandex.metrica.impl.p022ob;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.yandex.metrica.impl.p022ob.C2608Fg;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.Sg */
/* loaded from: classes2.dex */
public class C2932Sg implements InterfaceC2783Mg {

    /* renamed from: a */
    private final InstallReferrerClient f22308a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f22309b;

    /* renamed from: com.yandex.metrica.impl.ob.Sg$a */
    public class a implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3057Xg f22310a;

        /* renamed from: com.yandex.metrica.impl.ob.Sg$a$a, reason: collision with other inner class name */
        public class RunnableC7303a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C2608Fg f22312a;

            public RunnableC7303a(C2608Fg c2608Fg) {
                this.f22312a = c2608Fg;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f22310a.mo14789a(this.f22312a);
            }
        }

        public a(InterfaceC3057Xg interfaceC3057Xg) {
            this.f22310a = interfaceC3057Xg;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = C2932Sg.this.f22308a.getInstallReferrer();
                    C2608Fg c2608Fg = new C2608Fg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), C2608Fg.a.GP);
                    ((C3581rn) C2932Sg.this.f22309b).execute(new RunnableC7303a(c2608Fg));
                } catch (Throwable th) {
                    C2932Sg.m15122a(C2932Sg.this, this.f22310a, th);
                }
            } else {
                C2932Sg.m15122a(C2932Sg.this, this.f22310a, new IllegalStateException(AbstractC11153tN0.m24909u(i, "Referrer check failed with error ")));
            }
            try {
                C2932Sg.this.f22308a.endConnection();
            } catch (Throwable unused) {
            }
        }
    }

    public C2932Sg(InstallReferrerClient installReferrerClient, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this.f22308a = installReferrerClient;
        this.f22309b = interfaceExecutorC3607sn;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2783Mg
    /* renamed from: a */
    public void mo14626a(InterfaceC3057Xg interfaceC3057Xg) throws Throwable {
        this.f22308a.startConnection(new a(interfaceC3057Xg));
    }

    /* renamed from: a */
    public static void m15122a(C2932Sg c2932Sg, InterfaceC3057Xg interfaceC3057Xg, Throwable th) {
        ((C3581rn) c2932Sg.f22309b).execute(new RunnableC2957Tg(c2932Sg, interfaceC3057Xg, th));
    }
}
