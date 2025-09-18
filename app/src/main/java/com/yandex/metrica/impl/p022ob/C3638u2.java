package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2845P3;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.u2 */
/* loaded from: classes2.dex */
public class C3638u2 implements InterfaceC3664v2<C2845P3.a> {

    /* renamed from: a */
    private final Context f24882a;

    public C3638u2(Context context) {
        this.f24882a = context;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3664v2, p000.InterfaceC6434mZ
    public Object invoke() {
        Cursor cursorQuery;
        String string;
        String string2;
        C2845P3.a aVar = null;
        try {
            cursorQuery = this.f24882a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/clids"), null, null, null, null);
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
                            C2494B2.m13906a("Invalid clid {%s : %s}", string, string2);
                        } else {
                            map.put(string, string2);
                        }
                    }
                    C2494B2.m13906a("Clids from satellite: %s", map);
                    C2845P3.a aVar2 = new C2845P3.a(map, EnumC2567E0.SATELLITE);
                    C2968U2.m15239a(cursorQuery);
                    aVar = aVar2;
                } else {
                    C2494B2.m13906a("No Satellite content provider found", new Object[0]);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C2494B2.m13907a(th, "Error while getting satellite clids", new Object[0]);
                    return aVar;
                } finally {
                    C2968U2.m15239a(cursorQuery);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        return aVar;
    }
}
