package p000;

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
public final class C8172Qn0 extends ArrayAdapter {

    /* renamed from: a */
    public ColorStateList f9781a;

    /* renamed from: b */
    public ColorStateList f9782b;

    /* renamed from: c */
    public final /* synthetic */ C8224Rn0 f9783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8172Qn0(C8224Rn0 c8224Rn0, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f9783c = c8224Rn0;
        m6784a();
    }

    /* renamed from: a */
    public final void m6784a() {
        ColorStateList colorStateList;
        C8224Rn0 c8224Rn0 = this.f9783c;
        ColorStateList colorStateList2 = c8224Rn0.f10422l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f9782b = colorStateList;
        if (c8224Rn0.f10421k != 0 && c8224Rn0.f10422l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0749Lu.m5131d(c8224Rn0.f10422l.getColorForState(iArr3, 0), c8224Rn0.f10421k), AbstractC0749Lu.m5131d(c8224Rn0.f10422l.getColorForState(iArr2, 0), c8224Rn0.f10421k), c8224Rn0.f10421k});
        }
        this.f9781a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C8224Rn0 c8224Rn0 = this.f9783c;
            Drawable rippleDrawable = null;
            if (c8224Rn0.getText().toString().contentEquals(textView.getText()) && c8224Rn0.f10421k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c8224Rn0.f10421k);
                if (this.f9782b != null) {
                    AbstractC4173hL.m18806h(colorDrawable, this.f9781a);
                    rippleDrawable = new RippleDrawable(this.f9782b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
