package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.N8 */
/* loaded from: classes2.dex */
public final class C4681N8 {

    /* renamed from: a */
    public final C4633L8 f30504a;

    /* renamed from: b */
    public final C4657M8 f30505b;

    /* renamed from: c */
    public final IBinaryDataHelper f30506c;

    public C4681N8(Context context, C4964Z4 c4964z4) {
        this(new C4657M8(), new C4633L8(), C4966Z6.m20064a(context).m20065a(c4964z4));
    }

    public C4681N8(C4657M8 c4657m8, C4633L8 c4633l8, IBinaryDataHelper iBinaryDataHelper) {
        this.f30505b = c4657m8;
        this.f30504a = c4633l8;
        this.f30506c = iBinaryDataHelper;
    }
}
