package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: Mq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7970Mq0 extends FrameLayout implements InterfaceC6772ru {

    /* renamed from: a */
    public final CollapsibleActionView f7368a;

    /* JADX WARN: Multi-variable type inference failed */
    public C7970Mq0(View view) {
        super(view.getContext());
        this.f7368a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p000.InterfaceC6772ru
    /* renamed from: d */
    public final void mo5460d() {
        this.f7368a.onActionViewExpanded();
    }

    @Override // p000.InterfaceC6772ru
    /* renamed from: e */
    public final void mo5461e() {
        this.f7368a.onActionViewCollapsed();
    }
}
