package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* renamed from: vS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7606vS0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C7606vS0(int i) {
        this.a = i;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C7606vS0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC5210iv.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    return Z4.c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception unused2) {
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C3324d5 c3324d5 = new C3324d5(context);
                    c3324d5.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return c3324d5;
                } catch (Exception unused3) {
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C7464ui1 c7464ui1 = new C7464ui1();
                    c7464ui1.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return c7464ui1;
                } catch (Exception unused4) {
                    return null;
                }
        }
    }
}
