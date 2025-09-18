package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.N3 */
/* loaded from: classes2.dex */
public final class C2795N3 implements InterfaceC3220e0<Map<String, ? extends String>> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3220e0, p000.InterfaceC6497nZ
    public Object invoke(Object obj) {
        String asString = ((ContentValues) obj).getAsString("clids");
        HashMap<String, String> mapM17298d = C3762ym.m17298d(asString);
        if (C3762ym.m17299d(mapM17298d)) {
            return mapM17298d;
        }
        C2494B2.m13912b(AbstractC7222ym.m26234k("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
