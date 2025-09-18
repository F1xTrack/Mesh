package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* renamed from: Kx */
/* loaded from: classes.dex */
public final class C0690Kx {

    /* renamed from: a */
    public int f6395a;

    /* renamed from: b */
    public int f6396b;

    /* renamed from: c */
    public float f6397c;

    /* renamed from: d */
    public String f6398d;

    /* renamed from: e */
    public boolean f6399e;

    /* renamed from: f */
    public int f6400f;

    public C0690Kx(C0690Kx c0690Kx, Object obj) {
        c0690Kx.getClass();
        this.f6395a = c0690Kx.f6395a;
        m4782b(obj);
    }

    /* renamed from: a */
    public static void m4781a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), TG0.f11274c);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        Object string2 = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 1) {
                string2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i3 = 3;
                if (index == 3) {
                    string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i3 = 4;
                    if (index == 2) {
                        string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            string2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            string2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i3 = 5;
                            if (index == 5) {
                                string2 = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else if (index == 6) {
                                string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                i = 1;
                            } else if (index == 8) {
                                string2 = typedArrayObtainStyledAttributes.getString(index);
                            }
                        }
                        i = 7;
                    }
                }
                i = i3;
            }
        }
        if (string != null && string2 != null) {
            C0690Kx c0690Kx = new C0690Kx();
            c0690Kx.f6395a = i;
            c0690Kx.m4782b(string2);
            map.put(string, c0690Kx);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m4782b(Object obj) {
        switch (AbstractC7222ym.m26247x(this.f6395a)) {
            case 0:
                this.f6396b = ((Integer) obj).intValue();
                break;
            case 1:
                this.f6397c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f6400f = ((Integer) obj).intValue();
                break;
            case 4:
                this.f6398d = (String) obj;
                break;
            case 5:
                this.f6399e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f6397c = ((Float) obj).floatValue();
                break;
        }
    }
}
