package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import java.util.HashMap;

/* renamed from: iL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9741iL0 implements U21 {

    /* renamed from: a */
    public final InterfaceC0676Kj f29093a;

    /* renamed from: b */
    public long f29094b = 0;

    /* renamed from: c */
    public final /* synthetic */ C9869jL0 f29095c;

    public C9741iL0(C9869jL0 c9869jL0, InterfaceC0676Kj interfaceC0676Kj) {
        this.f29095c = c9869jL0;
        this.f29093a = interfaceC0676Kj;
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) {
        long jMo96H = this.f29093a.mo96H(c6507nj, 8192L);
        this.f29094b += jMo96H > 0 ? jMo96H : 0L;
        C9869jL0 c9869jL0 = this.f29095c;
        String str = c9869jL0.f35068a;
        HashMap map = RunnableC11786yL0.f46196y;
        C11405vL0 c11405vL0 = !map.containsKey(str) ? null : (C11405vL0) map.get(str);
        long jMo3383o = c9869jL0.f35070c.mo3383o();
        if (c11405vL0 != null && jMo3383o != 0 && c11405vL0.m25401a(this.f29094b / c9869jL0.f35070c.mo3383o())) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("taskId", c9869jL0.f35068a);
            writableMapCreateMap.putString("written", String.valueOf(this.f29094b));
            writableMapCreateMap.putString("total", String.valueOf(c9869jL0.f35070c.mo3383o()));
            if (c9869jL0.f35071d) {
                writableMapCreateMap.putString("chunk", c6507nj.mo4704N(Charset.defaultCharset()));
            } else {
                writableMapCreateMap.putString("chunk", "");
            }
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) c9869jL0.f35069b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
        }
        return jMo96H;
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
