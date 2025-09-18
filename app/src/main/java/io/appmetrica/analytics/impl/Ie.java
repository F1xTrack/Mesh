package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ie implements ProtobufConverter {
    public final Ge a = new Ge();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ce fromModel(He he) {
        Ce ce = new Ce();
        if (!TextUtils.isEmpty(he.a)) {
            ce.a = he.a;
        }
        ce.b = he.b.toString();
        ce.c = he.c;
        ce.d = he.d;
        ce.e = this.a.fromModel(he.e).intValue();
        return ce;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final He toModel(Ce ce) {
        JSONObject jSONObject;
        String str = ce.a;
        String str2 = ce.b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new He(str, jSONObject, ce.c, ce.d, this.a.toModel(Integer.valueOf(ce.e)));
    }
}
