package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: Us, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC1633Us implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnFocusChangeListenerC1633Us(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                C1867Xs c1867Xs = (C1867Xs) this.b;
                c1867Xs.t(c1867Xs.u());
                break;
            case 1:
                for (EditText editText : (EditText[]) this.b) {
                    if (editText.hasFocus()) {
                        break;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) AbstractC0872Ky.b(view.getContext(), InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    break;
                }
                break;
            case 2:
                C4329iM c4329iM = (C4329iM) this.b;
                c4329iM.l = z;
                c4329iM.q();
                if (!z) {
                    c4329iM.t(false);
                    c4329iM.m = false;
                    break;
                }
                break;
            default:
                XW0 xw0 = (XW0) this.b;
                O90.f(xw0, "this$0");
                int i = xw0.m;
                xw0.s(z ? new C7098so(i, xw0.getId(), 23) : new C7098so(i, xw0.getId(), 21));
                break;
        }
    }
}
