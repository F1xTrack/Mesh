package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.IpcRequest;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2369bg extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2369bg(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                IpcRequest ipcRequest = (IpcRequest) obj;
                O90.f(ipcRequest, "request");
                BaseIPCClient baseIPCClient = (BaseIPCClient) this.f;
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Executing pending request as connection is alive now", null, 2, null);
                try {
                    IpcRequest.execute$default(ipcRequest, (IInterface) this.g, (AppInfo) this.h, null, 4, null);
                } catch (RemoteException e) {
                    baseIPCClient.getLogger().error("Could not execute request", e);
                    ipcRequest.onError(e);
                }
                break;
            case 1:
                WritableMap writableMap = (WritableMap) obj;
                O90.f(writableMap, "$this$dispatch");
                WritableMap writableMapCreateMap = Arguments.createMap();
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                Exception exc = (Exception) this.f;
                exc.printStackTrace(printWriter);
                String string = stringWriter.toString();
                O90.e(string, "toString(...)");
                writableMapCreateMap.putString("errorString", (String) this.g);
                writableMapCreateMap.putString("errorException", exc.toString());
                writableMapCreateMap.putString("errorCode", (String) this.h);
                writableMapCreateMap.putString("errorStackTrace", string);
                writableMap.putMap("error", writableMapCreateMap);
                break;
            default:
                K81 k81 = (K81) obj;
                O90.f(k81, "$this$create");
                AbstractC3767fP1.b((C1339Qy) this.f, null, new C0394Eu1(k81, null, (C1329Qu1) this.g, (T71) this.h), 3);
                break;
        }
        return C1518Tf1.a;
    }
}
