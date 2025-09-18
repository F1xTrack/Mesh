package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.AbstractC9913jh0;
import p000.InterfaceC0965PK;
import p000.S61;

/* loaded from: classes.dex */
public class SurfaceHandlerBinding implements S61 {
    public static final int DISPLAY_MODE_HIDDEN = 2;
    public static final int DISPLAY_MODE_SUSPENDED = 1;
    public static final int DISPLAY_MODE_VISIBLE = 0;
    private static final int NO_SURFACE_ID = 0;

    @InterfaceC0965PK
    private final HybridData mHybridData;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DisplayModeTypeDef {
    }

    static {
        FabricSoLoader.staticInit();
    }

    public SurfaceHandlerBinding(String str) {
        this.mHybridData = initHybrid(0, str);
    }

    private native String getModuleNameNative();

    private native int getSurfaceIdNative();

    private static native HybridData initHybrid(int i, String str);

    private native boolean isRunningNative();

    private native void setDisplayModeNative(int i);

    private native void setLayoutConstraintsNative(float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7);

    private native void setPropsNative(NativeMap nativeMap);

    private native void setSurfaceIdNative(int i);

    private native void startNative();

    private native void stopNative();

    @Override // p000.S61
    public String getModuleName() {
        return getModuleNameNative();
    }

    @Override // p000.S61
    public int getSurfaceId() {
        return getSurfaceIdNative();
    }

    @Override // p000.S61
    public boolean isRunning() {
        return isRunningNative();
    }

    @Override // p000.S61
    public void setLayoutConstraints(int i, int i2, int i3, int i4, boolean z, boolean z2, float f) {
        setLayoutConstraintsNative(AbstractC9913jh0.m22090b(i) / f, AbstractC9913jh0.m22089a(i) / f, AbstractC9913jh0.m22090b(i2) / f, AbstractC9913jh0.m22089a(i2) / f, i3 / f, i4 / f, z, z2, f);
    }

    @Override // p000.S61
    public void setMountable(boolean z) {
        setDisplayModeNative(!z ? 1 : 0);
    }

    @Override // p000.S61
    public void setProps(NativeMap nativeMap) {
        setPropsNative(nativeMap);
    }

    @Override // p000.S61
    public void setSurfaceId(int i) {
        setSurfaceIdNative(i);
    }

    @Override // p000.S61
    public void start() {
        startNative();
    }

    @Override // p000.S61
    public void stop() {
        stopNative();
    }
}
