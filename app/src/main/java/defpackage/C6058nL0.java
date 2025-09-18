package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: nL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6058nL0 implements U21 {
    public final /* synthetic */ C6249oL0 a;

    public C6058nL0(C6249oL0 c6249oL0) {
        this.a = c6249oL0;
    }

    @Override // defpackage.U21
    public final long H(C6129nj c6129nj, long j) throws IOException {
        C6249oL0 c6249oL0 = this.a;
        int i = (int) 8192;
        try {
            byte[] bArr = new byte[i];
            long j2 = c6249oL0.b.m().read(bArr, 0, i);
            c6249oL0.c += j2 > 0 ? j2 : 0L;
            if (j2 > 0) {
                c6249oL0.e.write(bArr, 0, (int) j2);
            } else if (c6249oL0.o() == -1 && j2 == -1) {
                c6249oL0.f = true;
            }
            String str = c6249oL0.a;
            HashMap map = RunnableC8155yL0.y;
            C7585vL0 c7585vL0 = !map.containsKey(str) ? null : (C7585vL0) map.get(str);
            if (c6249oL0.o() != 0) {
                float fO = c6249oL0.o() != -1 ? c6249oL0.c / c6249oL0.o() : c6249oL0.f ? 1.0f : 0.0f;
                if (c7585vL0 != null && c7585vL0.a(fO)) {
                    if (c6249oL0.o() != -1) {
                        a(c6249oL0.c, c6249oL0.o(), c6249oL0.a);
                    } else if (c6249oL0.f) {
                        String str2 = c6249oL0.a;
                        long j3 = c6249oL0.c;
                        a(j3, j3, str2);
                    } else {
                        a(0L, c6249oL0.o(), c6249oL0.a);
                    }
                }
            }
            return j2;
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final void a(long j, long j2, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("taskId", str);
        writableMapCreateMap.putString("written", String.valueOf(j));
        writableMapCreateMap.putString("total", String.valueOf(j2));
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.a.d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.e.close();
    }

    @Override // defpackage.U21
    public final C0334Ea1 r() {
        return null;
    }
}
