package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class WZ0 extends AbstractC8923c01 {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f13262c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f13263d;

    public WZ0(ArrayList arrayList, Matrix matrix) {
        this.f13262c = arrayList;
        this.f13263d = matrix;
    }

    @Override // p000.AbstractC8923c01
    /* renamed from: a */
    public final void mo8818a(Matrix matrix, JZ0 jz0, int i, Canvas canvas) {
        Iterator it = this.f13262c.iterator();
        while (it.hasNext()) {
            ((AbstractC8923c01) it.next()).mo8818a(this.f13263d, jz0, i, canvas);
        }
    }
}
