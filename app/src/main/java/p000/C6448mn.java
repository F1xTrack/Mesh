package p000;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: mn */
/* loaded from: classes.dex */
public final class C6448mn extends Exception {

    /* renamed from: b */
    public static final Set f37914b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: a */
    public final int f37915a;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public C6448mn(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f37915a = 10001;
        if (f37914b.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public C6448mn(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f37915a = cameraAccessException.getReason();
    }

    public C6448mn(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.f37915a = 10002;
        if (f37914b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
