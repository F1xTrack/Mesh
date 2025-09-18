package p000;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class WI1 implements InterfaceC11785yK1 {

    /* renamed from: a */
    public final DD1 f13129a;

    /* renamed from: b */
    public final C1210TE f13130b;

    /* renamed from: c */
    public final boolean f13131c;

    public WI1(C1210TE c1210te, DD1 dd1) {
        C10212m12 c10212m12 = NF1.f7676a;
        this.f13130b = c1210te;
        this.f13131c = dd1 instanceof AbstractC11904zG1;
        this.f13129a = dd1;
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: a */
    public final void mo7661a(Object obj) {
        this.f13130b.getClass();
        C1210TE.m7638N(obj);
        C10212m12 c10212m12 = NF1.f7676a;
        C10212m12.m22630j(obj);
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: b */
    public final boolean mo7662b(Object obj) {
        return ((AbstractC11904zG1) obj).zzb.m7205f();
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: c */
    public final void mo7663c(Object obj, Object obj2) {
        AbstractC9486gL1.m18463t(obj, obj2);
        if (this.f13131c) {
            C10212m12 c10212m12 = NF1.f7676a;
            AbstractC9486gL1.m18462s(obj, obj2);
        }
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: d */
    public final boolean mo7664d(QG1 qg1, Object obj) {
        if (!qg1.zzc.equals(((QG1) obj).zzc)) {
            return false;
        }
        if (this.f13131c) {
            return ((AbstractC11904zG1) qg1).zzb.equals(((AbstractC11904zG1) obj).zzb);
        }
        return true;
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: e */
    public final int mo7665e(QG1 qg1) {
        int iHashCode = qg1.zzc.hashCode();
        if (!this.f13131c) {
            return iHashCode;
        }
        return ((AbstractC11904zG1) qg1).zzb.f10658a.hashCode() + (iHashCode * 53);
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: f */
    public final int mo7666f(QG1 qg1) {
        C9488gM1 c9488gM1 = qg1.zzc;
        int iM2536s = c9488gM1.f27703d;
        if (iM2536s == -1) {
            iM2536s = 0;
            for (int i = 0; i < c9488gM1.f27700a; i++) {
                int i2 = c9488gM1.f27701b[i] >>> 3;
                JE1 je1 = (JE1) c9488gM1.f27702c[i];
                int iM8717b = WE1.m8717b(8);
                int iM8717b2 = WE1.m8717b(i2) + WE1.m8717b(16);
                int iM8717b3 = WE1.m8717b(24);
                int iMo3006i = je1.mo3006i();
                iM2536s += iM8717b + iM8717b + iM8717b2 + F91.m2536s(iMo3006i, iMo3006i, iM8717b3);
            }
            c9488gM1.f27703d = iM2536s;
        }
        if (!this.f13131c) {
            return iM2536s;
        }
        C10126lL1 c10126lL1 = ((AbstractC11904zG1) qg1).zzb.f10658a;
        int i3 = c10126lL1.f37018b;
        int iM7200i = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iM7200i += SF1.m7200i(c10126lL1.m22409d(i4));
        }
        Iterator it = c10126lL1.m22407b().iterator();
        while (it.hasNext()) {
            iM7200i += SF1.m7200i((Map.Entry) it.next());
        }
        return iM2536s + iM7200i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[EDGE_INSN: B:49:0x0073->B:27:0x0073 BREAK  A[LOOP:1: B:14:0x0041->B:52:0x0041], SYNTHETIC] */
    @Override // p000.InterfaceC11785yK1
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo7667g(java.lang.Object r11, byte[] r12, int r13, int r14, p000.C0623Jt r15) throws p000.DH1 {
        /*
            r10 = this;
            r0 = r11
            QG1 r0 = (p000.QG1) r0
            gM1 r1 = r0.zzc
            gM1 r2 = p000.C9488gM1.f27699f
            if (r1 != r2) goto Lf
            gM1 r1 = p000.C9488gM1.m18470b()
            r0.zzc = r1
        Lf:
            zG1 r11 = (p000.AbstractC11904zG1) r11
            r11.m26368n()
            r11 = 0
        L15:
            if (r13 >= r14) goto L7d
            int r4 = p000.AbstractC9358fL1.m18211j(r12, r13, r15)
            int r2 = r15.f5769a
            r13 = 11
            DD1 r0 = r10.f13129a
            r3 = 2
            java.lang.Object r5 = r15.f5773e
            DF1 r5 = (p000.DF1) r5
            if (r2 == r13) goto L3f
            r13 = r2 & 7
            if (r13 != r3) goto L3a
            int r13 = r2 >>> 3
            r5.m1606a(r0, r13)
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = p000.AbstractC9358fL1.m18210i(r2, r3, r4, r5, r6, r7)
            goto L15
        L3a:
            int r13 = p000.AbstractC9358fL1.m18217p(r2, r12, r4, r14, r15)
            goto L15
        L3f:
            r13 = 0
            r2 = r11
        L41:
            if (r4 >= r14) goto L73
            int r4 = p000.AbstractC9358fL1.m18211j(r12, r4, r15)
            int r6 = r15.f5769a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r3) goto L5e
            r9 = 3
            if (r7 == r9) goto L53
            goto L6a
        L53:
            if (r8 != r3) goto L6a
            int r4 = p000.AbstractC9358fL1.m18203b(r12, r4, r15)
            java.lang.Object r2 = r15.f5772d
            JE1 r2 = (p000.JE1) r2
            goto L41
        L5e:
            if (r8 != 0) goto L6a
            int r4 = p000.AbstractC9358fL1.m18211j(r12, r4, r15)
            int r13 = r15.f5769a
            r5.m1606a(r0, r13)
            goto L41
        L6a:
            r7 = 12
            if (r6 == r7) goto L73
            int r4 = p000.AbstractC9358fL1.m18217p(r6, r12, r4, r14, r15)
            goto L41
        L73:
            if (r2 == 0) goto L7b
            int r13 = r13 << 3
            r13 = r13 | r3
            r1.m18472c(r13, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.WI1.mo7667g(java.lang.Object, byte[], int, int, Jt):void");
    }

    @Override // p000.InterfaceC11785yK1
    /* renamed from: h */
    public final void mo7668h(Object obj, L21 l21) {
        Iterator itM7202c = ((AbstractC11904zG1) obj).zzb.m7202c();
        if (itM7202c.hasNext()) {
            ((DG1) ((Map.Entry) itM7202c.next()).getKey()).getClass();
            throw null;
        }
        C9488gM1 c9488gM1 = ((QG1) obj).zzc;
        for (int i = 0; i < c9488gM1.f27700a; i++) {
            int i2 = c9488gM1.f27701b[i] >>> 3;
            Object obj2 = c9488gM1.f27702c[i];
            l21.getClass();
            boolean z = obj2 instanceof JE1;
            WE1 we1 = (WE1) l21.f6473b;
            if (z) {
                we1.m8734p(11);
                we1.m8733o(2, i2);
                we1.m8724f(3, (JE1) obj2);
                we1.m8734p(12);
            } else {
                we1.m8734p(11);
                we1.m8733o(2, i2);
                we1.m8734p(26);
                QG1 qg1 = (QG1) ((DD1) obj2);
                we1.m8734p(qg1.m6622c());
                qg1.m6627l(we1);
                we1.m8734p(12);
            }
        }
    }

    @Override // p000.InterfaceC11785yK1
    public final Object zze() {
        DD1 dd1 = this.f13129a;
        return dd1 instanceof QG1 ? (QG1) ((QG1) dd1).mo180m(4, null) : ((AbstractC10756qG1) ((QG1) dd1).mo180m(5, null)).mo1685i();
    }
}
