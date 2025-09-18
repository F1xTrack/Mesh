package io.appmetrica.analytics.impl;

import org.json.JSONObject;
import p000.AbstractC7038vr;
import p000.C6838sg;

/* renamed from: io.appmetrica.analytics.impl.Ya */
/* loaded from: classes2.dex */
public final class C4946Ya {
    /* renamed from: a */
    public static final C5568x9 m20033a(C4946Ya c4946Ya, EnumC4514G9 enumC4514G9, JSONObject jSONObject) {
        int i;
        c4946Ya.getClass();
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
        c5568x9.f32818b = jSONObject.toString().getBytes(AbstractC7038vr.f44561a);
        return c5568x9;
    }
}
