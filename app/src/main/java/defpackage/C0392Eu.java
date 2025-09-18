package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.animated.a;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* renamed from: Eu */
/* loaded from: classes.dex */
public final class C0392Eu extends T4 {
    public final a e;
    public final ReactApplicationContext f;
    public int g;
    public int h;
    public int i;
    public int j;
    public ReadableMap k;
    public boolean l;

    public C0392Eu(ReadableMap readableMap, a aVar, ReactApplicationContext reactApplicationContext) {
        this.e = aVar;
        this.f = reactApplicationContext;
        g(readableMap);
    }

    public static Context f(T4 t4) {
        View viewResolveView;
        ArrayList arrayList = t4.a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                T4 t42 = (T4) it.next();
                if (!(t42 instanceof KE0)) {
                    return f(t42);
                }
                KE0 ke0 = (KE0) t42;
                ke0.getClass();
                try {
                    viewResolveView = ke0.i.resolveView(ke0.e);
                } catch (C2262b60 unused) {
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

    @Override // defpackage.T4
    public final String c() {
        return "ColorAnimatedNode[" + this.d + "]: r: " + this.g + " g: " + this.h + " b: " + this.i + " a: " + this.j;
    }

    public final int e() {
        h();
        int i = this.g;
        a aVar = this.e;
        return (Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, AbstractC3857ft1.a(((C0823Kh1) aVar.i(this.j)).f() * KotlinVersion.MAX_COMPONENT_VALUE))) << 24) | (Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, AbstractC3857ft1.a(((C0823Kh1) aVar.i(i)).f()))) << 16) | (Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, AbstractC3857ft1.a(((C0823Kh1) aVar.i(this.h)).f()))) << 8) | Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, AbstractC3857ft1.a(((C0823Kh1) aVar.i(this.i)).f())));
    }

    public final void g(ReadableMap readableMap) {
        this.g = readableMap.getInt("r");
        this.h = readableMap.getInt("g");
        this.i = readableMap.getInt("b");
        this.j = readableMap.getInt("a");
        this.k = readableMap.getMap("nativeColor");
        this.l = false;
        h();
    }

    public final void h() {
        if (this.k == null || this.l) {
            return;
        }
        Context currentActivity = this.f.getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = f(this);
        }
        if (currentActivity == null) {
            return;
        }
        int iIntValue = ColorPropConverter.getColor(this.k, currentActivity).intValue();
        int i = this.g;
        a aVar = this.e;
        C0823Kh1 c0823Kh1 = (C0823Kh1) aVar.i(i);
        C0823Kh1 c0823Kh12 = (C0823Kh1) aVar.i(this.h);
        C0823Kh1 c0823Kh13 = (C0823Kh1) aVar.i(this.i);
        C0823Kh1 c0823Kh14 = (C0823Kh1) aVar.i(this.j);
        c0823Kh1.e = Color.red(iIntValue);
        c0823Kh12.e = Color.green(iIntValue);
        c0823Kh13.e = Color.blue(iIntValue);
        c0823Kh14.e = Color.alpha(iIntValue) / 255.0d;
        this.l = true;
    }
}
