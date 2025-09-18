package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ui1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7464ui1 extends AbstractC5746li1 {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public C7082si1 b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public C7464ui1() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C7082si1 c7082si1 = new C7082si1();
        c7082si1.c = null;
        c7082si1.d = j;
        c7082si1.b = new C6891ri1();
        this.b = c7082si1;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        AbstractC4135hL.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC4326iL.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C7082si1 c7082si1 = this.b;
        Bitmap bitmap = c7082si1.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c7082si1.f.getHeight()) {
            c7082si1.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c7082si1.k = true;
        }
        if (this.f) {
            C7082si1 c7082si12 = this.b;
            if (c7082si12.k || c7082si12.g != c7082si12.c || c7082si12.h != c7082si12.d || c7082si12.j != c7082si12.e || c7082si12.i != c7082si12.b.getRootAlpha()) {
                C7082si1 c7082si13 = this.b;
                c7082si13.f.eraseColor(0);
                Canvas canvas2 = new Canvas(c7082si13.f);
                C6891ri1 c6891ri1 = c7082si13.b;
                c6891ri1.a(c6891ri1.g, C6891ri1.p, canvas2, iMin, iMin2);
                C7082si1 c7082si14 = this.b;
                c7082si14.g = c7082si14.c;
                c7082si14.h = c7082si14.d;
                c7082si14.i = c7082si14.b.getRootAlpha();
                c7082si14.j = c7082si14.e;
                c7082si14.k = false;
            }
        } else {
            C7082si1 c7082si15 = this.b;
            c7082si15.f.eraseColor(0);
            Canvas canvas3 = new Canvas(c7082si15.f);
            C6891ri1 c6891ri12 = c7082si15.b;
            c6891ri12.a(c6891ri12.g, C6891ri1.p, canvas3, iMin, iMin2);
        }
        C7082si1 c7082si16 = this.b;
        if (c7082si16.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c7082si16.l == null) {
                Paint paint2 = new Paint();
                c7082si16.l = paint2;
                paint2.setFilterBitmap(true);
            }
            c7082si16.l.setAlpha(c7082si16.b.getRootAlpha());
            c7082si16.l.setColorFilter(colorFilter);
            paint = c7082si16.l;
        }
        canvas.drawBitmap(c7082si16.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? AbstractC4135hL.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new C7273ti1(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C7082si1 c7082si1 = this.b;
            if (c7082si1 != null) {
                C6891ri1 c6891ri1 = c7082si1.b;
                if (c6891ri1.n == null) {
                    c6891ri1.n = Boolean.valueOf(c6891ri1.g.a());
                }
                if (c6891ri1.n.booleanValue() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            C7082si1 c7082si1 = this.b;
            C7082si1 c7082si12 = new C7082si1();
            c7082si12.c = null;
            c7082si12.d = j;
            if (c7082si1 != null) {
                c7082si12.a = c7082si1.a;
                C6891ri1 c6891ri1 = new C6891ri1(c7082si1.b);
                c7082si12.b = c6891ri1;
                if (c7082si1.b.e != null) {
                    c6891ri1.e = new Paint(c7082si1.b.e);
                }
                if (c7082si1.b.d != null) {
                    c7082si12.b.d = new Paint(c7082si1.b.d);
                }
                c7082si12.c = c7082si1.c;
                c7082si12.d = c7082si1.d;
                c7082si12.e = c7082si1.e;
            }
            this.b = c7082si12;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C7082si1 c7082si1 = this.b;
        ColorStateList colorStateList = c7082si1.c;
        if (colorStateList == null || (mode = c7082si1.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C6891ri1 c6891ri1 = c7082si1.b;
        if (c6891ri1.n == null) {
            c6891ri1.n = Boolean.valueOf(c6891ri1.g.a());
        }
        if (c6891ri1.n.booleanValue()) {
            boolean zB = c7082si1.b.g.b(iArr);
            c7082si1.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            C6507ph1.c(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            AbstractC4135hL.h(drawable, colorStateList);
            return;
        }
        C7082si1 c7082si1 = this.b;
        if (c7082si1.c != colorStateList) {
            c7082si1.c = colorStateList;
            this.c = a(colorStateList, c7082si1.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            AbstractC4135hL.i(drawable, mode);
            return;
        }
        C7082si1 c7082si1 = this.b;
        if (c7082si1.d != mode) {
            c7082si1.d = mode;
            this.c = a(c7082si1.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C6891ri1 c6891ri1;
        int i;
        boolean z;
        char c;
        int i2;
        Paint.Cap cap;
        Drawable drawable = this.a;
        if (drawable != null) {
            AbstractC4135hL.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C7082si1 c7082si1 = this.b;
        c7082si1.b = new C6891ri1();
        TypedArray typedArrayD = FZ1.d(resources, theme, attributeSet, MR.b);
        C7082si1 c7082si12 = this.b;
        C6891ri1 c6891ri12 = c7082si12.b;
        int i3 = !FZ1.c(xmlPullParser, "tintMode") ? -1 : typedArrayD.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i4 = 3;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c7082si12.d = mode;
        int i5 = 1;
        ColorStateList colorStateListA = null;
        boolean z2 = false;
        if (FZ1.c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayD.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i6 >= 28 && i6 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayD.getResources();
                int resourceId = typedArrayD.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0704Iu.a;
                try {
                    colorStateListA = AbstractC0704Iu.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            c7082si12.c = colorStateList;
        }
        boolean z3 = c7082si12.e;
        if (FZ1.c(xmlPullParser, "autoMirrored")) {
            z3 = typedArrayD.getBoolean(5, z3);
        }
        c7082si12.e = z3;
        float f = c6891ri12.j;
        if (FZ1.c(xmlPullParser, "viewportWidth")) {
            f = typedArrayD.getFloat(7, f);
        }
        c6891ri12.j = f;
        float f2 = c6891ri12.k;
        if (FZ1.c(xmlPullParser, "viewportHeight")) {
            f2 = typedArrayD.getFloat(8, f2);
        }
        c6891ri12.k = f2;
        if (c6891ri12.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c6891ri12.h = typedArrayD.getDimension(3, c6891ri12.h);
            float dimension = typedArrayD.getDimension(2, c6891ri12.i);
            c6891ri12.i = dimension;
            if (c6891ri12.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c6891ri12.getAlpha();
                if (FZ1.c(xmlPullParser, "alpha")) {
                    alpha = typedArrayD.getFloat(4, alpha);
                }
                c6891ri12.setAlpha(alpha);
                String string = typedArrayD.getString(0);
                if (string != null) {
                    c6891ri12.m = string;
                    c6891ri12.o.put(string, c6891ri12);
                }
                typedArrayD.recycle();
                c7082si1.a = getChangingConfigurations();
                c7082si1.k = true;
                C7082si1 c7082si13 = this.b;
                C6891ri1 c6891ri13 = c7082si13.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c6891ri13.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                while (eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i4)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C6319oi1 c6319oi1 = (C6319oi1) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        C7925x8 c7925x8 = c6891ri13.o;
                        c6891ri1 = c6891ri13;
                        if (zEquals) {
                            C6128ni1 c6128ni1 = new C6128ni1();
                            c6128ni1.e = 0.0f;
                            c6128ni1.g = 1.0f;
                            c6128ni1.h = 1.0f;
                            c6128ni1.i = 0.0f;
                            c6128ni1.j = 1.0f;
                            c6128ni1.k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c6128ni1.l = cap2;
                            Paint.Join join = Paint.Join.MITER;
                            c6128ni1.m = join;
                            i = depth;
                            c6128ni1.n = 4.0f;
                            TypedArray typedArrayD2 = FZ1.d(resources, theme, attributeSet, MR.d);
                            if (FZ1.c(xmlPullParser, "pathData")) {
                                String string2 = typedArrayD2.getString(0);
                                if (string2 != null) {
                                    c6128ni1.b = string2;
                                }
                                String string3 = typedArrayD2.getString(2);
                                if (string3 != null) {
                                    c6128ni1.a = AbstractC7963xK1.c(string3);
                                }
                                c6128ni1.f = FZ1.a(typedArrayD2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c6128ni1.h;
                                if (FZ1.c(xmlPullParser, "fillAlpha")) {
                                    f3 = typedArrayD2.getFloat(12, f3);
                                }
                                c6128ni1.h = f3;
                                int i7 = !FZ1.c(xmlPullParser, "strokeLineCap") ? -1 : typedArrayD2.getInt(8, -1);
                                Paint.Cap cap3 = c6128ni1.l;
                                if (i7 == 0) {
                                    cap = cap2;
                                } else if (i7 != 1) {
                                    cap = i7 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c6128ni1.l = cap;
                                int i8 = !FZ1.c(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayD2.getInt(9, -1);
                                Paint.Join join2 = c6128ni1.m;
                                if (i8 != 0) {
                                    if (i8 != 1) {
                                        join = i8 != 2 ? join2 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                }
                                c6128ni1.m = join;
                                float f4 = c6128ni1.n;
                                if (FZ1.c(xmlPullParser, "strokeMiterLimit")) {
                                    f4 = typedArrayD2.getFloat(10, f4);
                                }
                                c6128ni1.n = f4;
                                c6128ni1.d = FZ1.a(typedArrayD2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c6128ni1.g;
                                if (FZ1.c(xmlPullParser, "strokeAlpha")) {
                                    f5 = typedArrayD2.getFloat(11, f5);
                                }
                                c6128ni1.g = f5;
                                float f6 = c6128ni1.e;
                                if (FZ1.c(xmlPullParser, "strokeWidth")) {
                                    f6 = typedArrayD2.getFloat(4, f6);
                                }
                                c6128ni1.e = f6;
                                float f7 = c6128ni1.j;
                                if (FZ1.c(xmlPullParser, "trimPathEnd")) {
                                    f7 = typedArrayD2.getFloat(6, f7);
                                }
                                c6128ni1.j = f7;
                                float f8 = c6128ni1.k;
                                if (FZ1.c(xmlPullParser, "trimPathOffset")) {
                                    f8 = typedArrayD2.getFloat(7, f8);
                                }
                                c6128ni1.k = f8;
                                float f9 = c6128ni1.i;
                                if (FZ1.c(xmlPullParser, "trimPathStart")) {
                                    f9 = typedArrayD2.getFloat(5, f9);
                                }
                                c6128ni1.i = f9;
                                int i9 = c6128ni1.c;
                                if (FZ1.c(xmlPullParser, "fillType")) {
                                    i9 = typedArrayD2.getInt(13, i9);
                                }
                                c6128ni1.c = i9;
                            }
                            typedArrayD2.recycle();
                            c6319oi1.b.add(c6128ni1);
                            if (c6128ni1.getPathName() != null) {
                                c7925x8.put(c6128ni1.getPathName(), c6128ni1);
                            }
                            c7082si13.a = c7082si13.a;
                            z = false;
                            c = '\b';
                            z4 = false;
                        } else {
                            i = depth;
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                C5937mi1 c5937mi1 = new C5937mi1();
                                if (FZ1.c(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayD3 = FZ1.d(resources, theme, attributeSet, MR.e);
                                    String string4 = typedArrayD3.getString(0);
                                    if (string4 != null) {
                                        c5937mi1.b = string4;
                                    }
                                    String string5 = typedArrayD3.getString(1);
                                    if (string5 != null) {
                                        c5937mi1.a = AbstractC7963xK1.c(string5);
                                    }
                                    c5937mi1.c = !FZ1.c(xmlPullParser, "fillType") ? 0 : typedArrayD3.getInt(2, 0);
                                    typedArrayD3.recycle();
                                }
                                c6319oi1.b.add(c5937mi1);
                                if (c5937mi1.getPathName() != null) {
                                    c7925x8.put(c5937mi1.getPathName(), c5937mi1);
                                }
                                c7082si13.a = c7082si13.a;
                            } else if (NotificationConstants.GROUP.equals(name)) {
                                C6319oi1 c6319oi12 = new C6319oi1();
                                TypedArray typedArrayD4 = FZ1.d(resources, theme, attributeSet, MR.c);
                                float f10 = c6319oi12.c;
                                if (FZ1.c(xmlPullParser, "rotation")) {
                                    f10 = typedArrayD4.getFloat(5, f10);
                                }
                                c6319oi12.c = f10;
                                c6319oi12.d = typedArrayD4.getFloat(1, c6319oi12.d);
                                c6319oi12.e = typedArrayD4.getFloat(2, c6319oi12.e);
                                float f11 = c6319oi12.f;
                                if (FZ1.c(xmlPullParser, "scaleX")) {
                                    f11 = typedArrayD4.getFloat(3, f11);
                                }
                                c6319oi12.f = f11;
                                float f12 = c6319oi12.g;
                                if (FZ1.c(xmlPullParser, "scaleY")) {
                                    f12 = typedArrayD4.getFloat(4, f12);
                                }
                                c6319oi12.g = f12;
                                float f13 = c6319oi12.h;
                                if (FZ1.c(xmlPullParser, "translateX")) {
                                    f13 = typedArrayD4.getFloat(6, f13);
                                }
                                c6319oi12.h = f13;
                                float f14 = c6319oi12.i;
                                if (FZ1.c(xmlPullParser, "translateY")) {
                                    f14 = typedArrayD4.getFloat(7, f14);
                                }
                                c6319oi12.i = f14;
                                z = false;
                                String string6 = typedArrayD4.getString(0);
                                if (string6 != null) {
                                    c6319oi12.k = string6;
                                }
                                c6319oi12.c();
                                typedArrayD4.recycle();
                                c6319oi1.b.add(c6319oi12);
                                arrayDeque.push(c6319oi12);
                                if (c6319oi12.getGroupName() != null) {
                                    c7925x8.put(c6319oi12.getGroupName(), c6319oi12);
                                }
                                c7082si13.a = c7082si13.a;
                            }
                            z = false;
                        }
                        i4 = 3;
                        i2 = 1;
                    } else {
                        c6891ri1 = c6891ri13;
                        i = depth;
                        z = z2;
                        c = '\b';
                        i2 = i5;
                        i4 = 3;
                        if (eventType == 3 && NotificationConstants.GROUP.equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i2;
                    c6891ri13 = c6891ri1;
                    z2 = z;
                    depth = i;
                }
                if (!z4) {
                    this.c = a(c7082si1.c, c7082si1.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayD.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C7464ui1(C7082si1 c7082si1) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = c7082si1;
        this.c = a(c7082si1.c, c7082si1.d);
    }
}
