package p000;

import com.swmansion.reanimated.ReanimatedPackage;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wz */
/* loaded from: classes.dex */
public final /* synthetic */ class C7109wz implements InterfaceC9229eL0 {

    /* renamed from: a */
    public final /* synthetic */ int f45217a;

    /* renamed from: b */
    public final /* synthetic */ HashMap f45218b;

    public /* synthetic */ C7109wz(HashMap map, int i) {
        this.f45217a = i;
        this.f45218b = map;
    }

    @Override // p000.InterfaceC9229eL0
    /* renamed from: a */
    public final Map mo9721a() {
        switch (this.f45217a) {
            case 0:
                return this.f45218b;
            case 1:
                return ReanimatedPackage.lambda$getReactModuleInfoProvider$0(this.f45218b);
            default:
                return this.f45218b;
        }
    }
}
