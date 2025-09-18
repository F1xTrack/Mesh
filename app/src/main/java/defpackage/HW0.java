package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes2.dex */
public final class HW0 extends C5742lh0 {
    public final ReactApplicationContext z;

    public HW0(ReactApplicationContext reactApplicationContext) {
        O90.f(reactApplicationContext, "context");
        this.z = reactApplicationContext;
    }

    @Override // defpackage.EM0, defpackage.DM0
    public final void b(C6846rT1 c6846rT1) {
        O90.f(c6846rT1, "nativeViewHierarchyOptimizer");
        UIManagerModule uIManagerModule = (UIManagerModule) this.z.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new C1724Vw0(13, this));
        }
    }
}
