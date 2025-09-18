package p000;

import android.content.Context;

/* renamed from: o32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10474o32 implements InterfaceC9834j32 {

    /* renamed from: a */
    public final C10809qh0 f38749a;

    /* renamed from: b */
    public final C10809qh0 f38750b;

    /* renamed from: c */
    public final C9706i32 f38751c;

    public C10474o32(Context context, C9706i32 c9706i32) {
        this.f38751c = c9706i32;
        C0928Ok c0928Ok = C0928Ok.f8587e;
        C8877bd1.m10476b(context);
        C8359Uc1 c8359Uc1M10477c = C8877bd1.m10475a().m10477c(c0928Ok);
        if (C0928Ok.f8586d.contains(new C7135xO("json"))) {
            this.f38749a = new C10809qh0(new C10914rV1(c8359Uc1M10477c, 2));
        }
        this.f38750b = new C10809qh0(new C10914rV1(c8359Uc1M10477c, 3));
    }

    @Override // p000.InterfaceC9834j32
    /* renamed from: a */
    public final void mo21975a(C1356VY c1356vy) {
        C9706i32 c9706i32 = this.f38751c;
        EnumC11261uD0 enumC11261uD0 = EnumC11261uD0.f43595b;
        EnumC11261uD0 enumC11261uD02 = EnumC11261uD0.f43594a;
        int i = c9706i32.f28801c;
        if (i != 0) {
            ((C8411Vc1) ((InterfaceC8151Qc1) this.f38750b.get())).m8514a(c1356vy.f12611b != 0 ? new C0040Ad(c1356vy.m8502j0(i), enumC11261uD02, null) : new C0040Ad(c1356vy.m8502j0(i), enumC11261uD0, null), new C7754Im0(29));
            return;
        }
        C10809qh0 c10809qh0 = this.f38749a;
        if (c10809qh0 != null) {
            ((C8411Vc1) ((InterfaceC8151Qc1) c10809qh0.get())).m8514a(c1356vy.f12611b != 0 ? new C0040Ad(c1356vy.m8502j0(i), enumC11261uD02, null) : new C0040Ad(c1356vy.m8502j0(i), enumC11261uD0, null), new C7754Im0(29));
        }
    }
}
