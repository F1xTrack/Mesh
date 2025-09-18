package p000;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsCxxInterop;

/* renamed from: ib0 */
/* loaded from: classes2.dex */
public final class C9773ib0 implements BL0 {

    /* renamed from: a */
    public Object f29338a;

    /* renamed from: b */
    public Object f29339b;

    /* renamed from: c */
    public Object f29340c;

    /* renamed from: d */
    public Object f29341d;

    /* renamed from: e */
    public Object f29342e;

    /* renamed from: f */
    public Object f29343f;

    /* renamed from: g */
    public Object f29344g;

    /* renamed from: h */
    public Object f29345h;

    /* renamed from: i */
    public Object f29346i;

    /* renamed from: j */
    public Object f29347j;

    /* renamed from: k */
    public Object f29348k;

    /* renamed from: l */
    public Object f29349l;

    /* renamed from: m */
    public Object f29350m;

    /* renamed from: n */
    public Object f29351n;

    /* renamed from: o */
    public Object f29352o;

    /* renamed from: p */
    public Object f29353p;

    /* renamed from: q */
    public Object f29354q;

    /* renamed from: r */
    public Object f29355r;

    /* renamed from: s */
    public Object f29356s;

    /* renamed from: t */
    public Object f29357t;

    /* renamed from: u */
    public Object f29358u;

    /* renamed from: v */
    public Object f29359v;

    /* renamed from: w */
    public Object f29360w;

    /* renamed from: x */
    public Object f29361x;

    public C9773ib0(C8582Yk0 c8582Yk0, C7978Mu0 c7978Mu0, C8342Tu0 c8342Tu0, C0712LI c0712li, C7408Bv0 c7408Bv0, S20 s20, C7356Av0 c7356Av0, OL0 ol0, C10689pl0 c10689pl0, C10339n11 c10339n11, C7512Dv0 c7512Dv0, C7564Ev0 c7564Ev0, C4049fN c4049fN, C7454Cs0 c7454Cs0, RP0 rp0, C0195D5 c0195d5, S20 s202, C8326Tm0 c8326Tm0, C7460Cv0 c7460Cv0, C11604wv0 c11604wv0, C7316Ab0 c7316Ab0, OJ1 oj1) {
        C7408Bv0 c7408Bv02 = C7408Bv0.f1080e;
        H71.f4136a.getClass();
        O90.m5968f(c8582Yk0, "storageManager");
        O90.m5968f(c7978Mu0, "finder");
        O90.m5968f(c8342Tu0, "kotlinClassFinder");
        O90.m5968f(c0712li, "deserializedDescriptorResolver");
        O90.m5968f(c7408Bv0, "signaturePropagator");
        O90.m5968f(s20, "errorReporter");
        O90.m5968f(c7356Av0, "javaPropertyInitializerEvaluator");
        O90.m5968f(ol0, "samConversionResolver");
        O90.m5968f(c10689pl0, "sourceElementFactory");
        O90.m5968f(c10339n11, "moduleClassResolver");
        O90.m5968f(c7512Dv0, "packagePartProvider");
        O90.m5968f(c7564Ev0, "supertypeLoopChecker");
        O90.m5968f(c4049fN, "lookupTracker");
        O90.m5968f(c7454Cs0, "module");
        O90.m5968f(rp0, "reflectionTypes");
        O90.m5968f(c0195d5, "annotationTypeQualifierResolver");
        O90.m5968f(s202, "signatureEnhancement");
        O90.m5968f(c8326Tm0, "javaClassesTracker");
        O90.m5968f(c7460Cv0, "settings");
        O90.m5968f(c11604wv0, "kotlinTypeChecker");
        O90.m5968f(c7316Ab0, "javaTypeEnhancementState");
        O90.m5968f(oj1, "javaModuleResolver");
        C1631Zv c1631Zv = C7616Fv0.f3480h;
        O90.m5968f(c1631Zv, "syntheticPartsProvider");
        this.f29338a = c8582Yk0;
        this.f29339b = c7978Mu0;
        this.f29340c = c8342Tu0;
        this.f29341d = c0712li;
        this.f29342e = c7408Bv0;
        this.f29343f = s20;
        this.f29344g = c7408Bv02;
        this.f29345h = c7356Av0;
        this.f29346i = ol0;
        this.f29347j = c10689pl0;
        this.f29348k = c10339n11;
        this.f29349l = c7512Dv0;
        this.f29350m = c7564Ev0;
        this.f29351n = c4049fN;
        this.f29352o = c7454Cs0;
        this.f29353p = rp0;
        this.f29354q = c0195d5;
        this.f29355r = s202;
        this.f29356s = c8326Tm0;
        this.f29357t = c7460Cv0;
        this.f29358u = c11604wv0;
        this.f29359v = c7316Ab0;
        this.f29360w = oj1;
        this.f29361x = c1631Zv;
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean allowCollapsableChildren() {
        Boolean boolValueOf = (Boolean) this.f29339b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.allowCollapsableChildren());
            this.f29339b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean allowRecursiveCommitsWithSynchronousMountOnAndroid() {
        Boolean boolValueOf = (Boolean) this.f29340c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.allowRecursiveCommitsWithSynchronousMountOnAndroid());
            this.f29340c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean batchRenderingUpdatesInEventLoop() {
        Boolean boolValueOf = (Boolean) this.f29341d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.batchRenderingUpdatesInEventLoop());
            this.f29341d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean boolValueOf = (Boolean) this.f29338a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.commonTestFlag());
            this.f29338a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean destroyFabricSurfacesInReactInstanceManager() {
        Boolean boolValueOf = (Boolean) this.f29342e;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.destroyFabricSurfacesInReactInstanceManager());
            this.f29342e = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBackgroundExecutor() {
        Boolean boolValueOf = (Boolean) this.f29343f;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableBackgroundExecutor());
            this.f29343f = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCleanTextInputYogaNode() {
        Boolean boolValueOf = (Boolean) this.f29344g;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCleanTextInputYogaNode());
            this.f29344g = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableGranularShadowTreeStateReconciliation() {
        Boolean boolValueOf = (Boolean) this.f29345h;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableGranularShadowTreeStateReconciliation());
            this.f29345h = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMicrotasks() {
        Boolean boolValueOf = (Boolean) this.f29346i;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableMicrotasks());
            this.f29346i = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        Boolean boolValueOf = (Boolean) this.f29347j;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSynchronousStateUpdates());
            this.f29347j = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        Boolean boolValueOf = (Boolean) this.f29348k;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableUIConsistency());
            this.f29348k = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak() {
        Boolean boolValueOf = (Boolean) this.f29349l;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak());
            this.f29349l = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean forceBatchingMountItemsOnAndroid() {
        Boolean boolValueOf = (Boolean) this.f29350m;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.forceBatchingMountItemsOnAndroid());
            this.f29350m = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledDebug() {
        Boolean boolValueOf = (Boolean) this.f29351n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledDebug());
            this.f29351n = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean boolValueOf = (Boolean) this.f29352o;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledRelease());
            this.f29352o = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        Boolean boolValueOf = (Boolean) this.f29353p;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.lazyAnimationCallbacks());
            this.f29353p = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean preventDoubleTextMeasure() {
        Boolean boolValueOf = (Boolean) this.f29354q;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.preventDoubleTextMeasure());
            this.f29354q = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean setAndroidLayoutDirection() {
        Boolean boolValueOf = (Boolean) this.f29355r;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.setAndroidLayoutDirection());
            this.f29355r = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useImmediateExecutorInAndroidBridgeless() {
        Boolean boolValueOf = (Boolean) this.f29356s;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useImmediateExecutorInAndroidBridgeless());
            this.f29356s = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useModernRuntimeScheduler() {
        Boolean boolValueOf = (Boolean) this.f29357t;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useModernRuntimeScheduler());
            this.f29357t = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean boolValueOf = (Boolean) this.f29358u;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNativeViewConfigsInBridgelessMode());
            this.f29358u = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdate() {
        Boolean boolValueOf = (Boolean) this.f29359v;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdate());
            this.f29359v = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdateOnLayout() {
        Boolean boolValueOf = (Boolean) this.f29360w;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdateOnLayout());
            this.f29360w = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useStateAlignmentMechanism() {
        Boolean boolValueOf = (Boolean) this.f29361x;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useStateAlignmentMechanism());
            this.f29361x = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
