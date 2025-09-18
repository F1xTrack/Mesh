package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* renamed from: Gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527Gn {
    public final QQ0 b;
    public final String c;
    public final HashMap a = new HashMap();
    public C1155Oo1 d = null;

    public C0527Gn(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = new C0449Fn(cameraCharacteristics);
        } else {
            this.b = new QQ0(cameraCharacteristics);
        }
        this.c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.b.a).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.b.a).get(key);
                if (obj2 != null) {
                    this.a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1155Oo1 b() {
        if (this.d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                VH vh = new VH(this.c, 17);
                C1155Oo1 c1155Oo1 = new C1155Oo1();
                c1155Oo1.c = new HashMap();
                c1155Oo1.d = new HashMap();
                new HashMap();
                c1155Oo1.a = new C6273oT0(streamConfigurationMap);
                c1155Oo1.b = vh;
                this.d = c1155Oo1;
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.d;
    }
}
