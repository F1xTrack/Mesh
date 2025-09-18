package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.EnumC2458c;
import com.yandex.metrica.impl.p022ob.C3044X3;

/* renamed from: com.yandex.metrica.impl.ob.K4 */
/* loaded from: classes2.dex */
class C2721K4 implements InterfaceC2596F4, InterfaceC2671I4<C3484o4> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2596F4
    /* renamed from: a */
    public InterfaceC2571E4 mo14062a(Context context, C2696J4 c2696j4, C2521C4 c2521c4, C3044X3 c3044x3) {
        return new C2746L4(context, c2696j4.m14417b(new C3536q4(c2521c4.m13951b(), c2521c4.m13950a()), c3044x3, new C3588s4(this)));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2671I4
    /* renamed from: b */
    public InterfaceC3380k4 mo13918b(Context context, C3172c4 c3172c4, C3044X3.a aVar, C2934Si c2934Si) {
        return new C2945T4(context, c3172c4, aVar, c2934Si.m15135c(), new C3059Xi(c2934Si), EnumC2458c.MAIN);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2671I4
    /* renamed from: a */
    public InterfaceC3432m4 mo13917a(Context context, C3172c4 c3172c4, C3044X3.a aVar, C2934Si c2934Si) {
        return new C3484o4(context, c2934Si.m15135c(), c3172c4, aVar, C2842P0.m14728i().m14744o(), C2842P0.m14728i().m14751v(), new C3059Xi(c2934Si));
    }
}
