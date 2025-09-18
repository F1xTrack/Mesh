package com.yandex.metrica.impl.p022ob;

import android.os.Handler;
import com.yandex.metrica.C3806y;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Oj */
/* loaded from: classes2.dex */
public class C2836Oj implements InterfaceC3169c1 {

    /* renamed from: a */
    private final Handler f21885a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f21886b;

    /* renamed from: c */
    private final InterfaceExecutorC3607sn f21887c;

    public C2836Oj(InterfaceExecutorC3607sn interfaceExecutorC3607sn, Handler handler, InterfaceExecutorC3607sn interfaceExecutorC3607sn2, C3090Z c3090z) {
        this.f21886b = interfaceExecutorC3607sn;
        this.f21885a = handler;
        this.f21887c = interfaceExecutorC3607sn2;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: a */
    public void mo14720a(C3806y c3806y, InterfaceC3066Y0 interfaceC3066Y0) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: b */
    public InterfaceExecutorC3607sn mo14722b() {
        return this.f21886b;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: c */
    public Handler mo14723c() {
        return this.f21885a;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: d */
    public InterfaceC3414lc mo14724d() {
        return new C3258fc();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: a */
    public void mo14721a(Map<String, Object> map) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: a */
    public C2516C mo14719a() {
        return new C2516C(this.f21887c);
    }
}
