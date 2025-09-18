package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4838re implements ProtobufConverter {
    public final Ge a;

    public C4838re() {
        this(new Ge());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final De fromModel(C4886te c4886te) {
        De de = new De();
        if (!TextUtils.isEmpty(c4886te.a)) {
            de.a = c4886te.a;
        }
        de.b = c4886te.b.toString();
        de.c = this.a.fromModel(c4886te.c).intValue();
        return de;
    }

    public C4838re(Ge ge) {
        this.a = ge;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4886te toModel(De de) {
        JSONObject jSONObject;
        String str = de.a;
        String str2 = de.b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C4886te(str, jSONObject, this.a.toModel(Integer.valueOf(de.c)));
    }
}
