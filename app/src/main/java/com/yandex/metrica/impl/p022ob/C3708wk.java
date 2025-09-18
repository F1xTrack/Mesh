package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.yandex.metrica.DoNotInline;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC7293zu;
import p000.C0779MN;

@Metadata(m22265bv = {1, 0, 3}, m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m22267d2 = {"Lcom/yandex/metrica/impl/ob/wk;", "", "Landroid/content/Context;", "context", "", "Lcom/yandex/metrica/impl/ob/uk;", "a", "(Landroid/content/Context;)Ljava/util/List;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, m22268k = 1, m22269mv = {1, 1, 15})
@TargetApi(23)
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.wk */
/* loaded from: classes2.dex */
public final class C3708wk {

    /* renamed from: a */
    public static final C3708wk f25206a = new C3708wk();

    /* renamed from: com.yandex.metrica.impl.ob.wk$a */
    public static final class a<T, R> implements InterfaceC3038Wm<SubscriptionManager, List<? extends SubscriptionInfo>> {

        /* renamed from: a */
        public static final a f25207a = new a();

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3038Wm
        /* renamed from: a */
        public List<? extends SubscriptionInfo> mo14148a(SubscriptionManager subscriptionManager) {
            return subscriptionManager.getActiveSubscriptionInfoList();
        }
    }

    private C3708wk() {
    }

    /* renamed from: a */
    public static final List<C3656uk> m17149a(Context context) {
        List<SubscriptionInfo> list = (List) C2968U2.m15228a(a.f25207a, context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager");
        if (list == null) {
            return C0779MN.f7117a;
        }
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer numM17193a = C2968U2.m15243a(29) ? C3734xk.m17193a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer numM17194b = C2968U2.m15243a(29) ? C3734xk.m17194b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C3656uk(numM17193a, numM17194b, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }
}
