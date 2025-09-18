package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.BaseAnalyticsSender;

/* renamed from: Of, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1126Of extends AbstractC1963Yy {
    public BaseAnalyticsEvent a;
    public /* synthetic */ Object b;
    public final /* synthetic */ BaseAnalyticsSender c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1126Of(BaseAnalyticsSender baseAnalyticsSender, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = baseAnalyticsSender;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
