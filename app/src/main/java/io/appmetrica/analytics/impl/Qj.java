package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Qj {
    public final String a;
    public final Lj b;
    public final Pj c;
    public final IBinaryDataHelper d;

    public Qj(Context context, Z4 z4) {
        z4.a();
        this.a = "session_extras";
        this.b = new Lj();
        this.c = new Pj();
        this.d = Z6.a(context).a(z4);
    }

    public final Map a() {
        try {
            byte[] bArr = this.d.get(this.a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.b.toModel(this.c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Lj lj = this.b;
        this.c.getClass();
        return lj.toModel(new Nj());
    }
}
