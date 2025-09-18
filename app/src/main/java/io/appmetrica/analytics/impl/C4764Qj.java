package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Qj */
/* loaded from: classes2.dex */
public final class C4764Qj {

    /* renamed from: a */
    public final String f30666a;

    /* renamed from: b */
    public final C4644Lj f30667b;

    /* renamed from: c */
    public final C4740Pj f30668c;

    /* renamed from: d */
    public final IBinaryDataHelper f30669d;

    public C4764Qj(Context context, C4964Z4 c4964z4) {
        c4964z4.m20054a();
        this.f30666a = "session_extras";
        this.f30667b = new C4644Lj();
        this.f30668c = new C4740Pj();
        this.f30669d = C4966Z6.m20064a(context).m20065a(c4964z4);
    }

    /* renamed from: a */
    public final Map m19747a() {
        try {
            byte[] bArr = this.f30669d.get(this.f30666a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f30667b.toModel(this.f30668c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        C4644Lj c4644Lj = this.f30667b;
        this.f30668c.getClass();
        return c4644Lj.toModel(new C4692Nj());
    }
}
