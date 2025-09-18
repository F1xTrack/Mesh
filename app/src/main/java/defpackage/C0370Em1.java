package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.websocket.WebSocketModule;
import io.appmetrica.analytics.BuildConfig;
import java.util.Map;

/* renamed from: Em1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370Em1 extends Y02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebSocketModule b;

    public C0370Em1(WebSocketModule webSocketModule, int i) {
        this.b = webSocketModule;
        this.a = i;
    }

    @Override // defpackage.Y02
    public final void d(int i, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.ID, this.a);
        writableMapCreateMap.putInt("code", i);
        writableMapCreateMap.putString("reason", str);
        this.b.sendEvent("websocketClosed", writableMapCreateMap);
    }

    @Override // defpackage.Y02
    public final void e(MN0 mn0, int i, String str) {
        mn0.b(i, str);
    }

    @Override // defpackage.Y02
    public final void f(Exception exc) {
        this.b.notifyWebSocketFailed(this.a, exc.getMessage());
    }

    @Override // defpackage.Y02
    public final void g(MN0 mn0, C0674Ik c0674Ik) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i = this.a;
        writableMapCreateMap.putInt(NotificationConstants.ID, i);
        writableMapCreateMap.putString("type", BuildConfig.SDK_DEPENDENCY);
        WebSocketModule webSocketModule = this.b;
        InterfaceC0448Fm1 interfaceC0448Fm1 = (InterfaceC0448Fm1) webSocketModule.mContentHandlers.get(Integer.valueOf(i));
        if (interfaceC0448Fm1 != null) {
            byte[] bArrJ = c0674Ik.j();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("blobId", ((C8033xi) interfaceC0448Fm1).a.store(bArrJ));
            writableMapCreateMap2.putInt("offset", 0);
            writableMapCreateMap2.putInt("size", bArrJ.length);
            writableMapCreateMap.putMap("data", writableMapCreateMap2);
            writableMapCreateMap.putString("type", "blob");
        } else {
            writableMapCreateMap.putString("data", c0674Ik.a());
        }
        webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
    }

    @Override // defpackage.Y02
    public final void h(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i = this.a;
        writableMapCreateMap.putInt(NotificationConstants.ID, i);
        writableMapCreateMap.putString("type", "text");
        WebSocketModule webSocketModule = this.b;
        if (((InterfaceC0448Fm1) webSocketModule.mContentHandlers.get(Integer.valueOf(i))) != null) {
            writableMapCreateMap.putString("data", str);
        } else {
            writableMapCreateMap.putString("data", str);
        }
        webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
    }

    @Override // defpackage.Y02
    public final void i(InterfaceC0214Cm1 interfaceC0214Cm1, HS0 hs0) {
        WebSocketModule webSocketModule = this.b;
        Map map = webSocketModule.mWebSocketConnections;
        int i = this.a;
        map.put(Integer.valueOf(i), interfaceC0214Cm1);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.ID, i);
        String strB = hs0.f.b("Sec-WebSocket-Protocol");
        if (strB == null) {
            strB = "";
        }
        writableMapCreateMap.putString("protocol", strB);
        webSocketModule.sendEvent("websocketOpen", writableMapCreateMap);
    }
}
