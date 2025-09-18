package defpackage;

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
public final class C0373En1 extends WindowInsetsAnimation$Callback {
    public final AbstractC0061An1 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public C0373En1(AbstractC0061An1 abstractC0061An1) {
        super(abstractC0061An1.getDispatchMode());
        this.d = new HashMap();
        this.a = abstractC0061An1;
    }

    public final C0607Hn1 a(WindowInsetsAnimation windowInsetsAnimation) {
        C0607Hn1 c0607Hn1 = (C0607Hn1) this.d.get(windowInsetsAnimation);
        if (c0607Hn1 == null) {
            c0607Hn1 = new C0607Hn1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0607Hn1.a = new C0451Fn1(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, c0607Hn1);
        }
        return c0607Hn1;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.onEnd(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.onPrepare(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationL = M21.l(list.get(size));
            C0607Hn1 c0607Hn1A = a(windowInsetsAnimationL);
            c0607Hn1A.a.d(windowInsetsAnimationL.getFraction());
            this.c.add(c0607Hn1A);
        }
        return this.a.onProgress(C1698Vn1.h(null, windowInsets), this.b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C8430zn1 c8430zn1OnStart = this.a.onStart(a(windowInsetsAnimation), new C8430zn1(bounds));
        c8430zn1OnStart.getClass();
        M21.n();
        return M21.j(c8430zn1OnStart.a.d(), c8430zn1OnStart.b.d());
    }
}
