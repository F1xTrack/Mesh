package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3288gg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Me */
/* loaded from: classes2.dex */
public class C2781Me implements InterfaceC3230ea<C2756Le, C3288gg.a> {

    /* renamed from: a */
    private final C2731Ke f21736a = new C2731Ke();

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3288gg.a mo13847b(C2756Le c2756Le) {
        C3288gg.a aVar = new C3288gg.a();
        if (!TextUtils.isEmpty(c2756Le.f21638a)) {
            aVar.f23517b = c2756Le.f21638a;
        }
        aVar.f23518c = c2756Le.f21639b.toString();
        aVar.f23519d = c2756Le.f21640c;
        aVar.f23520e = c2756Le.f21641d;
        aVar.f23521f = this.f21736a.mo13847b(c2756Le.f21642e).intValue();
        return aVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C2756Le mo13846a(C3288gg.a aVar) {
        JSONObject jSONObject;
        String str = aVar.f23517b;
        String str2 = aVar.f23518c;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C2756Le(str, jSONObject, aVar.f23519d, aVar.f23520e, this.f21736a.mo13846a(Integer.valueOf(aVar.f23521f)));
    }
}
