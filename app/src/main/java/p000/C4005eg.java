package p000;

import com.p019vk.push.core.ipc.BaseIPCClient;

/* renamed from: eg */
/* loaded from: classes2.dex */
public final class C4005eg extends AbstractC1571Yy {

    /* renamed from: a */
    public BaseIPCClient f26798a;

    /* renamed from: b */
    public InterfaceC6497nZ f26799b;

    /* renamed from: c */
    public /* synthetic */ Object f26800c;

    /* renamed from: d */
    public final /* synthetic */ BaseIPCClient f26801d;

    /* renamed from: e */
    public int f26802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4005eg(BaseIPCClient baseIPCClient, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f26801d = baseIPCClient;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f26800c = obj;
        this.f26802e |= Integer.MIN_VALUE;
        return this.f26801d.makeSimpleRequest(null, null, null, null, this);
    }
}
