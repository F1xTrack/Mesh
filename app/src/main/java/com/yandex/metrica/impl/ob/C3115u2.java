package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.P3;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3115u2 implements InterfaceC3140v2<P3.a> {
    private final Context a;

    public C3115u2(Context context) {
        this.a = context;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3140v2, defpackage.InterfaceC5908mZ
    public Object invoke() {
        Cursor cursorQuery;
        String string;
        String string2;
        P3.a aVar = null;
        try {
            cursorQuery = this.a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/clids"), null, null, null, null);
            try {
                if (cursorQuery != null) {
                    HashMap map = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        try {
                            string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("clid_key"));
                            string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("clid_value"));
                        } catch (Throwable unused) {
                        }
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            B2.a("Invalid clid {%s : %s}", string, string2);
                        } else {
                            map.put(string, string2);
                        }
                    }
                    B2.a("Clids from satellite: %s", map);
                    P3.a aVar2 = new P3.a(map, E0.SATELLITE);
                    U2.a(cursorQuery);
                    aVar = aVar2;
                } else {
                    B2.a("No Satellite content provider found", new Object[0]);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    B2.a(th, "Error while getting satellite clids", new Object[0]);
                    return aVar;
                } finally {
                    U2.a(cursorQuery);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        return aVar;
    }
}
