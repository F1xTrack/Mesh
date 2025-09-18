package p000;

/* renamed from: dw */
/* loaded from: classes.dex */
public final class C3958dw {

    /* renamed from: a */
    public final C3896cw f26394a;

    public C3958dw(C3896cw c3896cw) {
        this.f26394a = c3896cw;
    }

    /* renamed from: a */
    public final void m17777a() throws C11708xj1 {
        try {
            ((C3958dw) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC11835yj1.class).newInstance(this.f26394a)).m17777a();
        } catch (Exception e) {
            int i = C11708xj1.f45760a;
            if (!(e instanceof C11708xj1)) {
                throw new C11708xj1(e);
            }
        }
    }
}
