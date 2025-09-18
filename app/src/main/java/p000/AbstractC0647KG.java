package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* renamed from: KG */
/* loaded from: classes.dex */
public abstract class AbstractC0647KG {
    /* renamed from: a */
    public static Handler m4588a(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* renamed from: b */
    public static Handler m4589b(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* renamed from: c */
    public static Set m4590c(CameraCharacteristics cameraCharacteristics) {
        try {
            return cameraCharacteristics.getPhysicalCameraIds();
        } catch (Exception unused) {
            return Collections.emptySet();
        }
    }

    /* renamed from: d */
    public static boolean m4591d(Handler handler, RunnableC7099wp runnableC7099wp, long j) {
        return handler.postDelayed(runnableC7099wp, "retry_token", j);
    }
}
