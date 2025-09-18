package com.yandex.runtime.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;

/* loaded from: classes2.dex */
public class PlatformGLTextureView extends PlatformGLSurfaceTextureView implements TextureView.SurfaceTextureListener {
    private TextureViewImpl textureView;

    public class TextureViewImpl extends TextureView {
        public TextureViewImpl(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            setSurfaceTextureListener(PlatformGLTextureView.this);
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (PlatformGLTextureView.this.onTouchEvent(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.TextureView, android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            PlatformGLTextureView.this.onSizeChanged(i, i2);
        }
    }

    public PlatformGLTextureView(Context context) {
        this(context, null, 0, false);
    }

    public Bitmap getBitmap() {
        return this.textureView.getBitmap();
    }

    @Override // com.yandex.runtime.view.PlatformGLSurfaceTextureView, com.yandex.runtime.view.PlatformView
    public View getView() {
        return this.textureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        setTexture(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) throws InterruptedException {
        onTextureDestroyed();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        onSizeChanged(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
    }

    public PlatformGLTextureView(Context context, boolean z) {
        this(context, null, 0, z);
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, z);
        this.textureView = new TextureViewImpl(context, attributeSet);
    }
}
