package defpackage;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.LastLocationRequest;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class OL0 implements InterfaceC3595eW, NO, InterfaceC7364uB0, RemoteCall, InterfaceC7986xS0, InterfaceC1490Sw0, QN0, InterfaceC6515pk0, InterfaceC6053nJ1 {
    public static final OL0 b = new OL0(1);
    public static final OL0 c = new OL0(2);
    public static final OL0 d = new OL0(3);
    public static final OL0 e = new OL0(4);
    public static final OL0 f = new OL0(5);
    public static final /* synthetic */ OL0 g = new OL0(6);
    public static OL0 h;
    public final /* synthetic */ int a;

    public /* synthetic */ OL0(int i) {
        this.a = i;
    }

    public static W21 h(InterfaceC7662vl interfaceC7662vl) {
        while (interfaceC7662vl instanceof InterfaceC8042xl) {
            InterfaceC8042xl interfaceC8042xl = (InterfaceC8042xl) interfaceC7662vl;
            if (interfaceC8042xl.l() != 2) {
                break;
            }
            Collection collectionJ = interfaceC8042xl.j();
            O90.e(collectionJ, "getOverriddenDescriptors(...)");
            interfaceC7662vl = (InterfaceC8042xl) AbstractC8069xu.S(collectionJ);
            if (interfaceC7662vl == null) {
                return null;
            }
        }
        return interfaceC7662vl.e();
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        ((C8325zE1) obj).j(new LastLocationRequest.Builder().build(), (S81) obj2);
    }

    @Override // defpackage.InterfaceC7364uB0
    public boolean b(InterfaceC7492us interfaceC7492us, UI ui) {
        O90.f(interfaceC7492us, "classDescriptor");
        return true;
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        return new ConcurrentHashMap();
    }

    @Override // defpackage.InterfaceC7986xS0
    public void d(Object obj) {
        try {
            AbstractC0155Bt.a((Closeable) obj);
        } catch (IOException unused) {
        }
    }

    public boolean e(CD cd, CD cd2, boolean z, boolean z2) {
        if ((cd instanceof InterfaceC7492us) && (cd2 instanceof InterfaceC7492us)) {
            return O90.a(((InterfaceC7492us) cd).v(), ((InterfaceC7492us) cd2).v());
        }
        if ((cd instanceof InterfaceC5925me1) && (cd2 instanceof InterfaceC5925me1)) {
            return f((InterfaceC5925me1) cd, (InterfaceC5925me1) cd2, z, C8087y.k);
        }
        if (!(cd instanceof InterfaceC7662vl) || !(cd2 instanceof InterfaceC7662vl)) {
            return ((cd instanceof InterfaceC8465zz0) && (cd2 instanceof InterfaceC8465zz0)) ? O90.a(((AbstractC0096Az0) ((InterfaceC8465zz0) cd)).f, ((AbstractC0096Az0) ((InterfaceC8465zz0) cd2)).f) : O90.a(cd, cd2);
        }
        InterfaceC7662vl interfaceC7662vl = (InterfaceC7662vl) cd;
        InterfaceC7662vl interfaceC7662vl2 = (InterfaceC7662vl) cd2;
        O90.f(interfaceC7662vl, "a");
        O90.f(interfaceC7662vl2, "b");
        boolean z3 = true;
        if (!interfaceC7662vl.equals(interfaceC7662vl2)) {
            if (!O90.a(interfaceC7662vl.getName(), interfaceC7662vl2.getName()) || ((z2 && (interfaceC7662vl instanceof InterfaceC2400bq0) && (interfaceC7662vl2 instanceof InterfaceC2400bq0) && ((InterfaceC2400bq0) interfaceC7662vl).M() != ((InterfaceC2400bq0) interfaceC7662vl2).M()) || ((O90.a(interfaceC7662vl.i(), interfaceC7662vl2.i()) && (!z || !O90.a(h(interfaceC7662vl), h(interfaceC7662vl2)))) || AbstractC7002sI.o(interfaceC7662vl) || AbstractC7002sI.o(interfaceC7662vl2) || !g(interfaceC7662vl, interfaceC7662vl2, C8087y.j, z)))) {
                return false;
            }
            C7323tz0 c7323tz0 = new C7323tz0(new X11(interfaceC7662vl, interfaceC7662vl2, z));
            if (c7323tz0.m(interfaceC7662vl, interfaceC7662vl2, null, true).c() != 1 || c7323tz0.m(interfaceC7662vl2, interfaceC7662vl, null, true).c() != 1) {
                z3 = false;
            }
        }
        return z3;
    }

    public boolean f(InterfaceC5925me1 interfaceC5925me1, InterfaceC5925me1 interfaceC5925me12, boolean z, Function2 function2) {
        O90.f(interfaceC5925me1, "a");
        O90.f(interfaceC5925me12, "b");
        O90.f(function2, "equivalentCallables");
        if (interfaceC5925me1.equals(interfaceC5925me12)) {
            return true;
        }
        return !O90.a(interfaceC5925me1.i(), interfaceC5925me12.i()) && g(interfaceC5925me1, interfaceC5925me12, function2, z) && interfaceC5925me1.getIndex() == interfaceC5925me12.getIndex();
    }

    public boolean g(CD cd, CD cd2, Function2 function2, boolean z) {
        CD cdI = cd.i();
        CD cdI2 = cd2.i();
        return ((cdI instanceof InterfaceC8042xl) || (cdI2 instanceof InterfaceC8042xl)) ? ((Boolean) function2.invoke(cdI, cdI2)).booleanValue() : e(cdI, cdI2, z, true);
    }

    @Override // defpackage.QN0
    public AbstractC0663Ig0 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.InterfaceC3595eW
    public AbstractC0663Ig0 l(AF0 af0, String str, X01 x01, X01 x012) {
        O90.f(af0, "proto");
        O90.f(str, "flexibleId");
        O90.f(x01, "lowerBound");
        O90.f(x012, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // defpackage.NO
    public Boolean x() {
        return Boolean.TRUE;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                C7434uY1.b.get();
                Boolean bool = (Boolean) HY1.a.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                Long l = (Long) UW1.b.a();
                l.getClass();
                return l;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l2 = (Long) UW1.N.a();
                l2.getClass();
                return l2;
            default:
                C4176hY1.b.get();
                Double d2 = (Double) C6480pY1.c.a();
                d2.getClass();
                return d2;
        }
    }

    public OL0(NV1 nv1) {
        this.a = 24;
    }

    public OL0() {
        this.a = 8;
        new LinkedHashSet(20);
    }

    public OL0(Z41 z41) {
        this.a = 20;
        O90.f(z41, "storageManager");
        String str = C1922Yk0.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    @Override // defpackage.InterfaceC6515pk0
    public void a() {
    }
}
