package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import ru.mes.dnevnik.R;

/* renamed from: Mi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0979Mi implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0979Mi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
            default:
                NB nb = (NB) obj;
                View view2 = nb.x;
                if (view2.getWidth() > 1) {
                    Resources resources = nb.getContext().getResources();
                    int paddingLeft = nb.r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z = AbstractC0055Al1.a;
                    boolean z2 = nb.getLayoutDirection() == 1;
                    int dimensionPixelSize = nb.O ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView$SearchAutoComplete searchView$SearchAutoComplete = nb.p;
                    searchView$SearchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchView$SearchAutoComplete.setDropDownHorizontalOffset(z2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchView$SearchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
