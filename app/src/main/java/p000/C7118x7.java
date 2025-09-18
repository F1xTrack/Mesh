package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: x7 */
/* loaded from: classes.dex */
public final class C7118x7 {

    /* renamed from: l */
    public static final RectF f45398l = new RectF();

    /* renamed from: m */
    public static final ConcurrentHashMap f45399m = new ConcurrentHashMap();

    /* renamed from: a */
    public int f45400a = 0;

    /* renamed from: b */
    public boolean f45401b = false;

    /* renamed from: c */
    public float f45402c = -1.0f;

    /* renamed from: d */
    public float f45403d = -1.0f;

    /* renamed from: e */
    public float f45404e = -1.0f;

    /* renamed from: f */
    public int[] f45405f = new int[0];

    /* renamed from: g */
    public boolean f45406g = false;

    /* renamed from: h */
    public TextPaint f45407h;

    /* renamed from: i */
    public final TextView f45408i;

    /* renamed from: j */
    public final Context f45409j;

    /* renamed from: k */
    public final C6929u7 f45410k;

    public C7118x7(TextView textView) {
        this.f45408i = textView;
        this.f45409j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f45410k = new C6992v7();
        } else {
            this.f45410k = new C6929u7();
        }
    }

    /* renamed from: b */
    public static int[] m25762b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    public static Method m25763d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f45399m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Object m25764e(Object obj, Object obj2, String str) {
        try {
            return m25763d(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    /* renamed from: a */
    public final void m25765a() {
        if (m25767f()) {
            if (this.f45401b) {
                if (this.f45408i.getMeasuredHeight() <= 0 || this.f45408i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f45410k.mo25362b(this.f45408i) ? 1048576 : (this.f45408i.getMeasuredWidth() - this.f45408i.getTotalPaddingLeft()) - this.f45408i.getTotalPaddingRight();
                int height = (this.f45408i.getHeight() - this.f45408i.getCompoundPaddingBottom()) - this.f45408i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f45398l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM25766c = m25766c(rectF);
                        if (fM25766c != this.f45408i.getTextSize()) {
                            m25768g(fM25766c, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f45401b = true;
        }
    }

    /* renamed from: c */
    public final int m25766c(RectF rectF) {
        CharSequence transformation;
        int length = this.f45405f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.f45405f[i4];
            TextView textView = this.f45408i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f45407h;
            if (textPaint == null) {
                this.f45407h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f45407h.set(textView.getPaint());
            this.f45407h.setTextSize(i5);
            StaticLayout staticLayoutM24839a = AbstractC6866t7.m24839a(text, (Layout.Alignment) m25764e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f45408i, this.f45407h, this.f45410k);
            if ((maxLines == -1 || (staticLayoutM24839a.getLineCount() <= maxLines && staticLayoutM24839a.getLineEnd(staticLayoutM24839a.getLineCount() - 1) == text.length())) && staticLayoutM24839a.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.f45405f[i2];
    }

    /* renamed from: f */
    public final boolean m25767f() {
        return m25771j() && this.f45400a != 0;
    }

    /* renamed from: g */
    public final void m25768g(float f, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f45409j;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f45408i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f45401b = false;
                try {
                    Method methodM25763d = m25763d("nullLayouts");
                    if (methodM25763d != null) {
                        methodM25763d.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: h */
    public final boolean m25769h() {
        if (m25771j() && this.f45400a == 1) {
            if (!this.f45406g || this.f45405f.length == 0) {
                int iFloor = ((int) Math.floor((this.f45404e - this.f45403d) / this.f45402c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f45402c) + this.f45403d);
                }
                this.f45405f = m25762b(iArr);
            }
            this.f45401b = true;
        } else {
            this.f45401b = false;
        }
        return this.f45401b;
    }

    /* renamed from: i */
    public final boolean m25770i() {
        boolean z = this.f45405f.length > 0;
        this.f45406g = z;
        if (z) {
            this.f45400a = 1;
            this.f45403d = r0[0];
            this.f45404e = r0[r1 - 1];
            this.f45402c = -1.0f;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean m25771j() {
        return !(this.f45408i instanceof C0700L6);
    }

    /* renamed from: k */
    public final void m25772k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f45400a = 1;
        this.f45403d = f;
        this.f45404e = f2;
        this.f45402c = f3;
        this.f45406g = false;
    }
}
