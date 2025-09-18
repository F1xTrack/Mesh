package defpackage;

import com.vk.push.core.base.DelayedAction;
import com.vk.push.core.ipc.BaseIPCClient;

/* renamed from: Zf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1984Zf extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ BaseIPCClient f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1984Zf(BaseIPCClient baseIPCClient, int i) {
        super(0);
        this.e = i;
        this.f = baseIPCClient;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                BaseIPCClient baseIPCClient = this.f;
                if (baseIPCClient.k.isEmpty()) {
                    baseIPCClient.g();
                }
                return C1518Tf1.a;
            default:
                return new DelayedAction(null, new C1984Zf(this.f, 0), 1, null);
        }
    }
}
