package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class WZ0 extends AbstractC2431c01 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public WZ0(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.AbstractC2431c01
    public final void a(Matrix matrix, JZ0 jz0, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((AbstractC2431c01) it.next()).a(this.d, jz0, i, canvas);
        }
    }
}
