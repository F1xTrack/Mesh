package p000;

import com.p019vk.push.common.messaging.NotificationAnalyticsPayload;

/* renamed from: av1 */
/* loaded from: classes2.dex */
public final class C8785av1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C10454nv1 f16675a;

    /* renamed from: b */
    public String f16676b;

    /* renamed from: c */
    public NotificationAnalyticsPayload f16677c;

    /* renamed from: d */
    public /* synthetic */ Object f16678d;

    /* renamed from: e */
    public final /* synthetic */ C10454nv1 f16679e;

    /* renamed from: f */
    public int f16680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8785av1(C10454nv1 c10454nv1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f16679e = c10454nv1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f16678d = obj;
        this.f16680f |= Integer.MIN_VALUE;
        return C10454nv1.m23280a(this.f16679e, null, null, this);
    }
}
