package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: w31 */
/* loaded from: classes.dex */
public final class C11497w31 extends AbstractC6378lg {

    /* renamed from: i */
    public final PointF f44665i;

    /* renamed from: j */
    public final PointF f44666j;

    /* renamed from: k */
    public final C6494nW f44667k;

    /* renamed from: l */
    public final C6494nW f44668l;

    /* renamed from: m */
    public ES1 f44669m;

    /* renamed from: n */
    public ES1 f44670n;

    public C11497w31(C6494nW c6494nW, C6494nW c6494nW2) {
        super(Collections.emptyList());
        this.f44665i = new PointF();
        this.f44666j = new PointF();
        this.f44667k = c6494nW;
        this.f44668l = c6494nW2;
        mo5065i(this.f37231d);
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: e */
    public final Object mo5063e() {
        return m25557k();
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo3189f(C10551og0 c10551og0, float f) {
        return m25557k();
    }

    @Override // p000.AbstractC6378lg
    /* renamed from: i */
    public final void mo5065i(float f) {
        C6494nW c6494nW = this.f44667k;
        c6494nW.mo5065i(f);
        C6494nW c6494nW2 = this.f44668l;
        c6494nW2.mo5065i(f);
        this.f44665i.set(((Float) c6494nW.mo5063e()).floatValue(), ((Float) c6494nW2.mo5063e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f37228a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4194hg) arrayList.get(i)).mo1741a();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0039  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF m25557k() {
        /*
            r12 = this;
            ES1 r0 = r12.f44669m
            r1 = 0
            if (r0 == 0) goto L39
            nW r0 = r12.f44667k
            ig r2 = r0.f37230c
            og0 r2 = r2.mo7744e()
            if (r2 == 0) goto L39
            java.lang.Float r3 = r2.f39165h
            ES1 r4 = r12.f44669m
            float r5 = r2.f39164g
            if (r3 != 0) goto L19
            r6 = r5
            goto L1e
        L19:
            float r3 = r3.floatValue()
            r6 = r3
        L1e:
            java.lang.Object r3 = r2.f39159b
            r7 = r3
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r2 = r2.f39160c
            r8 = r2
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r0.m22528c()
            float r10 = r0.m22529d()
            float r11 = r0.f37231d
            java.lang.Object r0 = r4.m2303z(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L3a
        L39:
            r0 = r1
        L3a:
            ES1 r2 = r12.f44670n
            if (r2 == 0) goto L71
            nW r2 = r12.f44668l
            ig r3 = r2.f37230c
            og0 r3 = r3.mo7744e()
            if (r3 == 0) goto L71
            java.lang.Float r1 = r3.f39165h
            ES1 r4 = r12.f44670n
            float r5 = r3.f39164g
            if (r1 != 0) goto L52
            r6 = r5
            goto L57
        L52:
            float r1 = r1.floatValue()
            r6 = r1
        L57:
            java.lang.Object r1 = r3.f39159b
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r1 = r3.f39160c
            r8 = r1
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r2.m22528c()
            float r10 = r2.m22529d()
            float r11 = r2.f37231d
            java.lang.Object r1 = r4.m2303z(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r1 = (java.lang.Float) r1
        L71:
            android.graphics.PointF r2 = r12.f44665i
            android.graphics.PointF r3 = r12.f44666j
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C11497w31.m25557k():android.graphics.PointF");
    }
}
