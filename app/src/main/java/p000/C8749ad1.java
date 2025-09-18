package p000;

import android.app.Activity;
import android.telephony.SubscriptionManager;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.google.firebase.datatransport.TransportRegistrar;
import com.p018my.tracker.obfuscated.C2345n0;
import com.p018my.tracker.obfuscated.C2359q2;
import com.p018my.tracker.obfuscated.InterfaceC2302c2;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C5106em;
import io.appmetrica.analytics.impl.C5136g2;
import io.appmetrica.analytics.impl.C5379pk;
import io.appmetrica.analytics.impl.C5457sn;
import io.appmetrica.analytics.impl.C5482tn;
import io.appmetrica.analytics.impl.InterfaceC5265l6;
import io.appmetrica.analytics.impl.InterfaceC5532vn;
import java.util.List;
import org.json.JSONObject;

/* renamed from: ad1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C8749ad1 implements InterfaceC0750Lv, QueueThreadExceptionHandler, FunctionWithThrowable, InterfaceC5265l6, PurchasesUpdatedListener, InterfaceC2302c2, InterfaceC5532vn {

    /* renamed from: a */
    public final /* synthetic */ int f15596a;

    public /* synthetic */ C8749ad1(int i) {
        this.f15596a = i;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2302c2
    /* renamed from: a */
    public Object mo9774a() {
        return C2359q2.m13454d();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public Object apply(Object obj) {
        switch (this.f15596a) {
            case 4:
                return C5106em.m20352b((Activity) obj);
            default:
                return C5379pk.m20918a((SubscriptionManager) obj);
        }
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        switch (this.f15596a) {
            case 0:
                return TransportRegistrar.lambda$getComponents$0(c8128Pr0);
            case 1:
                return TransportRegistrar.lambda$getComponents$1(c8128Pr0);
            default:
                return TransportRegistrar.lambda$getComponents$2(c8128Pr0);
        }
    }

    @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
    public void handleException(Exception exc) {
        throw new RuntimeException(exc);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        C2345n0.m13325a(billingResult, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5532vn
    /* renamed from: a */
    public JSONObject mo9775a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.f15596a) {
            case 9:
                return C5457sn.m21056a(jSONObject, jSONObject2);
            default:
                return C5482tn.m21094a(jSONObject, jSONObject2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5265l6
    /* renamed from: a */
    public boolean mo9776a(Throwable th) {
        return C5136g2.m20405a(th);
    }
}
