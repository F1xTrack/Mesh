package defpackage;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.impl.ob.C2988p;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
import java.util.concurrent.Executor;

/* renamed from: mh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5932mh implements BillingClientStateListener {
    public final C2988p a;
    public final Executor b;
    public final Executor c;
    public final BillingClient d;
    public final InterfaceC3013q e;
    public final C2216as1 f;

    public C5932mh(C2988p c2988p, Executor executor, Executor executor2, BillingClient billingClient, InterfaceC3013q interfaceC3013q, C2216as1 c2216as1) {
        this.a = c2988p;
        this.b = executor;
        this.c = executor2;
        this.d = billingClient;
        this.e = interfaceC3013q;
        this.f = c2216as1;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.b.execute(new C5359jh(this, 1, billingResult));
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
    }
}
