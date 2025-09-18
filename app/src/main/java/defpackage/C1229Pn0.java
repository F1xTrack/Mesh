package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: Pn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1229Pn0 extends I3 {
    public final C6145no0 c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1229Pn0(C1417Ry c1417Ry) {
        TypedValue typedValueA = AbstractC5340ja1.a(c1417Ry, R.attr.materialAlertDialogTheme);
        int i = typedValueA == null ? 0 : typedValueA.data;
        Context contextB = AbstractC7362uA1.b(c1417Ry, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextB = i != 0 ? new C1417Ry(contextB, i) : contextB;
        TypedValue typedValueA2 = AbstractC5340ja1.a(c1417Ry, R.attr.materialAlertDialogTheme);
        super(contextB, typedValueA2 == null ? 0 : typedValueA2.data);
        Context context = getContext();
        Resources.Theme theme = context.getTheme();
        int[] iArr = NG0.k;
        DJ1.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        DJ1.b(context, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        TypedValue typedValueC = AbstractC5340ja1.c(context, R.attr.colorSurface, C1229Pn0.class.getCanonicalName());
        int i2 = typedValueC.resourceId;
        int iA = i2 != 0 ? AbstractC0872Ky.a(context, i2) : typedValueC.data;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iA);
        typedArrayObtainStyledAttributes2.recycle();
        C6145no0 c6145no0 = new C6145no0(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        c6145no0.h(context);
        c6145no0.j(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                C1701Vo1 c1701Vo1E = c6145no0.a.a.e();
                c1701Vo1E.e = new C7897x(dimension);
                c1701Vo1E.f = new C7897x(dimension);
                c1701Vo1E.g = new C7897x(dimension);
                c1701Vo1E.h = new C7897x(dimension);
                c6145no0.setShapeAppearanceModel(c1701Vo1E.c());
            }
        }
        this.c = c6145no0;
    }

    @Override // defpackage.I3
    public final void a(String str) {
        this.a.f = str;
    }

    public final void c(int i, FJ fj) {
    }

    @Override // defpackage.I3
    public final J3 create() {
        J3 j3Create = super.create();
        Window window = j3Create.getWindow();
        View decorView = window.getDecorView();
        C6145no0 c6145no0 = this.c;
        if (c6145no0 instanceof C6145no0) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            c6145no0.i(AbstractC4021gk1.i(decorView));
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) c6145no0, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new H80(j3Create, rect));
        return j3Create;
    }

    public final void d(int i, FJ fj) {
    }

    @Override // defpackage.I3
    public final I3 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (C1229Pn0) super.setNegativeButton(i, onClickListener);
    }

    @Override // defpackage.I3
    public final I3 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (C1229Pn0) super.setPositiveButton(i, onClickListener);
    }

    @Override // defpackage.I3
    public final I3 setTitle(CharSequence charSequence) {
        return (C1229Pn0) super.setTitle(charSequence);
    }

    @Override // defpackage.I3
    public final I3 setView(View view) {
        return (C1229Pn0) super.setView(view);
    }
}
