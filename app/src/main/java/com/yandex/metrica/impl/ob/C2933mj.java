package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.mj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2933mj {
    private static final Map<String, Integer> a = Collections.unmodifiableMap(new a());

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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.yandex.metrica.impl.ob.C3162vj r17, org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2933mj.a(com.yandex.metrica.impl.ob.vj, org.json.JSONObject):void");
    }

    private static C2880kg.k.a.C0015a a(JSONObject jSONObject, boolean z) {
        C2880kg.k.a.C0015a c0015a = new C2880kg.k.a.C0015a();
        Boolean boolB = C3240ym.b(jSONObject, "last_known_enabled");
        Boolean boolValueOf = Boolean.valueOf(c0015a.b);
        if (boolB == null) {
            boolB = boolValueOf;
        }
        c0015a.b = boolB.booleanValue();
        Boolean boolB2 = C3240ym.b(jSONObject, "scanning_enabled");
        Boolean boolValueOf2 = Boolean.valueOf(z);
        if (boolB2 == null) {
            boolB2 = boolValueOf2;
        }
        boolean zBooleanValue = boolB2.booleanValue();
        c0015a.c = zBooleanValue;
        if (jSONObject != null && zBooleanValue) {
            C2880kg.k.a.C0015a.C0016a c0016a = new C2880kg.k.a.C0015a.C0016a();
            Long lD = C3240ym.d(jSONObject, "duration_seconds");
            Long lValueOf = Long.valueOf(c0016a.b);
            if (lD == null) {
                lD = lValueOf;
            }
            c0016a.b = lD.longValue();
            Long lD2 = C3240ym.d(jSONObject, "interval_seconds");
            Long lValueOf2 = Long.valueOf(c0016a.c);
            if (lD2 == null) {
                lD2 = lValueOf2;
            }
            c0016a.c = lD2.longValue();
            c0015a.d = c0016a;
        }
        return c0015a;
    }
}
