package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* renamed from: io.appmetrica.analytics.impl.Y2 */
/* loaded from: classes2.dex */
public final class C4938Y2 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C4962Z2 f31088a;

    public C4938Y2(C4962Z2 c4962z2) {
        this.f31088a = c4962z2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f31088a.f31139b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f31088a.getClass();
        BatteryInfo batteryInfoM20053a = C4962Z2.m20053a(intent);
        this.f31088a.f31139b = batteryInfoM20053a;
        if (chargeType != batteryInfoM20053a.chargeType) {
            this.f31088a.f31138a.execute(new C4914X2(this, batteryInfoM20053a));
        }
    }
}
