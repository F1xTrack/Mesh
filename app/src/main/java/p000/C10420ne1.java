package p000;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ne1 */
/* loaded from: classes2.dex */
public final class C10420ne1 extends AbstractC6654q1 {

    /* renamed from: l */
    public final ArrayList f38431l;

    /* renamed from: m */
    public boolean f38432m;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10420ne1(InterfaceC0140CD interfaceC0140CD, InterfaceC0510I5 interfaceC0510I5, boolean z, EnumC9532gi1 enumC9532gi1, C8340Tt0 c8340Tt0, int i, Z41 z41) {
        C7564Ev0 c7564Ev0 = C7564Ev0.f2965h;
        if (interfaceC0140CD == null) {
            m23158b1(19);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m23158b1(20);
            throw null;
        }
        if (enumC9532gi1 == null) {
            m23158b1(21);
            throw null;
        }
        if (c8340Tt0 == null) {
            m23158b1(22);
            throw null;
        }
        if (z41 == null) {
            m23158b1(25);
            throw null;
        }
        super(z41, interfaceC0140CD, interfaceC0510I5, c8340Tt0, enumC9532gi1, z, i, c7564Ev0);
        this.f38431l = new ArrayList(1);
        this.f38432m = false;
    }

    /* renamed from: A1 */
    public static C10420ne1 m23156A1(InterfaceC0140CD interfaceC0140CD, InterfaceC0510I5 interfaceC0510I5, boolean z, EnumC9532gi1 enumC9532gi1, C8340Tt0 c8340Tt0, int i, Z41 z41) {
        if (interfaceC0140CD == null) {
            m23158b1(6);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m23158b1(7);
            throw null;
        }
        if (enumC9532gi1 == null) {
            m23158b1(8);
            throw null;
        }
        if (c8340Tt0 == null) {
            m23158b1(9);
            throw null;
        }
        if (z41 != null) {
            return new C10420ne1(interfaceC0140CD, interfaceC0510I5, z, enumC9532gi1, c8340Tt0, i, z41);
        }
        m23158b1(11);
        throw null;
    }

    /* renamed from: B1 */
    public static C10420ne1 m23157B1(AbstractC0189D abstractC0189D, EnumC9532gi1 enumC9532gi1, C8340Tt0 c8340Tt0, int i, Z41 z41) {
        C0447H5 c0447h5 = S20.f10539b;
        if (abstractC0189D == null) {
            m23158b1(0);
            throw null;
        }
        if (z41 == null) {
            m23158b1(4);
            throw null;
        }
        C10420ne1 c10420ne1M23156A1 = m23156A1(abstractC0189D, c0447h5, false, enumC9532gi1, c8340Tt0, i, z41);
        X01 x01M26505m = AbstractC6940uI.m25152e(abstractC0189D).m26505m();
        if (c10420ne1M23156A1.f38432m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + c10420ne1M23156A1.m23159C1());
        }
        if (!AbstractC1141S8.m7182b(x01M26505m)) {
            c10420ne1M23156A1.f38431l.add(x01M26505m);
        }
        if (!c10420ne1M23156A1.f38432m) {
            c10420ne1M23156A1.f38432m = true;
            return c10420ne1M23156A1;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + c10420ne1M23156A1.m23159C1());
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m23158b1(int i) {
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

    /* renamed from: C1 */
    public final String m23159C1() {
        return getName() + " declared in " + AbstractC6814sI.m24695g(mo423i());
    }

    @Override // p000.AbstractC6654q1
    /* renamed from: z1 */
    public final List mo8120z1() {
        if (!this.f38432m) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + m23159C1());
        }
        ArrayList arrayList = this.f38431l;
        if (arrayList != null) {
            return arrayList;
        }
        m23158b1(28);
        throw null;
    }
}
