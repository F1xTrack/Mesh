package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.ipc.BaseIPCClient;
import com.p019vk.push.core.ipc.BindingDiedException;
import com.p019vk.push.core.ipc.IpcRequest;

/* renamed from: ag */
/* loaded from: classes2.dex */
public final class C1679ag extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f15610e;

    /* renamed from: f */
    public final /* synthetic */ BaseIPCClient f15611f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1679ag(BaseIPCClient baseIPCClient, int i) {
        super(1);
        this.f15610e = i;
        this.f15611f = baseIPCClient;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f15610e) {
            case 0:
                IpcRequest ipcRequest = (IpcRequest) obj;
                O90.m5968f(ipcRequest, "it");
                this.f15611f.f20448k.remove(ipcRequest);
                break;
            default:
                IpcRequest ipcRequest2 = (IpcRequest) obj;
                O90.m5968f(ipcRequest2, "request");
                Logger.DefaultImpls.info$default(this.f15611f.getLogger(), "Notify caller about failed request due to binding death", null, 2, null);
                ipcRequest2.onError(new BindingDiedException());
                break;
        }
        return C8313Tf1.f11463a;
    }
}
