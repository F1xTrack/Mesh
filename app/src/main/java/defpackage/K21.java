package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final /* synthetic */ class K21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ K21(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View view = this.b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                View view2 = this.b;
                ((InputMethodManager) AbstractC0872Ky.b(view2.getContext(), InputMethodManager.class)).showSoftInput(view2, 1);
                break;
        }
    }
}
