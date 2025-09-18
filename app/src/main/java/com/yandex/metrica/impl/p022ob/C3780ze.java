package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2506Be;
import com.yandex.metrica.impl.p022ob.C3288gg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ze */
/* loaded from: classes2.dex */
public class C3780ze implements InterfaceC3230ea<C2506Be.a, C3288gg.b> {

    /* renamed from: a */
    private final C2731Ke f25423a;

    public C3780ze() {
        this(new C2731Ke());
    }

    public C3780ze(C2731Ke c2731Ke) {
        this.f25423a = c2731Ke;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3288gg.b mo13847b(C2506Be.a aVar) {
        C3288gg.b bVar = new C3288gg.b();
        if (!TextUtils.isEmpty(aVar.f20932a)) {
            bVar.f23523b = aVar.f20932a;
        }
        bVar.f23524c = aVar.f20933b.toString();
        bVar.f23525d = this.f25423a.mo13847b(aVar.f20934c).intValue();
        return bVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C2506Be.a mo13846a(C3288gg.b bVar) {
        JSONObject jSONObject;
        String str = bVar.f23523b;
        String str2 = bVar.f23524c;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C2506Be.a(str, jSONObject, this.f25423a.mo13846a(Integer.valueOf(bVar.f23525d)));
    }
}
