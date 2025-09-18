package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.Uh */
/* loaded from: classes2.dex */
public class C2983Uh {

    /* renamed from: a */
    private final Context f22485a;

    /* renamed from: b */
    private final C2742L0 f22486b;

    /* renamed from: c */
    private final InterfaceExecutorC3607sn f22487c;

    /* renamed from: d */
    private final C2880Qd f22488d;

    /* renamed from: e */
    private final InterfaceC2859Ph f22489e;

    /* renamed from: f */
    private final InterfaceC2839Om f22490f;

    /* renamed from: g */
    private final InterfaceC2979Ud f22491g;

    /* renamed from: h */
    private final C3687w f22492h;

    /* renamed from: i */
    private boolean f22493i;

    public C2983Uh(Context context) {
        this(context, new C2742L0(), new C2880Qd(), new C2814Nm(), new C2904Rd(context), C2842P0.m14728i().m14748s().m17356h(), C2842P0.m14728i().m14750u(), C2842P0.m14728i().m14729a());
    }

    /* renamed from: c */
    public static void m15285c(C2983Uh c2983Uh) {
        synchronized (c2983Uh) {
            c2983Uh.f22493i = false;
        }
    }

    /* renamed from: a */
    public synchronized void m15286a(C2885Qi c2885Qi, C3238ei c3238ei) {
        try {
            C2585Ei c2585EiM14864M = c2885Qi.m14864M();
            if (c2585EiM14864M == null) {
                return;
            }
            File fileM14500a = this.f22486b.m14500a(this.f22485a, "certificate.p12");
            boolean z = fileM14500a != null && fileM14500a.exists();
            if (z) {
                c3238ei.m15854a(fileM14500a);
            }
            long jMo14675b = this.f22490f.mo14675b();
            long jMo14307a = this.f22489e.mo14307a();
            if ((!z || jMo14675b >= jMo14307a) && !this.f22493i) {
                String strM14879e = c2885Qi.m14879e();
                if (!TextUtils.isEmpty(strM14879e) && this.f22491g.mo14997a()) {
                    this.f22493i = true;
                    this.f22492h.m17102a(C3687w.f25138c, this.f22487c, new C2933Sh(this, strM14879e, fileM14500a, c3238ei, c2585EiM14864M));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C2983Uh(Context context, C2742L0 c2742l0, C2880Qd c2880Qd, InterfaceC2839Om interfaceC2839Om, InterfaceC2979Ud interfaceC2979Ud, InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC2859Ph interfaceC2859Ph, C3687w c3687w) {
        this.f22493i = false;
        this.f22485a = context;
        this.f22486b = c2742l0;
        this.f22488d = c2880Qd;
        this.f22490f = interfaceC2839Om;
        this.f22491g = interfaceC2979Ud;
        this.f22487c = interfaceExecutorC3607sn;
        this.f22489e = interfaceC2859Ph;
        this.f22492h = c3687w;
    }

    /* renamed from: a */
    public static void m15283a(C2983Uh c2983Uh, long j) {
        c2983Uh.f22489e.mo14310a(c2983Uh.f22490f.mo14675b() + j);
    }
}
