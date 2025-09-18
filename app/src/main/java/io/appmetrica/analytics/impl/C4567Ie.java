package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Ie */
/* loaded from: classes2.dex */
public final class C4567Ie implements ProtobufConverter {

    /* renamed from: a */
    public final C4519Ge f30288a = new C4519Ge();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4421Ce fromModel(C4543He c4543He) {
        C4421Ce c4421Ce = new C4421Ce();
        if (!TextUtils.isEmpty(c4543He.f30251a)) {
            c4421Ce.f29957a = c4543He.f30251a;
        }
        c4421Ce.f29958b = c4543He.f30252b.toString();
        c4421Ce.f29959c = c4543He.f30253c;
        c4421Ce.f29960d = c4543He.f30254d;
        c4421Ce.f29961e = this.f30288a.fromModel(c4543He.f30255e).intValue();
        return c4421Ce;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4543He toModel(C4421Ce c4421Ce) {
        JSONObject jSONObject;
        String str = c4421Ce.f29957a;
        String str2 = c4421Ce.f29958b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C4543He(str, jSONObject, c4421Ce.f29959c, c4421Ce.f29960d, this.f30288a.toModel(Integer.valueOf(c4421Ce.f29961e)));
    }
}
