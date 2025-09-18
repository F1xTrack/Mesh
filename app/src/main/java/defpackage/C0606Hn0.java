package defpackage;

import com.vk.push.core.network.data.source.MasterHostApi;

/* renamed from: Hn0 */
/* loaded from: classes2.dex */
public final class C0606Hn0 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ MasterHostApi b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0606Hn0(MasterHostApi masterHostApi, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.b = masterHostApi;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objM82getAllExistingHostListIoAF18A = this.b.m82getAllExistingHostListIoAF18A(this);
        return objM82getAllExistingHostListIoAF18A == EnumC1030Mz.a ? objM82getAllExistingHostListIoAF18A : new PS0(objM82getAllExistingHostListIoAF18A);
    }
}
