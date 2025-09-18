package p000;

import java.io.File;

/* renamed from: UT */
/* loaded from: classes2.dex */
public final class C1288UT extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f11797e;

    /* renamed from: f */
    public final /* synthetic */ C1414WT f11798f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1288UT(C1414WT c1414wt, int i) {
        super(0);
        this.f11797e = i;
        this.f11798f = c1414wt;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        C1414WT c1414wt = this.f11798f;
        switch (this.f11797e) {
            case 0:
                try {
                    File filesDir = c1414wt.m8778o().getFilesDir();
                    O90.m5967e(filesDir, "getFilesDir(...)");
                    C1414WT.m8767g(c1414wt, filesDir);
                    File cacheDir = c1414wt.m8778o().getCacheDir();
                    O90.m5967e(cacheDir, "getCacheDir(...)");
                    C1414WT.m8767g(c1414wt, cacheDir);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            default:
                try {
                    AbstractC11432vY1.m25445b(c1414wt.f13197f, new C1005Py("Module destroyed. All coroutines are cancelled."));
                    break;
                } catch (IllegalStateException unused) {
                    String str = AbstractC1477XT.f13800a;
                    break;
                }
        }
        return c8313Tf1;
        return c8313Tf1;
    }
}
