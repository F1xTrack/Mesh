package p000;

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
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ui1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11324ui1 extends AbstractC10172li1 {

    /* renamed from: j */
    public static final PorterDuff.Mode f43800j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public C11068si1 f43801b;

    /* renamed from: c */
    public PorterDuffColorFilter f43802c;

    /* renamed from: d */
    public ColorFilter f43803d;

    /* renamed from: e */
    public boolean f43804e;

    /* renamed from: f */
    public boolean f43805f;

    /* renamed from: g */
    public final float[] f43806g;

    /* renamed from: h */
    public final Matrix f43807h;

    /* renamed from: i */
    public final Rect f43808i;

    public C11324ui1() {
        this.f43805f = true;
        this.f43806g = new float[9];
        this.f43807h = new Matrix();
        this.f43808i = new Rect();
        C11068si1 c11068si1 = new C11068si1();
        c11068si1.f42558c = null;
        c11068si1.f42559d = f43800j;
        c11068si1.f42557b = new C10940ri1();
        this.f43801b = c11068si1;
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m25225a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f37260a;
        if (drawable == null) {
            return false;
        }
        AbstractC4173hL.m18800b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f43808i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f43803d;
        if (colorFilter == null) {
            colorFilter = this.f43802c;
        }
        Matrix matrix = this.f43807h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f43806g;
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
        if (isAutoMirrored() && AbstractC4236iL.m19003a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C11068si1 c11068si1 = this.f43801b;
        Bitmap bitmap = c11068si1.f42561f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c11068si1.f42561f.getHeight()) {
            c11068si1.f42561f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c11068si1.f42566k = true;
        }
        if (this.f43805f) {
            C11068si1 c11068si12 = this.f43801b;
            if (c11068si12.f42566k || c11068si12.f42562g != c11068si12.f42558c || c11068si12.f42563h != c11068si12.f42559d || c11068si12.f42565j != c11068si12.f42560e || c11068si12.f42564i != c11068si12.f42557b.getRootAlpha()) {
                C11068si1 c11068si13 = this.f43801b;
                c11068si13.f42561f.eraseColor(0);
                Canvas canvas2 = new Canvas(c11068si13.f42561f);
                C10940ri1 c10940ri1 = c11068si13.f42557b;
                c10940ri1.m24463a(c10940ri1.f41822g, C10940ri1.f41815p, canvas2, iMin, iMin2);
                C11068si1 c11068si14 = this.f43801b;
                c11068si14.f42562g = c11068si14.f42558c;
                c11068si14.f42563h = c11068si14.f42559d;
                c11068si14.f42564i = c11068si14.f42557b.getRootAlpha();
                c11068si14.f42565j = c11068si14.f42560e;
                c11068si14.f42566k = false;
            }
        } else {
            C11068si1 c11068si15 = this.f43801b;
            c11068si15.f42561f.eraseColor(0);
            Canvas canvas3 = new Canvas(c11068si15.f42561f);
            C10940ri1 c10940ri12 = c11068si15.f42557b;
            c10940ri12.m24463a(c10940ri12.f41822g, C10940ri1.f41815p, canvas3, iMin, iMin2);
        }
        C11068si1 c11068si16 = this.f43801b;
        if (c11068si16.f42557b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c11068si16.f42567l == null) {
                Paint paint2 = new Paint();
                c11068si16.f42567l = paint2;
                paint2.setFilterBitmap(true);
            }
            c11068si16.f42567l.setAlpha(c11068si16.f42557b.getRootAlpha());
            c11068si16.f42567l.setColorFilter(colorFilter);
            paint = c11068si16.f42567l;
        }
        canvas.drawBitmap(c11068si16.f42561f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.getAlpha() : this.f43801b.f42557b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f43801b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f37260a;
        return drawable != null ? AbstractC4173hL.m18801c(drawable) : this.f43803d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f37260a != null && Build.VERSION.SDK_INT >= 24) {
            return new C11196ti1(this.f37260a.getConstantState());
        }
        this.f43801b.f42556a = getChangingConfigurations();
        return this.f43801b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f43801b.f42557b.f41824i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f43801b.f42557b.f41823h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.isAutoMirrored() : this.f43801b.f42560e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C11068si1 c11068si1 = this.f43801b;
            if (c11068si1 != null) {
                C10940ri1 c10940ri1 = c11068si1.f42557b;
                if (c10940ri1.f41829n == null) {
                    c10940ri1.f41829n = Boolean.valueOf(c10940ri1.f41822g.mo23172a());
                }
                if (c10940ri1.f41829n.booleanValue() || ((colorStateList = this.f43801b.f42558c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f43804e && super.mutate() == this) {
            C11068si1 c11068si1 = this.f43801b;
            C11068si1 c11068si12 = new C11068si1();
            c11068si12.f42558c = null;
            c11068si12.f42559d = f43800j;
            if (c11068si1 != null) {
                c11068si12.f42556a = c11068si1.f42556a;
                C10940ri1 c10940ri1 = new C10940ri1(c11068si1.f42557b);
                c11068si12.f42557b = c10940ri1;
                if (c11068si1.f42557b.f41820e != null) {
                    c10940ri1.f41820e = new Paint(c11068si1.f42557b.f41820e);
                }
                if (c11068si1.f42557b.f41819d != null) {
                    c11068si12.f42557b.f41819d = new Paint(c11068si1.f42557b.f41819d);
                }
                c11068si12.f42558c = c11068si1.f42558c;
                c11068si12.f42559d = c11068si1.f42559d;
                c11068si12.f42560e = c11068si1.f42560e;
            }
            this.f43801b = c11068si12;
            this.f43804e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C11068si1 c11068si1 = this.f43801b;
        ColorStateList colorStateList = c11068si1.f42558c;
        if (colorStateList == null || (mode = c11068si1.f42559d) == null) {
            z = false;
        } else {
            this.f43802c = m25225a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C10940ri1 c10940ri1 = c11068si1.f42557b;
        if (c10940ri1.f41829n == null) {
            c10940ri1.f41829n = Boolean.valueOf(c10940ri1.f41822g.mo23172a());
        }
        if (c10940ri1.f41829n.booleanValue()) {
            boolean zMo23173b = c11068si1.f42557b.f41822g.mo23173b(iArr);
            c11068si1.f42566k |= zMo23173b;
            if (zMo23173b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f43801b.f42557b.getRootAlpha() != i) {
            this.f43801b.f42557b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f43801b.f42560e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f43803d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            C10682ph1.m23835c(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            AbstractC4173hL.m18806h(drawable, colorStateList);
            return;
        }
        C11068si1 c11068si1 = this.f43801b;
        if (c11068si1.f42558c != colorStateList) {
            c11068si1.f42558c = colorStateList;
            this.f43802c = m25225a(colorStateList, c11068si1.f42559d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            AbstractC4173hL.m18807i(drawable, mode);
            return;
        }
        C11068si1 c11068si1 = this.f43801b;
        if (c11068si1.f42559d != mode) {
            c11068si1.f42559d = mode;
            this.f43802c = m25225a(c11068si1.f42558c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f37260a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C10940ri1 c10940ri1;
        int i;
        boolean z;
        char c;
        int i2;
        Paint.Cap cap;
        Drawable drawable = this.f37260a;
        if (drawable != null) {
            AbstractC4173hL.m18802d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C11068si1 c11068si1 = this.f43801b;
        c11068si1.f42557b = new C10940ri1();
        TypedArray typedArrayM2678d = FZ1.m2678d(resources, theme, attributeSet, AbstractC0783MR.f7158b);
        C11068si1 c11068si12 = this.f43801b;
        C10940ri1 c10940ri12 = c11068si12.f42557b;
        int i3 = !FZ1.m2677c(xmlPullParser, "tintMode") ? -1 : typedArrayM2678d.getInt(6, -1);
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
        c11068si12.f42559d = mode;
        int i5 = 1;
        ColorStateList colorStateListM4063a = null;
        boolean z2 = false;
        if (FZ1.m2677c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayM2678d.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i6 >= 28 && i6 <= 31) {
                colorStateListM4063a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM2678d.getResources();
                int resourceId = typedArrayM2678d.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0561Iu.f5196a;
                try {
                    colorStateListM4063a = AbstractC0561Iu.m4063a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        ColorStateList colorStateList = colorStateListM4063a;
        if (colorStateList != null) {
            c11068si12.f42558c = colorStateList;
        }
        boolean z3 = c11068si12.f42560e;
        if (FZ1.m2677c(xmlPullParser, "autoMirrored")) {
            z3 = typedArrayM2678d.getBoolean(5, z3);
        }
        c11068si12.f42560e = z3;
        float f = c10940ri12.f41825j;
        if (FZ1.m2677c(xmlPullParser, "viewportWidth")) {
            f = typedArrayM2678d.getFloat(7, f);
        }
        c10940ri12.f41825j = f;
        float f2 = c10940ri12.f41826k;
        if (FZ1.m2677c(xmlPullParser, "viewportHeight")) {
            f2 = typedArrayM2678d.getFloat(8, f2);
        }
        c10940ri12.f41826k = f2;
        if (c10940ri12.f41825j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM2678d.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c10940ri12.f41823h = typedArrayM2678d.getDimension(3, c10940ri12.f41823h);
            float dimension = typedArrayM2678d.getDimension(2, c10940ri12.f41824i);
            c10940ri12.f41824i = dimension;
            if (c10940ri12.f41823h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM2678d.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c10940ri12.getAlpha();
                if (FZ1.m2677c(xmlPullParser, "alpha")) {
                    alpha = typedArrayM2678d.getFloat(4, alpha);
                }
                c10940ri12.setAlpha(alpha);
                String string = typedArrayM2678d.getString(0);
                if (string != null) {
                    c10940ri12.f41828m = string;
                    c10940ri12.f41830o.put(string, c10940ri12);
                }
                typedArrayM2678d.recycle();
                c11068si1.f42556a = getChangingConfigurations();
                c11068si1.f42566k = true;
                C11068si1 c11068si13 = this.f43801b;
                C10940ri1 c10940ri13 = c11068si13.f42557b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c10940ri13.f41822g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                while (eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i4)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C10556oi1 c10556oi1 = (C10556oi1) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        C7119x8 c7119x8 = c10940ri13.f41830o;
                        c10940ri1 = c10940ri13;
                        if (zEquals) {
                            C10428ni1 c10428ni1 = new C10428ni1();
                            c10428ni1.f38477e = 0.0f;
                            c10428ni1.f38479g = 1.0f;
                            c10428ni1.f38480h = 1.0f;
                            c10428ni1.f38481i = 0.0f;
                            c10428ni1.f38482j = 1.0f;
                            c10428ni1.f38483k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c10428ni1.f38484l = cap2;
                            Paint.Join join = Paint.Join.MITER;
                            c10428ni1.f38485m = join;
                            i = depth;
                            c10428ni1.f38486n = 4.0f;
                            TypedArray typedArrayM2678d2 = FZ1.m2678d(resources, theme, attributeSet, AbstractC0783MR.f7160d);
                            if (FZ1.m2677c(xmlPullParser, "pathData")) {
                                String string2 = typedArrayM2678d2.getString(0);
                                if (string2 != null) {
                                    c10428ni1.f41111b = string2;
                                }
                                String string3 = typedArrayM2678d2.getString(2);
                                if (string3 != null) {
                                    c10428ni1.f41110a = AbstractC11658xK1.m25839c(string3);
                                }
                                c10428ni1.f38478f = FZ1.m2675a(typedArrayM2678d2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c10428ni1.f38480h;
                                if (FZ1.m2677c(xmlPullParser, "fillAlpha")) {
                                    f3 = typedArrayM2678d2.getFloat(12, f3);
                                }
                                c10428ni1.f38480h = f3;
                                int i7 = !FZ1.m2677c(xmlPullParser, "strokeLineCap") ? -1 : typedArrayM2678d2.getInt(8, -1);
                                Paint.Cap cap3 = c10428ni1.f38484l;
                                if (i7 == 0) {
                                    cap = cap2;
                                } else if (i7 != 1) {
                                    cap = i7 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c10428ni1.f38484l = cap;
                                int i8 = !FZ1.m2677c(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayM2678d2.getInt(9, -1);
                                Paint.Join join2 = c10428ni1.f38485m;
                                if (i8 != 0) {
                                    if (i8 != 1) {
                                        join = i8 != 2 ? join2 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                }
                                c10428ni1.f38485m = join;
                                float f4 = c10428ni1.f38486n;
                                if (FZ1.m2677c(xmlPullParser, "strokeMiterLimit")) {
                                    f4 = typedArrayM2678d2.getFloat(10, f4);
                                }
                                c10428ni1.f38486n = f4;
                                c10428ni1.f38476d = FZ1.m2675a(typedArrayM2678d2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c10428ni1.f38479g;
                                if (FZ1.m2677c(xmlPullParser, "strokeAlpha")) {
                                    f5 = typedArrayM2678d2.getFloat(11, f5);
                                }
                                c10428ni1.f38479g = f5;
                                float f6 = c10428ni1.f38477e;
                                if (FZ1.m2677c(xmlPullParser, "strokeWidth")) {
                                    f6 = typedArrayM2678d2.getFloat(4, f6);
                                }
                                c10428ni1.f38477e = f6;
                                float f7 = c10428ni1.f38482j;
                                if (FZ1.m2677c(xmlPullParser, "trimPathEnd")) {
                                    f7 = typedArrayM2678d2.getFloat(6, f7);
                                }
                                c10428ni1.f38482j = f7;
                                float f8 = c10428ni1.f38483k;
                                if (FZ1.m2677c(xmlPullParser, "trimPathOffset")) {
                                    f8 = typedArrayM2678d2.getFloat(7, f8);
                                }
                                c10428ni1.f38483k = f8;
                                float f9 = c10428ni1.f38481i;
                                if (FZ1.m2677c(xmlPullParser, "trimPathStart")) {
                                    f9 = typedArrayM2678d2.getFloat(5, f9);
                                }
                                c10428ni1.f38481i = f9;
                                int i9 = c10428ni1.f41112c;
                                if (FZ1.m2677c(xmlPullParser, "fillType")) {
                                    i9 = typedArrayM2678d2.getInt(13, i9);
                                }
                                c10428ni1.f41112c = i9;
                            }
                            typedArrayM2678d2.recycle();
                            c10556oi1.f39184b.add(c10428ni1);
                            if (c10428ni1.getPathName() != null) {
                                c7119x8.put(c10428ni1.getPathName(), c10428ni1);
                            }
                            c11068si13.f42556a = c11068si13.f42556a;
                            z = false;
                            c = '\b';
                            z4 = false;
                        } else {
                            i = depth;
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                C10300mi1 c10300mi1 = new C10300mi1();
                                if (FZ1.m2677c(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayM2678d3 = FZ1.m2678d(resources, theme, attributeSet, AbstractC0783MR.f7161e);
                                    String string4 = typedArrayM2678d3.getString(0);
                                    if (string4 != null) {
                                        c10300mi1.f41111b = string4;
                                    }
                                    String string5 = typedArrayM2678d3.getString(1);
                                    if (string5 != null) {
                                        c10300mi1.f41110a = AbstractC11658xK1.m25839c(string5);
                                    }
                                    c10300mi1.f41112c = !FZ1.m2677c(xmlPullParser, "fillType") ? 0 : typedArrayM2678d3.getInt(2, 0);
                                    typedArrayM2678d3.recycle();
                                }
                                c10556oi1.f39184b.add(c10300mi1);
                                if (c10300mi1.getPathName() != null) {
                                    c7119x8.put(c10300mi1.getPathName(), c10300mi1);
                                }
                                c11068si13.f42556a = c11068si13.f42556a;
                            } else if (NotificationConstants.GROUP.equals(name)) {
                                C10556oi1 c10556oi12 = new C10556oi1();
                                TypedArray typedArrayM2678d4 = FZ1.m2678d(resources, theme, attributeSet, AbstractC0783MR.f7159c);
                                float f10 = c10556oi12.f39185c;
                                if (FZ1.m2677c(xmlPullParser, "rotation")) {
                                    f10 = typedArrayM2678d4.getFloat(5, f10);
                                }
                                c10556oi12.f39185c = f10;
                                c10556oi12.f39186d = typedArrayM2678d4.getFloat(1, c10556oi12.f39186d);
                                c10556oi12.f39187e = typedArrayM2678d4.getFloat(2, c10556oi12.f39187e);
                                float f11 = c10556oi12.f39188f;
                                if (FZ1.m2677c(xmlPullParser, "scaleX")) {
                                    f11 = typedArrayM2678d4.getFloat(3, f11);
                                }
                                c10556oi12.f39188f = f11;
                                float f12 = c10556oi12.f39189g;
                                if (FZ1.m2677c(xmlPullParser, "scaleY")) {
                                    f12 = typedArrayM2678d4.getFloat(4, f12);
                                }
                                c10556oi12.f39189g = f12;
                                float f13 = c10556oi12.f39190h;
                                if (FZ1.m2677c(xmlPullParser, "translateX")) {
                                    f13 = typedArrayM2678d4.getFloat(6, f13);
                                }
                                c10556oi12.f39190h = f13;
                                float f14 = c10556oi12.f39191i;
                                if (FZ1.m2677c(xmlPullParser, "translateY")) {
                                    f14 = typedArrayM2678d4.getFloat(7, f14);
                                }
                                c10556oi12.f39191i = f14;
                                z = false;
                                String string6 = typedArrayM2678d4.getString(0);
                                if (string6 != null) {
                                    c10556oi12.f39193k = string6;
                                }
                                c10556oi12.m23527c();
                                typedArrayM2678d4.recycle();
                                c10556oi1.f39184b.add(c10556oi12);
                                arrayDeque.push(c10556oi12);
                                if (c10556oi12.getGroupName() != null) {
                                    c7119x8.put(c10556oi12.getGroupName(), c10556oi12);
                                }
                                c11068si13.f42556a = c11068si13.f42556a;
                            }
                            z = false;
                        }
                        i4 = 3;
                        i2 = 1;
                    } else {
                        c10940ri1 = c10940ri13;
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
                    c10940ri13 = c10940ri1;
                    z2 = z;
                    depth = i;
                }
                if (!z4) {
                    this.f43802c = m25225a(c11068si1.f42558c, c11068si1.f42559d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM2678d.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM2678d.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C11324ui1(C11068si1 c11068si1) {
        this.f43805f = true;
        this.f43806g = new float[9];
        this.f43807h = new Matrix();
        this.f43808i = new Rect();
        this.f43801b = c11068si1;
        this.f43802c = m25225a(c11068si1.f42558c, c11068si1.f42559d);
    }
}
