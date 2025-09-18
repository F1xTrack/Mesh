package defpackage;

import android.view.View;
import androidx.fragment.app.g;

/* loaded from: classes.dex */
public final class EJ extends YX {
    public final /* synthetic */ YX a;
    public final /* synthetic */ g b;

    public EJ(g gVar, YX yx) {
        this.b = gVar;
        this.a = yx;
    }

    @Override // defpackage.YX
    public final View b(int i) {
        YX yx = this.a;
        return yx.c() ? yx.b(i) : this.b.onFindViewById(i);
    }

    @Override // defpackage.YX
    public final boolean c() {
        return this.a.c() || this.b.onHasView();
    }
}
