package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.re */
/* loaded from: classes2.dex */
public final class C5423re implements ProtobufConverter {

    /* renamed from: a */
    public final C4519Ge f32508a;

    public C5423re() {
        this(new C4519Ge());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4446De fromModel(C5473te c5473te) {
        C4446De c4446De = new C4446De();
        if (!TextUtils.isEmpty(c5473te.f32630a)) {
            c4446De.f30016a = c5473te.f32630a;
        }
        c4446De.f30017b = c5473te.f32631b.toString();
        c4446De.f30018c = this.f32508a.fromModel(c5473te.f32632c).intValue();
        return c4446De;
    }

    public C5423re(C4519Ge c4519Ge) {
        this.f32508a = c4519Ge;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5473te toModel(C4446De c4446De) {
        JSONObject jSONObject;
        String str = c4446De.f30016a;
        String str2 = c4446De.f30017b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C5473te(str, jSONObject, this.f32508a.toModel(Integer.valueOf(c4446De.f30018c)));
    }
}
