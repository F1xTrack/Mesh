package defpackage;

import com.vk.push.core.ipc.BaseIPCClient;

/* renamed from: cg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2559cg extends AbstractC1963Yy {
    public BaseIPCClient a;
    public InterfaceC6099nZ b;
    public /* synthetic */ Object c;
    public final /* synthetic */ BaseIPCClient d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2559cg(BaseIPCClient baseIPCClient, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.d = baseIPCClient;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.makeAsyncRequest(null, null, null, null, null, 0L, this);
    }
}
