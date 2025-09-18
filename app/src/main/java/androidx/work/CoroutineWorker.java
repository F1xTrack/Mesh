package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import p000.AbstractC11432vY1;
import p000.AbstractC11551wU1;
import p000.AbstractC1571Yy;
import p000.AbstractC8060Oj0;
import p000.AbstractC9366fP1;
import p000.C0399GK;
import p000.C1006Pz;
import p000.C1068Qy;
import p000.C1069Qz;
import p000.C11687xZ0;
import p000.C7064wG;
import p000.C8148Qb0;
import p000.C8304Tb0;
import p000.C8539Xo1;
import p000.ExecutorC6865t6;
import p000.InterfaceFutureC7800Jj0;
import p000.O90;
import p000.RunnableC0383G4;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m22267d2 = {"Landroidx/work/CoroutineWorker;", "LOj0;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends AbstractC8060Oj0 {

    /* renamed from: a */
    public final C8148Qb0 f16563a;

    /* renamed from: b */
    public final C11687xZ0 f16564b;

    /* renamed from: c */
    public final C7064wG f16565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        O90.m5968f(context, "appContext");
        O90.m5968f(workerParameters, "params");
        this.f16563a = new C8148Qb0(null);
        C11687xZ0 c11687xZ0 = new C11687xZ0();
        this.f16564b = c11687xZ0;
        c11687xZ0.mo2494d(new RunnableC0383G4(27, this), (ExecutorC6865t6) ((C8539Xo1) getTaskExecutor()).f13981b);
        this.f16565c = C0399GK.f3695b;
    }

    /* renamed from: a */
    public abstract Object mo10322a(AbstractC1571Yy abstractC1571Yy);

    @Override // p000.AbstractC8060Oj0
    public final InterfaceFutureC7800Jj0 getForegroundInfoAsync() {
        C8148Qb0 c8148Qb0 = new C8148Qb0(null);
        C7064wG c7064wG = this.f16565c;
        c7064wG.getClass();
        C1068Qy c1068QyM25444a = AbstractC11432vY1.m25444a(AbstractC11551wU1.m25639c(c7064wG, c8148Qb0));
        C8304Tb0 c8304Tb0 = new C8304Tb0(c8148Qb0);
        AbstractC9366fP1.m18230b(c1068QyM25444a, null, new C1006Pz(c8304Tb0, this, null), 3);
        return c8304Tb0;
    }

    @Override // p000.AbstractC8060Oj0
    public final void onStopped() {
        super.onStopped();
        this.f16564b.cancel(false);
    }

    @Override // p000.AbstractC8060Oj0
    public final InterfaceFutureC7800Jj0 startWork() {
        C8148Qb0 c8148Qb0 = this.f16563a;
        C7064wG c7064wG = this.f16565c;
        c7064wG.getClass();
        AbstractC9366fP1.m18230b(AbstractC11432vY1.m25444a(AbstractC11551wU1.m25639c(c7064wG, c8148Qb0)), null, new C1069Qz(this, null), 3);
        return this.f16564b;
    }
}
