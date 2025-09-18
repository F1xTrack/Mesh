package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import io.sentry.android.core.internal.util.f;

/* loaded from: classes.dex */
public final /* synthetic */ class FV implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;

    public /* synthetic */ FV(Object obj, View view, int i) {
        this.a = i;
        this.b = obj;
        this.c = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                GV gv = (GV) this.b;
                gv.getClass();
                this.c.getViewTreeObserver().removeOnDrawListener(gv);
                break;
            case 1:
                C6846rT1 c6846rT1 = (C6846rT1) this.b;
                O90.f(c6846rT1, "this$0");
                c6846rT1.J((ViewGroup) this.c);
                break;
            default:
                f fVar = (f) this.b;
                fVar.getClass();
                this.c.getViewTreeObserver().removeOnDrawListener(fVar);
                break;
        }
    }
}
