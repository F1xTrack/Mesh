package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Qp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312Qp extends View implements InterfaceC4283i61 {
    public final ArrayList a;
    public List b;
    public int c;
    public float d;
    public C1468Sp e;
    public float f;

    public C1312Qp(Context context) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.emptyList();
        this.c = 0;
        this.d = 0.0533f;
        this.e = C1468Sp.g;
        this.f = 0.08f;
    }

    @Override // defpackage.InterfaceC4283i61
    public final void a(List list, C1468Sp c1468Sp, float f, int i, float f2) {
        this.b = list;
        this.e = c1468Sp;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C2263b61(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r39) {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1312Qp.dispatchDraw(android.graphics.Canvas):void");
    }
}
