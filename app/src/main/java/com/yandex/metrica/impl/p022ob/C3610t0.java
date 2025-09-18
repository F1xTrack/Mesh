package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3662v0;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.t0 */
/* loaded from: classes2.dex */
public class C3610t0 implements InterfaceC2917S1<C3662v0.a> {

    /* renamed from: a */
    private final C3662v0 f24789a;

    public C3610t0() {
        this(new C3662v0());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2917S1
    /* renamed from: a */
    public C3662v0.a mo14408a(int i, byte[] bArr, Map map) {
        if (200 == i) {
            this.f24789a.getClass();
            try {
                if (!C2968U2.m15246a(bArr)) {
                    return new C3662v0.a(new JSONObject(new String(bArr, "UTF-8")).optString("status"));
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public C3610t0(C3662v0 c3662v0) {
        this.f24789a = c3662v0;
    }
}
