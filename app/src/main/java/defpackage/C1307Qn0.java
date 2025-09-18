package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* renamed from: Qn0 */
/* loaded from: classes.dex */
public final class C1307Qn0 extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ C1385Rn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307Qn0(C1385Rn0 c1385Rn0, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = c1385Rn0;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        C1385Rn0 c1385Rn0 = this.c;
        ColorStateList colorStateList2 = c1385Rn0.l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (c1385Rn0.k != 0 && c1385Rn0.l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0937Lu.d(c1385Rn0.l.getColorForState(iArr3, 0), c1385Rn0.k), AbstractC0937Lu.d(c1385Rn0.l.getColorForState(iArr2, 0), c1385Rn0.k), c1385Rn0.k});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C1385Rn0 c1385Rn0 = this.c;
            Drawable rippleDrawable = null;
            if (c1385Rn0.getText().toString().contentEquals(textView.getText()) && c1385Rn0.k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c1385Rn0.k);
                if (this.b != null) {
                    AbstractC4135hL.h(colorDrawable, this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
