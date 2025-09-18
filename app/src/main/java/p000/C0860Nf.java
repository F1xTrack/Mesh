package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.BaseAnalyticsSender;

/* renamed from: Nf */
/* loaded from: classes2.dex */
public final class C0860Nf extends AbstractC1571Yy {

    /* renamed from: a */
    public BaseAnalyticsSender f7942a;

    /* renamed from: b */
    public BaseAnalyticsEvent f7943b;

    /* renamed from: c */
    public /* synthetic */ Object f7944c;

    /* renamed from: d */
    public final /* synthetic */ BaseAnalyticsSender f7945d;

    /* renamed from: e */
    public int f7946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0860Nf(BaseAnalyticsSender baseAnalyticsSender, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f7945d = baseAnalyticsSender;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f7944c = obj;
        this.f7946e |= Integer.MIN_VALUE;
        return BaseAnalyticsSender.access$handleEvent(this.f7945d, null, this);
    }
}
