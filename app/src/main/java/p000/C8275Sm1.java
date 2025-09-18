package p000;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: Sm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8275Sm1 extends FrameLayout implements InterfaceC9712i61 {

    /* renamed from: a */
    public final C1059Qp f10970a;

    /* renamed from: b */
    public final C8171Qm1 f10971b;

    /* renamed from: c */
    public List f10972c;

    /* renamed from: d */
    public C1184Sp f10973d;

    /* renamed from: e */
    public float f10974e;

    /* renamed from: f */
    public int f10975f;

    /* renamed from: g */
    public float f10976g;

    public C8275Sm1(Context context) {
        super(context, null);
        this.f10972c = Collections.emptyList();
        this.f10973d = C1184Sp.f10989g;
        this.f10974e = 0.0533f;
        this.f10975f = 0;
        this.f10976g = 0.08f;
        C1059Qp c1059Qp = new C1059Qp(context);
        this.f10970a = c1059Qp;
        C8171Qm1 c8171Qm1 = new C8171Qm1(context, null);
        this.f10971b = c8171Qm1;
        c8171Qm1.setBackgroundColor(0);
        addView(c1059Qp);
        addView(c8171Qm1);
    }

    @Override // p000.InterfaceC9712i61
    /* renamed from: a */
    public final void mo6792a(List list, C1184Sp c1184Sp, float f, int i, float f2) {
        this.f10973d = c1184Sp;
        this.f10974e = f;
        this.f10975f = i;
        this.f10976g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C6933uB c6933uB = (C6933uB) list.get(i2);
            if (c6933uB.f43569d != null) {
                arrayList.add(c6933uB);
            } else {
                arrayList2.add(c6933uB);
            }
        }
        if (!this.f10972c.isEmpty() || !arrayList2.isEmpty()) {
            this.f10972c = arrayList2;
            m7451c();
        }
        this.f10970a.mo6792a(arrayList, c1184Sp, f, i, f2);
        invalidate();
    }

    /* renamed from: b */
    public final String m7450b(float f, int i) {
        float fM1705c = DT1.m1705c(i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), f);
        if (fM1705c == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fM1705c / getContext().getResources().getDisplayMetrics().density)};
        int i2 = AbstractC7485Dh1.f2166a;
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7451c() {
        /*
            Method dump skipped, instructions count: 1867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8275Sm1.m7451c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f10972c.isEmpty()) {
            return;
        }
        m7451c();
    }
}
