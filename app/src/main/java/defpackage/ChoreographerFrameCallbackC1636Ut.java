package defpackage;

import android.view.Choreographer;
import android.view.View;

/* renamed from: Ut, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC1636Ut implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ChoreographerFrameCallbackC1636Ut(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.a) {
            case 0:
                GR0 gr0 = (GR0) this.b;
                C1714Vt c1714Vt = (C1714Vt) gr0.b;
                C7581vK c7581vK = c1714Vt.b;
                if (c7581vK.b != c7581vK.c) {
                    c1714Vt.b();
                }
                ((C1714Vt) gr0.b).a = false;
                break;
            case 1:
                ZB zb = (ZB) this.b;
                zb.V = false;
                zb.measure(View.MeasureSpec.makeMeasureSpec(zb.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(zb.getHeight(), Integer.MIN_VALUE));
                zb.layout(zb.getLeft(), zb.getTop(), zb.getRight(), zb.getBottom());
                break;
            default:
                SV0 sv0 = (SV0) this.b;
                sv0.e = false;
                sv0.measure(View.MeasureSpec.makeMeasureSpec(sv0.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(sv0.getHeight(), 1073741824));
                sv0.layout(sv0.getLeft(), sv0.getTop(), sv0.getRight(), sv0.getBottom());
                break;
        }
    }
}
