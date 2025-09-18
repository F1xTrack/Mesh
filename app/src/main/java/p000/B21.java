package p000;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class B21 extends CO0 {

    /* renamed from: a */
    public boolean f526a = false;

    /* renamed from: b */
    public final /* synthetic */ C8248Rz0 f527b;

    public B21(C8248Rz0 c8248Rz0) {
        this.f527b = c8248Rz0;
    }

    @Override // p000.CO0
    /* renamed from: a */
    public final void mo468a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f526a) {
            this.f526a = false;
            this.f527b.m7143h();
        }
    }

    @Override // p000.CO0
    /* renamed from: b */
    public final void mo469b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f526a = true;
    }
}
