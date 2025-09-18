package p000;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: En1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7549En1 extends WindowInsetsAnimation$Callback {

    /* renamed from: a */
    public final AbstractC7341An1 f2903a;

    /* renamed from: b */
    public List f2904b;

    /* renamed from: c */
    public ArrayList f2905c;

    /* renamed from: d */
    public final HashMap f2906d;

    public C7549En1(AbstractC7341An1 abstractC7341An1) {
        super(abstractC7341An1.getDispatchMode());
        this.f2906d = new HashMap();
        this.f2903a = abstractC7341An1;
    }

    /* renamed from: a */
    public final C7705Hn1 m2421a(WindowInsetsAnimation windowInsetsAnimation) {
        C7705Hn1 c7705Hn1 = (C7705Hn1) this.f2906d.get(windowInsetsAnimation);
        if (c7705Hn1 == null) {
            c7705Hn1 = new C7705Hn1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c7705Hn1.f4508a = new C7601Fn1(windowInsetsAnimation);
            }
            this.f2906d.put(windowInsetsAnimation, c7705Hn1);
        }
        return c7705Hn1;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2903a.onEnd(m2421a(windowInsetsAnimation));
        this.f2906d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2903a.onPrepare(m2421a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2905c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2905c = arrayList2;
            this.f2904b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM5232l = M21.m5232l(list.get(size));
            C7705Hn1 c7705Hn1M2421a = m2421a(windowInsetsAnimationM5232l);
            c7705Hn1M2421a.f4508a.mo2781d(windowInsetsAnimationM5232l.getFraction());
            this.f2905c.add(c7705Hn1M2421a);
        }
        return this.f2903a.onProgress(C8433Vn1.m8551h(null, windowInsets), this.f2904b).m8557g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C11970zn1 c11970zn1OnStart = this.f2903a.onStart(m2421a(windowInsetsAnimation), new C11970zn1(bounds));
        c11970zn1OnStart.getClass();
        M21.m5234n();
        return M21.m5230j(c11970zn1OnStart.f47008a.m4203d(), c11970zn1OnStart.f47009b.m4203d());
    }
}
