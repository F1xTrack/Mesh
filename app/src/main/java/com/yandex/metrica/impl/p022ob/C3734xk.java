package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.SubscriptionInfo;
import com.yandex.metrica.DoNotInline;
import kotlin.Metadata;

@Metadata(m22265bv = {1, 0, 3}, m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, m22267d2 = {"Lcom/yandex/metrica/impl/ob/xk;", "", "Landroid/telephony/SubscriptionInfo;", "subscriptionInfo", "", "a", "(Landroid/telephony/SubscriptionInfo;)Ljava/lang/Integer;", "b", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, m22268k = 1, m22269mv = {1, 1, 15})
@TargetApi(29)
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.xk */
/* loaded from: classes2.dex */
public final class C3734xk {

    /* renamed from: a */
    public static final C3734xk f25257a = new C3734xk();

    private C3734xk() {
    }

    /* renamed from: a */
    public static final Integer m17193a(SubscriptionInfo subscriptionInfo) {
        return C3323i.m16071b(subscriptionInfo.getMccString());
    }

    /* renamed from: b */
    public static final Integer m17194b(SubscriptionInfo subscriptionInfo) {
        return C3323i.m16071b(subscriptionInfo.getMncString());
    }
}
