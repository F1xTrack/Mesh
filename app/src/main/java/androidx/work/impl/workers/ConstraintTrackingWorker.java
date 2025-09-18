package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p000.AbstractC3898cy;
import p000.AbstractC8060Oj0;
import p000.C11687xZ0;
import p000.C1210TE;
import p000.InterfaceC11591wo1;
import p000.InterfaceFutureC7800Jj0;
import p000.O90;
import p000.RunnableC0383G4;

@Metadata(m22266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m22267d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "LOj0;", "Lwo1;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends AbstractC8060Oj0 implements InterfaceC11591wo1 {

    /* renamed from: a */
    public final WorkerParameters f16595a;

    /* renamed from: b */
    public final Object f16596b;

    /* renamed from: c */
    public volatile boolean f16597c;

    /* renamed from: d */
    public final C11687xZ0 f16598d;

    /* renamed from: e */
    public AbstractC8060Oj0 f16599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        O90.m5968f(context, "appContext");
        O90.m5968f(workerParameters, "workerParameters");
        this.f16595a = workerParameters;
        this.f16596b = new Object();
        this.f16598d = new C11687xZ0();
    }

    @Override // p000.InterfaceC11591wo1
    /* renamed from: d */
    public final void mo5550d(ArrayList arrayList) {
        O90.m5968f(arrayList, "workSpecs");
        C1210TE c1210teM7634G = C1210TE.m7634G();
        int i = AbstractC3898cy.f25730a;
        arrayList.toString();
        c1210teM7634G.getClass();
        synchronized (this.f16596b) {
            this.f16597c = true;
        }
    }

    @Override // p000.InterfaceC11591wo1
    /* renamed from: f */
    public final void mo5552f(List list) {
    }

    @Override // p000.AbstractC8060Oj0
    public final void onStopped() {
        super.onStopped();
        AbstractC8060Oj0 abstractC8060Oj0 = this.f16599e;
        if (abstractC8060Oj0 == null || abstractC8060Oj0.isStopped()) {
            return;
        }
        abstractC8060Oj0.stop();
    }

    @Override // p000.AbstractC8060Oj0
    public final InterfaceFutureC7800Jj0 startWork() {
        getBackgroundExecutor().execute(new RunnableC0383G4(26, this));
        C11687xZ0 c11687xZ0 = this.f16598d;
        O90.m5967e(c11687xZ0, "future");
        return c11687xZ0;
    }
}
