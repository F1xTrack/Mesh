package com.yandex.runtime.view.internal;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class GLTextureView {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private EGLConfigChooserImpl eglConfigChooser;
    private Set<Integer> externalSurfaceIds;
    private GLContextFactory glContextFactory;
    private GLRenderThread renderThread;

    public GLTextureView(boolean z) {
        EGLConfigChooserImpl eGLConfigChooserImpl = new EGLConfigChooserImpl();
        this.eglConfigChooser = eGLConfigChooserImpl;
        this.glContextFactory = new GLContextFactory(z, eGLConfigChooserImpl);
        this.externalSurfaceIds = new HashSet();
    }

    private boolean isInitialized() {
        return this.renderThread != null;
    }

    public void addSurfaceId(int i) {
        if (isInitialized()) {
            if (this.externalSurfaceIds.isEmpty()) {
                this.renderThread.onExternalSurfaceAttached();
            }
            this.externalSurfaceIds.add(Integer.valueOf(i));
            this.renderThread.requestRender();
        }
    }

    public void onPause() {
        if (isInitialized()) {
            this.renderThread.onPause();
        }
    }

    public void onResume() {
        if (isInitialized()) {
            this.renderThread.onResume();
        }
    }

    public void onSizeChanged(int i, int i2) {
        if (isInitialized()) {
            this.renderThread.onSizeChanged(i, i2);
        }
    }

    public void onTextureDestroyed() throws InterruptedException {
        if (isInitialized()) {
            this.renderThread.finish();
            try {
                this.renderThread.join();
            } catch (InterruptedException unused) {
            }
            this.renderThread = null;
        }
    }

    public void removeSurfaceId(int i) {
        if (isInitialized()) {
            this.externalSurfaceIds.remove(Integer.valueOf(i));
            if (this.externalSurfaceIds.isEmpty()) {
                this.renderThread.onExternalSurfaceDetached();
            }
        }
    }

    public void requestRender() {
        if (isInitialized()) {
            this.renderThread.requestRender();
        }
    }

    public void setRenderer(SurfaceTexture surfaceTexture, int i, int i2, GLSurfaceView.Renderer renderer) {
        surfaceTexture.setDefaultBufferSize(i, i2);
        GLRenderThread gLRenderThread = new GLRenderThread(surfaceTexture, this.eglConfigChooser, this.glContextFactory, renderer);
        this.renderThread = gLRenderThread;
        gLRenderThread.onSizeChanged(i, i2);
        this.renderThread.start();
    }
}
