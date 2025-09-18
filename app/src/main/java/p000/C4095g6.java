package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g6 */
/* loaded from: classes.dex */
public final class C4095g6 implements InterfaceC10017kV0 {

    /* renamed from: a */
    public final /* synthetic */ int f27561a = 0;

    /* renamed from: b */
    public final Object f27562b;

    public C4095g6(C10145lV0 c10145lV0) {
        O90.m5968f(c10145lV0, "registry");
        this.f27562b = new LinkedHashSet();
        c10145lV0.m22443c("androidx.savedstate.Restarter", this);
    }

    @Override // p000.InterfaceC10017kV0
    /* renamed from: a */
    public final Bundle mo18401a() {
        switch (this.f27561a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC4221i6) this.f27562b).m18964g().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f27562b));
                return bundle2;
        }
    }

    public C4095g6(AbstractActivityC4221i6 abstractActivityC4221i6) {
        this.f27562b = abstractActivityC4221i6;
    }
}
