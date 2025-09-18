package p000;

import android.view.Choreographer;
import android.view.View;

/* renamed from: Ut */
/* loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC1314Ut implements Choreographer.FrameCallback {

    /* renamed from: a */
    public final /* synthetic */ int f12188a;

    /* renamed from: b */
    public final /* synthetic */ Object f12189b;

    public /* synthetic */ ChoreographerFrameCallbackC1314Ut(int i, Object obj) {
        this.f12188a = i;
        this.f12189b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f12188a) {
            case 0:
                GR0 gr0 = (GR0) this.f12189b;
                C1377Vt c1377Vt = (C1377Vt) gr0.f3738b;
                C7005vK c7005vK = c1377Vt.f12845b;
                if (c7005vK.f44329b != c7005vK.f44330c) {
                    c1377Vt.m8615b();
                }
                ((C1377Vt) gr0.f3738b).f12844a = false;
                break;
            case 1:
                C1585ZB c1585zb = (C1585ZB) this.f12189b;
                c1585zb.f14770V = false;
                c1585zb.measure(View.MeasureSpec.makeMeasureSpec(c1585zb.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(c1585zb.getHeight(), Integer.MIN_VALUE));
                c1585zb.layout(c1585zb.getLeft(), c1585zb.getTop(), c1585zb.getRight(), c1585zb.getBottom());
                break;
            default:
                SV0 sv0 = (SV0) this.f12189b;
                sv0.f10819e = false;
                sv0.measure(View.MeasureSpec.makeMeasureSpec(sv0.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(sv0.getHeight(), 1073741824));
                sv0.layout(sv0.getLeft(), sv0.getTop(), sv0.getRight(), sv0.getBottom());
                break;
        }
    }
}
