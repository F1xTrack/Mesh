package com.yandex.mapkit.mapview;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import androidx.car.app.SurfaceCallback;
import androidx.car.app.SurfaceContainer;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.runtime.view.PlatformGLSurface;

/* loaded from: classes2.dex */
public class MapSurface implements SurfaceCallback {
    private final MapWindow mapWindow;
    private final PlatformGLSurface platformGLSurface;
    private Surface surface;

    public MapSurface(Context context) {
        this(context, null);
    }

    public void destroyNativePlatformView() throws InterruptedException {
        this.platformGLSurface.destroyNativePlatformView();
    }

    public Map getMap() {
        return this.mapWindow.getMap();
    }

    public MapWindow getMapWindow() {
        return this.mapWindow;
    }

    public boolean isSurfaceValid() {
        Surface surface = this.surface;
        return surface != null && surface.isValid();
    }

    public void onStableAreaChanged(Rect rect) {
    }

    public void onSurfaceAvailable(SurfaceContainer surfaceContainer) {
        this.surface = surfaceContainer.getSurface();
        if (isSurfaceValid()) {
            this.platformGLSurface.onSurfaceAvailable(this.surface, surfaceContainer.getWidth(), surfaceContainer.getHeight());
            this.platformGLSurface.start();
            this.platformGLSurface.resume();
        }
    }

    public void onSurfaceDestroyed(SurfaceContainer surfaceContainer) throws InterruptedException {
        if (this.surface == null) {
            return;
        }
        this.platformGLSurface.pause();
        this.platformGLSurface.stop();
        this.platformGLSurface.onSurfaceDestroyed(surfaceContainer.getSurface());
        this.surface = null;
    }

    public void onVisibleAreaChanged(Rect rect) {
    }

    public void requestRender() {
        if (isSurfaceValid()) {
            this.platformGLSurface.requestRenderNative();
        }
    }

    public MapSurface(Context context, GLSurfaceView.Renderer renderer) {
        this(context, renderer, null);
    }

    public MapSurface(Context context, GLSurfaceView.Renderer renderer, Float f) {
        this.surface = null;
        PlatformGLSurface platformGLSurface = new PlatformGLSurface(context, false, renderer);
        this.platformGLSurface = platformGLSurface;
        if (f == null) {
            this.mapWindow = MapKitFactory.getInstance().createMapWindow(platformGLSurface);
        } else {
            this.mapWindow = MapKitFactory.getInstance().createMapWindow(platformGLSurface, f.floatValue());
        }
    }
}
