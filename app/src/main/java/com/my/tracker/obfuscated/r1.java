package com.my.tracker.obfuscated;

import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class r1 {
    protected final r a = new r(16384);
    protected final r b = new r(4096);

    public synchronized void a() {
        this.a.d();
        this.b.d();
    }

    public static void a(s1 s1Var, String str, l0 l0Var, u0 u0Var, r rVar) throws IOException {
        rVar.a();
        rVar.a(1, str);
        if (l0Var != null && !TextUtils.isEmpty(l0Var.a)) {
            boolean z = l0Var.b;
            rVar.a(2, l0Var.a);
            rVar.a(3, z ? 1 : 0);
        }
        if (u0Var != null && !TextUtils.isEmpty(u0Var.a)) {
            boolean z2 = u0Var.b;
            rVar.a(4, u0Var.a);
            rVar.a(5, z2 ? 1 : 0);
        }
        if (rVar.b() > 0) {
            s1Var.a(31, rVar);
        }
    }

    public static void a(s1 s1Var, g gVar, a0 a0Var, r rVar, r rVar2) throws IOException {
        rVar.a();
        if (gVar != null) {
            rVar2.a();
            rVar2.a(1, gVar.a);
            long j = gVar.b;
            if (j != -1) {
                rVar2.a(2, j);
            }
            if (rVar2.b() > 0) {
                rVar.a(31, rVar2);
            }
        }
        rVar.a(1, a0Var.g);
        rVar.a(2, a0Var.f);
        rVar.a(3, a0Var.k);
        rVar.a(4, a0Var.e);
        s1Var.a(21, rVar);
    }

    public static void a(s1 s1Var, String str, String str2, g0 g0Var, r rVar, r rVar2) throws IOException {
        a0 a0Var = g0Var.c;
        rVar.a();
        a(rVar, str, g0Var.d, g0Var.e, rVar2);
        int i = a0Var.a;
        if (i != -1) {
            rVar.a(1, i);
        }
        if (!TextUtils.isEmpty(a0Var.d)) {
            rVar.a(2, a0Var.d);
        }
        if (!TextUtils.isEmpty(a0Var.j)) {
            rVar.a(3, a0Var.j);
        }
        if (!TextUtils.isEmpty(a0Var.p)) {
            rVar.a(4, a0Var.p);
        }
        if (!TextUtils.isEmpty(a0Var.b)) {
            rVar.a(5, a0Var.b);
        }
        if (!TextUtils.isEmpty(a0Var.c)) {
            rVar.a(6, a0Var.c);
        }
        if (!TextUtils.isEmpty(a0Var.i)) {
            rVar.a(7, a0Var.i);
        }
        if (!TextUtils.isEmpty(a0Var.h)) {
            rVar.a(8, a0Var.h);
        }
        int i2 = a0Var.w;
        if (i2 != -1) {
            rVar.a(9, i2);
        }
        int i3 = a0Var.q;
        if (i3 != -1) {
            rVar.a(10, i3);
        }
        int i4 = a0Var.r;
        if (i4 != -1) {
            rVar.a(11, i4);
        }
        int i5 = a0Var.s;
        if (i5 != -1) {
            rVar.a(12, i5);
        }
        if (!Float.isNaN(a0Var.u)) {
            rVar.a(13, a0Var.u);
        }
        if (!Float.isNaN(a0Var.v)) {
            rVar.a(14, a0Var.v);
        }
        if (!Float.isNaN(a0Var.t)) {
            rVar.a(15, a0Var.t);
        }
        rVar.a(16, str2);
        o oVar = g0Var.j;
        if (oVar != null) {
            int i6 = oVar.a;
            if (i6 != -1) {
                rVar.a(17, i6);
            }
            int i7 = oVar.b;
            if (i7 >= 0) {
                rVar.a(18, i7);
            }
        }
        long j = a0Var.x;
        if (j != -1) {
            rVar.a(19, j);
        }
        long j2 = a0Var.y;
        if (j2 != -1) {
            rVar.a(20, j2);
        }
        int i8 = a0Var.z;
        if (i8 != -1) {
            rVar.a(23, i8);
        }
        int i9 = a0Var.A;
        if (i9 != -1) {
            rVar.a(24, i9);
        }
        i0 i0Var = g0Var.k;
        if (i0Var != null && !TextUtils.isEmpty(i0Var.a)) {
            rVar.a(25, g0Var.k.a);
        }
        if (rVar.b() > 0) {
            s1Var.a(23, rVar);
        }
    }

    public static void a(s1 s1Var, a1 a1Var, r rVar) throws IOException {
        if (a1Var.equals(a1.g)) {
            return;
        }
        rVar.a();
        if (!Double.isNaN(a1Var.b)) {
            rVar.a(1, a1Var.b);
        }
        if (!Double.isNaN(a1Var.c)) {
            rVar.a(2, a1Var.c);
        }
        if (!Float.isNaN(a1Var.d)) {
            rVar.a(3, a1Var.d);
        }
        if (!Float.isNaN(a1Var.e)) {
            rVar.a(4, a1Var.e);
        }
        long j = a1Var.f;
        if (j > 0) {
            rVar.a(5, w2.b(j));
        }
        int i = a1Var.a;
        if (i != -1) {
            rVar.a(6, i);
        }
        if (rVar.b() > 0) {
            s1Var.a(26, rVar);
        }
    }

    public static void a(s1 s1Var, i1 i1Var, y0 y0Var, a0 a0Var, r rVar) throws IOException {
        rVar.a();
        int i = i1Var.a;
        if (i != -1) {
            rVar.a(1, i);
        }
        Boolean bool = i1Var.c;
        if (bool != null) {
            rVar.a(7, bool == Boolean.TRUE ? 1 : 0);
        }
        rVar.a(2, i1Var.b);
        if (!TextUtils.isEmpty(a0Var.l)) {
            rVar.a(3, a0Var.l);
        }
        if (!TextUtils.isEmpty(a0Var.m)) {
            rVar.a(4, a0Var.m);
        }
        if (!TextUtils.isEmpty(a0Var.n)) {
            rVar.a(5, a0Var.n);
        }
        if (!TextUtils.isEmpty(a0Var.o)) {
            rVar.a(6, a0Var.o);
        }
        if (y0Var != null) {
            rVar.a(8, y0Var.a);
        }
        rVar.a(11, i1Var.d != 2 ? 0 : 1);
        if (rVar.b() > 0) {
            s1Var.a(25, rVar);
        }
    }

    public static void a(s1 s1Var, b3 b3Var, r rVar) throws IOException {
        rVar.a();
        int i = b3Var.b;
        if (i == 0 || i == 1 || i == 2) {
            rVar.a(1, i);
        }
        int i2 = b3Var.a;
        if (i2 > -1) {
            rVar.a(2, i2);
        }
        rVar.a(3, b3Var.c);
        rVar.a(4, b3Var.d);
        rVar.a(5, b3Var.e);
        rVar.a(6, b3Var.f);
        rVar.a(7, b3Var.g);
        rVar.a(8, b3Var.h);
        rVar.a(9, b3Var.i);
        if (rVar.b() > 0) {
            s1Var.a(22, rVar);
        }
    }
}
