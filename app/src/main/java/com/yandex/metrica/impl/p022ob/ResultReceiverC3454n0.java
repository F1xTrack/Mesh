package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

@SuppressLint({"ParcelCreator"})
/* renamed from: com.yandex.metrica.impl.ob.n0 */
/* loaded from: classes2.dex */
public class ResultReceiverC3454n0 extends ResultReceiver {

    /* renamed from: b */
    public static final /* synthetic */ int f24272b = 0;

    /* renamed from: a */
    private final a f24273a;

    /* renamed from: com.yandex.metrica.impl.ob.n0$a */
    public interface a {
        /* renamed from: a */
        void mo14366a(int i, Bundle bundle);
    }

    public ResultReceiverC3454n0(Handler handler, a aVar) {
        super(handler);
        this.f24273a = aVar;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(C2688Il.class.getClassLoader());
        this.f24273a.mo14366a(i, bundle);
    }
}
