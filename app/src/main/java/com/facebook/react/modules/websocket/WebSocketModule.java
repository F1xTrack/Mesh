package com.facebook.react.modules.websocket;

import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.C0551Ik;
import p000.C10457nx0;
import p000.C10585ox0;
import p000.C1210TE;
import p000.C6937uF;
import p000.C7018vX;
import p000.C7547Em1;
import p000.InterfaceC0327FB;
import p000.InterfaceC7443Cm1;
import p000.InterfaceC7599Fm1;
import p000.InterfaceC9101dL0;
import p000.MN0;
import p000.O90;

@InterfaceC9101dL0(name = NativeWebSocketModuleSpec.NAME)
/* loaded from: classes.dex */
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    private static InterfaceC0327FB customClientBuilder;
    private final Map<Integer, InterfaceC7599Fm1> mContentHandlers;
    private C7018vX mCookieHandler;
    private final Map<Integer, InterfaceC7443Cm1> mWebSocketConnections;

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new C7018vX();
    }

    private String getCookie(String str) {
        try {
            List list = (List) this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return (String) list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException(AbstractC7222ym.m26245v("Unable to get cookie from ", str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getDefaultOrigin(java.lang.String r10) {
        /*
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> Lad
            r0.<init>(r10)     // Catch: java.net.URISyntaxException -> Lad
            java.lang.String r1 = r0.getScheme()     // Catch: java.net.URISyntaxException -> Lad
            int r2 = r1.hashCode()     // Catch: java.net.URISyntaxException -> Lad
            r3 = 3804(0xedc, float:5.33E-42)
            r4 = 1
            r5 = 2
            java.lang.String r6 = "http"
            r7 = 3
            java.lang.String r8 = "https"
            r9 = -1
            if (r2 == r3) goto L43
            r3 = 118039(0x1cd17, float:1.65408E-40)
            if (r2 == r3) goto L39
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r3) goto L31
            r3 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r3) goto L29
            goto L4d
        L29:
            boolean r1 = r1.equals(r8)     // Catch: java.net.URISyntaxException -> Lad
            if (r1 == 0) goto L4d
            r1 = r7
            goto L4e
        L31:
            boolean r1 = r1.equals(r6)     // Catch: java.net.URISyntaxException -> Lad
            if (r1 == 0) goto L4d
            r1 = r5
            goto L4e
        L39:
            java.lang.String r2 = "wss"
            boolean r1 = r1.equals(r2)     // Catch: java.net.URISyntaxException -> Lad
            if (r1 == 0) goto L4d
            r1 = 0
            goto L4e
        L43:
            java.lang.String r2 = "ws"
            boolean r1 = r1.equals(r2)     // Catch: java.net.URISyntaxException -> Lad
            if (r1 == 0) goto L4d
            r1 = r4
            goto L4e
        L4d:
            r1 = r9
        L4e:
            if (r1 == 0) goto L6a
            if (r1 == r4) goto L6b
            java.lang.String r6 = ""
            if (r1 == r5) goto L59
            if (r1 == r7) goto L59
            goto L6b
        L59:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> Lad
            r1.<init>(r6)     // Catch: java.net.URISyntaxException -> Lad
            java.lang.String r2 = r0.getScheme()     // Catch: java.net.URISyntaxException -> Lad
            r1.append(r2)     // Catch: java.net.URISyntaxException -> Lad
            java.lang.String r6 = r1.toString()     // Catch: java.net.URISyntaxException -> Lad
            goto L6b
        L6a:
            r6 = r8
        L6b:
            int r1 = r0.getPort()     // Catch: java.net.URISyntaxException -> Lad
            java.lang.String r2 = "://"
            if (r1 == r9) goto L96
            java.lang.String r1 = r0.getHost()     // Catch: java.net.URISyntaxException -> Lad
            int r0 = r0.getPort()     // Catch: java.net.URISyntaxException -> Lad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> Lad
            r3.<init>()     // Catch: java.net.URISyntaxException -> Lad
            r3.append(r6)     // Catch: java.net.URISyntaxException -> Lad
            r3.append(r2)     // Catch: java.net.URISyntaxException -> Lad
            r3.append(r1)     // Catch: java.net.URISyntaxException -> Lad
            java.lang.String r1 = ":"
            r3.append(r1)     // Catch: java.net.URISyntaxException -> Lad
            r3.append(r0)     // Catch: java.net.URISyntaxException -> Lad
            java.lang.String r10 = r3.toString()     // Catch: java.net.URISyntaxException -> Lad
            goto Lac
        L96:
            java.lang.String r0 = r0.getHost()     // Catch: java.net.URISyntaxException -> Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> Lad
            r1.<init>()     // Catch: java.net.URISyntaxException -> Lad
            r1.append(r6)     // Catch: java.net.URISyntaxException -> Lad
            r1.append(r2)     // Catch: java.net.URISyntaxException -> Lad
            r1.append(r0)     // Catch: java.net.URISyntaxException -> Lad
            java.lang.String r10 = r1.toString()     // Catch: java.net.URISyntaxException -> Lad
        Lac:
            return r10
        Lad:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to set "
            java.lang.String r2 = " as default origin header"
            java.lang.String r10 = p000.AbstractC7222ym.m26234k(r1, r10, r2)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.getDefaultOrigin(java.lang.String):java.lang.String");
    }

    public void notifyWebSocketFailed(int i, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, i);
        writableMapCreateMap.putString("message", str);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, writableMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d, String str, double d2) {
        int i = (int) d2;
        InterfaceC7443Cm1 interfaceC7443Cm1 = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (interfaceC7443Cm1 == null) {
            return;
        }
        try {
            ((MN0) interfaceC7443Cm1).m5350b((int) d, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
        } catch (Exception unused) {
            AbstractC3929dS.m17675h("ReactNative");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d) {
        boolean z;
        int i = (int) d;
        C10457nx0 c10457nx0 = new C10457nx0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c10457nx0.m23286a(10L, timeUnit);
        c10457nx0.m23289d(10L, timeUnit);
        c10457nx0.m23287b(0L, TimeUnit.MINUTES);
        applyCustomBuilder(c10457nx0);
        C10585ox0 c10585ox0 = new C10585ox0(c10457nx0);
        C6937uF c6937uF = new C6937uF(9, false);
        c6937uF.m25135F(Integer.valueOf(i));
        c6937uF.m25136G(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            c6937uF.m25139k("Cookie", cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(strNextKey))) {
                    if (strNextKey.equalsIgnoreCase("origin")) {
                        z = true;
                    }
                    c6937uF.m25139k(strNextKey, map.getString(strNextKey));
                } else {
                    AbstractC3929dS.m17683p("ReactNative");
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            c6937uF.m25139k("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                String strTrim = readableArray.getString(i2).trim();
                if (!strTrim.isEmpty() && !strTrim.contains(StringUtils.COMMA)) {
                    sb.append(strTrim);
                    sb.append(StringUtils.COMMA);
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                c6937uF.m25139k("Sec-WebSocket-Protocol", sb.toString());
            }
        }
        c10585ox0.m23581c(c6937uF.m25141o(), new C7547Em1(this, i));
        ((ThreadPoolExecutor) c10585ox0.f39371a.m24421t()).shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<InterfaceC7443Cm1> it = this.mWebSocketConnections.values().iterator();
        while (it.hasNext()) {
            ((MN0) it.next()).m5350b(1001, null);
        }
        this.mWebSocketConnections.clear();
        this.mContentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d) {
        int i = (int) d;
        InterfaceC7443Cm1 interfaceC7443Cm1 = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (interfaceC7443Cm1 != null) {
            try {
                C0551Ik c0551Ik = C0551Ik.f5116d;
                O90.m5968f(c0551Ik, "bytes");
                ((MN0) interfaceC7443Cm1).m5357i(c0551Ik, 2);
                return;
            } catch (Exception e) {
                notifyWebSocketFailed(i, e.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, i);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt(NotificationConstants.f19487ID, i);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d) {
        int i = (int) d;
        InterfaceC7443Cm1 interfaceC7443Cm1 = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (interfaceC7443Cm1 != null) {
            try {
                O90.m5968f(str, "text");
                C0551Ik c0551Ik = C0551Ik.f5116d;
                ((MN0) interfaceC7443Cm1).m5357i(C1210TE.m7631D(str), 1);
                return;
            } catch (Exception e) {
                notifyWebSocketFailed(i, e.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, i);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt(NotificationConstants.f19487ID, i);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d) {
        int i = (int) d;
        InterfaceC7443Cm1 interfaceC7443Cm1 = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (interfaceC7443Cm1 != null) {
            try {
                C0551Ik c0551Ik = C0551Ik.f5116d;
                C0551Ik c0551IkM7629B = C1210TE.m7629B(str);
                O90.m5968f(c0551IkM7629B, "bytes");
                ((MN0) interfaceC7443Cm1).m5357i(c0551IkM7629B, 2);
                return;
            } catch (Exception e) {
                notifyWebSocketFailed(i, e.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt(NotificationConstants.f19487ID, i);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt(NotificationConstants.f19487ID, i);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    public void setContentHandler(int i, InterfaceC7599Fm1 interfaceC7599Fm1) {
        if (interfaceC7599Fm1 != null) {
            this.mContentHandlers.put(Integer.valueOf(i), interfaceC7599Fm1);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    public void sendBinary(C0551Ik c0551Ik, int i) {
        InterfaceC7443Cm1 interfaceC7443Cm1 = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (interfaceC7443Cm1 == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt(NotificationConstants.f19487ID, i);
            writableMapCreateMap.putString("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt(NotificationConstants.f19487ID, i);
            writableMapCreateMap2.putInt("code", 0);
            writableMapCreateMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            O90.m5968f(c0551Ik, "bytes");
            ((MN0) interfaceC7443Cm1).m5357i(c0551Ik, 2);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    private static void applyCustomBuilder(C10457nx0 c10457nx0) {
    }

    public static void setCustomClientBuilder(InterfaceC0327FB interfaceC0327FB) {
    }
}
