package p000;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Qp */
/* loaded from: classes.dex */
public final class C1059Qp extends View implements InterfaceC9712i61 {

    /* renamed from: a */
    public final ArrayList f9797a;

    /* renamed from: b */
    public List f9798b;

    /* renamed from: c */
    public int f9799c;

    /* renamed from: d */
    public float f9800d;

    /* renamed from: e */
    public C1184Sp f9801e;

    /* renamed from: f */
    public float f9802f;

    public C1059Qp(Context context) {
        super(context, null);
        this.f9797a = new ArrayList();
        this.f9798b = Collections.emptyList();
        this.f9799c = 0;
        this.f9800d = 0.0533f;
        this.f9801e = C1184Sp.f10989g;
        this.f9802f = 0.08f;
    }

    @Override // p000.InterfaceC9712i61
    /* renamed from: a */
    public final void mo6792a(List list, C1184Sp c1184Sp, float f, int i, float f2) {
        this.f9798b = list;
        this.f9801e = c1184Sp;
        this.f9800d = f;
        this.f9799c = i;
        this.f9802f = f2;
        while (true) {
            ArrayList arrayList = this.f9797a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C8811b61(getContext()));
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C1059Qp.dispatchDraw(android.graphics.Canvas):void");
    }
}
