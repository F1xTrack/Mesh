package defpackage;

import com.vk.push.core.network.data.source.MasterHostApi;

/* renamed from: Ln0 */
/* loaded from: classes2.dex */
public final class C0918Ln0 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ MasterHostApi b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0918Ln0(MasterHostApi masterHostApi, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.b = masterHostApi;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objM84getMastergIAlus = this.b.m84getMastergIAlus(null, this);
        return objM84getMastergIAlus == EnumC1030Mz.a ? objM84getMastergIAlus : new PS0(objM84getMastergIAlus);
    }
}
