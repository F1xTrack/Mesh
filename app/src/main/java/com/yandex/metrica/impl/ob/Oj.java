package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.util.Map;

/* loaded from: classes2.dex */
public class Oj implements InterfaceC2666c1 {
    private final Handler a;
    private final InterfaceExecutorC3086sn b;
    private final InterfaceExecutorC3086sn c;

    public Oj(InterfaceExecutorC3086sn interfaceExecutorC3086sn, Handler handler, InterfaceExecutorC3086sn interfaceExecutorC3086sn2, Z z) {
        this.b = interfaceExecutorC3086sn;
        this.a = handler;
        this.c = interfaceExecutorC3086sn2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public void a(com.yandex.metrica.y yVar, Y0 y0) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public InterfaceExecutorC3086sn b() {
        return this.b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public Handler c() {
        return this.a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public InterfaceC2901lc d() {
        return new C2752fc();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public void a(Map<String, Object> map) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2666c1
    public C a() {
        return new C(this.c);
    }
}
