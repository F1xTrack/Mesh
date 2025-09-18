package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6943s implements InterfaceC6900rl1 {
    public int a;
    public boolean b;
    public final Object c;

    public C6943s(X01 x01, int i, boolean z) {
        this.c = x01;
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.InterfaceC6900rl1
    public void a() {
        this.b = true;
    }

    @Override // defpackage.InterfaceC6900rl1
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.b = false;
    }

    @Override // defpackage.InterfaceC6900rl1
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    public C6943s(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.b = false;
    }
}
