package p000;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* renamed from: Eu */
/* loaded from: classes.dex */
public final class C0309Eu extends AbstractC1200T4 {

    /* renamed from: e */
    public final C1881a f2940e;

    /* renamed from: f */
    public final ReactApplicationContext f2941f;

    /* renamed from: g */
    public int f2942g;

    /* renamed from: h */
    public int f2943h;

    /* renamed from: i */
    public int f2944i;

    /* renamed from: j */
    public int f2945j;

    /* renamed from: k */
    public ReadableMap f2946k;

    /* renamed from: l */
    public boolean f2947l;

    public C0309Eu(ReadableMap readableMap, C1881a c1881a, ReactApplicationContext reactApplicationContext) {
        this.f2940e = c1881a;
        this.f2941f = reactApplicationContext;
        m2444g(readableMap);
    }

    /* renamed from: f */
    public static Context m2441f(AbstractC1200T4 abstractC1200T4) {
        View viewResolveView;
        ArrayList arrayList = abstractC1200T4.f11140a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                AbstractC1200T4 abstractC1200T42 = (AbstractC1200T4) it.next();
                if (!(abstractC1200T42 instanceof KE0)) {
                    return m2441f(abstractC1200T42);
                }
                KE0 ke0 = (KE0) abstractC1200T42;
                ke0.getClass();
                try {
                    viewResolveView = ke0.f5955i.resolveView(ke0.f5951e);
                } catch (C8810b60 unused) {
                    viewResolveView = null;
                }
                if (viewResolveView != null) {
                    return viewResolveView.getContext();
                }
                return null;
            }
        }
        return null;
    }

    @Override // p000.AbstractC1200T4
    /* renamed from: c */
    public final String mo2442c() {
        return "ColorAnimatedNode[" + this.f11143d + "]: r: " + this.f2942g + " g: " + this.f2943h + " b: " + this.f2944i + " a: " + this.f2945j;
    }

    /* renamed from: e */
    public final int m2443e() {
        m2445h();
        int i = this.f2942g;
        C1881a c1881a = this.f2940e;
        return (Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, AbstractC9426ft1.m18303a(((C7849Kh1) c1881a.m10932i(this.f2945j)).m4701f() * KotlinVersion.MAX_COMPONENT_VALUE))) << 24) | (Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, AbstractC9426ft1.m18303a(((C7849Kh1) c1881a.m10932i(i)).m4701f()))) << 16) | (Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, AbstractC9426ft1.m18303a(((C7849Kh1) c1881a.m10932i(this.f2943h)).m4701f()))) << 8) | Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, AbstractC9426ft1.m18303a(((C7849Kh1) c1881a.m10932i(this.f2944i)).m4701f())));
    }

    /* renamed from: g */
    public final void m2444g(ReadableMap readableMap) {
        this.f2942g = readableMap.getInt("r");
        this.f2943h = readableMap.getInt("g");
        this.f2944i = readableMap.getInt("b");
        this.f2945j = readableMap.getInt("a");
        this.f2946k = readableMap.getMap("nativeColor");
        this.f2947l = false;
        m2445h();
    }

    /* renamed from: h */
    public final void m2445h() {
        if (this.f2946k == null || this.f2947l) {
            return;
        }
        Context currentActivity = this.f2941f.getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = m2441f(this);
        }
        if (currentActivity == null) {
            return;
        }
        int iIntValue = ColorPropConverter.getColor(this.f2946k, currentActivity).intValue();
        int i = this.f2942g;
        C1881a c1881a = this.f2940e;
        C7849Kh1 c7849Kh1 = (C7849Kh1) c1881a.m10932i(i);
        C7849Kh1 c7849Kh12 = (C7849Kh1) c1881a.m10932i(this.f2943h);
        C7849Kh1 c7849Kh13 = (C7849Kh1) c1881a.m10932i(this.f2944i);
        C7849Kh1 c7849Kh14 = (C7849Kh1) c1881a.m10932i(this.f2945j);
        c7849Kh1.f6259e = Color.red(iIntValue);
        c7849Kh12.f6259e = Color.green(iIntValue);
        c7849Kh13.f6259e = Color.blue(iIntValue);
        c7849Kh14.f6259e = Color.alpha(iIntValue) / 255.0d;
        this.f2947l = true;
    }
}
