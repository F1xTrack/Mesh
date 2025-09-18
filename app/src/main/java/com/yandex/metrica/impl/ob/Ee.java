package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ee implements InterfaceC2715e0<Le> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2715e0, defpackage.InterfaceC6099nZ
    public Object invoke(Object obj) {
        ContentValues contentValues = (ContentValues) obj;
        String asString = contentValues.getAsString("tracking_id");
        Le le = null;
        if (TextUtils.isEmpty(asString)) {
            B2.b("Tracking id is empty", new Object[0]);
        } else {
            try {
                String asString2 = contentValues.getAsString("additional_params");
                if (TextUtils.isEmpty(asString2)) {
                    B2.b("No additional params", new Object[0]);
                } else {
                    JSONObject jSONObject = new JSONObject(asString2);
                    if (jSONObject.length() == 0) {
                        B2.b("Additional params are empty", new Object[0]);
                    } else {
                        B2.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
                        le = new Le(asString, jSONObject, true, false, E0.RETAIL);
                    }
                }
            } catch (Throwable th) {
                B2.a(th, "Could not parse additional parameters", new Object[0]);
            }
        }
        return le;
    }
}
