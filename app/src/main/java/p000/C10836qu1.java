package p000;

import com.p019vk.push.common.messaging.RemoteMessage;

/* renamed from: qu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10836qu1 extends AbstractC1571Yy {

    /* renamed from: a */
    public C11730xu1 f41245a;

    /* renamed from: b */
    public RemoteMessage f41246b;

    /* renamed from: c */
    public /* synthetic */ Object f41247c;

    /* renamed from: d */
    public final /* synthetic */ C11730xu1 f41248d;

    /* renamed from: e */
    public int f41249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10836qu1(C11730xu1 c11730xu1, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f41248d = c11730xu1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f41247c = obj;
        this.f41249e |= Integer.MIN_VALUE;
        return this.f41248d.m26000b(null, this);
    }
}
