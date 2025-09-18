package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: cX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2533cX0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ NB a;

    public C2533cX0(NB nb) {
        this.a = nb;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.s();
        return true;
    }
}
