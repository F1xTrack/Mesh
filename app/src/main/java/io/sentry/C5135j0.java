package io.sentry;

import defpackage.AbstractC8235ym;
import defpackage.H30;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.sentry.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5135j0 {
    public final ArrayList a;

    public C5135j0() {
        this.a = new ArrayList();
    }

    public InterfaceC5120e0 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (InterfaceC5120e0) AbstractC8235ym.e(1, arrayList);
    }

    public boolean b() {
        if (this.a.size() == 1) {
            return true;
        }
        InterfaceC5120e0 interfaceC5120e0A = a();
        e();
        if (!(a() instanceof C5129h0)) {
            if (!(a() instanceof C5123f0)) {
                return false;
            }
            C5123f0 c5123f0 = (C5123f0) a();
            if (interfaceC5120e0A == null || c5123f0 == null) {
                return false;
            }
            c5123f0.a.add(interfaceC5120e0A.getValue());
            return false;
        }
        C5129h0 c5129h0 = (C5129h0) a();
        e();
        C5126g0 c5126g0 = (C5126g0) a();
        if (c5129h0 == null || interfaceC5120e0A == null || c5126g0 == null) {
            return false;
        }
        c5126g0.a.put(c5129h0.a, interfaceC5120e0A.getValue());
        return false;
    }

    public boolean c(InterfaceC5117d0 interfaceC5117d0) {
        Object objD = interfaceC5117d0.d();
        if (a() == null && objD != null) {
            this.a.add(new C5132i0(objD));
            return true;
        }
        if (a() instanceof C5129h0) {
            C5129h0 c5129h0 = (C5129h0) a();
            e();
            ((C5126g0) a()).a.put(c5129h0.a, objD);
            return false;
        }
        if (!(a() instanceof C5123f0)) {
            return false;
        }
        ((C5123f0) a()).a.add(objD);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void d(final C5138k0 c5138k0) {
        boolean zB;
        int i = AbstractC5114c0.a[((io.sentry.vendor.gson.stream.a) c5138k0.b).o0().ordinal()];
        ArrayList arrayList = this.a;
        io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) c5138k0.b;
        switch (i) {
            case 1:
                aVar.m();
                arrayList.add(new C5123f0());
                zB = false;
                break;
            case 2:
                aVar.w();
                zB = b();
                break;
            case 3:
                c5138k0.n();
                arrayList.add(new C5126g0());
                zB = false;
                break;
            case 4:
                c5138k0.o();
                zB = b();
                break;
            case 5:
                arrayList.add(new C5129h0(aVar.d0()));
                zB = false;
                break;
            case 6:
                final int i2 = 0;
                zB = c(new InterfaceC5117d0() { // from class: io.sentry.b0
                    @Override // io.sentry.InterfaceC5117d0
                    public final Object d() {
                        switch (i2) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) c5138k0.b).m0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) c5138k0.b).U());
                        }
                    }
                });
                break;
            case 7:
                zB = c(new H30(this, 22, c5138k0));
                break;
            case 8:
                final int i3 = 1;
                zB = c(new InterfaceC5117d0() { // from class: io.sentry.b0
                    @Override // io.sentry.InterfaceC5117d0
                    public final Object d() {
                        switch (i3) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) c5138k0.b).m0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) c5138k0.b).U());
                        }
                    }
                });
                break;
            case 9:
                aVar.h0();
                zB = c(new C(1));
                break;
            case 10:
                zB = true;
                break;
            default:
                zB = false;
                break;
        }
        if (zB) {
            return;
        }
        d(c5138k0);
    }

    public void e() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public C5135j0(List list) {
        this.a = new ArrayList(list == null ? new ArrayList(0) : list);
    }
}
