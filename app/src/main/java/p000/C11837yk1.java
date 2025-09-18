package p000;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.C1932a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: yk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11837yk1 {

    /* renamed from: a */
    public final C1932a f46437a;

    /* renamed from: b */
    public int f46438b = 0;

    /* renamed from: c */
    public int[] f46439c;

    public C11837yk1(C1932a c1932a) {
        this.f46437a = c1932a;
    }

    /* renamed from: a */
    public final int m26218a(int i, int i2) {
        C1932a c1932a;
        int[] iArr = this.f46439c;
        if (iArr != null && (i2 >= iArr.length || iArr[i2] >= i)) {
            AbstractC3929dS.m17684q("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i), Integer.valueOf(i2));
            m26219b();
        }
        if (this.f46439c == null) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (true) {
                c1932a = this.f46437a;
                if (i3 >= i) {
                    break;
                }
                arrayList.add(c1932a.getChildAt(i3));
                i3++;
            }
            Collections.sort(arrayList, new C8774aq0(26));
            this.f46439c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.f46439c[i4] = c1932a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.f46439c[i2];
    }

    /* renamed from: b */
    public final void m26219b() {
        int i = 0;
        this.f46438b = 0;
        while (true) {
            C1932a c1932a = this.f46437a;
            if (i >= c1932a.getChildCount()) {
                this.f46439c = null;
                return;
            } else {
                if (ViewGroupManager.getViewZIndex(c1932a.getChildAt(i)) != null) {
                    this.f46438b++;
                }
                i++;
            }
        }
    }
}
