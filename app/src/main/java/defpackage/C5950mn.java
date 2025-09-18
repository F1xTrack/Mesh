package defpackage;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: mn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5950mn extends Exception {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public final int a;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public C5950mn(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.a = 10001;
        if (b.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public C5950mn(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.a = cameraAccessException.getReason();
    }

    public C5950mn(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.a = 10002;
        if (b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
