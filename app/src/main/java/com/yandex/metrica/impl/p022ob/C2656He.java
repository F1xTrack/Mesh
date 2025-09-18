package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.He */
/* loaded from: classes2.dex */
public class C2656He implements InterfaceC3664v2<C2756Le> {

    /* renamed from: a */
    private final Context f21362a;

    public C2656He(Context context) {
        this.f21362a = context;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3664v2, p000.InterfaceC6434mZ
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2756Le invoke() {
        Cursor cursorQuery;
        try {
            cursorQuery = this.f21362a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/preload_info"), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    C2494B2.m13906a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("tracking_id"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("additional_parameters"));
                        JSONObject jSONObject = !TextUtils.isEmpty(string2) ? new JSONObject(string2) : new JSONObject();
                        C2494B2.m13906a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                        C2756Le c2756Le = new C2756Le(string, jSONObject, !TextUtils.isEmpty(string), false, EnumC2567E0.SATELLITE);
                        C2968U2.m15239a(cursorQuery);
                        return c2756Le;
                    }
                    C2494B2.m13906a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        C2968U2.m15239a(cursorQuery);
        return null;
    }
}
