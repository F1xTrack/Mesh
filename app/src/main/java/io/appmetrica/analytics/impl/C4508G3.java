package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.G3 */
/* loaded from: classes2.dex */
public final class C4508G3 implements InterfaceC4462E5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4462E5, p000.InterfaceC6497nZ
    /* renamed from: a */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapM20176c = AbstractC5020bb.m20176c(asString);
        if (AbstractC4550Hl.m19477a(mapM20176c)) {
            return mapM20176c;
        }
        AbstractC5527vi.m21161a(AbstractC7222ym.m26234k("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
