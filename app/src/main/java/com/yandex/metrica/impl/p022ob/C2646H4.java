package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.H4 */
/* loaded from: classes2.dex */
public class C2646H4 implements InterfaceC2940T, InterfaceC2571E4 {

    /* renamed from: a */
    private C3094Z3 f21338a;

    /* renamed from: b */
    private final ResultReceiver f21339b;

    public C2646H4(Context context, C3094Z3 c3094z3, C3044X3 c3044x3) {
        this.f21338a = c3094z3;
        this.f21339b = c3044x3.f22750c;
        c3094z3.m15529a(this);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2571E4
    /* renamed from: a */
    public void mo13840a(C3376k0 c3376k0, C3044X3 c3044x3) {
        this.f21338a.m15530a(c3044x3.f22749b);
        this.f21338a.m15533a(c3376k0, this);
    }

    /* renamed from: b */
    public C3094Z3 m14219b() {
        return this.f21338a;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2940T
    /* renamed from: a */
    public void mo14218a(C2965U c2965u) {
        ResultReceiver resultReceiver = this.f21339b;
        int i = ResultReceiverC3454n0.f24272b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c2965u.m15212c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2571E4
    /* renamed from: a */
    public void mo13839a() {
        this.f21338a.m15535b(this);
    }
}
