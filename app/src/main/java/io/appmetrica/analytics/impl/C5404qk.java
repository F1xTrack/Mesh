package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.telephony.SubscriptionInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import kotlin.Metadata;

@DoNotInline
@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, m22267d2 = {"Lio/appmetrica/analytics/impl/qk;", "", "Landroid/telephony/SubscriptionInfo;", "subscriptionInfo", "", "a", "(Landroid/telephony/SubscriptionInfo;)Ljava/lang/Integer;", "b", "<init>", "()V", "analytics_binaryProdRelease"}, m22268k = 1, m22269mv = {1, 6, 0})
@TargetApi(29)
/* renamed from: io.appmetrica.analytics.impl.qk */
/* loaded from: classes2.dex */
public final class C5404qk {

    /* renamed from: a */
    public static final C5404qk f32469a = new C5404qk();

    private C5404qk() {
    }

    /* renamed from: a */
    public static final Integer m20979a(SubscriptionInfo subscriptionInfo) {
        return ParseUtils.intValueOf(subscriptionInfo.getMccString());
    }

    /* renamed from: b */
    public static final Integer m20980b(SubscriptionInfo subscriptionInfo) {
        return ParseUtils.intValueOf(subscriptionInfo.getMncString());
    }
}
