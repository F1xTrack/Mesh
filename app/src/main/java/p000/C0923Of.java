package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.BaseAnalyticsSender;

/* renamed from: Of */
/* loaded from: classes2.dex */
public final class C0923Of extends AbstractC1571Yy {

    /* renamed from: a */
    public BaseAnalyticsEvent f8555a;

    /* renamed from: b */
    public /* synthetic */ Object f8556b;

    /* renamed from: c */
    public final /* synthetic */ BaseAnalyticsSender f8557c;

    /* renamed from: d */
    public int f8558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0923Of(BaseAnalyticsSender baseAnalyticsSender, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f8557c = baseAnalyticsSender;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f8556b = obj;
        this.f8558d |= Integer.MIN_VALUE;
        return this.f8557c.m13734a(null, this);
    }
}
