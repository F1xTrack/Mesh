package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: ie1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4385ie1 extends EZ implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4385ie1(int i, Object obj, int i2) {
        super(i, obj);
        this.a = i2;
    }

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        switch (this.a) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        switch (this.a) {
            case 0:
                return BP0.a.b(C5352je1.class);
            default:
                return BP0.a.b(C7883wv0.class);
        }
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        switch (this.a) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) obj;
                AbstractC0663Ig0 abstractC0663Ig02 = (AbstractC0663Ig0) obj2;
                O90.f(abstractC0663Ig0, "p0");
                O90.f(abstractC0663Ig02, "p1");
                ((C5352je1) this.receiver).getClass();
                InterfaceC7693vv0.b.getClass();
                C7883wv0 c7883wv0 = C7502uv0.b;
                return Boolean.valueOf(c7883wv0.b(abstractC0663Ig0, abstractC0663Ig02) && !c7883wv0.b(abstractC0663Ig02, abstractC0663Ig0));
            default:
                AbstractC0663Ig0 abstractC0663Ig03 = (AbstractC0663Ig0) obj;
                AbstractC0663Ig0 abstractC0663Ig04 = (AbstractC0663Ig0) obj2;
                O90.f(abstractC0663Ig03, "p0");
                O90.f(abstractC0663Ig04, "p1");
                return Boolean.valueOf(((C7883wv0) this.receiver).a(abstractC0663Ig03, abstractC0663Ig04));
        }
    }
}
