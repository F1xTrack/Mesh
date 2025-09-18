package androidx.fragment.app;

import android.view.View;
import defpackage.C0923Lp;
import defpackage.HS1;
import defpackage.O90;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class e {
    public final v a;
    public final C0923Lp b;

    public e(v vVar, C0923Lp c0923Lp) {
        this.a = vVar;
        this.b = c0923Lp;
    }

    public final void a() {
        v vVar = this.a;
        C0923Lp c0923Lp = this.b;
        LinkedHashSet linkedHashSet = vVar.e;
        if (linkedHashSet.remove(c0923Lp) && linkedHashSet.isEmpty()) {
            vVar.b();
        }
    }

    public final boolean b() {
        v vVar = this.a;
        View view = vVar.c.mView;
        O90.e(view, "operation.fragment.mView");
        int iA = HS1.a(view);
        int i = vVar.a;
        return iA == i || !(iA == 2 || i == 2);
    }
}
