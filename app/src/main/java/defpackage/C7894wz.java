package defpackage;

import com.swmansion.reanimated.ReanimatedPackage;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7894wz implements InterfaceC3563eL0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HashMap b;

    public /* synthetic */ C7894wz(HashMap map, int i) {
        this.a = i;
        this.b = map;
    }

    @Override // defpackage.InterfaceC3563eL0
    public final Map a() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ReanimatedPackage.lambda$getReactModuleInfoProvider$0(this.b);
            default:
                return this.b;
        }
    }
}
