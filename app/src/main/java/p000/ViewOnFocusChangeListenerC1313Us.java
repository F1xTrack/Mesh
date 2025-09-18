package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: Us */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC1313Us implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f12179a;

    /* renamed from: b */
    public final /* synthetic */ Object f12180b;

    public /* synthetic */ ViewOnFocusChangeListenerC1313Us(int i, Object obj) {
        this.f12179a = i;
        this.f12180b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f12179a) {
            case 0:
                C1502Xs c1502Xs = (C1502Xs) this.f12180b;
                c1502Xs.m9175t(c1502Xs.m9176u());
                break;
            case 1:
                for (EditText editText : (EditText[]) this.f12180b) {
                    if (editText.hasFocus()) {
                        break;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) AbstractC0691Ky.m4784b(view.getContext(), InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    break;
                }
                break;
            case 2:
                C4237iM c4237iM = (C4237iM) this.f12180b;
                c4237iM.f29103l = z;
                c4237iM.m1176q();
                if (!z) {
                    c4237iM.m19005t(false);
                    c4237iM.f29104m = false;
                    break;
                }
                break;
            default:
                XW0 xw0 = (XW0) this.f12180b;
                O90.m5968f(xw0, "this$0");
                int i = xw0.f13827m;
                xw0.m9068s(z ? new C6846so(i, xw0.getId(), 23) : new C6846so(i, xw0.getId(), 21));
                break;
        }
    }
}
