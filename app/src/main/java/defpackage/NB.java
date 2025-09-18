package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class NB extends AbstractC5330jX0 {
    public InterfaceC3599eX0 v1;
    public View.OnClickListener w1;
    public final C6553px x1;

    public NB(Context context, C6473pW0 c6473pW0) {
        super(context);
        MB mb = new MB(this, 0);
        C6553px c6553px = new C6553px();
        c6553px.c = c6473pW0;
        c6553px.d = mb;
        c6553px.b = true;
        this.x1 = c6553px;
        super.setOnSearchClickListener(new ViewOnClickListenerC1555Ts(1, this));
        super.setOnCloseListener(new B7(28, this));
        setMaxWidth(Integer.MAX_VALUE);
    }

    public final boolean getOverrideBackAction() {
        return this.x1.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.P) {
            return;
        }
        this.x1.d();
    }

    @Override // defpackage.AbstractC5330jX0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6553px c6553px = this.x1;
        if (c6553px.a) {
            Iterator it = ((MB) c6553px.d).b.iterator();
            while (it.hasNext()) {
                ((InterfaceC0533Gp) it.next()).cancel();
            }
            c6553px.a = false;
        }
    }

    @Override // defpackage.AbstractC5330jX0
    public void setOnCloseListener(InterfaceC3599eX0 interfaceC3599eX0) {
        this.v1 = interfaceC3599eX0;
    }

    @Override // defpackage.AbstractC5330jX0
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.w1 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z) {
        this.x1.b = z;
    }

    public final void setText(String str) {
        O90.f(str, "text");
        t(str);
    }
}
