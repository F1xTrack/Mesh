package defpackage;

import com.vk.push.common.messaging.NotificationAnalyticsPayload;
import com.vk.push.common.messaging.NotificationPayload;
import kotlin.Pair;

/* renamed from: dt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3475dt1 extends AbstractC1963Yy {
    public U41 a;
    public NotificationPayload b;
    public Pair c;
    public NotificationAnalyticsPayload d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ U41 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3475dt1(U41 u41, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.g = u41;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(null, 0, null, null, this);
    }
}
