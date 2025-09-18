package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class WI1 implements InterfaceC8153yK1 {
    public final DD1 a;
    public final TE b;
    public final boolean c;

    public WI1(TE te, DD1 dd1) {
        C5806m12 c5806m12 = NF1.a;
        this.b = te;
        this.c = dd1 instanceof AbstractC8331zG1;
        this.a = dd1;
    }

    @Override // defpackage.InterfaceC8153yK1
    public final void a(Object obj) {
        this.b.getClass();
        TE.N(obj);
        C5806m12 c5806m12 = NF1.a;
        C5806m12.j(obj);
    }

    @Override // defpackage.InterfaceC8153yK1
    public final boolean b(Object obj) {
        return ((AbstractC8331zG1) obj).zzb.f();
    }

    @Override // defpackage.InterfaceC8153yK1
    public final void c(Object obj, Object obj2) {
        AbstractC3946gL1.t(obj, obj2);
        if (this.c) {
            C5806m12 c5806m12 = NF1.a;
            AbstractC3946gL1.s(obj, obj2);
        }
    }

    @Override // defpackage.InterfaceC8153yK1
    public final boolean d(QG1 qg1, Object obj) {
        if (!qg1.zzc.equals(((QG1) obj).zzc)) {
            return false;
        }
        if (this.c) {
            return ((AbstractC8331zG1) qg1).zzb.equals(((AbstractC8331zG1) obj).zzb);
        }
        return true;
    }

    @Override // defpackage.InterfaceC8153yK1
    public final int e(QG1 qg1) {
        int iHashCode = qg1.zzc.hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return ((AbstractC8331zG1) qg1).zzb.a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.InterfaceC8153yK1
    public final int f(QG1 qg1) {
        C3949gM1 c3949gM1 = qg1.zzc;
        int iS = c3949gM1.d;
        if (iS == -1) {
            iS = 0;
            for (int i = 0; i < c3949gM1.a; i++) {
                int i2 = c3949gM1.b[i] >>> 3;
                JE1 je1 = (JE1) c3949gM1.c[i];
                int iB = WE1.b(8);
                int iB2 = WE1.b(i2) + WE1.b(16);
                int iB3 = WE1.b(24);
                int i3 = je1.i();
                iS += iB + iB + iB2 + F91.s(i3, i3, iB3);
            }
            c3949gM1.d = iS;
        }
        if (!this.c) {
            return iS;
        }
        C5677lL1 c5677lL1 = ((AbstractC8331zG1) qg1).zzb.a;
        int i4 = c5677lL1.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += SF1.i(c5677lL1.d(i6));
        }
        Iterator it = c5677lL1.b().iterator();
        while (it.hasNext()) {
            i5 += SF1.i((Map.Entry) it.next());
        }
        return iS + i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[EDGE_INSN: B:49:0x0073->B:27:0x0073 BREAK  A[LOOP:1: B:14:0x0041->B:52:0x0041], SYNTHETIC] */
    @Override // defpackage.InterfaceC8153yK1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.C0779Jt r15) throws defpackage.DH1 {
        /*
            r10 = this;
            r0 = r11
            QG1 r0 = (defpackage.QG1) r0
            gM1 r1 = r0.zzc
            gM1 r2 = defpackage.C3949gM1.f
            if (r1 != r2) goto Lf
            gM1 r1 = defpackage.C3949gM1.b()
            r0.zzc = r1
        Lf:
            zG1 r11 = (defpackage.AbstractC8331zG1) r11
            r11.n()
            r11 = 0
        L15:
            if (r13 >= r14) goto L7d
            int r4 = defpackage.AbstractC3755fL1.j(r12, r13, r15)
            int r2 = r15.a
            r13 = 11
            DD1 r0 = r10.a
            r3 = 2
            java.lang.Object r5 = r15.e
            DF1 r5 = (defpackage.DF1) r5
            if (r2 == r13) goto L3f
            r13 = r2 & 7
            if (r13 != r3) goto L3a
            int r13 = r2 >>> 3
            r5.a(r0, r13)
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = defpackage.AbstractC3755fL1.i(r2, r3, r4, r5, r6, r7)
            goto L15
        L3a:
            int r13 = defpackage.AbstractC3755fL1.p(r2, r12, r4, r14, r15)
            goto L15
        L3f:
            r13 = 0
            r2 = r11
        L41:
            if (r4 >= r14) goto L73
            int r4 = defpackage.AbstractC3755fL1.j(r12, r4, r15)
            int r6 = r15.a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r3) goto L5e
            r9 = 3
            if (r7 == r9) goto L53
            goto L6a
        L53:
            if (r8 != r3) goto L6a
            int r4 = defpackage.AbstractC3755fL1.b(r12, r4, r15)
            java.lang.Object r2 = r15.d
            JE1 r2 = (defpackage.JE1) r2
            goto L41
        L5e:
            if (r8 != 0) goto L6a
            int r4 = defpackage.AbstractC3755fL1.j(r12, r4, r15)
            int r13 = r15.a
            r5.a(r0, r13)
            goto L41
        L6a:
            r7 = 12
            if (r6 == r7) goto L73
            int r4 = defpackage.AbstractC3755fL1.p(r6, r12, r4, r14, r15)
            goto L41
        L73:
            if (r2 == 0) goto L7b
            int r13 = r13 << 3
            r13 = r13 | r3
            r1.c(r13, r2)
        L7b:
            r13 = r4
            goto L15
        L7d:
            if (r13 != r14) goto L80
            return
        L80:
            DH1 r11 = new DH1
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WI1.g(java.lang.Object, byte[], int, int, Jt):void");
    }

    @Override // defpackage.InterfaceC8153yK1
    public final void h(Object obj, L21 l21) {
        Iterator itC = ((AbstractC8331zG1) obj).zzb.c();
        if (itC.hasNext()) {
            ((DG1) ((Map.Entry) itC.next()).getKey()).getClass();
            throw null;
        }
        C3949gM1 c3949gM1 = ((QG1) obj).zzc;
        for (int i = 0; i < c3949gM1.a; i++) {
            int i2 = c3949gM1.b[i] >>> 3;
            Object obj2 = c3949gM1.c[i];
            l21.getClass();
            boolean z = obj2 instanceof JE1;
            WE1 we1 = (WE1) l21.b;
            if (z) {
                we1.p(11);
                we1.o(2, i2);
                we1.f(3, (JE1) obj2);
                we1.p(12);
            } else {
                we1.p(11);
                we1.o(2, i2);
                we1.p(26);
                QG1 qg1 = (QG1) ((DD1) obj2);
                we1.p(qg1.c());
                qg1.l(we1);
                we1.p(12);
            }
        }
    }

    @Override // defpackage.InterfaceC8153yK1
    public final Object zze() {
        DD1 dd1 = this.a;
        return dd1 instanceof QG1 ? (QG1) ((QG1) dd1).m(4, null) : ((AbstractC6617qG1) ((QG1) dd1).m(5, null)).i();
    }
}
