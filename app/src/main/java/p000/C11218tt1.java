package p000;

/* renamed from: tt1 */
/* loaded from: classes.dex */
public final class C11218tt1 {

    /* renamed from: b */
    public final ExecutorC1215TJ f43401b;

    /* renamed from: d */
    public final Object f43403d;

    /* renamed from: a */
    public final /* synthetic */ int f43400a = 0;

    /* renamed from: c */
    public final Object f43402c = new Object();

    public C11218tt1(ExecutorC1215TJ executorC1215TJ, InterfaceC7984Mx0 interfaceC7984Mx0) {
        this.f43403d = interfaceC7984Mx0;
        this.f43401b = executorC1215TJ;
    }

    /* renamed from: a */
    public final void m25028a(C8499Wu1 c8499Wu1) {
        switch (this.f43400a) {
            case 0:
                this.f43401b.execute(new RunnableC1420WZ(this, c8499Wu1, false, 20));
                break;
            case 1:
                if (!c8499Wu1.mo8877g()) {
                    this.f43401b.execute(new RunnableC1483XZ(this, c8499Wu1, false, 24));
                    break;
                }
                break;
            default:
                if (c8499Wu1.mo8877g()) {
                    this.f43401b.execute(new RunnableC1420WZ(this, c8499Wu1, false, 21));
                    break;
                }
                break;
        }
    }

    public C11218tt1(ExecutorC1215TJ executorC1215TJ, InterfaceC8244Rx0 interfaceC8244Rx0) {
        this.f43403d = interfaceC8244Rx0;
        this.f43401b = executorC1215TJ;
    }

    public C11218tt1(ExecutorC1215TJ executorC1215TJ, InterfaceC9051cy0 interfaceC9051cy0) {
        this.f43403d = interfaceC9051cy0;
        this.f43401b = executorC1215TJ;
    }
}
