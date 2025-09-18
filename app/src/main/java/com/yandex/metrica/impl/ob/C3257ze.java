package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Be;
import com.yandex.metrica.impl.ob.C2781gg;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ze, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3257ze implements InterfaceC2725ea<Be.a, C2781gg.b> {
    private final Ke a;

    public C3257ze() {
        this(new Ke());
    }

    public C3257ze(Ke ke) {
        this.a = ke;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2781gg.b b(Be.a aVar) {
        C2781gg.b bVar = new C2781gg.b();
        if (!TextUtils.isEmpty(aVar.a)) {
            bVar.b = aVar.a;
        }
        bVar.c = aVar.b.toString();
        bVar.d = this.a.b(aVar.c).intValue();
        return bVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Be.a a(C2781gg.b bVar) {
        JSONObject jSONObject;
        String str = bVar.b;
        String str2 = bVar.c;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new Be.a(str, jSONObject, this.a.a(Integer.valueOf(bVar.d)));
    }
}
