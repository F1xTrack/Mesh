package p000;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.LastLocationRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class OL0 implements InterfaceC3995eW, InterfaceC0843NO, InterfaceC11257uB0, RemoteCall, InterfaceC11673xS0, InterfaceC8294Sw0, QN0, InterfaceC10687pk0, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static final OL0 f8367b = new OL0(1);

    /* renamed from: c */
    public static final OL0 f8368c = new OL0(2);

    /* renamed from: d */
    public static final OL0 f8369d = new OL0(3);

    /* renamed from: e */
    public static final OL0 f8370e = new OL0(4);

    /* renamed from: f */
    public static final OL0 f8371f = new OL0(5);

    /* renamed from: g */
    public static final /* synthetic */ OL0 f8372g = new OL0(6);

    /* renamed from: h */
    public static OL0 f8373h;

    /* renamed from: a */
    public final /* synthetic */ int f8374a;

    public /* synthetic */ OL0(int i) {
        this.f8374a = i;
    }

    /* renamed from: h */
    public static W21 m6020h(InterfaceC7032vl interfaceC7032vl) {
        while (interfaceC7032vl instanceof InterfaceC7158xl) {
            InterfaceC7158xl interfaceC7158xl = (InterfaceC7158xl) interfaceC7032vl;
            if (interfaceC7158xl.mo116l() != 2) {
                break;
            }
            Collection collectionMo1222j = interfaceC7158xl.mo1222j();
            O90.m5967e(collectionMo1222j, "getOverriddenDescriptors(...)");
            interfaceC7032vl = (InterfaceC7158xl) AbstractC7167xu.m25973S(collectionMo1222j);
            if (interfaceC7032vl == null) {
                return null;
            }
        }
        return interfaceC7032vl.mo422e();
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        ((C11900zE1) obj).m26343j(new LastLocationRequest.Builder().build(), (S81) obj2);
    }

    @Override // p000.InterfaceC11257uB0
    /* renamed from: b */
    public boolean mo6014b(InterfaceC6976us interfaceC6976us, C1277UI c1277ui) {
        O90.m5968f(interfaceC6976us, "classDescriptor");
        return true;
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        return new ConcurrentHashMap();
    }

    @Override // p000.InterfaceC11673xS0
    /* renamed from: d */
    public void mo2828d(Object obj) {
        try {
            AbstractC0119Bt.m899a((Closeable) obj);
        } catch (IOException unused) {
        }
    }

    /* renamed from: e */
    public boolean m6021e(InterfaceC0140CD interfaceC0140CD, InterfaceC0140CD interfaceC0140CD2, boolean z, boolean z2) {
        if ((interfaceC0140CD instanceof InterfaceC6976us) && (interfaceC0140CD2 instanceof InterfaceC6976us)) {
            return O90.m5963a(((InterfaceC6976us) interfaceC0140CD).mo1439v(), ((InterfaceC6976us) interfaceC0140CD2).mo1439v());
        }
        if ((interfaceC0140CD instanceof InterfaceC10292me1) && (interfaceC0140CD2 instanceof InterfaceC10292me1)) {
            return m6022f((InterfaceC10292me1) interfaceC0140CD, (InterfaceC10292me1) interfaceC0140CD2, z, C7173y.f45981k);
        }
        if (!(interfaceC0140CD instanceof InterfaceC7032vl) || !(interfaceC0140CD2 instanceof InterfaceC7032vl)) {
            return ((interfaceC0140CD instanceof InterfaceC11993zz0) && (interfaceC0140CD2 instanceof InterfaceC11993zz0)) ? O90.m5963a(((AbstractC7364Az0) ((InterfaceC11993zz0) interfaceC0140CD)).f494f, ((AbstractC7364Az0) ((InterfaceC11993zz0) interfaceC0140CD2)).f494f) : O90.m5963a(interfaceC0140CD, interfaceC0140CD2);
        }
        InterfaceC7032vl interfaceC7032vl = (InterfaceC7032vl) interfaceC0140CD;
        InterfaceC7032vl interfaceC7032vl2 = (InterfaceC7032vl) interfaceC0140CD2;
        O90.m5968f(interfaceC7032vl, "a");
        O90.m5968f(interfaceC7032vl2, "b");
        boolean z3 = true;
        if (!interfaceC7032vl.equals(interfaceC7032vl2)) {
            if (!O90.m5963a(interfaceC7032vl.getName(), interfaceC7032vl2.getName()) || ((z2 && (interfaceC7032vl instanceof InterfaceC8902bq0) && (interfaceC7032vl2 instanceof InterfaceC8902bq0) && ((InterfaceC8902bq0) interfaceC7032vl).mo111M() != ((InterfaceC8902bq0) interfaceC7032vl2).mo111M()) || ((O90.m5963a(interfaceC7032vl.mo423i(), interfaceC7032vl2.mo423i()) && (!z || !O90.m5963a(m6020h(interfaceC7032vl), m6020h(interfaceC7032vl2)))) || AbstractC6814sI.m24703o(interfaceC7032vl) || AbstractC6814sI.m24703o(interfaceC7032vl2) || !m6023g(interfaceC7032vl, interfaceC7032vl2, C7173y.f45980j, z)))) {
                return false;
            }
            C11229tz0 c11229tz0 = new C11229tz0(new X11(interfaceC7032vl, interfaceC7032vl2, z));
            if (c11229tz0.m25063m(interfaceC7032vl, interfaceC7032vl2, null, true).m24815c() != 1 || c11229tz0.m25063m(interfaceC7032vl2, interfaceC7032vl, null, true).m24815c() != 1) {
                z3 = false;
            }
        }
        return z3;
    }

    /* renamed from: f */
    public boolean m6022f(InterfaceC10292me1 interfaceC10292me1, InterfaceC10292me1 interfaceC10292me12, boolean z, Function2 function2) {
        O90.m5968f(interfaceC10292me1, "a");
        O90.m5968f(interfaceC10292me12, "b");
        O90.m5968f(function2, "equivalentCallables");
        if (interfaceC10292me1.equals(interfaceC10292me12)) {
            return true;
        }
        return !O90.m5963a(interfaceC10292me1.mo423i(), interfaceC10292me12.mo423i()) && m6023g(interfaceC10292me1, interfaceC10292me12, function2, z) && interfaceC10292me1.getIndex() == interfaceC10292me12.getIndex();
    }

    /* renamed from: g */
    public boolean m6023g(InterfaceC0140CD interfaceC0140CD, InterfaceC0140CD interfaceC0140CD2, Function2 function2, boolean z) {
        InterfaceC0140CD interfaceC0140CDMo423i = interfaceC0140CD.mo423i();
        InterfaceC0140CD interfaceC0140CDMo423i2 = interfaceC0140CD2.mo423i();
        return ((interfaceC0140CDMo423i instanceof InterfaceC7158xl) || (interfaceC0140CDMo423i2 instanceof InterfaceC7158xl)) ? ((Boolean) function2.invoke(interfaceC0140CDMo423i, interfaceC0140CDMo423i2)).booleanValue() : m6021e(interfaceC0140CDMo423i, interfaceC0140CDMo423i2, z, true);
    }

    @Override // p000.QN0
    public AbstractC7742Ig0 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // p000.InterfaceC3995eW
    /* renamed from: l */
    public AbstractC7742Ig0 mo6024l(AF0 af0, String str, X01 x01, X01 x012) {
        O90.m5968f(af0, "proto");
        O90.m5968f(str, "flexibleId");
        O90.m5968f(x01, "lowerBound");
        O90.m5968f(x012, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // p000.InterfaceC0843NO
    /* renamed from: x */
    public Boolean mo5667x() {
        return Boolean.TRUE;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f8374a) {
            case 26:
                C11304uY1.f43748b.get();
                Boolean bool = (Boolean) HY1.f4340a.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11861b.m8754a();
                l.getClass();
                return l;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l2 = (Long) UW1.f11846N.m8754a();
                l2.getClass();
                return l2;
            default:
                C9640hY1.f28446b.get();
                Double d = (Double) C10664pY1.f40204c.m8754a();
                d.getClass();
                return d;
        }
    }

    public OL0(NV1 nv1) {
        this.f8374a = 24;
    }

    public OL0() {
        this.f8374a = 8;
        new LinkedHashSet(20);
    }

    public OL0(Z41 z41) {
        this.f8374a = 20;
        O90.m5968f(z41, "storageManager");
        String str = C8582Yk0.f14496d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    @Override // p000.InterfaceC10687pk0
    /* renamed from: a */
    public void mo858a() {
    }
}
