package com.facebook.react.modules.fresco;

import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashMap;
import java.util.HashSet;
import p000.AbstractC3929dS;
import p000.AbstractC4061fZ;
import p000.C0912OU;
import p000.C10585ox0;
import p000.C10969rx0;
import p000.C7018vX;
import p000.C8684a70;
import p000.C8812b70;
import p000.C8940c70;
import p000.C9972k81;
import p000.G10;
import p000.II1;
import p000.InterfaceC6208iz;
import p000.InterfaceC9101dL0;
import p000.ML1;
import p000.O90;
import p000.TJ0;
import p000.XL0;
import p000.Z60;

@InterfaceC9101dL0(name = FrescoModule.NAME, needsEagerInit = true)
/* loaded from: classes.dex */
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private C8812b70 mConfig;
    private Z60 mImagePipeline;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, (C8812b70) null);
    }

    private static C8812b70 getDefaultConfig(ReactContext reactContext) {
        C8684a70 defaultConfigBuilder = getDefaultConfigBuilder(reactContext);
        defaultConfigBuilder.getClass();
        return new C8812b70(defaultConfigBuilder);
    }

    public static C8684a70 getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        C9972k81 c9972k81 = new C9972k81();
        new HashMap();
        new HashMap();
        hashSet.add(c9972k81);
        C10585ox0 c10585ox0 = new C10585ox0(II1.m3810d());
        ((TJ0) ((InterfaceC6208iz) c10585ox0.f39380j)).f11322a = new G10(new C7018vX());
        Context applicationContext = reactContext.getApplicationContext();
        O90.m5968f(applicationContext, "context");
        C8684a70 c8684a70 = new C8684a70(applicationContext);
        c8684a70.f15317b = new C10969rx0(c10585ox0);
        c8684a70.f15317b = new XL0(c10585ox0);
        c8684a70.f15321f = 2;
        c8684a70.f15318c = hashSet;
        return c8684a70;
    }

    private Z60 getImagePipeline() {
        if (this.mImagePipeline == null) {
            C8940c70 c8940c70 = C8940c70.f17308t;
            ML1.m5337d(c8940c70, "ImagePipelineFactory was not initialized!");
            this.mImagePipeline = c8940c70.m10592e();
        }
        return this.mImagePipeline;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        Z60 imagePipeline = getImagePipeline();
        C0912OU c0912ou = new C0912OU(18);
        imagePipeline.f14729e.mo1071g(c0912ou);
        imagePipeline.f14730f.mo1071g(c0912ou);
        imagePipeline.f14731g.m3553g();
        imagePipeline.f14732h.m3553g();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(reactApplicationContext);
            }
            AbstractC4061fZ.m18253c(reactApplicationContext.getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            AbstractC3929dS.m17683p("ReactNative");
        }
        this.mConfig = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            Z60 imagePipeline = getImagePipeline();
            C0912OU c0912ou = new C0912OU(18);
            imagePipeline.f14729e.mo1071g(c0912ou);
            imagePipeline.f14730f.mo1071g(c0912ou);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, (C8812b70) null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, Z60 z60, boolean z) {
        this(reactApplicationContext, z60, z, false);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, Z60 z60, boolean z, boolean z2) {
        this(reactApplicationContext, z);
        this.mImagePipeline = z60;
        if (z2) {
            sHasBeenInitialized = true;
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, C8812b70 c8812b70) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = c8812b70;
    }
}
