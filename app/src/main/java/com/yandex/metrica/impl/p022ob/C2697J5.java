package com.yandex.metrica.impl.p022ob;

import org.json.JSONObject;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.J5 */
/* loaded from: classes2.dex */
public class C2697J5 extends AbstractC3589s5 {

    /* renamed from: b */
    private final C3170c2 f21494b;

    public C2697J5(C3250f4 c3250f4) {
        this(c3250f4, C2842P0.m14728i().m14742m());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3459n5
    /* renamed from: a */
    public boolean mo13844a(C3376k0 c3376k0) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject;
        EnumC2567E0 enumC2567E0 = null;
        try {
            jSONObjectOptJSONObject = new JSONObject(c3376k0.m16246p()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        C3170c2 c3170c2 = this.f21494b;
        String strM17300e = C3762ym.m17300e(jSONObjectOptJSONObject, "trackingId");
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("additionalParams")) {
            jSONObject = null;
        } else {
            try {
                jSONObject = jSONObjectOptJSONObject.getJSONObject("additionalParams");
            } catch (Throwable unused2) {
            }
        }
        if (jSONObject == null) {
            jSONObject = jSONObject2;
        }
        boolean zM17282a = C3762ym.m17282a(jSONObjectOptJSONObject, "wasSet", false);
        boolean zM17282a2 = C3762ym.m17282a(jSONObjectOptJSONObject, "autoTracking", false);
        String strM17300e2 = C3762ym.m17300e(jSONObjectOptJSONObject, "source");
        EnumC2567E0[] enumC2567E0ArrValues = EnumC2567E0.values();
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            }
            EnumC2567E0 enumC2567E02 = enumC2567E0ArrValues[i];
            if (O90.m5963a(enumC2567E02.m14026a(), strM17300e2)) {
                enumC2567E0 = enumC2567E02;
                break;
            }
            i++;
        }
        c3170c2.m13876b(new C2756Le(strM17300e, jSONObject, zM17282a, zM17282a2, enumC2567E0 != null ? enumC2567E0 : EnumC2567E0.UNDEFINED));
        return false;
    }

    public C2697J5(C3250f4 c3250f4, C3170c2 c3170c2) {
        super(c3250f4);
        this.f21494b = c3170c2;
    }
}
