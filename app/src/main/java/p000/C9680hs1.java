package p000;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.impl.p022ob.C3505p;
import java.util.concurrent.Executor;

/* renamed from: hs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9680hs1 extends AbstractRunnableC7152xf {

    /* renamed from: b */
    public final /* synthetic */ C3505p f28646b;

    /* renamed from: c */
    public final /* synthetic */ C0471HT f28647c;

    public C9680hs1(C0471HT c0471ht, C3505p c3505p) {
        super(1);
        this.f28647c = c0471ht;
        this.f28646b = c3505p;
    }

    @Override // p000.AbstractRunnableC7152xf
    /* renamed from: a */
    public final void mo18884a() {
        BillingClient billingClientBuild = BillingClient.newBuilder((Context) this.f28647c.f4309a).setListener(new C7564Ev0(19)).enablePendingPurchases().build();
        C0471HT c0471ht = this.f28647c;
        billingClientBuild.startConnection(new C6442mh(this.f28646b, (Executor) c0471ht.f4310b, (Executor) c0471ht.f4311c, billingClientBuild, c0471ht, new C8779as1(billingClientBuild)));
    }
}
