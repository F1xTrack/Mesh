package defpackage;

import androidx.activity.a;

/* renamed from: Jx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792Jx0 implements InterfaceC0533Gp {
    public final MB a;
    public final /* synthetic */ a b;

    public C0792Jx0(a aVar, MB mb) {
        O90.f(mb, "onBackPressedCallback");
        this.b = aVar;
        this.a = mb;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [FZ, mZ] */
    @Override // defpackage.InterfaceC0533Gp
    public final void cancel() {
        a aVar = this.b;
        C6018n8 c6018n8 = aVar.b;
        MB mb = this.a;
        c6018n8.remove(mb);
        if (O90.a(aVar.c, mb)) {
            mb.getClass();
            aVar.c = null;
        }
        mb.b.remove(this);
        ?? r0 = mb.c;
        if (r0 != 0) {
            r0.invoke();
        }
        mb.c = null;
    }
}
