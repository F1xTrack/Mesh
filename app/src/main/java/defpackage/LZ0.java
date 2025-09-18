package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class LZ0 {
    public AbstractC6659qU1 a = new GT0();
    public AbstractC6659qU1 b = new GT0();
    public AbstractC6659qU1 c = new GT0();
    public AbstractC6659qU1 d = new GT0();
    public InterfaceC8274yz e = new C7897x(0.0f);
    public InterfaceC8274yz f = new C7897x(0.0f);
    public InterfaceC8274yz g = new C7897x(0.0f);
    public InterfaceC8274yz h = new C7897x(0.0f);
    public C3759fN i = new C3759fN(0);
    public C3759fN j = new C3759fN(0);
    public C3759fN k = new C3759fN(0);
    public C3759fN l = new C3759fN(0);

    public static C1701Vo1 a(Context context, int i, int i2, C7897x c7897x) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(NG0.z);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC8274yz interfaceC8274yzC = c(typedArrayObtainStyledAttributes, 5, c7897x);
            InterfaceC8274yz interfaceC8274yzC2 = c(typedArrayObtainStyledAttributes, 8, interfaceC8274yzC);
            InterfaceC8274yz interfaceC8274yzC3 = c(typedArrayObtainStyledAttributes, 9, interfaceC8274yzC);
            InterfaceC8274yz interfaceC8274yzC4 = c(typedArrayObtainStyledAttributes, 7, interfaceC8274yzC);
            InterfaceC8274yz interfaceC8274yzC5 = c(typedArrayObtainStyledAttributes, 6, interfaceC8274yzC);
            C1701Vo1 c1701Vo1 = new C1701Vo1();
            AbstractC6659qU1 abstractC6659qU1A = AbstractC1938Yp1.a(i4);
            c1701Vo1.a = abstractC6659qU1A;
            C1701Vo1.d(abstractC6659qU1A);
            c1701Vo1.e = interfaceC8274yzC2;
            AbstractC6659qU1 abstractC6659qU1A2 = AbstractC1938Yp1.a(i5);
            c1701Vo1.b = abstractC6659qU1A2;
            C1701Vo1.d(abstractC6659qU1A2);
            c1701Vo1.f = interfaceC8274yzC3;
            AbstractC6659qU1 abstractC6659qU1A3 = AbstractC1938Yp1.a(i6);
            c1701Vo1.c = abstractC6659qU1A3;
            C1701Vo1.d(abstractC6659qU1A3);
            c1701Vo1.g = interfaceC8274yzC4;
            AbstractC6659qU1 abstractC6659qU1A4 = AbstractC1938Yp1.a(i7);
            c1701Vo1.d = abstractC6659qU1A4;
            C1701Vo1.d(abstractC6659qU1A4);
            c1701Vo1.h = interfaceC8274yzC5;
            return c1701Vo1;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static C1701Vo1 b(Context context, AttributeSet attributeSet, int i, int i2) {
        C7897x c7897x = new C7897x(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.s, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, c7897x);
    }

    public static InterfaceC8274yz c(TypedArray typedArray, int i, InterfaceC8274yz interfaceC8274yz) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return interfaceC8274yz;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new C7897x(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C5882mQ0(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC8274yz;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(C3759fN.class) && this.j.getClass().equals(C3759fN.class) && this.i.getClass().equals(C3759fN.class) && this.k.getClass().equals(C3759fN.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof GT0) && (this.a instanceof GT0) && (this.c instanceof GT0) && (this.d instanceof GT0));
    }

    public final C1701Vo1 e() {
        C1701Vo1 c1701Vo1 = new C1701Vo1();
        c1701Vo1.a = this.a;
        c1701Vo1.b = this.b;
        c1701Vo1.c = this.c;
        c1701Vo1.d = this.d;
        c1701Vo1.e = this.e;
        c1701Vo1.f = this.f;
        c1701Vo1.g = this.g;
        c1701Vo1.h = this.h;
        c1701Vo1.i = this.i;
        c1701Vo1.j = this.j;
        c1701Vo1.k = this.k;
        c1701Vo1.l = this.l;
        return c1701Vo1;
    }
}
