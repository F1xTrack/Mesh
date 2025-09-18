package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3044X3;

/* renamed from: com.yandex.metrica.impl.ob.x4 */
/* loaded from: classes2.dex */
public class C3718x4 extends C3250f4 {

    /* renamed from: A */
    private final C2769M2 f25231A;

    /* renamed from: z */
    private final String f25232z;

    public C3718x4(Context context, C3172c4 c3172c4, C3044X3.a aVar, C2769M2 c2769m2, C2885Qi c2885Qi, AbstractC3034Wi abstractC3034Wi) {
        this(context, c3172c4, new C2994V3(), new C2893R2(), new C3276g4(context, c3172c4, aVar, abstractC3034Wi, c2885Qi, new C3666v4(c2769m2), C2842P0.m14728i().m14748s().m17353e(), C2968U2.m15248b(context, c3172c4.m15701b()), C2842P0.m14728i().m14739j()), c2769m2);
    }

    @Override // com.yandex.metrica.impl.p022ob.C3250f4, com.yandex.metrica.impl.p022ob.InterfaceC3432m4
    /* renamed from: a */
    public synchronized void mo15170a(C3044X3.a aVar) {
        super.mo15170a(aVar);
        this.f25231A.m14594a(this.f25232z, aVar.f22762l);
    }

    public C3718x4(Context context, C3172c4 c3172c4, C2994V3 c2994v3, C2893R2 c2893r2, C3276g4 c3276g4, C2769M2 c2769m2) {
        super(context, c3172c4, c2994v3, c2893r2, c3276g4);
        this.f25232z = c3172c4.m15700a();
        this.f25231A = c2769m2;
    }
}
