package com.yandex.runtime.view;

import android.view.Surface;
import android.view.View;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public interface PlatformView {
    void addSurface(int i, Surface surface);

    void destroyNativePlatformView();

    NativeObject getNativePlatformView();

    View getView();

    boolean isDebugModeEnabled();

    void onMemoryWarning();

    void pause();

    void removeSurface(int i);

    void resume();

    void setNoninteractive(boolean z);

    void start();

    void stop();
}
