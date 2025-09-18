package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.AbstractC2772g7;

/* renamed from: com.yandex.metrica.impl.ob.k7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2871k7 extends AbstractC2772g7 {
    private S2 d;

    public C2871k7(Context context, S2 s2, AbstractC2772g7.a aVar, com.yandex.metrica.r rVar) {
        this(s2, aVar, rVar, new K0(context));
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2772g7
    public void a(C2996p7 c2996p7) {
        this.d.a().a(c2996p7);
    }

    public C2871k7(S2 s2, AbstractC2772g7.a aVar, com.yandex.metrica.r rVar, K0 k0) {
        super(aVar, rVar, k0);
        this.d = s2;
    }
}
