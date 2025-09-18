package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import java.lang.reflect.InvocationTargetException;

/* renamed from: bX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2343bX0 implements View.OnKeyListener {
    public final /* synthetic */ NB a;

    public ViewOnKeyListenerC2343bX0(NB nb) {
        this.a = nb;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        NB nb = this.a;
        if (nb.e0 == null) {
            return false;
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = nb.p;
        if (!searchView$SearchAutoComplete.isPopupShowing() || searchView$SearchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchView$SearchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            nb.getContext().startActivity(nb.l("android.intent.action.SEARCH", null, null, searchView$SearchAutoComplete.getText().toString()));
            return true;
        }
        if (nb.e0 == null || nb.Q == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            nb.p(searchView$SearchAutoComplete.getListSelection());
        } else {
            if (i != 21 && i != 22) {
                if (i != 19) {
                    return false;
                }
                searchView$SearchAutoComplete.getListSelection();
                return false;
            }
            searchView$SearchAutoComplete.setSelection(i == 21 ? 0 : searchView$SearchAutoComplete.length());
            searchView$SearchAutoComplete.setListSelection(0);
            searchView$SearchAutoComplete.clearListSelection();
            searchView$SearchAutoComplete.a();
        }
        return true;
    }
}
