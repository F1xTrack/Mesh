package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2966o2;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2697d7 {
    private final C3145v7 a;

    public C2697d7() {
        this(new C3145v7());
    }

    public C2966o2.f a(C2996p7 c2996p7, C2866k2 c2866k2) {
        String strB;
        C2946n7 c2946n7 = c2996p7.a;
        String str = "";
        if (c2946n7 != null && (strB = c2946n7.b()) != null) {
            str = strB;
        }
        byte[] bArrA = this.a.a(c2996p7);
        Im imB = AbstractC3265zm.b(c2866k2.b().a());
        List<Integer> list = J0.i;
        S s = new S(bArrA, str, EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), imB);
        s.c(c2866k2.d());
        return new C2966o2.f(s, c2866k2).a(s.s()).a(true);
    }

    public C2697d7(C3145v7 c3145v7) {
        this.a = c3145v7;
    }
}
