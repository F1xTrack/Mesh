package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class D extends AbstractC8064xs0 {
    public final C1559Tt0 a;
    public final C1688Vk0 b;
    public final C1688Vk0 c;
    public final C1688Vk0 d;

    public D(Z41 z41, C1559Tt0 c1559Tt0) {
        if (z41 == null) {
            r(0);
            throw null;
        }
        if (c1559Tt0 == null) {
            r(1);
            throw null;
        }
        this.a = c1559Tt0;
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        this.b = new C1688Vk0(c1922Yk0, new C(this, 0));
        this.c = new C1688Vk0(c1922Yk0, new C(this, 1));
        this.d = new C1688Vk0(c1922Yk0, new C(this, 2));
    }

    public static /* synthetic */ void r(int i) {
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

    @Override // defpackage.InterfaceC7492us
    public InterfaceC5578kq0 I0() {
        InterfaceC5578kq0 interfaceC5578kq0 = (InterfaceC5578kq0) this.c.invoke();
        if (interfaceC5578kq0 != null) {
            return interfaceC5578kq0;
        }
        r(4);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public InterfaceC5578kq0 O0() {
        AbstractC7384uI.i(AbstractC7002sI.d(this));
        InterfaceC5578kq0 interfaceC5578kq0N = n(C1130Og0.a);
        if (interfaceC5578kq0N != null) {
            return interfaceC5578kq0N;
        }
        r(17);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public List S0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        r(6);
        throw null;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.q(this, obj);
    }

    @Override // defpackage.AbstractC8064xs0, defpackage.CD
    /* renamed from: a */
    public final InterfaceC1087Ns x1() {
        return this;
    }

    @Override // defpackage.InterfaceC7492us
    public final C6887rh0 a1() {
        C6887rh0 c6887rh0 = (C6887rh0) this.d.invoke();
        if (c6887rh0 != null) {
            return c6887rh0;
        }
        r(5);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 c0(AbstractC7452ue1 abstractC7452ue1) {
        AbstractC7384uI.i(AbstractC7002sI.d(this));
        InterfaceC5578kq0 interfaceC5578kq0K = k(abstractC7452ue1, C1130Og0.a);
        if (interfaceC5578kq0K != null) {
            return interfaceC5578kq0K;
        }
        r(16);
        throw null;
    }

    @Override // defpackage.CD
    public final C1559Tt0 getName() {
        C1559Tt0 c1559Tt0 = this.a;
        if (c1559Tt0 != null) {
            return c1559Tt0;
        }
        r(2);
        throw null;
    }

    @Override // defpackage.AbstractC8064xs0
    public InterfaceC5578kq0 k(AbstractC7452ue1 abstractC7452ue1, C1130Og0 c1130Og0) {
        if (!abstractC7452ue1.e()) {
            return new T51(n(c1130Og0), new C7833we1(abstractC7452ue1));
        }
        InterfaceC5578kq0 interfaceC5578kq0N = n(c1130Og0);
        if (interfaceC5578kq0N != null) {
            return interfaceC5578kq0N;
        }
        r(12);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1087Ns
    public final X01 m() {
        X01 x01 = (X01) this.b.invoke();
        if (x01 != null) {
            return x01;
        }
        r(20);
        throw null;
    }

    @Override // defpackage.R51
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public InterfaceC7492us b(C7833we1 c7833we1) {
        if (c7833we1 != null) {
            return c7833we1.a.e() ? this : new C4014gi0(this, c7833we1);
        }
        r(18);
        throw null;
    }

    @Override // defpackage.AbstractC8064xs0, defpackage.CD
    /* renamed from: a */
    public final CD x1() {
        return this;
    }

    @Override // defpackage.AbstractC8064xs0, defpackage.CD
    /* renamed from: a */
    public final InterfaceC7492us x1() {
        return this;
    }
}
