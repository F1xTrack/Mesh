package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.flatbuffer.FlexBuffers;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC0815Mx;
import p000.AbstractC0878Nx;
import p000.AbstractC4212hy;
import p000.C0941Ox;
import p000.C1004Px;
import p000.C1570Yx;
import p000.C3960dy;
import p000.C4023ey;
import p000.C7967Mo1;
import p000.C9016cj0;
import p000.C9445g20;
import p000.C9573h20;
import p000.TG0;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    public final SparseArray f16051a;

    /* renamed from: b */
    public final ArrayList f16052b;

    /* renamed from: c */
    public final C4023ey f16053c;

    /* renamed from: d */
    public int f16054d;

    /* renamed from: e */
    public int f16055e;

    /* renamed from: f */
    public int f16056f;

    /* renamed from: g */
    public int f16057g;

    /* renamed from: h */
    public boolean f16058h;

    /* renamed from: i */
    public int f16059i;

    /* renamed from: j */
    public C1570Yx f16060j;

    /* renamed from: k */
    public C7967Mo1 f16061k;

    /* renamed from: l */
    public int f16062l;

    /* renamed from: m */
    public HashMap f16063m;

    /* renamed from: n */
    public final SparseArray f16064n;

    /* renamed from: o */
    public final C1004Px f16065o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f16051a = new SparseArray();
        this.f16052b = new ArrayList(4);
        this.f16053c = new C4023ey();
        this.f16054d = 0;
        this.f16055e = 0;
        this.f16056f = Integer.MAX_VALUE;
        this.f16057g = Integer.MAX_VALUE;
        this.f16058h = true;
        this.f16059i = 263;
        this.f16060j = null;
        this.f16061k = null;
        this.f16062l = -1;
        this.f16063m = new HashMap();
        this.f16064n = new SparseArray();
        this.f16065o = new C1004Px(this);
        m9956d(attributeSet, 0);
    }

    /* renamed from: b */
    public static C0941Ox m9954b() {
        C0941Ox c0941Ox = new C0941Ox(-2, -2);
        c0941Ox.f8722a = -1;
        c0941Ox.f8724b = -1;
        c0941Ox.f8726c = -1.0f;
        c0941Ox.f8728d = -1;
        c0941Ox.f8730e = -1;
        c0941Ox.f8732f = -1;
        c0941Ox.f8734g = -1;
        c0941Ox.f8736h = -1;
        c0941Ox.f8738i = -1;
        c0941Ox.f8740j = -1;
        c0941Ox.f8742k = -1;
        c0941Ox.f8744l = -1;
        c0941Ox.f8745m = -1;
        c0941Ox.f8746n = 0;
        c0941Ox.f8747o = 0.0f;
        c0941Ox.f8748p = -1;
        c0941Ox.f8749q = -1;
        c0941Ox.f8750r = -1;
        c0941Ox.f8751s = -1;
        c0941Ox.f8752t = -1;
        c0941Ox.f8753u = -1;
        c0941Ox.f8754v = -1;
        c0941Ox.f8755w = -1;
        c0941Ox.f8756x = -1;
        c0941Ox.f8757y = -1;
        c0941Ox.f8758z = 0.5f;
        c0941Ox.f8696A = 0.5f;
        c0941Ox.f8697B = null;
        c0941Ox.f8698C = 1;
        c0941Ox.f8699D = -1.0f;
        c0941Ox.f8700E = -1.0f;
        c0941Ox.f8701F = 0;
        c0941Ox.f8702G = 0;
        c0941Ox.f8703H = 0;
        c0941Ox.f8704I = 0;
        c0941Ox.f8705J = 0;
        c0941Ox.f8706K = 0;
        c0941Ox.f8707L = 0;
        c0941Ox.f8708M = 0;
        c0941Ox.f8709N = 1.0f;
        c0941Ox.f8710O = 1.0f;
        c0941Ox.f8711P = -1;
        c0941Ox.f8712Q = -1;
        c0941Ox.f8713R = -1;
        c0941Ox.f8714S = false;
        c0941Ox.f8715T = false;
        c0941Ox.f8716U = null;
        c0941Ox.f8717V = true;
        c0941Ox.f8718W = true;
        c0941Ox.f8719X = false;
        c0941Ox.f8720Y = false;
        c0941Ox.f8721Z = false;
        c0941Ox.f8723a0 = -1;
        c0941Ox.f8725b0 = -1;
        c0941Ox.f8727c0 = -1;
        c0941Ox.f8729d0 = -1;
        c0941Ox.f8731e0 = -1;
        c0941Ox.f8733f0 = -1;
        c0941Ox.f8735g0 = 0.5f;
        c0941Ox.f8743k0 = new C3960dy();
        return c0941Ox;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* renamed from: c */
    public final C3960dy m9955c(View view) {
        if (view == this) {
            return this.f16053c;
        }
        if (view == null) {
            return null;
        }
        return ((C0941Ox) view.getLayoutParams()).f8743k0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0941Ox;
    }

    /* renamed from: d */
    public final void m9956d(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        C4023ey c4023ey = this.f16053c;
        c4023ey.f26422U = this;
        C1004Px c1004Px = this.f16065o;
        c4023ey.f26971g0 = c1004Px;
        c4023ey.f26970f0.f13114f = c1004Px;
        this.f16051a.put(getId(), this);
        this.f16060j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, TG0.f11273b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 9) {
                    this.f16054d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16054d);
                } else if (index == 10) {
                    this.f16055e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16055e);
                } else if (index == 7) {
                    this.f16056f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16056f);
                } else if (index == 8) {
                    this.f16057g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16057g);
                } else if (index == 89) {
                    this.f16059i = typedArrayObtainStyledAttributes.getInt(index, this.f16059i);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m9957e(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f16061k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1570Yx c1570Yx = new C1570Yx();
                        this.f16060j = c1570Yx;
                        c1570Yx.m9435e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f16060j = null;
                    }
                    this.f16062l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i3 = this.f16059i;
        c4023ey.f26980p0 = i3;
        C9016cj0.f17698p = (i3 & 256) == 256;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f16052b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0815Mx) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(StringUtils.COMMA);
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0074  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9957e(int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r9 = this;
            Mo1 r0 = new Mo1
            android.content.Context r1 = r9.getContext()
            r0.<init>()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f7362a = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f7363b = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r3 = 0
        L24:
            r4 = 1
            if (r2 == r4) goto Lb2
            if (r2 == 0) goto La2
            r5 = 2
            if (r2 == r5) goto L2e
            goto La5
        L2e:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L6a;
                case 80204913: goto L60;
                case 1382829617: goto L56;
                case 1657696882: goto L4c;
                case 1901439077: goto L3c;
                default: goto L3b;
            }     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
        L3b:
            goto L74
        L3c:
            java.lang.String r6 = "Variant"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r2 == 0) goto L74
            r2 = r8
            goto L75
        L46:
            r10 = move-exception
            goto Lab
        L49:
            r10 = move-exception
            goto Laf
        L4c:
            java.lang.String r6 = "layoutDescription"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r2 == 0) goto L74
            r2 = 0
            goto L75
        L56:
            java.lang.String r6 = "StateSet"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r2 == 0) goto L74
            r2 = r4
            goto L75
        L60:
            java.lang.String r6 = "State"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r2 == 0) goto L74
            r2 = r5
            goto L75
        L6a:
            java.lang.String r6 = "ConstraintSet"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r2 == 0) goto L74
            r2 = r7
            goto L75
        L74:
            r2 = -1
        L75:
            if (r2 == 0) goto La5
            if (r2 == r4) goto La5
            if (r2 == r5) goto L93
            if (r2 == r8) goto L84
            if (r2 == r7) goto L80
            goto La5
        L80:
            r0.m5452u(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            goto La5
        L84:
            Qx r2 = new Qx     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r3 == 0) goto La5
            java.lang.Object r4 = r3.f34816c     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r4.add(r2)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            goto La5
        L93:
            ix0 r3 = new ix0     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            java.lang.Object r2 = r0.f7362a     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            int r4 = r3.f34814a     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r2.put(r4, r3)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            goto La5
        La2:
            r10.getName()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
        La5:
            int r2 = r10.next()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            goto L24
        Lab:
            r10.printStackTrace()
            goto Lb2
        Laf:
            r10.printStackTrace()
        Lb2:
            r9.f16061k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m9957e(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:574:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0335  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9958f(p000.C4023ey r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m9958f(ey, int, int, int):void");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f16058h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m9954b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) throws NumberFormatException {
        int i;
        Context context = getContext();
        C0941Ox c0941Ox = new C0941Ox(context, attributeSet);
        c0941Ox.f8722a = -1;
        c0941Ox.f8724b = -1;
        c0941Ox.f8726c = -1.0f;
        c0941Ox.f8728d = -1;
        c0941Ox.f8730e = -1;
        c0941Ox.f8732f = -1;
        c0941Ox.f8734g = -1;
        c0941Ox.f8736h = -1;
        c0941Ox.f8738i = -1;
        c0941Ox.f8740j = -1;
        c0941Ox.f8742k = -1;
        c0941Ox.f8744l = -1;
        c0941Ox.f8745m = -1;
        c0941Ox.f8746n = 0;
        c0941Ox.f8747o = 0.0f;
        c0941Ox.f8748p = -1;
        c0941Ox.f8749q = -1;
        c0941Ox.f8750r = -1;
        c0941Ox.f8751s = -1;
        c0941Ox.f8752t = -1;
        c0941Ox.f8753u = -1;
        c0941Ox.f8754v = -1;
        c0941Ox.f8755w = -1;
        c0941Ox.f8756x = -1;
        c0941Ox.f8757y = -1;
        c0941Ox.f8758z = 0.5f;
        c0941Ox.f8696A = 0.5f;
        c0941Ox.f8697B = null;
        c0941Ox.f8698C = 1;
        c0941Ox.f8699D = -1.0f;
        c0941Ox.f8700E = -1.0f;
        c0941Ox.f8701F = 0;
        c0941Ox.f8702G = 0;
        c0941Ox.f8703H = 0;
        c0941Ox.f8704I = 0;
        c0941Ox.f8705J = 0;
        c0941Ox.f8706K = 0;
        c0941Ox.f8707L = 0;
        c0941Ox.f8708M = 0;
        c0941Ox.f8709N = 1.0f;
        c0941Ox.f8710O = 1.0f;
        c0941Ox.f8711P = -1;
        c0941Ox.f8712Q = -1;
        c0941Ox.f8713R = -1;
        c0941Ox.f8714S = false;
        c0941Ox.f8715T = false;
        c0941Ox.f8716U = null;
        c0941Ox.f8717V = true;
        c0941Ox.f8718W = true;
        c0941Ox.f8719X = false;
        c0941Ox.f8720Y = false;
        c0941Ox.f8721Z = false;
        c0941Ox.f8723a0 = -1;
        c0941Ox.f8725b0 = -1;
        c0941Ox.f8727c0 = -1;
        c0941Ox.f8729d0 = -1;
        c0941Ox.f8731e0 = -1;
        c0941Ox.f8733f0 = -1;
        c0941Ox.f8735g0 = 0.5f;
        c0941Ox.f8743k0 = new C3960dy();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TG0.f11273b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = AbstractC0878Nx.f8143a.get(index);
            switch (i3) {
                case 1:
                    c0941Ox.f8713R = typedArrayObtainStyledAttributes.getInt(index, c0941Ox.f8713R);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8745m);
                    c0941Ox.f8745m = resourceId;
                    if (resourceId == -1) {
                        c0941Ox.f8745m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c0941Ox.f8746n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8746n);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c0941Ox.f8747o) % 360.0f;
                    c0941Ox.f8747o = f;
                    if (f < 0.0f) {
                        c0941Ox.f8747o = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c0941Ox.f8722a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0941Ox.f8722a);
                    break;
                case 6:
                    c0941Ox.f8724b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0941Ox.f8724b);
                    break;
                case 7:
                    c0941Ox.f8726c = typedArrayObtainStyledAttributes.getFloat(index, c0941Ox.f8726c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8728d);
                    c0941Ox.f8728d = resourceId2;
                    if (resourceId2 == -1) {
                        c0941Ox.f8728d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8730e);
                    c0941Ox.f8730e = resourceId3;
                    if (resourceId3 == -1) {
                        c0941Ox.f8730e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8732f);
                    c0941Ox.f8732f = resourceId4;
                    if (resourceId4 == -1) {
                        c0941Ox.f8732f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8734g);
                    c0941Ox.f8734g = resourceId5;
                    if (resourceId5 == -1) {
                        c0941Ox.f8734g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8736h);
                    c0941Ox.f8736h = resourceId6;
                    if (resourceId6 == -1) {
                        c0941Ox.f8736h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8738i);
                    c0941Ox.f8738i = resourceId7;
                    if (resourceId7 == -1) {
                        c0941Ox.f8738i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8740j);
                    c0941Ox.f8740j = resourceId8;
                    if (resourceId8 == -1) {
                        c0941Ox.f8740j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8742k);
                    c0941Ox.f8742k = resourceId9;
                    if (resourceId9 == -1) {
                        c0941Ox.f8742k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8744l);
                    c0941Ox.f8744l = resourceId10;
                    if (resourceId10 == -1) {
                        c0941Ox.f8744l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8748p);
                    c0941Ox.f8748p = resourceId11;
                    if (resourceId11 == -1) {
                        c0941Ox.f8748p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8749q);
                    c0941Ox.f8749q = resourceId12;
                    if (resourceId12 == -1) {
                        c0941Ox.f8749q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8750r);
                    c0941Ox.f8750r = resourceId13;
                    if (resourceId13 == -1) {
                        c0941Ox.f8750r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c0941Ox.f8751s);
                    c0941Ox.f8751s = resourceId14;
                    if (resourceId14 == -1) {
                        c0941Ox.f8751s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c0941Ox.f8752t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8752t);
                    break;
                case 22:
                    c0941Ox.f8753u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8753u);
                    break;
                case 23:
                    c0941Ox.f8754v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8754v);
                    break;
                case 24:
                    c0941Ox.f8755w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8755w);
                    break;
                case 25:
                    c0941Ox.f8756x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8756x);
                    break;
                case 26:
                    c0941Ox.f8757y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8757y);
                    break;
                case 27:
                    c0941Ox.f8714S = typedArrayObtainStyledAttributes.getBoolean(index, c0941Ox.f8714S);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    c0941Ox.f8715T = typedArrayObtainStyledAttributes.getBoolean(index, c0941Ox.f8715T);
                    break;
                case 29:
                    c0941Ox.f8758z = typedArrayObtainStyledAttributes.getFloat(index, c0941Ox.f8758z);
                    break;
                case 30:
                    c0941Ox.f8696A = typedArrayObtainStyledAttributes.getFloat(index, c0941Ox.f8696A);
                    break;
                case 31:
                    c0941Ox.f8703H = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    c0941Ox.f8704I = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        c0941Ox.f8705J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8705J);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0941Ox.f8705J) == -2) {
                            c0941Ox.f8705J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c0941Ox.f8707L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8707L);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0941Ox.f8707L) == -2) {
                            c0941Ox.f8707L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case C5043c9.f31374J /* 35 */:
                    c0941Ox.f8709N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0941Ox.f8709N));
                    c0941Ox.f8703H = 2;
                    break;
                case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                    try {
                        c0941Ox.f8706K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8706K);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0941Ox.f8706K) == -2) {
                            c0941Ox.f8706K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c0941Ox.f8708M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0941Ox.f8708M);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0941Ox.f8708M) == -2) {
                            c0941Ox.f8708M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case C5043c9.f31375K /* 38 */:
                    c0941Ox.f8710O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0941Ox.f8710O));
                    c0941Ox.f8704I = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0941Ox.f8697B = string;
                            c0941Ox.f8698C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = c0941Ox.f8697B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = c0941Ox.f8697B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        c0941Ox.f8698C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        c0941Ox.f8698C = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = c0941Ox.f8697B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = c0941Ox.f8697B.substring(i);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    String strSubstring3 = c0941Ox.f8697B.substring(i, iIndexOf2);
                                    String strSubstring4 = c0941Ox.f8697B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        break;
                                    } else {
                                        try {
                                            float f2 = Float.parseFloat(strSubstring3);
                                            float f3 = Float.parseFloat(strSubstring4);
                                            if (f2 <= 0.0f || f3 <= 0.0f) {
                                                break;
                                            } else if (c0941Ox.f8698C == 1) {
                                                Math.abs(f3 / f2);
                                                break;
                                            } else {
                                                Math.abs(f2 / f3);
                                                break;
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            c0941Ox.f8699D = typedArrayObtainStyledAttributes.getFloat(index, c0941Ox.f8699D);
                            break;
                        case 46:
                            c0941Ox.f8700E = typedArrayObtainStyledAttributes.getFloat(index, c0941Ox.f8700E);
                            break;
                        case 47:
                            c0941Ox.f8701F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0941Ox.f8702G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0941Ox.f8711P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0941Ox.f8711P);
                            break;
                        case 50:
                            c0941Ox.f8712Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0941Ox.f8712Q);
                            break;
                        case 51:
                            c0941Ox.f8716U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c0941Ox.m6188a();
        return c0941Ox;
    }

    public int getMaxHeight() {
        return this.f16057g;
    }

    public int getMaxWidth() {
        return this.f16056f;
    }

    public int getMinHeight() {
        return this.f16055e;
    }

    public int getMinWidth() {
        return this.f16054d;
    }

    public int getOptimizationLevel() {
        return this.f16053c.f26980p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0941Ox c0941Ox = (C0941Ox) childAt.getLayoutParams();
            C3960dy c3960dy = c0941Ox.f8743k0;
            if (childAt.getVisibility() != 8 || c0941Ox.f8720Y || c0941Ox.f8721Z || zIsInEditMode) {
                int iM17790m = c3960dy.m17790m();
                int iM17791n = c3960dy.m17791n();
                childAt.layout(iM17790m, iM17791n, c3960dy.m17789l() + iM17790m, c3960dy.m17786i() + iM17791n);
            }
        }
        ArrayList arrayList = this.f16052b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0815Mx) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:430:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0532  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C3960dy c3960dyM9955c = m9955c(view);
        if ((view instanceof C9445g20) && !(c3960dyM9955c instanceof C9573h20)) {
            C0941Ox c0941Ox = (C0941Ox) view.getLayoutParams();
            C9573h20 c9573h20 = new C9573h20();
            c0941Ox.f8743k0 = c9573h20;
            c0941Ox.f8720Y = true;
            c9573h20.m18700B(c0941Ox.f8713R);
        }
        if (view instanceof AbstractC0815Mx) {
            AbstractC0815Mx abstractC0815Mx = (AbstractC0815Mx) view;
            abstractC0815Mx.m5486g();
            ((C0941Ox) view.getLayoutParams()).f8721Z = true;
            ArrayList arrayList = this.f16052b;
            if (!arrayList.contains(abstractC0815Mx)) {
                arrayList.add(abstractC0815Mx);
            }
        }
        this.f16051a.put(view.getId(), view);
        this.f16058h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f16051a.remove(view.getId());
        C3960dy c3960dyM9955c = m9955c(view);
        this.f16053c.f26968d0.remove(c3960dyM9955c);
        c3960dyM9955c.f26410I = null;
        this.f16052b.remove(view);
        this.f16058h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f16058h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1570Yx c1570Yx) {
        this.f16060j = c1570Yx;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f16051a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f16057g) {
            return;
        }
        this.f16057g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f16056f) {
            return;
        }
        this.f16056f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f16055e) {
            return;
        }
        this.f16055e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f16054d) {
            return;
        }
        this.f16054d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC4212hy abstractC4212hy) {
        C7967Mo1 c7967Mo1 = this.f16061k;
        if (c7967Mo1 != null) {
            c7967Mo1.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f16059i = i;
        this.f16053c.f26980p0 = i;
        C9016cj0.f17698p = (i & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.f16051a = new SparseArray();
        this.f16052b = new ArrayList(4);
        this.f16053c = new C4023ey();
        this.f16054d = 0;
        this.f16055e = 0;
        this.f16056f = Integer.MAX_VALUE;
        this.f16057g = Integer.MAX_VALUE;
        this.f16058h = true;
        this.f16059i = 263;
        this.f16060j = null;
        this.f16061k = null;
        this.f16062l = -1;
        this.f16063m = new HashMap();
        this.f16064n = new SparseArray();
        this.f16065o = new C1004Px(this);
        m9956d(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0941Ox c0941Ox = new C0941Ox(layoutParams);
        c0941Ox.f8722a = -1;
        c0941Ox.f8724b = -1;
        c0941Ox.f8726c = -1.0f;
        c0941Ox.f8728d = -1;
        c0941Ox.f8730e = -1;
        c0941Ox.f8732f = -1;
        c0941Ox.f8734g = -1;
        c0941Ox.f8736h = -1;
        c0941Ox.f8738i = -1;
        c0941Ox.f8740j = -1;
        c0941Ox.f8742k = -1;
        c0941Ox.f8744l = -1;
        c0941Ox.f8745m = -1;
        c0941Ox.f8746n = 0;
        c0941Ox.f8747o = 0.0f;
        c0941Ox.f8748p = -1;
        c0941Ox.f8749q = -1;
        c0941Ox.f8750r = -1;
        c0941Ox.f8751s = -1;
        c0941Ox.f8752t = -1;
        c0941Ox.f8753u = -1;
        c0941Ox.f8754v = -1;
        c0941Ox.f8755w = -1;
        c0941Ox.f8756x = -1;
        c0941Ox.f8757y = -1;
        c0941Ox.f8758z = 0.5f;
        c0941Ox.f8696A = 0.5f;
        c0941Ox.f8697B = null;
        c0941Ox.f8698C = 1;
        c0941Ox.f8699D = -1.0f;
        c0941Ox.f8700E = -1.0f;
        c0941Ox.f8701F = 0;
        c0941Ox.f8702G = 0;
        c0941Ox.f8703H = 0;
        c0941Ox.f8704I = 0;
        c0941Ox.f8705J = 0;
        c0941Ox.f8706K = 0;
        c0941Ox.f8707L = 0;
        c0941Ox.f8708M = 0;
        c0941Ox.f8709N = 1.0f;
        c0941Ox.f8710O = 1.0f;
        c0941Ox.f8711P = -1;
        c0941Ox.f8712Q = -1;
        c0941Ox.f8713R = -1;
        c0941Ox.f8714S = false;
        c0941Ox.f8715T = false;
        c0941Ox.f8716U = null;
        c0941Ox.f8717V = true;
        c0941Ox.f8718W = true;
        c0941Ox.f8719X = false;
        c0941Ox.f8720Y = false;
        c0941Ox.f8721Z = false;
        c0941Ox.f8723a0 = -1;
        c0941Ox.f8725b0 = -1;
        c0941Ox.f8727c0 = -1;
        c0941Ox.f8729d0 = -1;
        c0941Ox.f8731e0 = -1;
        c0941Ox.f8733f0 = -1;
        c0941Ox.f8735g0 = 0.5f;
        c0941Ox.f8743k0 = new C3960dy();
        return c0941Ox;
    }
}
