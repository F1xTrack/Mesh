package p000;

/* renamed from: Ej0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7540Ej0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2858a;

    /* renamed from: b */
    public final /* synthetic */ C7696Hj0 f2859b;

    public /* synthetic */ RunnableC7540Ej0(C7696Hj0 c7696Hj0, int i) {
        this.f2858a = i;
        this.f2859b = c7696Hj0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2858a) {
            case 0:
                C1659aM c1659aM = this.f2859b.f4457c;
                if (c1659aM != null) {
                    c1659aM.setListSelectionHidden(true);
                    c1659aM.requestLayout();
                    break;
                }
                break;
            default:
                C7696Hj0 c7696Hj0 = this.f2859b;
                C1659aM c1659aM2 = c7696Hj0.f4457c;
                if (c1659aM2 != null && c1659aM2.isAttachedToWindow() && c7696Hj0.f4457c.getCount() > c7696Hj0.f4457c.getChildCount() && c7696Hj0.f4457c.getChildCount() <= c7696Hj0.f4467m) {
                    c7696Hj0.f4480z.setInputMethodMode(2);
                    c7696Hj0.mo335b();
                    break;
                }
                break;
        }
    }
}
