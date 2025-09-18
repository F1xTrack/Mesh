package defpackage;

import android.widget.EditText;

/* renamed from: dg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3436dg0 {
    public final EditText a;
    public final MW b;
    public int c;
    public int d;
    public int e;
    public final ViewTreeObserverOnPreDrawListenerC6559pz f;

    public C3436dg0(EditText editText, MW mw) {
        O90.f(editText, "editText");
        O90.f(mw, NotificationConstants.ACTION);
        this.a = editText;
        this.b = mw;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = new ViewTreeObserverOnPreDrawListenerC6559pz(1, this);
    }
}
