package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ne1 */
/* loaded from: classes2.dex */
public final class C6116ne1 extends AbstractC6567q1 {
    public final ArrayList l;
    public boolean m;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6116ne1(CD cd, I5 i5, boolean z, EnumC4015gi1 enumC4015gi1, C1559Tt0 c1559Tt0, int i, Z41 z41) {
        C0396Ev0 c0396Ev0 = C0396Ev0.h;
        if (cd == null) {
            b1(19);
            throw null;
        }
        if (i5 == null) {
            b1(20);
            throw null;
        }
        if (enumC4015gi1 == null) {
            b1(21);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(22);
            throw null;
        }
        if (z41 == null) {
            b1(25);
            throw null;
        }
        super(z41, cd, i5, c1559Tt0, enumC4015gi1, z, i, c0396Ev0);
        this.l = new ArrayList(1);
        this.m = false;
    }

    public static C6116ne1 A1(CD cd, I5 i5, boolean z, EnumC4015gi1 enumC4015gi1, C1559Tt0 c1559Tt0, int i, Z41 z41) {
        if (cd == null) {
            b1(6);
            throw null;
        }
        if (i5 == null) {
            b1(7);
            throw null;
        }
        if (enumC4015gi1 == null) {
            b1(8);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(9);
            throw null;
        }
        if (z41 != null) {
            return new C6116ne1(cd, i5, z, enumC4015gi1, c1559Tt0, i, z41);
        }
        b1(11);
        throw null;
    }

    public static C6116ne1 B1(D d, EnumC4015gi1 enumC4015gi1, C1559Tt0 c1559Tt0, int i, Z41 z41) {
        H5 h5 = S20.b;
        if (d == null) {
            b1(0);
            throw null;
        }
        if (z41 == null) {
            b1(4);
            throw null;
        }
        C6116ne1 c6116ne1A1 = A1(d, h5, false, enumC4015gi1, c1559Tt0, i, z41);
        X01 x01M = AbstractC7384uI.e(d).m();
        if (c6116ne1A1.m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + c6116ne1A1.C1());
        }
        if (!S8.b(x01M)) {
            c6116ne1A1.l.add(x01M);
        }
        if (!c6116ne1A1.m) {
            c6116ne1A1.m = true;
            return c6116ne1A1;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + c6116ne1A1.C1());
    }

    public static /* synthetic */ void b1(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final String C1() {
        return getName() + " declared in " + AbstractC7002sI.g(i());
    }

    @Override // defpackage.AbstractC6567q1
    public final List z1() {
        if (!this.m) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + C1());
        }
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            return arrayList;
        }
        b1(28);
        throw null;
    }
}
