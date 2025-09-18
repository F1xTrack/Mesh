package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.e3 */
/* loaded from: classes2.dex */
public final class C5087e3 implements BillingInfoStorage {

    /* renamed from: a */
    public final ProtobufStateStorage f31522a;

    /* renamed from: b */
    public C5411r2 f31523b;

    public C5087e3(Context context) {
        this(C4789Rl.m19787a(C5411r2.class).m19823a(context));
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.f31523b.f32494a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f31523b.f32495b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<BillingInfo> list, boolean z) {
        for (BillingInfo billingInfo : list) {
        }
        C5411r2 c5411r2 = new C5411r2(list, z);
        this.f31523b = c5411r2;
        this.f31522a.save(c5411r2);
    }

    public C5087e3(ProtobufStateStorage protobufStateStorage) {
        this.f31522a = protobufStateStorage;
        this.f31523b = (C5411r2) protobufStateStorage.read();
    }
}
