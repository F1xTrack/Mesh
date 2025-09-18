package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.BaseAnalyticsSender;

/* renamed from: Nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1048Nf extends AbstractC1963Yy {
    public BaseAnalyticsSender a;
    public BaseAnalyticsEvent b;
    public /* synthetic */ Object c;
    public final /* synthetic */ BaseAnalyticsSender d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048Nf(BaseAnalyticsSender baseAnalyticsSender, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.d = baseAnalyticsSender;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return BaseAnalyticsSender.access$handleEvent(this.d, null, this);
    }
}
