package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.k3 */
/* loaded from: classes2.dex */
public final class C5237k3 implements IBinaryDataHelper {

    /* renamed from: a */
    public final IBinaryDataHelper f32026a;

    public C5237k3(IBinaryDataHelper iBinaryDataHelper) {
        this.f32026a = iBinaryDataHelper;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(String str) {
        return this.f32026a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(String str, byte[] bArr) {
        this.f32026a.insert(str, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(String str) {
        this.f32026a.remove(str);
    }
}
