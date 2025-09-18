package io.appmetrica.analytics.impl;

import defpackage.AbstractC7680vr;
import defpackage.C7074sg;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Cd {
    public static final C4977x9 a(Cd cd, G9 g9, Object obj) throws SecurityException {
        int i;
        cd.getClass();
        C4977x9 c4977x9 = new C4977x9();
        switch (g9) {
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
                throw new C7074sg();
        }
        c4977x9.a = i;
        Dd.b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        c4977x9.b = jSONObject.toString().getBytes(AbstractC7680vr.a);
        return c4977x9;
    }
}
