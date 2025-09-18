package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: nL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10381nL0 implements U21 {

    /* renamed from: a */
    public final /* synthetic */ C10509oL0 f38285a;

    public C10381nL0(C10509oL0 c10509oL0) {
        this.f38285a = c10509oL0;
    }

    @Override // p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) throws IOException {
        C10509oL0 c10509oL0 = this.f38285a;
        int i = (int) 8192;
        try {
            byte[] bArr = new byte[i];
            long j2 = c10509oL0.f38959b.m3876m().read(bArr, 0, i);
            c10509oL0.f38960c += j2 > 0 ? j2 : 0L;
            if (j2 > 0) {
                c10509oL0.f38962e.write(bArr, 0, (int) j2);
            } else if (c10509oL0.mo3383o() == -1 && j2 == -1) {
                c10509oL0.f38963f = true;
            }
            String str = c10509oL0.f38958a;
            HashMap map = RunnableC11786yL0.f46196y;
            C11405vL0 c11405vL0 = !map.containsKey(str) ? null : (C11405vL0) map.get(str);
            if (c10509oL0.mo3383o() != 0) {
                float fMo3383o = c10509oL0.mo3383o() != -1 ? c10509oL0.f38960c / c10509oL0.mo3383o() : c10509oL0.f38963f ? 1.0f : 0.0f;
                if (c11405vL0 != null && c11405vL0.m25401a(fMo3383o)) {
                    if (c10509oL0.mo3383o() != -1) {
                        m23125a(c10509oL0.f38960c, c10509oL0.mo3383o(), c10509oL0.f38958a);
                    } else if (c10509oL0.f38963f) {
                        String str2 = c10509oL0.f38958a;
                        long j3 = c10509oL0.f38960c;
                        m23125a(j3, j3, str2);
                    } else {
                        m23125a(0L, c10509oL0.mo3383o(), c10509oL0.f38958a);
                    }
                }
            }
            return j2;
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* renamed from: a */
    public final void m23125a(long j, long j2, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("taskId", str);
        writableMapCreateMap.putString("written", String.valueOf(j));
        writableMapCreateMap.putString("total", String.valueOf(j2));
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f38285a.f38961d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f38285a.f38962e.close();
    }

    @Override // p000.U21
    /* renamed from: r */
    public final C7523Ea1 mo97r() {
        return null;
    }
}
