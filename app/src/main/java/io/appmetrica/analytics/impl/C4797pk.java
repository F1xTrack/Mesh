package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import defpackage.AbstractC8449zu;
import defpackage.C2171ad1;
import defpackage.MN;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@DoNotInline
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/impl/pk;", "", "Landroid/content/Context;", "context", "", "Lio/appmetrica/analytics/impl/jk;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 6, 0})
@TargetApi(23)
/* renamed from: io.appmetrica.analytics.impl.pk */
/* loaded from: classes2.dex */
public final class C4797pk {
    public static final C4797pk a = new C4797pk();

    private C4797pk() {
    }

    public static final List<C4653jk> a(Context context) {
        List<SubscriptionInfo> list = (List) SystemServiceUtils.accessSystemServiceByNameSafely(context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new C2171ad1(7));
        if (list == null) {
            return MN.a;
        }
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer numA = AndroidUtils.isApiAchieved(29) ? C4821qk.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer numB = AndroidUtils.isApiAchieved(29) ? C4821qk.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C4653jk(numA, numB, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }

    public static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }
}
