package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: PI */
/* loaded from: classes2.dex */
public final class C0963PI {

    /* renamed from: j */
    public static final /* synthetic */ InterfaceC10293mf0[] f8982j;

    /* renamed from: a */
    public final LinkedHashMap f8983a;

    /* renamed from: b */
    public final LinkedHashMap f8984b;

    /* renamed from: c */
    public final LinkedHashMap f8985c;

    /* renamed from: d */
    public final C8270Sk0 f8986d;

    /* renamed from: e */
    public final C8270Sk0 f8987e;

    /* renamed from: f */
    public final C8478Wk0 f8988f;

    /* renamed from: g */
    public final C8426Vk0 f8989g;

    /* renamed from: h */
    public final C8426Vk0 f8990h;

    /* renamed from: i */
    public final /* synthetic */ AbstractC1088RI f8991i;

    static {
        IP0 ip0 = BP0.f799a;
        f8982j = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C0963PI.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), ip0.mo3850f(new GE0(ip0.mo3846b(C0963PI.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public C0963PI(AbstractC1088RI abstractC1088RI, List list, List list2, List list3) {
        O90.m5968f(list, "functionList");
        O90.m5968f(list2, "propertyList");
        O90.m5968f(list3, "typeAliasList");
        this.f8991i = abstractC1088RI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C8340Tt0 c8340Tt0M1002b = CB1.m1002b((InterfaceC8392Ut0) abstractC1088RI.f10113b.f12663d, ((C9729iF0) ((AbstractC0631K0) obj)).f28985f);
            Object arrayList = linkedHashMap.get(c8340Tt0M1002b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c8340Tt0M1002b, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f8983a = m6294c(linkedHashMap);
        AbstractC1088RI abstractC1088RI2 = this.f8991i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            C8340Tt0 c8340Tt0M1002b2 = CB1.m1002b((InterfaceC8392Ut0) abstractC1088RI2.f10113b.f12663d, ((C10753qF0) ((AbstractC0631K0) obj2)).f40690f);
            Object arrayList2 = linkedHashMap2.get(c8340Tt0M1002b2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(c8340Tt0M1002b2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f8984b = m6294c(linkedHashMap2);
        ((C7129xI) this.f8991i.f10113b.f12662c).f45520c.getClass();
        AbstractC1088RI abstractC1088RI3 = this.f8991i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            C8340Tt0 c8340Tt0M1002b3 = CB1.m1002b((InterfaceC8392Ut0) abstractC1088RI3.f10113b.f12663d, ((CF0) ((AbstractC0631K0) obj3)).f1273e);
            Object arrayList3 = linkedHashMap3.get(c8340Tt0M1002b3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(c8340Tt0M1002b3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f8985c = m6294c(linkedHashMap3);
        this.f8986d = ((C8582Yk0) ((C7129xI) this.f8991i.f10113b.f12662c).f45518a).m9350b(new C0900OI(this, 0));
        this.f8987e = ((C8582Yk0) ((C7129xI) this.f8991i.f10113b.f12662c).f45518a).m9350b(new C0900OI(this, 1));
        this.f8988f = ((C8582Yk0) ((C7129xI) this.f8991i.f10113b.f12662c).f45518a).m9351c(new C0900OI(this, 2));
        AbstractC1088RI abstractC1088RI4 = this.f8991i;
        Z41 z41 = ((C7129xI) abstractC1088RI4.f10113b.f12662c).f45518a;
        C0837NI c0837ni = new C0837NI(this, abstractC1088RI4, 0);
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        c8582Yk0.getClass();
        this.f8989g = new C8426Vk0(c8582Yk0, c0837ni);
        AbstractC1088RI abstractC1088RI5 = this.f8991i;
        Z41 z412 = ((C7129xI) abstractC1088RI5.f10113b.f12662c).f45518a;
        C0837NI c0837ni2 = new C0837NI(this, abstractC1088RI5, 1);
        C8582Yk0 c8582Yk02 = (C8582Yk0) z412;
        c8582Yk02.getClass();
        this.f8990h = new C8426Vk0(c8582Yk02, c0837ni2);
    }

    /* renamed from: c */
    public static LinkedHashMap m6294c(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC11205tn0.m24983b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractC0631K0> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(iterable));
            for (AbstractC0631K0 abstractC0631K0 : iterable) {
                int iMo128b = abstractC0631K0.mo128b();
                int iM4209i = C0577J9.m4209i(iMo128b) + iMo128b;
                if (iM4209i > 4096) {
                    iM4209i = 4096;
                }
                C0577J9 c0577j9M4212n = C0577J9.m4212n(byteArrayOutputStream, iM4209i);
                c0577j9M4212n.m4218F(iMo128b);
                abstractC0631K0.mo132f(c0577j9M4212n);
                c0577j9M4212n.m4224m();
                arrayList.add(C8313Tf1.f11463a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    /* renamed from: a */
    public final Collection m6295a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        return !((Set) WS1.m8763b(this.f8989g, f8982j[0])).contains(c8340Tt0) ? C0779MN.f7117a : (Collection) this.f8986d.invoke(c8340Tt0);
    }

    /* renamed from: b */
    public final Collection m6296b(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        return !((Set) WS1.m8763b(this.f8990h, f8982j[1])).contains(c8340Tt0) ? C0779MN.f7117a : (Collection) this.f8987e.invoke(c8340Tt0);
    }
}
