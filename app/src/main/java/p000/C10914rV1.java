package p000;

/* renamed from: rV1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C10914rV1 implements InterfaceC9347fG0 {

    /* renamed from: a */
    public final /* synthetic */ int f41693a;

    /* renamed from: b */
    public final /* synthetic */ C8359Uc1 f41694b;

    public /* synthetic */ C10914rV1(C8359Uc1 c8359Uc1, int i) {
        this.f41693a = i;
        this.f41694b = c8359Uc1;
    }

    @Override // p000.InterfaceC9347fG0
    public final Object get() {
        switch (this.f41693a) {
            case 0:
                return this.f41694b.m8089a("FIREBASE_ML_SDK", new C7135xO("json"), C8326Tm0.f11512i);
            case 1:
                return this.f41694b.m8089a("FIREBASE_ML_SDK", new C7135xO("proto"), C10689pl0.f40373j);
            case 2:
                return this.f41694b.m8089a("FIREBASE_ML_SDK", new C7135xO("json"), new BG1(4));
            default:
                return this.f41694b.m8089a("FIREBASE_ML_SDK", new C7135xO("proto"), new C11523wG1(4));
        }
    }
}
