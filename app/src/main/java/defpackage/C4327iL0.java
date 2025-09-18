package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import java.util.HashMap;

/* renamed from: iL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4327iL0 implements U21 {
    public final InterfaceC0827Kj a;
    public long b = 0;
    public final /* synthetic */ C5294jL0 c;

    public C4327iL0(C5294jL0 c5294jL0, InterfaceC0827Kj interfaceC0827Kj) {
        this.c = c5294jL0;
        this.a = interfaceC0827Kj;
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) {
        long jH = this.a.H(c6129nj, 8192L);
        this.b += jH > 0 ? jH : 0L;
        C5294jL0 c5294jL0 = this.c;
        String str = c5294jL0.a;
        HashMap map = RunnableC8155yL0.y;
        C7585vL0 c7585vL0 = !map.containsKey(str) ? null : (C7585vL0) map.get(str);
        long jO = c5294jL0.c.o();
        if (c7585vL0 != null && jO != 0 && c7585vL0.a(this.b / c5294jL0.c.o())) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("taskId", c5294jL0.a);
            writableMapCreateMap.putString("written", String.valueOf(this.b));
            writableMapCreateMap.putString("total", String.valueOf(c5294jL0.c.o()));
            if (c5294jL0.d) {
                writableMapCreateMap.putString("chunk", c6129nj.N(Charset.defaultCharset()));
            } else {
                writableMapCreateMap.putString("chunk", "");
            }
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) c5294jL0.b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
        }
        return jH;
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
