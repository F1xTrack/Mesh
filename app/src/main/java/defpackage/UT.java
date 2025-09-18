package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class UT extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ WT f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UT(WT wt, int i) {
        super(0);
        this.e = i;
        this.f = wt;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        WT wt = this.f;
        switch (this.e) {
            case 0:
                try {
                    File filesDir = wt.o().getFilesDir();
                    O90.e(filesDir, "getFilesDir(...)");
                    WT.g(wt, filesDir);
                    File cacheDir = wt.o().getCacheDir();
                    O90.e(cacheDir, "getCacheDir(...)");
                    WT.g(wt, cacheDir);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            default:
                try {
                    AbstractC7625vY1.b(wt.f, new C1261Py("Module destroyed. All coroutines are cancelled."));
                    break;
                } catch (IllegalStateException unused) {
                    String str = XT.a;
                    break;
                }
        }
        return c1518Tf1;
        return c1518Tf1;
    }
}
