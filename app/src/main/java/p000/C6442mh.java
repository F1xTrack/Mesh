package p000;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.impl.p022ob.C3505p;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
import java.util.concurrent.Executor;

/* renamed from: mh */
/* loaded from: classes2.dex */
public final class C6442mh implements BillingClientStateListener {

    /* renamed from: a */
    public final C3505p f37828a;

    /* renamed from: b */
    public final Executor f37829b;

    /* renamed from: c */
    public final Executor f37830c;

    /* renamed from: d */
    public final BillingClient f37831d;

    /* renamed from: e */
    public final InterfaceC3531q f37832e;

    /* renamed from: f */
    public final C8779as1 f37833f;

    public C6442mh(C3505p c3505p, Executor executor, Executor executor2, BillingClient billingClient, InterfaceC3531q interfaceC3531q, C8779as1 c8779as1) {
        this.f37828a = c3505p;
        this.f37829b = executor;
        this.f37830c = executor2;
        this.f37831d = billingClient;
        this.f37832e = interfaceC3531q;
        this.f37833f = c8779as1;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f37829b.execute(new C6253jh(this, 1, billingResult));
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
    }
}
