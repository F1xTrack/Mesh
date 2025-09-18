package p000;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* renamed from: NB */
/* loaded from: classes2.dex */
public final class C0830NB extends AbstractC9893jX0 {

    /* renamed from: v1 */
    public InterfaceC9253eX0 f7535v1;

    /* renamed from: w1 */
    public View.OnClickListener f7536w1;

    /* renamed from: x1 */
    public final C6649px f7537x1;

    public C0830NB(Context context, C10659pW0 c10659pW0) {
        super(context);
        C0767MB c0767mb = new C0767MB(this, 0);
        C6649px c6649px = new C6649px();
        c6649px.f40447c = c10659pW0;
        c6649px.f40448d = c0767mb;
        c6649px.f40446b = true;
        this.f7537x1 = c6649px;
        super.setOnSearchClickListener(new ViewOnClickListenerC1250Ts(1, this));
        super.setOnCloseListener(new C0071B7(28, this));
        setMaxWidth(Integer.MAX_VALUE);
    }

    public final boolean getOverrideBackAction() {
        return this.f7537x1.f40446b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35191P) {
            return;
        }
        this.f7537x1.m23893d();
    }

    @Override // p000.AbstractC9893jX0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6649px c6649px = this.f7537x1;
        if (c6649px.f40445a) {
            Iterator it = ((C0767MB) c6649px.f40448d).f7027b.iterator();
            while (it.hasNext()) {
                ((InterfaceC0430Gp) it.next()).cancel();
            }
            c6649px.f40445a = false;
        }
    }

    @Override // p000.AbstractC9893jX0
    public void setOnCloseListener(InterfaceC9253eX0 interfaceC9253eX0) {
        this.f7535v1 = interfaceC9253eX0;
    }

    @Override // p000.AbstractC9893jX0
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f7536w1 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z) {
        this.f7537x1.f40446b = z;
    }

    public final void setText(String str) {
        O90.m5968f(str, "text");
        m22062t(str);
    }
}
