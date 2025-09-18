package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: D */
/* loaded from: classes2.dex */
public abstract class AbstractC0189D extends AbstractC11725xs0 {

    /* renamed from: a */
    public final C8340Tt0 f1791a;

    /* renamed from: b */
    public final C8426Vk0 f1792b;

    /* renamed from: c */
    public final C8426Vk0 f1793c;

    /* renamed from: d */
    public final C8426Vk0 f1794d;

    public AbstractC0189D(Z41 z41, C8340Tt0 c8340Tt0) {
        if (z41 == null) {
            m1485r(0);
            throw null;
        }
        if (c8340Tt0 == null) {
            m1485r(1);
            throw null;
        }
        this.f1791a = c8340Tt0;
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        this.f1792b = new C8426Vk0(c8582Yk0, new C0126C(this, 0));
        this.f1793c = new C8426Vk0(c8582Yk0, new C0126C(this, 1));
        this.f1794d = new C8426Vk0(c8582Yk0, new C0126C(this, 2));
    }

    /* renamed from: r */
    public static /* synthetic */ void m1485r(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: I0 */
    public InterfaceC10059kq0 mo1486I0() {
        InterfaceC10059kq0 interfaceC10059kq0 = (InterfaceC10059kq0) this.f1793c.invoke();
        if (interfaceC10059kq0 != null) {
            return interfaceC10059kq0;
        }
        m1485r(4);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: O0 */
    public InterfaceC10059kq0 mo1487O0() {
        AbstractC6940uI.m25156i(AbstractC6814sI.m24692d(this));
        InterfaceC10059kq0 interfaceC10059kq0Mo1437n = mo1437n(C8054Og0.f8561a);
        if (interfaceC10059kq0Mo1437n != null) {
            return interfaceC10059kq0Mo1437n;
        }
        m1485r(17);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: S0 */
    public List mo1488S0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m1485r(6);
        throw null;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2854q(this, obj);
    }

    @Override // p000.AbstractC11725xs0, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0873Ns mo2089x1() {
        return this;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: a1 */
    public final C10937rh0 mo1489a1() {
        C10937rh0 c10937rh0 = (C10937rh0) this.f1794d.invoke();
        if (c10937rh0 != null) {
            return c10937rh0;
        }
        m1485r(5);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: c0 */
    public final InterfaceC10059kq0 mo1490c0(AbstractC11316ue1 abstractC11316ue1) {
        AbstractC6940uI.m25156i(AbstractC6814sI.m24692d(this));
        InterfaceC10059kq0 interfaceC10059kq0Mo1491k = mo1491k(abstractC11316ue1, C8054Og0.f8561a);
        if (interfaceC10059kq0Mo1491k != null) {
            return interfaceC10059kq0Mo1491k;
        }
        m1485r(16);
        throw null;
    }

    @Override // p000.InterfaceC0140CD
    public final C8340Tt0 getName() {
        C8340Tt0 c8340Tt0 = this.f1791a;
        if (c8340Tt0 != null) {
            return c8340Tt0;
        }
        m1485r(2);
        throw null;
    }

    @Override // p000.AbstractC11725xs0
    /* renamed from: k */
    public InterfaceC10059kq0 mo1491k(AbstractC11316ue1 abstractC11316ue1, C8054Og0 c8054Og0) {
        if (!abstractC11316ue1.mo7050e()) {
            return new T51(mo1437n(c8054Og0), new C11571we1(abstractC11316ue1));
        }
        InterfaceC10059kq0 interfaceC10059kq0Mo1437n = mo1437n(c8054Og0);
        if (interfaceC10059kq0Mo1437n != null) {
            return interfaceC10059kq0Mo1437n;
        }
        m1485r(12);
        throw null;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0873Ns
    /* renamed from: m */
    public final X01 mo1492m() {
        X01 x01 = (X01) this.f1792b.invoke();
        if (x01 != null) {
            return x01;
        }
        m1485r(20);
        throw null;
    }

    @Override // p000.R51
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public InterfaceC6976us mo114b(C11571we1 c11571we1) {
        if (c11571we1 != null) {
            return c11571we1.f45011a.mo7050e() ? this : new C9531gi0(this, c11571we1);
        }
        m1485r(18);
        throw null;
    }

    @Override // p000.AbstractC11725xs0, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0140CD mo2089x1() {
        return this;
    }

    @Override // p000.AbstractC11725xs0, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC6976us mo2089x1() {
        return this;
    }
}
