package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ee */
/* loaded from: classes2.dex */
public final class C2581Ee implements InterfaceC3220e0<C2756Le> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3220e0, p000.InterfaceC6497nZ
    public Object invoke(Object obj) {
        ContentValues contentValues = (ContentValues) obj;
        String asString = contentValues.getAsString("tracking_id");
        C2756Le c2756Le = null;
        if (TextUtils.isEmpty(asString)) {
            C2494B2.m13912b("Tracking id is empty", new Object[0]);
        } else {
            try {
                String asString2 = contentValues.getAsString("additional_params");
                if (TextUtils.isEmpty(asString2)) {
                    C2494B2.m13912b("No additional params", new Object[0]);
                } else {
                    JSONObject jSONObject = new JSONObject(asString2);
                    if (jSONObject.length() == 0) {
                        C2494B2.m13912b("Additional params are empty", new Object[0]);
                    } else {
                        C2494B2.m13906a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
                        c2756Le = new C2756Le(asString, jSONObject, true, false, EnumC2567E0.RETAIL);
                    }
                }
            } catch (Throwable th) {
                C2494B2.m13907a(th, "Could not parse additional parameters", new Object[0]);
            }
        }
        return c2756Le;
    }
}
