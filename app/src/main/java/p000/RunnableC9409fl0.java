package p000;

import com.facebook.react.devsupport.LogBoxModule;

/* renamed from: fl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9409fl0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f27372a;

    /* renamed from: b */
    public final /* synthetic */ LogBoxModule f27373b;

    public /* synthetic */ RunnableC9409fl0(LogBoxModule logBoxModule, int i) {
        this.f27372a = i;
        this.f27373b = logBoxModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27372a) {
            case 0:
                LogBoxModule.hide$lambda$2(this.f27373b);
                break;
            case 1:
                LogBoxModule._init_$lambda$0(this.f27373b);
                break;
            default:
                LogBoxModule.invalidate$lambda$3(this.f27373b);
                break;
        }
    }
}
