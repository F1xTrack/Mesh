package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
public class H4 implements T, E4 {
    private Z3 a;
    private final ResultReceiver b;

    public H4(Context context, Z3 z3, X3 x3) {
        this.a = z3;
        this.b = x3.c;
        z3.a(this);
    }

    @Override // com.yandex.metrica.impl.ob.E4
    public void a(C2864k0 c2864k0, X3 x3) {
        this.a.a(x3.b);
        this.a.a(c2864k0, this);
    }

    public Z3 b() {
        return this.a;
    }

    @Override // com.yandex.metrica.impl.ob.T
    public void a(U u) {
        ResultReceiver resultReceiver = this.b;
        int i = ResultReceiverC2939n0.b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            u.c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // com.yandex.metrica.impl.ob.E4
    public void a() {
        this.a.b(this);
    }
}
