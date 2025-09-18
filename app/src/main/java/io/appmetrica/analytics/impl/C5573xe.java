package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xe */
/* loaded from: classes2.dex */
public final class C5573xe implements InterfaceC4462E5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4462E5, p000.InterfaceC6497nZ
    /* renamed from: a */
    public final C4543He invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("tracking_id");
        if (TextUtils.isEmpty(asString)) {
            AbstractC5527vi.m21161a("Tracking id is empty", new Object[0]);
            return null;
        }
        if (ParseUtils.parseLong(asString) == null) {
            AbstractC5527vi.m21161a("Tracking id from preload info content provider is not a number", new Object[0]);
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (TextUtils.isEmpty(asString2)) {
                AbstractC5527vi.m21161a("No additional params", new Object[0]);
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                AbstractC5527vi.m21161a("Additional params are empty", new Object[0]);
                return null;
            }
            AbstractC5527vi.m21161a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new C4543He(asString, jSONObject, true, false, EnumC4728P7.f30607e);
        } catch (Throwable th) {
            ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Could not parse additional parameters\n" + StringUtils.throwableToString(th), new Object[0]);
            return null;
        }
    }
}
