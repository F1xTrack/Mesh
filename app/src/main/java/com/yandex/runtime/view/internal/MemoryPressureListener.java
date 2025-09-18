package com.yandex.runtime.view.internal;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.yandex.runtime.view.PlatformView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class MemoryPressureListener implements ComponentCallbacks2 {
    private WeakReference<PlatformView> weakPlatformView;

    public MemoryPressureListener(PlatformView platformView) {
        this.weakPlatformView = new WeakReference<>(platformView);
    }

    private void onMemoryWarning() {
        PlatformView platformView = this.weakPlatformView.get();
        if (platformView != null) {
            platformView.onMemoryWarning();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onMemoryWarning();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 80 || i == 20 || i == 10 || i == 15) {
            onMemoryWarning();
        }
    }
}
