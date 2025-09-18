package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.B6 */
/* loaded from: classes2.dex */
public final class ResultReceiverC4388B6 extends ResultReceiver {

    /* renamed from: a */
    public final InterfaceC4363A6 f29895a;

    public ResultReceiverC4388B6(Handler handler, InterfaceC4363A6 interfaceC4363A6) {
        super(handler);
        this.f29895a = interfaceC4363A6;
    }

    /* renamed from: a */
    public static void m19226a(ResultReceiver resultReceiver, C5163h4 c5163h4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c5163h4.m20485b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f29895a.mo19185a(i, bundle);
    }

    /* renamed from: a */
    public static void m19225a(ResultReceiver resultReceiver, EnumC4621Kk enumC4621Kk, C5163h4 c5163h4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", enumC4621Kk.f30411a);
            c5163h4.m20485b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
