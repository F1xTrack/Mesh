package com.yandex.metrica.impl.ob;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.yandex.metrica.impl.ob.Fg;
import defpackage.AbstractC7209tN0;

/* loaded from: classes2.dex */
public class Sg implements Mg {
    private final InstallReferrerClient a;
    private final InterfaceExecutorC3086sn b;

    public class a implements InstallReferrerStateListener {
        final /* synthetic */ Xg a;

        /* renamed from: com.yandex.metrica.impl.ob.Sg$a$a, reason: collision with other inner class name */
        public class RunnableC0009a implements Runnable {
            final /* synthetic */ Fg a;

            public RunnableC0009a(Fg fg) {
                this.a = fg;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.a(this.a);
            }
        }

        public a(Xg xg) {
            this.a = xg;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = Sg.this.a.getInstallReferrer();
                    Fg fg = new Fg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), Fg.a.GP);
                    ((C3061rn) Sg.this.b).execute(new RunnableC0009a(fg));
                } catch (Throwable th) {
                    Sg.a(Sg.this, this.a, th);
                }
            } else {
                Sg.a(Sg.this, this.a, new IllegalStateException(AbstractC7209tN0.u(i, "Referrer check failed with error ")));
            }
            try {
                Sg.this.a.endConnection();
            } catch (Throwable unused) {
            }
        }
    }

    public Sg(InstallReferrerClient installReferrerClient, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this.a = installReferrerClient;
        this.b = interfaceExecutorC3086sn;
    }

    @Override // com.yandex.metrica.impl.ob.Mg
    public void a(Xg xg) throws Throwable {
        this.a.startConnection(new a(xg));
    }

    public static void a(Sg sg, Xg xg, Throwable th) {
        ((C3061rn) sg.b).execute(new Tg(sg, xg, th));
    }
}
