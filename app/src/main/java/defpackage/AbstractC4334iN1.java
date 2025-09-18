package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: iN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4334iN1 {
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a4, code lost:
    
        if (r31 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03a6, code lost:
    
        if (r13 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a8, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b7, code lost:
    
        if (r3.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b9, code lost:
    
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03c5, code lost:
    
        if (r32 != 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c7, code lost:
    
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03cb, code lost:
    
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03ce, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4334iN1.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static EnumC3548eG0 b(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return EnumC3548eG0.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return EnumC3548eG0.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC3548eG0.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return EnumC3548eG0.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC3548eG0.SPDY_3;
        }
        if (str.equals("quic")) {
            return EnumC3548eG0.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && d(i4)) || (z2 && d(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C7361uA0[] c7361uA0ArrC = AbstractC7963xK1.c(string);
            C7361uA0[] c7361uA0ArrC2 = AbstractC7963xK1.c(string2);
            if (c7361uA0ArrC == null && c7361uA0ArrC2 == null) {
                return null;
            }
            if (c7361uA0ArrC == null) {
                if (c7361uA0ArrC2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C6200o5(), c7361uA0ArrC2);
                }
                return null;
            }
            C6200o5 c6200o5 = new C6200o5();
            if (c7361uA0ArrC2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c6200o5, c7361uA0ArrC);
            } else {
                if (!AbstractC7963xK1.a(c7361uA0ArrC, c7361uA0ArrC2)) {
                    throw new InflateException(AbstractC1705Vq.i(" Can't morph from ", string, " to ", string2));
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c6200o5, c7361uA0ArrC, c7361uA0ArrC2);
            }
            return propertyValuesHolderOfObject;
        }
        C5254j8 c5254j8 = i == 3 ? C5254j8.a : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z) {
            int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : d(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (z2) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z2) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
        }
        if (propertyValuesHolderOfInt == null || c5254j8 == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(c5254j8);
        return propertyValuesHolderOfInt;
    }

    public static boolean d(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        TypedArray typedArrayD = FZ1.d(resources, theme, attributeSet, MR.h);
        TypedArray typedArrayD2 = FZ1.d(resources, theme, attributeSet, MR.l);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j = FZ1.c(xmlResourceParser, "duration") ? typedArrayD.getInt(1, 300) : 300;
        long j2 = !FZ1.c(xmlResourceParser, "startOffset") ? 0 : typedArrayD.getInt(2, 0);
        int i = !FZ1.c(xmlResourceParser, "valueType") ? 4 : typedArrayD.getInt(7, 4);
        if (FZ1.c(xmlResourceParser, "valueFrom") && FZ1.c(xmlResourceParser, "valueTo")) {
            if (i == 4) {
                TypedValue typedValuePeekValue = typedArrayD.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i2 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayD.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                i = ((z && d(i2)) || (z2 && d(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderC = c(typedArrayD, i, 5, 6, "");
            if (propertyValuesHolderC != null) {
                valueAnimator3.setValues(propertyValuesHolderC);
            }
        }
        valueAnimator3.setDuration(j);
        valueAnimator3.setStartDelay(j2);
        valueAnimator3.setRepeatCount(!FZ1.c(xmlResourceParser, "repeatCount") ? 0 : typedArrayD.getInt(3, 0));
        valueAnimator3.setRepeatMode(!FZ1.c(xmlResourceParser, "repeatMode") ? 1 : typedArrayD.getInt(4, 1));
        if (typedArrayD2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strB = FZ1.b(typedArrayD2, xmlResourceParser, "pathData", 1);
            if (strB != null) {
                String strB2 = FZ1.b(typedArrayD2, xmlResourceParser, "propertyXName", 2);
                String strB3 = FZ1.b(typedArrayD2, xmlResourceParser, "propertyYName", 3);
                if (strB2 == null && strB3 == null) {
                    throw new InflateException(typedArrayD2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathD = AbstractC7963xK1.d(strB);
                PathMeasure pathMeasure = new PathMeasure(pathD, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                while (true) {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator3 = valueAnimator3;
                }
                PathMeasure pathMeasure2 = new PathMeasure(pathD, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                typedArray = typedArrayD;
                int i3 = 0;
                int i4 = 0;
                float f2 = 0.0f;
                while (true) {
                    if (i4 >= iMin) {
                        break;
                    }
                    int i5 = iMin;
                    pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
                    fArr[i4] = fArr3[0];
                    fArr2[i4] = fArr3[1];
                    f2 += f;
                    int i6 = i3 + 1;
                    if (i6 < arrayList.size() && f2 > ((Float) arrayList.get(i6)).floatValue()) {
                        pathMeasure2.nextContour();
                        i3 = i6;
                    }
                    i4++;
                    iMin = i5;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strB2 != null ? PropertyValuesHolder.ofFloat(strB2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strB3 != null ? PropertyValuesHolder.ofFloat(strB3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayD;
                objectAnimator2.setPropertyName(FZ1.b(typedArrayD2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayD;
        }
        if (FZ1.c(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayD2 != null) {
            typedArrayD2.recycle();
        }
        return valueAnimator2;
    }
}
