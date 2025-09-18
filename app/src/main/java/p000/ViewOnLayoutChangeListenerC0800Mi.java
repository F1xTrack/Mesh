package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import ru.mes.dnevnik.R;

/* renamed from: Mi */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0800Mi implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f7307a;

    /* renamed from: b */
    public final /* synthetic */ Object f7308b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0800Mi(int i, Object obj) {
        this.f7307a = i;
        this.f7308b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object obj = this.f7308b;
        switch (this.f7307a) {
            case 0:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
            default:
                C0830NB c0830nb = (C0830NB) obj;
                View view2 = c0830nb.f35216x;
                if (view2.getWidth() > 1) {
                    Resources resources = c0830nb.getContext().getResources();
                    int paddingLeft = c0830nb.f35207r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z = AbstractC7337Al1.f354a;
                    boolean z2 = c0830nb.getLayoutDirection() == 1;
                    int dimensionPixelSize = c0830nb.f35190O ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView$SearchAutoComplete searchView$SearchAutoComplete = c0830nb.f35204p;
                    searchView$SearchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchView$SearchAutoComplete.setDropDownHorizontalOffset(z2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchView$SearchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
