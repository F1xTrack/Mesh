package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C2781gg;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Me implements InterfaceC2725ea<Le, C2781gg.a> {
    private final Ke a = new Ke();

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2781gg.a b(Le le) {
        C2781gg.a aVar = new C2781gg.a();
        if (!TextUtils.isEmpty(le.a)) {
            aVar.b = le.a;
        }
        aVar.c = le.b.toString();
        aVar.d = le.c;
        aVar.e = le.d;
        aVar.f = this.a.b(le.e).intValue();
        return aVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Le a(C2781gg.a aVar) {
        JSONObject jSONObject;
        String str = aVar.b;
        String str2 = aVar.c;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new Le(str, jSONObject, aVar.d, aVar.e, this.a.a(Integer.valueOf(aVar.f)));
    }
}
