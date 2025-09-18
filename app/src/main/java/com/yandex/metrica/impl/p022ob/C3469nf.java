package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nf */
/* loaded from: classes2.dex */
public class C3469nf implements InterfaceC3443mf {

    /* renamed from: a */
    private final C3030We f24316a;

    public C3469nf() {
        this(new C3030We());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3443mf
    /* renamed from: a */
    public byte[] mo14848a(C3055Xe c3055Xe, C3367jh c3367jh) {
        if (!c3367jh.m16147U() && !TextUtils.isEmpty(c3055Xe.f22787b)) {
            try {
                JSONObject jSONObject = new JSONObject(c3055Xe.f22787b);
                jSONObject.remove("preloadInfo");
                c3055Xe.f22787b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f24316a.mo14848a(c3055Xe, c3367jh);
    }

    public C3469nf(C3030We c3030We) {
        this.f24316a = c3030We;
    }
}
