package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import com.yandex.metrica.impl.ob.ResultReceiverC2939n0;

/* loaded from: classes2.dex */
class Ji implements ResultReceiverC2939n0.a {
    final /* synthetic */ InterfaceC3236yi a;
    final /* synthetic */ Ii b;

    public Ji(Ii ii, InterfaceC3236yi interfaceC3236yi) {
        this.b = ii;
        this.a = interfaceC3236yi;
    }

    @Override // com.yandex.metrica.impl.ob.ResultReceiverC2939n0.a
    public void a(int i, Bundle bundle) {
        this.b.a(bundle, this.a);
    }
}
