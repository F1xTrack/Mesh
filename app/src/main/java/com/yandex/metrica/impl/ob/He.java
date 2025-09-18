package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class He implements InterfaceC3140v2<Le> {
    private final Context a;

    public He(Context context) {
        this.a = context;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3140v2, defpackage.InterfaceC5908mZ
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Le invoke() {
        Cursor cursorQuery;
        try {
            cursorQuery = this.a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/preload_info"), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    B2.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("tracking_id"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("additional_parameters"));
                        JSONObject jSONObject = !TextUtils.isEmpty(string2) ? new JSONObject(string2) : new JSONObject();
                        B2.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                        Le le = new Le(string, jSONObject, !TextUtils.isEmpty(string), false, E0.SATELLITE);
                        U2.a(cursorQuery);
                        return le;
                    }
                    B2.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        U2.a(cursorQuery);
        return null;
    }
}
