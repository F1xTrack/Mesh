package defpackage;

/* renamed from: Ej0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0360Ej0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0594Hj0 b;

    public /* synthetic */ RunnableC0360Ej0(C0594Hj0 c0594Hj0, int i) {
        this.a = i;
        this.b = c0594Hj0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C2118aM c2118aM = this.b.c;
                if (c2118aM != null) {
                    c2118aM.setListSelectionHidden(true);
                    c2118aM.requestLayout();
                    break;
                }
                break;
            default:
                C0594Hj0 c0594Hj0 = this.b;
                C2118aM c2118aM2 = c0594Hj0.c;
                if (c2118aM2 != null && c2118aM2.isAttachedToWindow() && c0594Hj0.c.getCount() > c0594Hj0.c.getChildCount() && c0594Hj0.c.getChildCount() <= c0594Hj0.m) {
                    c0594Hj0.z.setInputMethodMode(2);
                    c0594Hj0.b();
                    break;
                }
                break;
        }
    }
}
