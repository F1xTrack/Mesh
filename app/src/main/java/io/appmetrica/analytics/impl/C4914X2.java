package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.X2 */
/* loaded from: classes2.dex */
public final class C4914X2 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ BatteryInfo f31001a;

    /* renamed from: b */
    public final /* synthetic */ C4938Y2 f31002b;

    public C4914X2(C4938Y2 c4938y2, BatteryInfo batteryInfo) {
        this.f31002b = c4938y2;
        this.f31001a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4962Z2 c4962z2 = this.f31002b.f31088a;
        ChargeType chargeType = this.f31001a.chargeType;
        ChargeType chargeType2 = C4962Z2.f31137d;
        synchronized (c4962z2) {
            Iterator it = c4962z2.f31140c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
