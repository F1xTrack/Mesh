package defpackage;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

/* renamed from: dX0 */
/* loaded from: classes.dex */
public abstract class AbstractC3409dX0 {
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(SearchView$SearchAutoComplete searchView$SearchAutoComplete, int i) {
        searchView$SearchAutoComplete.setInputMethodMode(i);
    }
}
