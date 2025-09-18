package p000;

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
public final class C8120Pn0 extends C0508I3 {

    /* renamed from: c */
    public final C10439no0 f9280c;

    /* renamed from: d */
    public final Rect f9281d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8120Pn0(C1130Ry c1130Ry) {
        TypedValue typedValueM22072a = AbstractC9900ja1.m22072a(c1130Ry, R.attr.materialAlertDialogTheme);
        int i = typedValueM22072a == null ? 0 : typedValueM22072a.data;
        Context contextM25127b = AbstractC11256uA1.m25127b(c1130Ry, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextM25127b = i != 0 ? new C1130Ry(contextM25127b, i) : contextM25127b;
        TypedValue typedValueM22072a2 = AbstractC9900ja1.m22072a(c1130Ry, R.attr.materialAlertDialogTheme);
        super(contextM25127b, typedValueM22072a2 == null ? 0 : typedValueM22072a2.data);
        Context context = getContext();
        Resources.Theme theme = context.getTheme();
        int[] iArr = NG0.f7697k;
        DJ1.m1624a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        DJ1.m1625b(context, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
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
        this.f9281d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        TypedValue typedValueM22074c = AbstractC9900ja1.m22074c(context, R.attr.colorSurface, C8120Pn0.class.getCanonicalName());
        int i2 = typedValueM22074c.resourceId;
        int iM4783a = i2 != 0 ? AbstractC0691Ky.m4783a(context, i2) : typedValueM22074c.data;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iM4783a);
        typedArrayObtainStyledAttributes2.recycle();
        C10439no0 c10439no0 = new C10439no0(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        c10439no0.m23236h(context);
        c10439no0.m23238j(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                C8435Vo1 c8435Vo1M5027e = c10439no0.f38516a.f37931a.m5027e();
                c8435Vo1M5027e.f12767e = new C7110x(dimension);
                c8435Vo1M5027e.f12768f = new C7110x(dimension);
                c8435Vo1M5027e.f12769g = new C7110x(dimension);
                c8435Vo1M5027e.f12770h = new C7110x(dimension);
                c10439no0.setShapeAppearanceModel(c8435Vo1M5027e.m8561c());
            }
        }
        this.f9280c = c10439no0;
    }

    @Override // p000.C0508I3
    /* renamed from: a */
    public final void mo3737a(String str) {
        this.f4670a.f2377f = str;
    }

    /* renamed from: c */
    public final void m6428c(int i, DialogInterfaceOnClickListenerC0335FJ dialogInterfaceOnClickListenerC0335FJ) {
    }

    @Override // p000.C0508I3
    public final DialogInterfaceC0571J3 create() {
        DialogInterfaceC0571J3 dialogInterfaceC0571J3Create = super.create();
        Window window = dialogInterfaceC0571J3Create.getWindow();
        View decorView = window.getDecorView();
        C10439no0 c10439no0 = this.f9280c;
        if (c10439no0 instanceof C10439no0) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            c10439no0.m23237i(AbstractC9536gk1.m18614i(decorView));
        }
        Rect rect = this.f9281d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) c10439no0, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new H80(dialogInterfaceC0571J3Create, rect));
        return dialogInterfaceC0571J3Create;
    }

    /* renamed from: d */
    public final void m6429d(int i, DialogInterfaceOnClickListenerC0335FJ dialogInterfaceOnClickListenerC0335FJ) {
    }

    @Override // p000.C0508I3
    public final C0508I3 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (C8120Pn0) super.setNegativeButton(i, onClickListener);
    }

    @Override // p000.C0508I3
    public final C0508I3 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (C8120Pn0) super.setPositiveButton(i, onClickListener);
    }

    @Override // p000.C0508I3
    public final C0508I3 setTitle(CharSequence charSequence) {
        return (C8120Pn0) super.setTitle(charSequence);
    }

    @Override // p000.C0508I3
    public final C0508I3 setView(View view) {
        return (C8120Pn0) super.setView(view);
    }
}
