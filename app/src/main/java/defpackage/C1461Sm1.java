package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: Sm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461Sm1 extends FrameLayout implements InterfaceC4283i61 {
    public final C1312Qp a;
    public final C1305Qm1 b;
    public List c;
    public C1468Sp d;
    public float e;
    public int f;
    public float g;

    public C1461Sm1(Context context) {
        super(context, null);
        this.c = Collections.emptyList();
        this.d = C1468Sp.g;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        C1312Qp c1312Qp = new C1312Qp(context);
        this.a = c1312Qp;
        C1305Qm1 c1305Qm1 = new C1305Qm1(context, null);
        this.b = c1305Qm1;
        c1305Qm1.setBackgroundColor(0);
        addView(c1312Qp);
        addView(c1305Qm1);
    }

    @Override // defpackage.InterfaceC4283i61
    public final void a(List list, C1468Sp c1468Sp, float f, int i, float f2) {
        this.d = c1468Sp;
        this.e = f;
        this.f = i;
        this.g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C7363uB c7363uB = (C7363uB) list.get(i2);
            if (c7363uB.d != null) {
                arrayList.add(c7363uB);
            } else {
                arrayList2.add(c7363uB);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, c1468Sp, f, i, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float fC = DT1.c(i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), f);
        if (fC == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fC / getContext().getResources().getDisplayMetrics().density)};
        int i2 = AbstractC0277Dh1.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1461Sm1.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
