package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class FZ1 {
    /* renamed from: a */
    public static C1356VY m2675a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C1356VY c1356vyM8462t;
        if (m2677c(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C1356VY((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c1356vyM8462t = C1356VY.m8462t(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                c1356vyM8462t = null;
            }
            if (c1356vyM8462t != null) {
                return c1356vyM8462t;
            }
        }
        return new C1356VY((Shader) null, (ColorStateList) null, 0);
    }

    /* renamed from: b */
    public static String m2676b(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (m2677c(xmlResourceParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m2677c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: d */
    public static TypedArray m2678d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: e */
    public static C6417mI m2679e(InterfaceC6497nZ interfaceC6497nZ) {
        C6671qI c6671qI = new C6671qI();
        interfaceC6497nZ.invoke(c6671qI);
        c6671qI.f40743a = true;
        return new C6417mI(c6671qI);
    }
}
