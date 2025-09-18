package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4651ji implements InterfaceC4675ki {
    public final Context a;
    public final String b = "content://" + a() + "/clids";
    public final String c = "clid_key";
    public final String d = "clid_value";

    public C4651ji(Context context) {
        this.a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4675ki, defpackage.InterfaceC5908mZ
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final I3 invoke() {
        Cursor cursorQuery;
        String string;
        String string2;
        if (!PackageManagerUtils.hasContentProvider(this.a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC4938vi.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.a.getContentResolver().query(Uri.parse(this.b), null, null, null, null);
            try {
            } catch (Throwable th) {
                th = th;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Error while getting satellite clids\n" + StringUtils.throwableToString(th), new Object[0]);
                    return null;
                } finally {
                    hn.a(cursorQuery);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            AbstractC4938vi.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorQuery.moveToNext()) {
            try {
                string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.c));
                string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.d));
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                AbstractC4938vi.a("Invalid clid {%s : %s}", string, string2);
            } else {
                linkedHashMap.put(string, string2);
            }
        }
        AbstractC4938vi.a("Clids from satellite: %s", linkedHashMap);
        return new I3(linkedHashMap, P7.d);
    }
}
