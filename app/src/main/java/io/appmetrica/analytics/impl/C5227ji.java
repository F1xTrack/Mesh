package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.ji */
/* loaded from: classes2.dex */
public final class C5227ji implements InterfaceC5252ki {

    /* renamed from: a */
    public final Context f31984a;

    /* renamed from: b */
    public final String f31985b = "content://" + m20593a() + "/clids";

    /* renamed from: c */
    public final String f31986c = "clid_key";

    /* renamed from: d */
    public final String f31987d = "clid_value";

    public C5227ji(Context context) {
        this.f31984a = context;
    }

    /* renamed from: a */
    public final String m20593a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5252ki, p000.InterfaceC6434mZ
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4556I3 invoke() {
        Cursor cursorQuery;
        String string;
        String string2;
        if (!PackageManagerUtils.hasContentProvider(this.f31984a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC5527vi.m21161a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f31984a.getContentResolver().query(Uri.parse(this.f31985b), null, null, null, null);
            try {
            } catch (Throwable th) {
                th = th;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Error while getting satellite clids\n" + StringUtils.throwableToString(th), new Object[0]);
                    return null;
                } finally {
                    AbstractC5182hn.m20509a(cursorQuery);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            AbstractC5527vi.m21161a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorQuery.moveToNext()) {
            try {
                string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f31986c));
                string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f31987d));
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                AbstractC5527vi.m21161a("Invalid clid {%s : %s}", string, string2);
            } else {
                linkedHashMap.put(string, string2);
            }
        }
        AbstractC5527vi.m21161a("Clids from satellite: %s", linkedHashMap);
        return new C4556I3(linkedHashMap, EnumC4728P7.f30606d);
    }
}
