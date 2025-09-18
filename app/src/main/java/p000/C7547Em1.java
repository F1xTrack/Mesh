package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.BuildConfig;
import java.util.Map;

/* renamed from: Em1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7547Em1 extends Y02 {

    /* renamed from: a */
    public final /* synthetic */ int f2898a;

    /* renamed from: b */
    public final /* synthetic */ WebSocketModule f2899b;

    public C7547Em1(WebSocketModule webSocketModule, int i) {
        this.f2899b = webSocketModule;
        this.f2898a = i;
    }

    @Override // p000.Y02
    /* renamed from: d */
    public final void mo2415d(int i, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, this.f2898a);
        writableMapCreateMap.putInt("code", i);
        writableMapCreateMap.putString("reason", str);
        this.f2899b.sendEvent("websocketClosed", writableMapCreateMap);
    }

    @Override // p000.Y02
    /* renamed from: e */
    public final void mo2416e(MN0 mn0, int i, String str) {
        mn0.m5350b(i, str);
    }

    @Override // p000.Y02
    /* renamed from: f */
    public final void mo2417f(Exception exc) {
        this.f2899b.notifyWebSocketFailed(this.f2898a, exc.getMessage());
    }

    @Override // p000.Y02
    /* renamed from: g */
    public final void mo2418g(MN0 mn0, C0551Ik c0551Ik) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i = this.f2898a;
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, i);
        writableMapCreateMap.putString("type", BuildConfig.SDK_DEPENDENCY);
        WebSocketModule webSocketModule = this.f2899b;
        InterfaceC7599Fm1 interfaceC7599Fm1 = (InterfaceC7599Fm1) webSocketModule.mContentHandlers.get(Integer.valueOf(i));
        if (interfaceC7599Fm1 != null) {
            byte[] bArrMo3990j = c0551Ik.mo3990j();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("blobId", ((C7155xi) interfaceC7599Fm1).f45745a.store(bArrMo3990j));
            writableMapCreateMap2.putInt("offset", 0);
            writableMapCreateMap2.putInt("size", bArrMo3990j.length);
            writableMapCreateMap.putMap("data", writableMapCreateMap2);
            writableMapCreateMap.putString("type", "blob");
        } else {
            writableMapCreateMap.putString("data", c0551Ik.mo3981a());
        }
        webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
    }

    @Override // p000.Y02
    /* renamed from: h */
    public final void mo2419h(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i = this.f2898a;
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, i);
        writableMapCreateMap.putString("type", "text");
        WebSocketModule webSocketModule = this.f2899b;
        if (((InterfaceC7599Fm1) webSocketModule.mContentHandlers.get(Integer.valueOf(i))) != null) {
            writableMapCreateMap.putString("data", str);
        } else {
            writableMapCreateMap.putString("data", str);
        }
        webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
    }

    @Override // p000.Y02
    /* renamed from: i */
    public final void mo2420i(InterfaceC7443Cm1 interfaceC7443Cm1, HS0 hs0) {
        WebSocketModule webSocketModule = this.f2899b;
        Map map = webSocketModule.mWebSocketConnections;
        int i = this.f2898a;
        map.put(Integer.valueOf(i), interfaceC7443Cm1);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, i);
        String strM4524b = hs0.f4300f.m4524b("Sec-WebSocket-Protocol");
        if (strM4524b == null) {
            strM4524b = "";
        }
        writableMapCreateMap.putString("protocol", strM4524b);
        webSocketModule.sendEvent("websocketOpen", writableMapCreateMap);
    }
}
