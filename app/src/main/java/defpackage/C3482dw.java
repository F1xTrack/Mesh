package defpackage;

/* renamed from: dw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3482dw {
    public final C3292cw a;

    public C3482dw(C3292cw c3292cw) {
        this.a = c3292cw;
    }

    public final void a() throws C8038xj1 {
        try {
            ((C3482dw) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC8228yj1.class).newInstance(this.a)).a();
        } catch (Exception e) {
            int i = C8038xj1.a;
            if (!(e instanceof C8038xj1)) {
                throw new C8038xj1(e);
            }
        }
    }
}
