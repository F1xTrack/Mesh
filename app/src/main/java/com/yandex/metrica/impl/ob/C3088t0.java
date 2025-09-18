package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C3138v0;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3088t0 implements S1<C3138v0.a> {
    private final C3138v0 a;

    public C3088t0() {
        this(new C3138v0());
    }

    @Override // com.yandex.metrica.impl.ob.S1
    public C3138v0.a a(int i, byte[] bArr, Map map) {
        if (200 == i) {
            this.a.getClass();
            try {
                if (!U2.a(bArr)) {
                    return new C3138v0.a(new JSONObject(new String(bArr, "UTF-8")).optString("status"));
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public C3088t0(C3138v0 c3138v0) {
        this.a = c3138v0;
    }
}
