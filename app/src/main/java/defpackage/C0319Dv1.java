package defpackage;

import com.vk.push.core.domain.model.CallingAppIds;

/* renamed from: Dv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0319Dv1 extends AbstractC1963Yy {
    public CallingAppIds a;
    public C2407bs1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C2407bs1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0319Dv1(C2407bs1 c2407bs1, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy);
        this.d = c2407bs1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objB = this.d.b(null, this);
        return objB == EnumC1030Mz.a ? objB : new PS0(objB);
    }
}
