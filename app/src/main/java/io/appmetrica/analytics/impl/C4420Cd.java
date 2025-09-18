package io.appmetrica.analytics.impl;

import java.lang.reflect.Field;
import org.json.JSONObject;
import p000.AbstractC7038vr;
import p000.C6838sg;

/* renamed from: io.appmetrica.analytics.impl.Cd */
/* loaded from: classes2.dex */
public final class C4420Cd {
    /* renamed from: a */
    public static final C5568x9 m19271a(C4420Cd c4420Cd, EnumC4514G9 enumC4514G9, Object obj) throws SecurityException {
        int i;
        c4420Cd.getClass();
        C5568x9 c5568x9 = new C5568x9();
        switch (enumC4514G9) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new C6838sg();
        }
        c5568x9.f32817a = i;
        C4445Dd.f30014b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        c5568x9.f32818b = jSONObject.toString().getBytes(AbstractC7038vr.f44561a);
        return c5568x9;
    }
}
