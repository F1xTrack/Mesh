package defpackage;

import android.app.Activity;
import android.telephony.SubscriptionManager;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.google.firebase.datatransport.TransportRegistrar;
import com.my.tracker.obfuscated.c2;
import com.my.tracker.obfuscated.n0;
import com.my.tracker.obfuscated.q2;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C4536em;
import io.appmetrica.analytics.impl.C4564g2;
import io.appmetrica.analytics.impl.C4797pk;
import io.appmetrica.analytics.impl.InterfaceC4687l6;
import io.appmetrica.analytics.impl.sn;
import io.appmetrica.analytics.impl.tn;
import io.appmetrica.analytics.impl.vn;
import java.util.List;
import org.json.JSONObject;

/* renamed from: ad1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2171ad1 implements InterfaceC0940Lv, QueueThreadExceptionHandler, FunctionWithThrowable, InterfaceC4687l6, PurchasesUpdatedListener, c2, vn {
    public final /* synthetic */ int a;

    public /* synthetic */ C2171ad1(int i) {
        this.a = i;
    }

    @Override // com.my.tracker.obfuscated.c2
    public Object a() {
        return q2.d();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                return C4536em.b((Activity) obj);
            default:
                return C4797pk.a((SubscriptionManager) obj);
        }
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        switch (this.a) {
            case 0:
                return TransportRegistrar.lambda$getComponents$0(c1241Pr0);
            case 1:
                return TransportRegistrar.lambda$getComponents$1(c1241Pr0);
            default:
                return TransportRegistrar.lambda$getComponents$2(c1241Pr0);
        }
    }

    @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
    public void handleException(Exception exc) {
        throw new RuntimeException(exc);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        n0.a(billingResult, list);
    }

    @Override // io.appmetrica.analytics.impl.vn
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.a) {
            case 9:
                return sn.a(jSONObject, jSONObject2);
            default:
                return tn.a(jSONObject, jSONObject2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4687l6
    public boolean a(Throwable th) {
        return C4564g2.a(th);
    }
}
