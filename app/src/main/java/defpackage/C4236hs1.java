package defpackage;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.impl.ob.C2988p;
import java.util.concurrent.Executor;

/* renamed from: hs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4236hs1 extends AbstractRunnableC8024xf {
    public final /* synthetic */ C2988p b;
    public final /* synthetic */ HT c;

    public C4236hs1(HT ht, C2988p c2988p) {
        super(1);
        this.c = ht;
        this.b = c2988p;
    }

    @Override // defpackage.AbstractRunnableC8024xf
    public final void a() {
        BillingClient billingClientBuild = BillingClient.newBuilder((Context) this.c.a).setListener(new C0396Ev0(19)).enablePendingPurchases().build();
        HT ht = this.c;
        billingClientBuild.startConnection(new C5932mh(this.b, (Executor) ht.b, (Executor) ht.c, billingClientBuild, ht, new C2216as1(billingClientBuild)));
    }
}
