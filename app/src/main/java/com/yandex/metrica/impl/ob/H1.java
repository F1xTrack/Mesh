package com.yandex.metrica.impl.ob;

import android.content.Intent;
import com.yandex.metrica.impl.ob.M1;

/* loaded from: classes2.dex */
class H1 implements M1.e {
    final /* synthetic */ B1 a;

    public H1(B1 b1) {
        this.a = b1;
    }

    @Override // com.yandex.metrica.impl.ob.M1.e
    public void a(Intent intent) {
        if (this.a.a != null) {
            B1 b1 = this.a;
            B1.b(b1, b1.a);
            B1.g(this.a);
            this.a.e.a(this.a.a);
        }
    }
}
