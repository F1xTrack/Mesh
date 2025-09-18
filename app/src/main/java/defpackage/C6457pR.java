package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.adapters.react.ReactAdapterPackage;
import java.util.List;

/* renamed from: pR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6457pR implements ZL0 {
    public static final F71 b = LB.b(X2.B);
    public final C0855Ks0 a;

    public C6457pR() {
        List listA = S02.a();
        C0855Ks0 c0855Ks0 = new C0855Ks0();
        c0855Ks0.b = new ReactAdapterPackage();
        c0855Ks0.d = null;
        CC0 cc0 = new CC0(24, false);
        cc0.b = listA;
        c0855Ks0.a = cc0;
        this.a = c0855Ks0;
    }

    @Override // defpackage.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        O90.f(reactApplicationContext, "reactContext");
        return this.a.createNativeModules(reactApplicationContext);
    }

    @Override // defpackage.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        O90.f(reactApplicationContext, "reactContext");
        return this.a.createViewManagers(reactApplicationContext);
    }
}
