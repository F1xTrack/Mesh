package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC7293zu;
import p000.C0779MN;
import p000.C8749ad1;

@DoNotInline
@Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, m22267d2 = {"Lio/appmetrica/analytics/impl/pk;", "", "Landroid/content/Context;", "context", "", "Lio/appmetrica/analytics/impl/jk;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, m22268k = 1, m22269mv = {1, 6, 0})
@TargetApi(23)
/* renamed from: io.appmetrica.analytics.impl.pk */
/* loaded from: classes2.dex */
public final class C5379pk {

    /* renamed from: a */
    public static final C5379pk f32404a = new C5379pk();

    private C5379pk() {
    }

    /* renamed from: a */
    public static final List<C5229jk> m20917a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new C8749ad1(7));
        if (list == null) {
            return C0779MN.f7117a;
        }
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer numM20979a = AndroidUtils.isApiAchieved(29) ? C5404qk.m20979a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer numM20980b = AndroidUtils.isApiAchieved(29) ? C5404qk.m20980b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C5229jk(numM20979a, numM20980b, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List m20918a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
