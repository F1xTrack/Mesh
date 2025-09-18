package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: Hs */
/* loaded from: classes2.dex */
public final class C0620Hs extends E {
    public final AbstractC8064xs0 c;
    public final List d;
    public final Collection e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0620Hs(AbstractC8064xs0 abstractC8064xs0, List list, Collection collection, Z41 z41) {
        super(z41);
        if (list == null) {
            l(1);
            throw null;
        }
        if (collection == null) {
            l(2);
            throw null;
        }
        if (z41 == null) {
            l(3);
            throw null;
        }
        this.c = abstractC8064xs0;
        this.d = Collections.unmodifiableList(new ArrayList(list));
        this.e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void l(int i) {
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

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.AbstractC5612l1
    public final Collection e() {
        Collection collection = this.e;
        if (collection != null) {
            return collection;
        }
        l(6);
        throw null;
    }

    @Override // defpackage.AbstractC5612l1
    public final C0396Ev0 g() {
        return C0396Ev0.h;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        List list = this.d;
        if (list != null) {
            return list;
        }
        l(4);
        throw null;
    }

    @Override // defpackage.E
    /* renamed from: m */
    public final InterfaceC7492us a() {
        AbstractC8064xs0 abstractC8064xs0 = this.c;
        if (abstractC8064xs0 != null) {
            return abstractC8064xs0;
        }
        l(5);
        throw null;
    }

    public final String toString() {
        String str = AbstractC7002sI.g(this.c).a;
        if (str != null) {
            return str;
        }
        MX.a(4);
        throw null;
    }
}
