package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* renamed from: vS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11419vS0 {

    /* renamed from: a */
    public final /* synthetic */ int f44381a;

    public /* synthetic */ C11419vS0(int i) {
        this.f44381a = i;
    }

    /* renamed from: a */
    public final Drawable m25423a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f44381a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C11419vS0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC6204iv.m21939c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    return C1578Z4.m9463c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception unused2) {
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C3906d5 c3906d5 = new C3906d5(context);
                    c3906d5.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return c3906d5;
                } catch (Exception unused3) {
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C11324ui1 c11324ui1 = new C11324ui1();
                    c11324ui1.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return c11324ui1;
                } catch (Exception unused4) {
                    return null;
                }
        }
    }
}
