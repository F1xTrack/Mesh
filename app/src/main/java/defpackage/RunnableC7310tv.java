package defpackage;

/* renamed from: tv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7310tv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractActivityC0629Hv b;

    public /* synthetic */ RunnableC7310tv(AbstractActivityC0629Hv abstractActivityC0629Hv, int i) {
        this.a = i;
        this.b = abstractActivityC0629Hv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AbstractActivityC0629Hv abstractActivityC0629Hv = this.b;
                O90.f(abstractActivityC0629Hv, "this$0");
                abstractActivityC0629Hv.invalidateMenu();
                return;
            default:
                AbstractActivityC0629Hv abstractActivityC0629Hv2 = this.b;
                O90.f(abstractActivityC0629Hv2, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!O90.a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!O90.a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
