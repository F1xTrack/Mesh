package defpackage;

import com.vk.push.common.messaging.NotificationAnalyticsPayload;

/* renamed from: av1 */
/* loaded from: classes2.dex */
public final class C2225av1 extends AbstractC1963Yy {
    public C6167nv1 a;
    public String b;
    public NotificationAnalyticsPayload c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C6167nv1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2225av1(C6167nv1 c6167nv1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.e = c6167nv1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return C6167nv1.a(this.e, null, null, this);
    }
}
