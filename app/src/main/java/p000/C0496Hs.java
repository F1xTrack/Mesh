package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: Hs */
/* loaded from: classes2.dex */
public final class C0496Hs extends AbstractC0252E {

    /* renamed from: c */
    public final AbstractC11725xs0 f4558c;

    /* renamed from: d */
    public final List f4559d;

    /* renamed from: e */
    public final Collection f4560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0496Hs(AbstractC11725xs0 abstractC11725xs0, List list, Collection collection, Z41 z41) {
        super(z41);
        if (list == null) {
            m3636l(1);
            throw null;
        }
        if (collection == null) {
            m3636l(2);
            throw null;
        }
        if (z41 == null) {
            m3636l(3);
            throw null;
        }
        this.f4558c = abstractC11725xs0;
        this.f4559d = Collections.unmodifiableList(new ArrayList(list));
        this.f4560e = Collections.unmodifiableCollection(collection);
    }

    /* renamed from: l */
    public static /* synthetic */ void m3636l(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        return true;
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: e */
    public final Collection mo3024e() {
        Collection collection = this.f4560e;
        if (collection != null) {
            return collection;
        }
        m3636l(6);
        throw null;
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: g */
    public final C7564Ev0 mo3025g() {
        return C7564Ev0.f2965h;
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        List list = this.f4559d;
        if (list != null) {
            return list;
        }
        m3636l(4);
        throw null;
    }

    @Override // p000.AbstractC0252E
    /* renamed from: m */
    public final InterfaceC6976us mo1962a() {
        AbstractC11725xs0 abstractC11725xs0 = this.f4558c;
        if (abstractC11725xs0 != null) {
            return abstractC11725xs0;
        }
        m3636l(5);
        throw null;
    }

    public final String toString() {
        String str = AbstractC6814sI.m24695g(this.f4558c).f7212a;
        if (str != null) {
            return str;
        }
        C0789MX.m5387a(4);
        throw null;
    }
}
