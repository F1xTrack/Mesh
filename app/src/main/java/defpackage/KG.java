package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class KG {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Set c(CameraCharacteristics cameraCharacteristics) {
        try {
            return cameraCharacteristics.getPhysicalCameraIds();
        } catch (Exception unused) {
            return Collections.emptySet();
        }
    }

    public static boolean d(Handler handler, RunnableC7864wp runnableC7864wp, long j) {
        return handler.postDelayed(runnableC7864wp, "retry_token", j);
    }
}
