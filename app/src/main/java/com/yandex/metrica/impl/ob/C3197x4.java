package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.X3;

/* renamed from: com.yandex.metrica.impl.ob.x4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3197x4 extends C2744f4 {
    private final M2 A;
    private final String z;

    public C3197x4(Context context, C2669c4 c2669c4, X3.a aVar, M2 m2, Qi qi, Wi wi) {
        this(context, c2669c4, new V3(), new R2(), new C2769g4(context, c2669c4, aVar, wi, qi, new C3142v4(m2), P0.i().s().e(), U2.b(context, c2669c4.b()), P0.i().j()), m2);
    }

    @Override // com.yandex.metrica.impl.ob.C2744f4, com.yandex.metrica.impl.ob.InterfaceC2918m4
    public synchronized void a(X3.a aVar) {
        super.a(aVar);
        this.A.a(this.z, aVar.l);
    }

    public C3197x4(Context context, C2669c4 c2669c4, V3 v3, R2 r2, C2769g4 c2769g4, M2 m2) {
        super(context, c2669c4, v3, r2, c2769g4);
        this.z = c2669c4.a();
        this.A = m2;
    }
}
