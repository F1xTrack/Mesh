package defpackage;

import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsCxxInterop;

/* renamed from: ib0 */
/* loaded from: classes2.dex */
public final class C4375ib0 implements BL0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;

    public C4375ib0(C1922Yk0 c1922Yk0, C1016Mu0 c1016Mu0, C1562Tu0 c1562Tu0, LI li, C0162Bv0 c0162Bv0, S20 s20, C0084Av0 c0084Av0, OL0 ol0, C6518pl0 c6518pl0, C5996n11 c5996n11, C0318Dv0 c0318Dv0, C0396Ev0 c0396Ev0, C3759fN c3759fN, C0231Cs0 c0231Cs0, RP0 rp0, D5 d5, S20 s202, C1538Tm0 c1538Tm0, C0240Cv0 c0240Cv0, C7883wv0 c7883wv0, C0024Ab0 c0024Ab0, OJ1 oj1) {
        C0162Bv0 c0162Bv02 = C0162Bv0.e;
        H71.a.getClass();
        O90.f(c1922Yk0, "storageManager");
        O90.f(c1016Mu0, "finder");
        O90.f(c1562Tu0, "kotlinClassFinder");
        O90.f(li, "deserializedDescriptorResolver");
        O90.f(c0162Bv0, "signaturePropagator");
        O90.f(s20, "errorReporter");
        O90.f(c0084Av0, "javaPropertyInitializerEvaluator");
        O90.f(ol0, "samConversionResolver");
        O90.f(c6518pl0, "sourceElementFactory");
        O90.f(c5996n11, "moduleClassResolver");
        O90.f(c0318Dv0, "packagePartProvider");
        O90.f(c0396Ev0, "supertypeLoopChecker");
        O90.f(c3759fN, "lookupTracker");
        O90.f(c0231Cs0, "module");
        O90.f(rp0, "reflectionTypes");
        O90.f(d5, "annotationTypeQualifierResolver");
        O90.f(s202, "signatureEnhancement");
        O90.f(c1538Tm0, "javaClassesTracker");
        O90.f(c0240Cv0, "settings");
        O90.f(c7883wv0, "kotlinTypeChecker");
        O90.f(c0024Ab0, "javaTypeEnhancementState");
        O90.f(oj1, "javaModuleResolver");
        C2032Zv c2032Zv = C0474Fv0.h;
        O90.f(c2032Zv, "syntheticPartsProvider");
        this.a = c1922Yk0;
        this.b = c1016Mu0;
        this.c = c1562Tu0;
        this.d = li;
        this.e = c0162Bv0;
        this.f = s20;
        this.g = c0162Bv02;
        this.h = c0084Av0;
        this.i = ol0;
        this.j = c6518pl0;
        this.k = c5996n11;
        this.l = c0318Dv0;
        this.m = c0396Ev0;
        this.n = c3759fN;
        this.o = c0231Cs0;
        this.p = rp0;
        this.q = d5;
        this.r = s202;
        this.s = c1538Tm0;
        this.t = c0240Cv0;
        this.u = c7883wv0;
        this.v = c0024Ab0;
        this.w = oj1;
        this.x = c2032Zv;
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean allowCollapsableChildren() {
        Boolean boolValueOf = (Boolean) this.b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.allowCollapsableChildren());
            this.b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean allowRecursiveCommitsWithSynchronousMountOnAndroid() {
        Boolean boolValueOf = (Boolean) this.c;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.allowRecursiveCommitsWithSynchronousMountOnAndroid());
            this.c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean batchRenderingUpdatesInEventLoop() {
        Boolean boolValueOf = (Boolean) this.d;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.batchRenderingUpdatesInEventLoop());
            this.d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean boolValueOf = (Boolean) this.a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.commonTestFlag());
            this.a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean destroyFabricSurfacesInReactInstanceManager() {
        Boolean boolValueOf = (Boolean) this.e;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.destroyFabricSurfacesInReactInstanceManager());
            this.e = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBackgroundExecutor() {
        Boolean boolValueOf = (Boolean) this.f;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableBackgroundExecutor());
            this.f = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCleanTextInputYogaNode() {
        Boolean boolValueOf = (Boolean) this.g;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCleanTextInputYogaNode());
            this.g = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableGranularShadowTreeStateReconciliation() {
        Boolean boolValueOf = (Boolean) this.h;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableGranularShadowTreeStateReconciliation());
            this.h = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableMicrotasks() {
        Boolean boolValueOf = (Boolean) this.i;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableMicrotasks());
            this.i = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        Boolean boolValueOf = (Boolean) this.j;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSynchronousStateUpdates());
            this.j = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        Boolean boolValueOf = (Boolean) this.k;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableUIConsistency());
            this.k = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak() {
        Boolean boolValueOf = (Boolean) this.l;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak());
            this.l = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean forceBatchingMountItemsOnAndroid() {
        Boolean boolValueOf = (Boolean) this.m;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.forceBatchingMountItemsOnAndroid());
            this.m = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledDebug() {
        Boolean boolValueOf = (Boolean) this.n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledDebug());
            this.n = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean boolValueOf = (Boolean) this.o;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledRelease());
            this.o = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        Boolean boolValueOf = (Boolean) this.p;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.lazyAnimationCallbacks());
            this.p = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean preventDoubleTextMeasure() {
        Boolean boolValueOf = (Boolean) this.q;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.preventDoubleTextMeasure());
            this.q = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean setAndroidLayoutDirection() {
        Boolean boolValueOf = (Boolean) this.r;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.setAndroidLayoutDirection());
            this.r = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useImmediateExecutorInAndroidBridgeless() {
        Boolean boolValueOf = (Boolean) this.s;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useImmediateExecutorInAndroidBridgeless());
            this.s = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useModernRuntimeScheduler() {
        Boolean boolValueOf = (Boolean) this.t;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useModernRuntimeScheduler());
            this.t = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean boolValueOf = (Boolean) this.u;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNativeViewConfigsInBridgelessMode());
            this.u = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdate() {
        Boolean boolValueOf = (Boolean) this.v;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdate());
            this.v = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRuntimeShadowNodeReferenceUpdateOnLayout() {
        Boolean boolValueOf = (Boolean) this.w;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRuntimeShadowNodeReferenceUpdateOnLayout());
            this.w = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // defpackage.BL0, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useStateAlignmentMechanism() {
        Boolean boolValueOf = (Boolean) this.x;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useStateAlignmentMechanism());
            this.x = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
