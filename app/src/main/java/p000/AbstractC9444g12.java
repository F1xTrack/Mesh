package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;

/* renamed from: g12 */
/* loaded from: classes.dex */
public abstract class AbstractC9444g12 {
    /* renamed from: a */
    public static int m18381a(int i) {
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
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* renamed from: b */
    public static boolean m18382b(C0071B7 c0071b7) {
        Boolean bool;
        try {
            bool = (Boolean) ((C0428Gn) c0071b7.f579b).m3155a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (AbstractC7067wJ.f44776a.m17864z0(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                AbstractC7806Jm0.m4412f("FlashAvailability");
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                AbstractC7806Jm0.m4412f("FlashAvailability");
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            AbstractC7806Jm0.m4412f("FlashAvailability");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
