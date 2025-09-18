package p000;

import com.p019vk.push.core.ipc.BaseIPCClient;

/* renamed from: cg */
/* loaded from: classes2.dex */
public final class C1862cg extends AbstractC1571Yy {

    /* renamed from: a */
    public BaseIPCClient f17677a;

    /* renamed from: b */
    public InterfaceC6497nZ f17678b;

    /* renamed from: c */
    public /* synthetic */ Object f17679c;

    /* renamed from: d */
    public final /* synthetic */ BaseIPCClient f17680d;

    /* renamed from: e */
    public int f17681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1862cg(BaseIPCClient baseIPCClient, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f17680d = baseIPCClient;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f17679c = obj;
        this.f17681e |= Integer.MIN_VALUE;
        return this.f17680d.makeAsyncRequest(null, null, null, null, null, 0L, this);
    }
}
