package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import defpackage.AbstractC8235ym;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class N3 implements InterfaceC2715e0<Map<String, ? extends String>> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2715e0, defpackage.InterfaceC6099nZ
    public Object invoke(Object obj) {
        String asString = ((ContentValues) obj).getAsString("clids");
        HashMap<String, String> mapD = C3240ym.d(asString);
        if (C3240ym.d(mapD)) {
            return mapD;
        }
        B2.b(AbstractC8235ym.k("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
