package p000;

import com.p019vk.push.core.domain.model.CallingAppIds;

/* renamed from: Dv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7513Dv1 extends AbstractC1571Yy {

    /* renamed from: a */
    public CallingAppIds f2306a;

    /* renamed from: b */
    public C8907bs1 f2307b;

    /* renamed from: c */
    public /* synthetic */ Object f2308c;

    /* renamed from: d */
    public final /* synthetic */ C8907bs1 f2309d;

    /* renamed from: e */
    public int f2310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7513Dv1(C8907bs1 c8907bs1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f2309d = c8907bs1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f2308c = obj;
        this.f2310e |= Integer.MIN_VALUE;
        Object objM10534b = this.f2309d.m10534b(null, this);
        return objM10534b == EnumC0817Mz.f7418a ? objM10534b : new PS0(objM10534b);
    }
}
