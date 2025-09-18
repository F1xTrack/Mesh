package p000;

import com.p019vk.push.core.base.DelayedAction;
import com.p019vk.push.core.ipc.BaseIPCClient;

/* renamed from: Zf */
/* loaded from: classes2.dex */
public final class C1615Zf extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f15080e;

    /* renamed from: f */
    public final /* synthetic */ BaseIPCClient f15081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1615Zf(BaseIPCClient baseIPCClient, int i) {
        super(0);
        this.f15080e = i;
        this.f15081f = baseIPCClient;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f15080e) {
            case 0:
                BaseIPCClient baseIPCClient = this.f15081f;
                if (baseIPCClient.f20448k.isEmpty()) {
                    baseIPCClient.m13749g();
                }
                return C8313Tf1.f11463a;
            default:
                return new DelayedAction(null, new C1615Zf(this.f15081f, 0), 1, null);
        }
    }
}
