package p000;

import android.view.View;
import com.facebook.yoga.YogaNodeJNIBase;

/* loaded from: classes2.dex */
public final class JM0 extends C10169lh0 implements InterfaceC7761Ip1 {

    /* renamed from: A */
    public int f5492A;

    /* renamed from: B */
    public boolean f5493B;

    /* renamed from: z */
    public int f5494z;

    @Override // p000.InterfaceC7761Ip1
    /* renamed from: a0 */
    public final long mo4023a0(YogaNodeJNIBase yogaNodeJNIBase, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12) {
        if (!this.f5493B) {
            S91 s91 = this.f2652d;
            UN1.m7999c(s91);
            GM0 gm0 = new GM0(s91);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            gm0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.f5494z = gm0.getMeasuredWidth();
            this.f5492A = gm0.getMeasuredHeight();
            this.f5493B = true;
        }
        return AbstractC11746y12.m26033b(this.f5494z, this.f5492A);
    }
}
