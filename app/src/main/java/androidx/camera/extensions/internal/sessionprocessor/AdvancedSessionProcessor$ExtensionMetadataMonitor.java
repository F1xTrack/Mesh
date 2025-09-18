package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import java.util.Map;
import java.util.Objects;
import p000.C7560Et0;

/* loaded from: classes.dex */
class AdvancedSessionProcessor$ExtensionMetadataMonitor {
    private final C7560Et0 mCurrentExtensionTypeLiveData;
    private final C7560Et0 mExtensionStrengthLiveData;

    public AdvancedSessionProcessor$ExtensionMetadataMonitor(C7560Et0 c7560Et0, C7560Et0 c7560Et02) {
        this.mCurrentExtensionTypeLiveData = c7560Et0;
        this.mExtensionStrengthLiveData = c7560Et02;
    }

    private int convertExtensionMode(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
        Object obj;
        Object obj2;
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.mCurrentExtensionTypeLiveData != null && (obj2 = map.get(CaptureResult.EXTENSION_CURRENT_TYPE)) != null) {
                Integer num = (Integer) obj2;
                if (!Objects.equals(this.mCurrentExtensionTypeLiveData.mo1868d(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                    this.mCurrentExtensionTypeLiveData.m2440k(Integer.valueOf(convertExtensionMode(num.intValue())));
                }
            }
            if (this.mExtensionStrengthLiveData == null || (obj = map.get(CaptureResult.EXTENSION_STRENGTH)) == null || Objects.equals(this.mExtensionStrengthLiveData.mo1868d(), obj)) {
                return;
            }
            this.mExtensionStrengthLiveData.m2440k((Integer) obj);
        }
    }
}
