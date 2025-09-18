package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* renamed from: jP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9877jP0 extends AbstractC10517oP0 implements InterfaceC7420Cb0 {

    /* renamed from: a */
    public final Constructor f35144a;

    public C9877jP0(Constructor constructor) {
        O90.m5968f(constructor, "member");
        this.f35144a = constructor;
    }

    @Override // p000.AbstractC10517oP0
    /* renamed from: b */
    public final Member mo22030b() {
        return this.f35144a;
    }

    @Override // p000.InterfaceC7420Cb0
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f35144a.getTypeParameters();
        O90.m5967e(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C11285uP0(typeVariable));
        }
        return arrayList;
    }
}
