package defpackage;

import com.vk.push.common.analytics.AnalyticsSender;

/* renamed from: wq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7869wq1 extends AbstractC1963Yy {
    public AnalyticsSender a;
    public String b;
    public Object c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C0070Aq1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7869wq1(C0070Aq1 c0070Aq1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.f = c0070Aq1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, null, this);
    }
}
