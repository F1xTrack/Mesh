package defpackage;

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
    public static VY a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        VY vyT;
        if (c(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new VY((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                vyT = VY.t(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                vyT = null;
            }
            if (vyT != null) {
                return vyT;
            }
        }
        return new VY((Shader) null, (ColorStateList) null, 0);
    }

    public static String b(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (c(xmlResourceParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static C5857mI e(InterfaceC6099nZ interfaceC6099nZ) {
        C6621qI c6621qI = new C6621qI();
        interfaceC6099nZ.invoke(c6621qI);
        c6621qI.a = true;
        return new C5857mI(c6621qI);
    }
}
