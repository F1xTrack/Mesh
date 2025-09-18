package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final /* synthetic */ class K21 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5886a;

    /* renamed from: b */
    public final /* synthetic */ View f5887b;

    public /* synthetic */ K21(int i, View view) {
        this.f5886a = i;
        this.f5887b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5886a) {
            case 0:
                View view = this.f5887b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                View view2 = this.f5887b;
                ((InputMethodManager) AbstractC0691Ky.m4784b(view2.getContext(), InputMethodManager.class)).showSoftInput(view2, 1);
                break;
        }
    }
}
