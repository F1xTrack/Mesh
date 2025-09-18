package defpackage;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: yk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8231yk1 {
    public final a a;
    public int b = 0;
    public int[] c;

    public C8231yk1(a aVar) {
        this.a = aVar;
    }

    public final int a(int i, int i2) {
        a aVar;
        int[] iArr = this.c;
        if (iArr != null && (i2 >= iArr.length || iArr[i2] >= i)) {
            AbstractC3393dS.q("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i), Integer.valueOf(i2));
            b();
        }
        if (this.c == null) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (true) {
                aVar = this.a;
                if (i3 >= i) {
                    break;
                }
                arrayList.add(aVar.getChildAt(i3));
                i3++;
            }
            Collections.sort(arrayList, new C2209aq0(26));
            this.c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.c[i4] = aVar.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.c[i2];
    }

    public final void b() {
        int i = 0;
        this.b = 0;
        while (true) {
            a aVar = this.a;
            if (i >= aVar.getChildCount()) {
                this.c = null;
                return;
            } else {
                if (ViewGroupManager.getViewZIndex(aVar.getChildAt(i)) != null) {
                    this.b++;
                }
                i++;
            }
        }
    }
}
