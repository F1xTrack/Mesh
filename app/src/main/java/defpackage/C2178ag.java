package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.BindingDiedException;
import com.vk.push.core.ipc.IpcRequest;

/* renamed from: ag, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2178ag extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ BaseIPCClient f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2178ag(BaseIPCClient baseIPCClient, int i) {
        super(1);
        this.e = i;
        this.f = baseIPCClient;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                IpcRequest ipcRequest = (IpcRequest) obj;
                O90.f(ipcRequest, "it");
                this.f.k.remove(ipcRequest);
                break;
            default:
                IpcRequest ipcRequest2 = (IpcRequest) obj;
                O90.f(ipcRequest2, "request");
                Logger.DefaultImpls.info$default(this.f.getLogger(), "Notify caller about failed request due to binding death", null, 2, null);
                ipcRequest2.onError(new BindingDiedException());
                break;
        }
        return C1518Tf1.a;
    }
}
