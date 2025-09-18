package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import defpackage.AbstractC8235ym;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class G3 implements E5 {
    @Override // io.appmetrica.analytics.impl.E5, defpackage.InterfaceC6099nZ
    /* renamed from: a */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapC = AbstractC4450bb.c(asString);
        if (Hl.a(mapC)) {
            return mapC;
        }
        AbstractC4938vi.a(AbstractC8235ym.k("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
