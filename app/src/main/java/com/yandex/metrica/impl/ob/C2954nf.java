package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2954nf implements InterfaceC2929mf {
    private final We a;

    public C2954nf() {
        this(new We());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2929mf
    public byte[] a(Xe xe, C2856jh c2856jh) {
        if (!c2856jh.U() && !TextUtils.isEmpty(xe.b)) {
            try {
                JSONObject jSONObject = new JSONObject(xe.b);
                jSONObject.remove("preloadInfo");
                xe.b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.a.a(xe, c2856jh);
    }

    public C2954nf(We we) {
        this.a = we;
    }
}
