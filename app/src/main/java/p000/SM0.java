package p000;

import android.view.View;
import com.facebook.yoga.YogaNodeJNIBase;

/* loaded from: classes.dex */
public final class SM0 extends C10169lh0 implements InterfaceC7761Ip1 {

    /* renamed from: A */
    public int f10701A;

    /* renamed from: B */
    public boolean f10702B;

    /* renamed from: z */
    public int f10703z;

    @Override // p000.InterfaceC7761Ip1
    /* renamed from: a0 */
    public final long mo4023a0(YogaNodeJNIBase yogaNodeJNIBase, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12) {
        if (!this.f10702B) {
            S91 s91 = this.f2652d;
            UN1.m7999c(s91);
            QM0 qm0 = new QM0(s91);
            qm0.setShowText(false);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            qm0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.f10703z = qm0.getMeasuredWidth();
            this.f10701A = qm0.getMeasuredHeight();
            this.f10702B = true;
        }
        return AbstractC11746y12.m26033b(this.f10703z, this.f10701A);
    }
}
