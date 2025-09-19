package expo.modules.adapters.react;

import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.core.BasePackage;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import p000.C0026AP;
import p000.C10015kU0;
import p000.C1543YW;
import p000.C9398ff1;
import p000.UA0;

/* loaded from: classes2.dex */
public class ReactAdapterPackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, p000.InterfaceC11866yz0
    /* renamed from: e */
    public final List mo18082e(ReactApplicationContext reactApplicationContext) {
        C9398ff1 c9398ff1 = new C9398ff1();
        c9398ff1.f27312b = new WeakHashMap();
        new WeakHashMap();
        c9398ff1.f27311a = reactApplicationContext;
        return Arrays.asList(c9398ff1, new C0026AP(), new C1543YW(), new C10015kU0(), new UA0(reactApplicationContext));
    }
}
