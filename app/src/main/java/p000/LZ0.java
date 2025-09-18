package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class LZ0 {

    /* renamed from: a */
    public AbstractC10784qU1 f6714a = new GT0();

    /* renamed from: b */
    public AbstractC10784qU1 f6715b = new GT0();

    /* renamed from: c */
    public AbstractC10784qU1 f6716c = new GT0();

    /* renamed from: d */
    public AbstractC10784qU1 f6717d = new GT0();

    /* renamed from: e */
    public InterfaceC7235yz f6718e = new C7110x(0.0f);

    /* renamed from: f */
    public InterfaceC7235yz f6719f = new C7110x(0.0f);

    /* renamed from: g */
    public InterfaceC7235yz f6720g = new C7110x(0.0f);

    /* renamed from: h */
    public InterfaceC7235yz f6721h = new C7110x(0.0f);

    /* renamed from: i */
    public C4049fN f6722i = new C4049fN(0);

    /* renamed from: j */
    public C4049fN f6723j = new C4049fN(0);

    /* renamed from: k */
    public C4049fN f6724k = new C4049fN(0);

    /* renamed from: l */
    public C4049fN f6725l = new C4049fN(0);

    /* renamed from: a */
    public static C8435Vo1 m5023a(Context context, int i, int i2, C7110x c7110x) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(NG0.f7712z);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC7235yz interfaceC7235yzM5025c = m5025c(typedArrayObtainStyledAttributes, 5, c7110x);
            InterfaceC7235yz interfaceC7235yzM5025c2 = m5025c(typedArrayObtainStyledAttributes, 8, interfaceC7235yzM5025c);
            InterfaceC7235yz interfaceC7235yzM5025c3 = m5025c(typedArrayObtainStyledAttributes, 9, interfaceC7235yzM5025c);
            InterfaceC7235yz interfaceC7235yzM5025c4 = m5025c(typedArrayObtainStyledAttributes, 7, interfaceC7235yzM5025c);
            InterfaceC7235yz interfaceC7235yzM5025c5 = m5025c(typedArrayObtainStyledAttributes, 6, interfaceC7235yzM5025c);
            C8435Vo1 c8435Vo1 = new C8435Vo1();
            AbstractC10784qU1 abstractC10784qU1M9385a = AbstractC8593Yp1.m9385a(i4);
            c8435Vo1.f12763a = abstractC10784qU1M9385a;
            C8435Vo1.m8558d(abstractC10784qU1M9385a);
            c8435Vo1.f12767e = interfaceC7235yzM5025c2;
            AbstractC10784qU1 abstractC10784qU1M9385a2 = AbstractC8593Yp1.m9385a(i5);
            c8435Vo1.f12764b = abstractC10784qU1M9385a2;
            C8435Vo1.m8558d(abstractC10784qU1M9385a2);
            c8435Vo1.f12768f = interfaceC7235yzM5025c3;
            AbstractC10784qU1 abstractC10784qU1M9385a3 = AbstractC8593Yp1.m9385a(i6);
            c8435Vo1.f12765c = abstractC10784qU1M9385a3;
            C8435Vo1.m8558d(abstractC10784qU1M9385a3);
            c8435Vo1.f12769g = interfaceC7235yzM5025c4;
            AbstractC10784qU1 abstractC10784qU1M9385a4 = AbstractC8593Yp1.m9385a(i7);
            c8435Vo1.f12766d = abstractC10784qU1M9385a4;
            C8435Vo1.m8558d(abstractC10784qU1M9385a4);
            c8435Vo1.f12770h = interfaceC7235yzM5025c5;
            return c8435Vo1;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C8435Vo1 m5024b(Context context, AttributeSet attributeSet, int i, int i2) {
        C7110x c7110x = new C7110x(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7705s, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m5023a(context, resourceId, resourceId2, c7110x);
    }

    /* renamed from: c */
    public static InterfaceC7235yz m5025c(TypedArray typedArray, int i, InterfaceC7235yz interfaceC7235yz) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return interfaceC7235yz;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new C7110x(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C10263mQ0(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC7235yz;
    }

    /* renamed from: d */
    public final boolean m5026d(RectF rectF) {
        boolean z = this.f6725l.getClass().equals(C4049fN.class) && this.f6723j.getClass().equals(C4049fN.class) && this.f6722i.getClass().equals(C4049fN.class) && this.f6724k.getClass().equals(C4049fN.class);
        float fMo22818a = this.f6718e.mo22818a(rectF);
        return z && ((this.f6719f.mo22818a(rectF) > fMo22818a ? 1 : (this.f6719f.mo22818a(rectF) == fMo22818a ? 0 : -1)) == 0 && (this.f6721h.mo22818a(rectF) > fMo22818a ? 1 : (this.f6721h.mo22818a(rectF) == fMo22818a ? 0 : -1)) == 0 && (this.f6720g.mo22818a(rectF) > fMo22818a ? 1 : (this.f6720g.mo22818a(rectF) == fMo22818a ? 0 : -1)) == 0) && ((this.f6715b instanceof GT0) && (this.f6714a instanceof GT0) && (this.f6716c instanceof GT0) && (this.f6717d instanceof GT0));
    }

    /* renamed from: e */
    public final C8435Vo1 m5027e() {
        C8435Vo1 c8435Vo1 = new C8435Vo1();
        c8435Vo1.f12763a = this.f6714a;
        c8435Vo1.f12764b = this.f6715b;
        c8435Vo1.f12765c = this.f6716c;
        c8435Vo1.f12766d = this.f6717d;
        c8435Vo1.f12767e = this.f6718e;
        c8435Vo1.f12768f = this.f6719f;
        c8435Vo1.f12769g = this.f6720g;
        c8435Vo1.f12770h = this.f6721h;
        c8435Vo1.f12771i = this.f6722i;
        c8435Vo1.f12772j = this.f6723j;
        c8435Vo1.f12773k = this.f6724k;
        c8435Vo1.f12774l = this.f6725l;
        return c8435Vo1;
    }
}
