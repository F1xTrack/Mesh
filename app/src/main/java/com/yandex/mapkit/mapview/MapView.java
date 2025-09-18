package com.yandex.mapkit.mapview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.Surface;
import android.widget.RelativeLayout;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.internal.MapWindowBinding;
import com.yandex.runtime.view.GraphicsAPIType;
import com.yandex.runtime.view.PlatformGLTextureView;
import com.yandex.runtime.view.PlatformView;
import com.yandex.runtime.view.PlatformViewFactory;
import com.yandex.runtime.view.PlatformVulkanSurfaceView;

/* loaded from: classes2.dex */
public class MapView extends RelativeLayout {
    private MapWindowBinding mapWindow;
    private PlatformView platformView;

    public MapView(Context context) {
        this(context, null, 0);
    }

    public void addSurface(int i, Surface surface) {
        this.platformView.addSurface(i, surface);
    }

    public GraphicsAPIType getGraphicsAPI() {
        return this.platformView instanceof PlatformVulkanSurfaceView ? GraphicsAPIType.VULKAN : GraphicsAPIType.OPEN_GL;
    }

    public Map getMap() {
        return this.mapWindow.getMap();
    }

    public MapWindow getMapWindow() {
        return this.mapWindow;
    }

    public Bitmap getScreenshot() {
        PlatformView platformView = this.platformView;
        if (platformView instanceof PlatformGLTextureView) {
            return ((PlatformGLTextureView) platformView).getBitmap();
        }
        return null;
    }

    public boolean isDebugModeEnabled() {
        return this.platformView.isDebugModeEnabled();
    }

    public void onMemoryWarning() {
        this.platformView.onMemoryWarning();
    }

    public void onStart() {
        this.platformView.start();
        this.platformView.resume();
    }

    public void onStop() {
        this.platformView.pause();
        this.platformView.stop();
    }

    public void removeSurface(int i) {
        this.platformView.removeSurface(i);
    }

    public void setNoninteractive(boolean z) {
        this.platformView.setNoninteractive(z);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        MapKitFactory.initialize(context);
        this.platformView = PlatformViewFactory.getPlatformView(context, PlatformViewFactory.convertAttributeSet(context, attributeSet));
        this.mapWindow = (MapWindowBinding) MapKitFactory.getInstance().createMapWindow(this.platformView);
        addView(this.platformView.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }
}
