package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;

/* renamed from: g12 */
/* loaded from: classes.dex */
public abstract class AbstractC3884g12 {
    public static int a(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC7209tN0.u(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean b(B7 b7) {
        Boolean bool;
        try {
            bool = (Boolean) ((C0527Gn) b7.b).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (AbstractC7768wJ.a.z0(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                AbstractC0759Jm0.f("FlashAvailability");
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                AbstractC0759Jm0.f("FlashAvailability");
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            AbstractC0759Jm0.f("FlashAvailability");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
