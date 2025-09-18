package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g6 */
/* loaded from: classes.dex */
public final class C3899g6 implements InterfaceC5515kV0 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public C3899g6(C5706lV0 c5706lV0) {
        O90.f(c5706lV0, "registry");
        this.b = new LinkedHashSet();
        c5706lV0.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.InterfaceC5515kV0
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC4281i6) this.b).g().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.b));
                return bundle2;
        }
    }

    public C3899g6(AbstractActivityC4281i6 abstractActivityC4281i6) {
        this.b = abstractActivityC4281i6;
    }
}
