package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* renamed from: jP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5306jP0 extends AbstractC6261oP0 implements InterfaceC0180Cb0 {
    public final Constructor a;

    public C5306jP0(Constructor constructor) {
        O90.f(constructor, "member");
        this.a = constructor;
    }

    @Override // defpackage.AbstractC6261oP0
    public final Member b() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0180Cb0
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        O90.e(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C7406uP0(typeVariable));
        }
        return arrayList;
    }
}
