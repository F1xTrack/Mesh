package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class B21 extends CO0 {
    public boolean a = false;
    public final /* synthetic */ C1421Rz0 b;

    public B21(C1421Rz0 c1421Rz0) {
        this.b = c1421Rz0;
    }

    @Override // defpackage.CO0
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.h();
        }
    }

    @Override // defpackage.CO0
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
