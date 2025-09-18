package defpackage;

import android.content.Context;

/* renamed from: o32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6196o32 implements InterfaceC5241j32 {
    public final C6697qh0 a;
    public final C6697qh0 b;
    public final C4274i32 c;

    public C6196o32(Context context, C4274i32 c4274i32) {
        this.c = c4274i32;
        C1141Ok c1141Ok = C1141Ok.e;
        C2362bd1.b(context);
        C1587Uc1 c1587Uc1C = C2362bd1.a().c(c1141Ok);
        if (C1141Ok.d.contains(new C7973xO("json"))) {
            this.a = new C6697qh0(new C6852rV1(c1587Uc1C, 2));
        }
        this.b = new C6697qh0(new C6852rV1(c1587Uc1C, 3));
    }

    @Override // defpackage.InterfaceC5241j32
    public final void a(VY vy) {
        C4274i32 c4274i32 = this.c;
        EnumC7370uD0 enumC7370uD0 = EnumC7370uD0.b;
        EnumC7370uD0 enumC7370uD02 = EnumC7370uD0.a;
        int i = c4274i32.c;
        if (i != 0) {
            ((C1665Vc1) ((InterfaceC1275Qc1) this.b.get())).a(vy.b != 0 ? new C0029Ad(vy.j0(i), enumC7370uD02, null) : new C0029Ad(vy.j0(i), enumC7370uD0, null), new C0681Im0(29));
            return;
        }
        C6697qh0 c6697qh0 = this.a;
        if (c6697qh0 != null) {
            ((C1665Vc1) ((InterfaceC1275Qc1) c6697qh0.get())).a(vy.b != 0 ? new C0029Ad(vy.j0(i), enumC7370uD02, null) : new C0029Ad(vy.j0(i), enumC7370uD0, null), new C0681Im0(29));
        }
    }
}
