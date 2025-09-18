package defpackage;

import android.view.View;
import com.facebook.yoga.YogaNodeJNIBase;

/* loaded from: classes2.dex */
public final class JM0 extends C5742lh0 implements InterfaceC0691Ip1 {
    public int A;
    public boolean B;
    public int z;

    @Override // defpackage.InterfaceC0691Ip1
    public final long a0(YogaNodeJNIBase yogaNodeJNIBase, float f, EnumC0769Jp1 enumC0769Jp1, float f2, EnumC0769Jp1 enumC0769Jp12) {
        if (!this.B) {
            S91 s91 = this.d;
            UN1.c(s91);
            GM0 gm0 = new GM0(s91);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            gm0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.z = gm0.getMeasuredWidth();
            this.A = gm0.getMeasuredHeight();
            this.B = true;
        }
        return AbstractC8095y12.b(this.z, this.A);
    }
}
