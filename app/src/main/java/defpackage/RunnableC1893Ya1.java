package defpackage;

import androidx.appcompat.widget.Toolbar;

/* renamed from: Ya1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1893Ya1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ RunnableC1893Ya1(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C2165ab1 c2165ab1 = this.b.M;
                C0849Kq0 c0849Kq0 = c2165ab1 == null ? null : c2165ab1.b;
                if (c0849Kq0 != null) {
                    c0849Kq0.collapseActionView();
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
