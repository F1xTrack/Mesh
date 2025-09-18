package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* renamed from: Gn */
/* loaded from: classes.dex */
public final class C0428Gn {

    /* renamed from: b */
    public final QQ0 f3890b;

    /* renamed from: c */
    public final String f3891c;

    /* renamed from: a */
    public final HashMap f3889a = new HashMap();

    /* renamed from: d */
    public C8071Oo1 f3892d = null;

    public C0428Gn(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3890b = new C0365Fn(cameraCharacteristics);
        } else {
            this.f3890b = new QQ0(cameraCharacteristics);
        }
        this.f3891c = str;
    }

    /* renamed from: a */
    public final Object m3155a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f3890b.f9619a).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f3889a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f3890b.f9619a).get(key);
                if (obj2 != null) {
                    this.f3889a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final C8071Oo1 m3156b() {
        if (this.f3892d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m3155a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                C1339VH c1339vh = new C1339VH(this.f3891c, 17);
                C8071Oo1 c8071Oo1 = new C8071Oo1();
                c8071Oo1.f8629c = new HashMap();
                c8071Oo1.f8630d = new HashMap();
                new HashMap();
                c8071Oo1.f8627a = new C10525oT0(streamConfigurationMap);
                c8071Oo1.f8628b = c1339vh;
                this.f3892d = c8071Oo1;
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.f3892d;
    }
}
