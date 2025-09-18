package p000;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import java.lang.reflect.InvocationTargetException;

/* renamed from: bX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC8864bX0 implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C0830NB f17062a;

    public ViewOnKeyListenerC8864bX0(C0830NB c0830nb) {
        this.f17062a = c0830nb;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0830NB c0830nb = this.f17062a;
        if (c0830nb.f35203e0 == null) {
            return false;
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = c0830nb.f35204p;
        if (!searchView$SearchAutoComplete.isPopupShowing() || searchView$SearchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchView$SearchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            c0830nb.getContext().startActivity(c0830nb.m22054l("android.intent.action.SEARCH", null, null, searchView$SearchAutoComplete.getText().toString()));
            return true;
        }
        if (c0830nb.f35203e0 == null || c0830nb.f35192Q == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            c0830nb.m22058p(searchView$SearchAutoComplete.getListSelection());
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
            searchView$SearchAutoComplete.m9848a();
        }
        return true;
    }
}
