package defpackage;

import com.vk.push.common.analytics.AnalyticsSender;

/* renamed from: wv1 */
/* loaded from: classes2.dex */
public final class C7884wv1 extends AbstractC1963Yy {
    public C0781Jt1 a;
    public AnalyticsSender b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0781Jt1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7884wv1(C0781Jt1 c0781Jt1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c0781Jt1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C0781Jt1.b(this.d, this);
    }
}
