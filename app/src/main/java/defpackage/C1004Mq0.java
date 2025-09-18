package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: Mq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004Mq0 extends FrameLayout implements InterfaceC6925ru {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1004Mq0(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.InterfaceC6925ru
    public final void d() {
        this.a.onActionViewExpanded();
    }

    @Override // defpackage.InterfaceC6925ru
    public final void e() {
        this.a.onActionViewCollapsed();
    }
}
