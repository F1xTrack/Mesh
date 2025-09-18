package com.yandex.metrica.impl.ob;

import android.content.Intent;
import com.yandex.metrica.impl.ob.M1;

/* loaded from: classes2.dex */
class N1 implements M1.d {
    final /* synthetic */ M1 a;

    public N1(M1 m1) {
        this.a = m1;
    }

    @Override // com.yandex.metrica.impl.ob.M1.d
    public boolean a(Intent intent, M1 m1) {
        M1 m12 = this.a;
        String action = intent.getAction();
        m12.getClass();
        return "com.yandex.metrica.ACTION_C_BG_L".equals(action);
    }
}
