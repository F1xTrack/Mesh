package p000;

import android.os.IInterface;
import android.os.RemoteException;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.p019vk.push.common.AppInfo;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.ipc.BaseIPCClient;
import com.p019vk.push.core.ipc.IpcRequest;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: bg */
/* loaded from: classes2.dex */
public final class C1800bg extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f17115e;

    /* renamed from: f */
    public final /* synthetic */ Object f17116f;

    /* renamed from: g */
    public final /* synthetic */ Object f17117g;

    /* renamed from: h */
    public final /* synthetic */ Object f17118h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1800bg(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f17115e = i;
        this.f17116f = obj;
        this.f17117g = obj2;
        this.f17118h = obj3;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f17115e) {
            case 0:
                IpcRequest ipcRequest = (IpcRequest) obj;
                O90.m5968f(ipcRequest, "request");
                BaseIPCClient baseIPCClient = (BaseIPCClient) this.f17116f;
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Executing pending request as connection is alive now", null, 2, null);
                try {
                    IpcRequest.execute$default(ipcRequest, (IInterface) this.f17117g, (AppInfo) this.f17118h, null, 4, null);
                } catch (RemoteException e) {
                    baseIPCClient.getLogger().error("Could not execute request", e);
                    ipcRequest.onError(e);
                }
                break;
            case 1:
                WritableMap writableMap = (WritableMap) obj;
                O90.m5968f(writableMap, "$this$dispatch");
                WritableMap writableMapCreateMap = Arguments.createMap();
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                Exception exc = (Exception) this.f17116f;
                exc.printStackTrace(printWriter);
                String string = stringWriter.toString();
                O90.m5967e(string, "toString(...)");
                writableMapCreateMap.putString("errorString", (String) this.f17117g);
                writableMapCreateMap.putString("errorException", exc.toString());
                writableMapCreateMap.putString("errorCode", (String) this.f17118h);
                writableMapCreateMap.putString("errorStackTrace", string);
                writableMap.putMap("error", writableMapCreateMap);
                break;
            default:
                K81 k81 = (K81) obj;
                O90.m5968f(k81, "$this$create");
                AbstractC9366fP1.m18230b((C1068Qy) this.f17116f, null, new C7563Eu1(k81, null, (C8187Qu1) this.f17117g, (T71) this.f17118h), 3);
                break;
        }
        return C8313Tf1.f11463a;
    }
}
