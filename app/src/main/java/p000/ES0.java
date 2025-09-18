package p000;

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

    /* renamed from: a */
    public static final ThreadLocal f2702a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f2703b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f2704c = new Object();

    /* renamed from: a */
    public static void m2275a(CS0 cs0, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2704c) {
            try {
                WeakHashMap weakHashMap = f2703b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(cs0);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(cs0, sparseArray);
                }
                sparseArray.append(i, new BS0(colorStateList, cs0.f1376a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static Typeface m2276b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m2277c(context, i, new TypedValue(), 0, null, false, false);
    }

    /* renamed from: c */
    public static Typeface m2277c(Context context, int i, TypedValue typedValue, int i2, EQ1 eq1, boolean z, boolean z2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM4696a = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C0640K9 c0640k9 = AbstractC7843Ke1.f6247b;
            Typeface typeface = (Typeface) c0640k9.m4572e(AbstractC7843Ke1.m4697b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (eq1 != null) {
                    new Handler(Looper.getMainLooper()).post(new MD0(eq1, 19, typeface));
                }
                typefaceM4696a = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC4122gX interfaceC4122gXM23924a = AbstractC10724q12.m23924a(resources.getXml(i), resources);
                        if (interfaceC4122gXM23924a != null) {
                            typefaceM4696a = AbstractC7843Ke1.m4696a(context, interfaceC4122gXM23924a, resources, i, string, typedValue.assetCookie, i2, eq1, z);
                        } else if (eq1 != null) {
                            eq1.m2266a(-3);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceMo3092e = AbstractC7843Ke1.f6246a.mo3092e(context, resources, i, string, i2);
                        if (typefaceMo3092e != null) {
                            c0640k9.m4573f(AbstractC7843Ke1.m4697b(resources, i, string, i4, i2), typefaceMo3092e);
                        }
                        if (eq1 != null) {
                            if (typefaceMo3092e != null) {
                                new Handler(Looper.getMainLooper()).post(new MD0(eq1, 19, typefaceMo3092e));
                            } else {
                                eq1.m2266a(-3);
                            }
                        }
                        typefaceM4696a = typefaceMo3092e;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (eq1 != null) {
                        eq1.m2266a(-3);
                    }
                }
            }
        } else if (eq1 != null) {
            eq1.m2266a(-3);
        }
        if (typefaceM4696a != null || eq1 != null || z2) {
            return typefaceM4696a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
