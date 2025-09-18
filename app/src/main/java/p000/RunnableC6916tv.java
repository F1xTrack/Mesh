package p000;

/* renamed from: tv */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6916tv implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f43412a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0499Hv f43413b;

    public /* synthetic */ RunnableC6916tv(AbstractActivityC0499Hv abstractActivityC0499Hv, int i) {
        this.f43412a = i;
        this.f43413b = abstractActivityC0499Hv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43412a) {
            case 0:
                AbstractActivityC0499Hv abstractActivityC0499Hv = this.f43413b;
                O90.m5968f(abstractActivityC0499Hv, "this$0");
                abstractActivityC0499Hv.invalidateMenu();
                return;
            default:
                AbstractActivityC0499Hv abstractActivityC0499Hv2 = this.f43413b;
                O90.m5968f(abstractActivityC0499Hv2, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!O90.m5963a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!O90.m5963a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
