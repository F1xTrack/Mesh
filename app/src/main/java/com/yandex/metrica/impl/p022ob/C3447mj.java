package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.mj */
/* loaded from: classes2.dex */
public class C3447mj {

    /* renamed from: a */
    private static final Map<String, Integer> f24265a = Collections.unmodifiableMap(new a());

    /* renamed from: com.yandex.metrica.impl.ob.mj$a */
    public class a extends HashMap<String, Integer> {
        public a() {
            put("BACKGROUND", 0);
            put("FOREGROUND", 2);
            put("VISIBLE", 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16434a(com.yandex.metrica.impl.p022ob.C3681vj r17, org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3447mj.m16434a(com.yandex.metrica.impl.ob.vj, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static C3392kg.k.a.C7309a m16433a(JSONObject jSONObject, boolean z) {
        C3392kg.k.a.C7309a c7309a = new C3392kg.k.a.C7309a();
        Boolean boolM17284b = C3762ym.m17284b(jSONObject, "last_known_enabled");
        Boolean boolValueOf = Boolean.valueOf(c7309a.f24044b);
        if (boolM17284b == null) {
            boolM17284b = boolValueOf;
        }
        c7309a.f24044b = boolM17284b.booleanValue();
        Boolean boolM17284b2 = C3762ym.m17284b(jSONObject, "scanning_enabled");
        Boolean boolValueOf2 = Boolean.valueOf(z);
        if (boolM17284b2 == null) {
            boolM17284b2 = boolValueOf2;
        }
        boolean zBooleanValue = boolM17284b2.booleanValue();
        c7309a.f24045c = zBooleanValue;
        if (jSONObject != null && zBooleanValue) {
            C3392kg.k.a.C7309a.C7310a c7310a = new C3392kg.k.a.C7309a.C7310a();
            Long lM17297d = C3762ym.m17297d(jSONObject, "duration_seconds");
            Long lValueOf = Long.valueOf(c7310a.f24047b);
            if (lM17297d == null) {
                lM17297d = lValueOf;
            }
            c7310a.f24047b = lM17297d.longValue();
            Long lM17297d2 = C3762ym.m17297d(jSONObject, "interval_seconds");
            Long lValueOf2 = Long.valueOf(c7310a.f24048c);
            if (lM17297d2 == null) {
                lM17297d2 = lValueOf2;
            }
            c7310a.f24048c = lM17297d2.longValue();
            c7309a.f24046d = c7310a;
        }
        return c7309a;
    }
}
