package defpackage;

import com.facebook.react.devsupport.LogBoxModule;

/* renamed from: fl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3832fl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogBoxModule b;

    public /* synthetic */ RunnableC3832fl0(LogBoxModule logBoxModule, int i) {
        this.a = i;
        this.b = logBoxModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LogBoxModule.hide$lambda$2(this.b);
                break;
            case 1:
                LogBoxModule._init_$lambda$0(this.b);
                break;
            default:
                LogBoxModule.invalidate$lambda$3(this.b);
                break;
        }
    }
}
