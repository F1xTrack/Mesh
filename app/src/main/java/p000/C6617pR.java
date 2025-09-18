package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.adapters.react.ReactAdapterPackage;
import java.util.List;

/* renamed from: pR */
/* loaded from: classes2.dex */
public final class C6617pR implements ZL0 {

    /* renamed from: b */
    public static final F71 f40074b = AbstractC0705LB.m4915b(C1450X2.f13494B);

    /* renamed from: a */
    public final C7870Ks0 f40075a;

    public C6617pR() {
        List listM7145a = S02.m7145a();
        C7870Ks0 c7870Ks0 = new C7870Ks0();
        c7870Ks0.f6368b = new ReactAdapterPackage();
        c7870Ks0.f6370d = null;
        CC0 cc0 = new CC0(24, false);
        cc0.f1250b = listM7145a;
        c7870Ks0.f6367a = cc0;
        this.f40075a = c7870Ks0;
    }

    @Override // p000.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        O90.m5968f(reactApplicationContext, "reactContext");
        return this.f40075a.createNativeModules(reactApplicationContext);
    }

    @Override // p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        O90.m5968f(reactApplicationContext, "reactContext");
        return this.f40075a.createViewManagers(reactApplicationContext);
    }
}
