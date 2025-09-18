package p000;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: s */
/* loaded from: classes.dex */
public final class C6795s implements InterfaceC10946rl1 {

    /* renamed from: a */
    public int f42187a;

    /* renamed from: b */
    public boolean f42188b;

    /* renamed from: c */
    public final Object f42189c;

    public C6795s(X01 x01, int i, boolean z) {
        this.f42189c = x01;
        this.f42187a = i;
        this.f42188b = z;
    }

    @Override // p000.InterfaceC10946rl1
    /* renamed from: a */
    public void mo5508a() {
        this.f42188b = true;
    }

    @Override // p000.InterfaceC10946rl1
    /* renamed from: b */
    public void mo5509b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f42188b = false;
    }

    @Override // p000.InterfaceC10946rl1
    /* renamed from: c */
    public void mo18261c() {
        if (this.f42188b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f42189c;
        actionBarContextView.f15795f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f42187a);
    }

    public C6795s(ActionBarContextView actionBarContextView) {
        this.f42189c = actionBarContextView;
        this.f42188b = false;
    }
}
