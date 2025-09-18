package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4517e3 implements BillingInfoStorage {
    public final ProtobufStateStorage a;
    public C4826r2 b;

    public C4517e3(Context context) {
        this(Rl.a(C4826r2.class).a(context));
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.b.a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.b.b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<BillingInfo> list, boolean z) {
        for (BillingInfo billingInfo : list) {
        }
        C4826r2 c4826r2 = new C4826r2(list, z);
        this.b = c4826r2;
        this.a.save(c4826r2);
    }

    public C4517e3(ProtobufStateStorage protobufStateStorage) {
        this.a = protobufStateStorage;
        this.b = (C4826r2) protobufStateStorage.read();
    }
}
