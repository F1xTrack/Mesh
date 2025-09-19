package com.bumptech.glide.integration.webp;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class WebpFrame {
    static final int FRAME_DURATION_MS_FOR_MIN = 100;
    static final int MIN_FRAME_DURATION_MS = 11;
    boolean blendPreviousFrame;
    int delay;
    boolean disposeBackgroundColor;

    /* renamed from: ih */
    int f17781ih;

    /* renamed from: iw */
    int f17782iw;

    /* renamed from: ix */
    int f17783ix;

    /* renamed from: iy */
    int f17784iy;

    @Keep
    private long mNativePtr;

    public WebpFrame(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.mNativePtr = j;
        this.f17783ix = i;
        this.f17784iy = i2;
        this.f17782iw = i3;
        this.f17781ih = i4;
        this.delay = i5;
        this.blendPreviousFrame = z;
        this.disposeBackgroundColor = z2;
        fixFrameDuration();
    }

    private void fixFrameDuration() {
        if (this.delay < 11) {
            this.delay = 100;
        }
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public void dispose() {
        nativeDispose();
    }

    public void finalize() throws Throwable {
        nativeFinalize();
    }

    public int getDurationMs() {
        return this.delay;
    }

    public int getHeight() {
        return this.f17781ih;
    }

    public int getWidth() {
        return this.f17782iw;
    }

    public int getXOffest() {
        return this.f17783ix;
    }

    public int getYOffest() {
        return this.f17784iy;
    }

    public boolean isBlendWithPreviousFrame() {
        return this.blendPreviousFrame;
    }

    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    public boolean shouldDisposeToBackgroundColor() {
        return this.disposeBackgroundColor;
    }
}
