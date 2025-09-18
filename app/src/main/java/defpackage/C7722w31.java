package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: w31 */
/* loaded from: classes.dex */
public final class C7722w31 extends AbstractC5738lg {
    public final PointF i;
    public final PointF j;
    public final C6090nW k;
    public final C6090nW l;
    public ES1 m;
    public ES1 n;

    public C7722w31(C6090nW c6090nW, C6090nW c6090nW2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = c6090nW;
        this.l = c6090nW2;
        i(this.d);
    }

    @Override // defpackage.AbstractC5738lg
    public final Object e() {
        return k();
    }

    @Override // defpackage.AbstractC5738lg
    public final /* bridge */ /* synthetic */ Object f(C6312og0 c6312og0, float f) {
        return k();
    }

    @Override // defpackage.AbstractC5738lg
    public final void i(float f) {
        C6090nW c6090nW = this.k;
        c6090nW.i(f);
        C6090nW c6090nW2 = this.l;
        c6090nW2.i(f);
        this.i.set(((Float) c6090nW.e()).floatValue(), ((Float) c6090nW2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4198hg) arrayList.get(i)).a();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF k() {
        /*
            r12 = this;
            ES1 r0 = r12.m
            r1 = 0
            if (r0 == 0) goto L39
            nW r0 = r12.k
            ig r2 = r0.c
            og0 r2 = r2.e()
            if (r2 == 0) goto L39
            java.lang.Float r3 = r2.h
            ES1 r4 = r12.m
            float r5 = r2.g
            if (r3 != 0) goto L19
            r6 = r5
            goto L1e
        L19:
            float r3 = r3.floatValue()
            r6 = r3
        L1e:
            java.lang.Object r3 = r2.b
            r7 = r3
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r2 = r2.c
            r8 = r2
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r0.c()
            float r10 = r0.d()
            float r11 = r0.d
            java.lang.Object r0 = r4.z(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L3a
        L39:
            r0 = r1
        L3a:
            ES1 r2 = r12.n
            if (r2 == 0) goto L71
            nW r2 = r12.l
            ig r3 = r2.c
            og0 r3 = r3.e()
            if (r3 == 0) goto L71
            java.lang.Float r1 = r3.h
            ES1 r4 = r12.n
            float r5 = r3.g
            if (r1 != 0) goto L52
            r6 = r5
            goto L57
        L52:
            float r1 = r1.floatValue()
            r6 = r1
        L57:
            java.lang.Object r1 = r3.b
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r1 = r3.c
            r8 = r1
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r2.c()
            float r10 = r2.d()
            float r11 = r2.d
            java.lang.Object r1 = r4.z(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r1 = (java.lang.Float) r1
        L71:
            android.graphics.PointF r2 = r12.i
            android.graphics.PointF r3 = r12.j
            r4 = 0
            if (r0 != 0) goto L7e
            float r0 = r2.x
            r3.set(r0, r4)
            goto L85
        L7e:
            float r0 = r0.floatValue()
            r3.set(r0, r4)
        L85:
            if (r1 != 0) goto L8f
            float r0 = r3.x
            float r1 = r2.y
            r3.set(r0, r1)
            goto L98
        L8f:
            float r0 = r3.x
            float r1 = r1.floatValue()
            r3.set(r0, r1)
        L98:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7722w31.k():android.graphics.PointF");
    }
}
