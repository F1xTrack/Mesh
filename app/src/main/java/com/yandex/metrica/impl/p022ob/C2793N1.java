package com.yandex.metrica.impl.p022ob;

import android.content.Intent;
import com.yandex.metrica.impl.p022ob.C2768M1;

/* renamed from: com.yandex.metrica.impl.ob.N1 */
/* loaded from: classes2.dex */
class C2793N1 implements C2768M1.d {

    /* renamed from: a */
    final /* synthetic */ C2768M1 f21761a;

    public C2793N1(C2768M1 c2768m1) {
        this.f21761a = c2768m1;
    }

    @Override // com.yandex.metrica.impl.p022ob.C2768M1.d
    /* renamed from: a */
    public boolean mo14591a(Intent intent, C2768M1 c2768m1) {
        C2768M1 c2768m12 = this.f21761a;
        String action = intent.getAction();
        c2768m12.getClass();
        return "com.yandex.metrica.ACTION_C_BG_L".equals(action);
    }
}
