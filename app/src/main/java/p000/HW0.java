package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes2.dex */
public final class HW0 extends C10169lh0 {

    /* renamed from: z */
    public final ReactApplicationContext f4331z;

    public HW0(ReactApplicationContext reactApplicationContext) {
        O90.m5968f(reactApplicationContext, "context");
        this.f4331z = reactApplicationContext;
    }

    @Override // p000.EM0, p000.DM0
    /* renamed from: b */
    public final void mo1652b(C10910rT1 c10910rT1) {
        O90.m5968f(c10910rT1, "nativeViewHierarchyOptimizer");
        UIManagerModule uIManagerModule = (UIManagerModule) this.f4331z.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new C8450Vw0(13, this));
        }
    }
}
