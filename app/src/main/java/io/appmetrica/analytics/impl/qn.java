package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class qn implements pn {
    public final C5024z8 a;

    public qn() {
        this(new C5024z8());
    }

    @Override // io.appmetrica.analytics.impl.pn
    public final byte[] a(J8 j8, Eg eg) {
        if (!((C4567g5) eg.m).B() && !TextUtils.isEmpty(j8.b)) {
            try {
                JSONObject jSONObject = new JSONObject(j8.b);
                jSONObject.remove("preloadInfo");
                j8.b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.a.a(j8, eg);
    }

    public qn(C5024z8 c5024z8) {
        this.a = c5024z8;
    }
}
