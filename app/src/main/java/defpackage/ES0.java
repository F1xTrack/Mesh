package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class ES0 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static void a(CS0 cs0, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap weakHashMap = b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(cs0);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(cs0, sparseArray);
                }
                sparseArray.append(i, new BS0(colorStateList, cs0.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, EQ1 eq1, boolean z, boolean z2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            K9 k9 = AbstractC0814Ke1.b;
            Typeface typeface = (Typeface) k9.e(AbstractC0814Ke1.b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (eq1 != null) {
                    new Handler(Looper.getMainLooper()).post(new MD0(eq1, 19, typeface));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC3980gX interfaceC3980gXA = AbstractC6570q12.a(resources.getXml(i), resources);
                        if (interfaceC3980gXA != null) {
                            typefaceA = AbstractC0814Ke1.a(context, interfaceC3980gXA, resources, i, string, typedValue.assetCookie, i2, eq1, z);
                        } else if (eq1 != null) {
                            eq1.a(-3);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceE = AbstractC0814Ke1.a.e(context, resources, i, string, i2);
                        if (typefaceE != null) {
                            k9.f(AbstractC0814Ke1.b(resources, i, string, i4, i2), typefaceE);
                        }
                        if (eq1 != null) {
                            if (typefaceE != null) {
                                new Handler(Looper.getMainLooper()).post(new MD0(eq1, 19, typefaceE));
                            } else {
                                eq1.a(-3);
                            }
                        }
                        typefaceA = typefaceE;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (eq1 != null) {
                        eq1.a(-3);
                    }
                }
            }
        } else if (eq1 != null) {
            eq1.a(-3);
        }
        if (typefaceA != null || eq1 != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
