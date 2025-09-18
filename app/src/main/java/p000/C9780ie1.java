package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: ie1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9780ie1 extends AbstractC0288EZ implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f29400a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9780ie1(int i, Object obj, int i2) {
        super(i, obj);
        this.f29400a = i2;
    }

    @Override // p000.AbstractC7284zl, p000.InterfaceC8152Qd0
    public final String getName() {
        switch (this.f29400a) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC10163le0 getOwner() {
        switch (this.f29400a) {
            case 0:
                return BP0.f799a.mo3846b(C9908je1.class);
            default:
                return BP0.f799a.mo3846b(C11604wv0.class);
        }
    }

    @Override // p000.AbstractC7284zl
    public final String getSignature() {
        switch (this.f29400a) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29400a) {
            case 0:
                AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) obj;
                AbstractC7742Ig0 abstractC7742Ig02 = (AbstractC7742Ig0) obj2;
                O90.m5968f(abstractC7742Ig0, "p0");
                O90.m5968f(abstractC7742Ig02, "p1");
                ((C9908je1) this.receiver).getClass();
                InterfaceC11477vv0.f44603b.getClass();
                C11604wv0 c11604wv0 = C11349uv0.f44021b;
                return Boolean.valueOf(c11604wv0.m25726b(abstractC7742Ig0, abstractC7742Ig02) && !c11604wv0.m25726b(abstractC7742Ig02, abstractC7742Ig0));
            default:
                AbstractC7742Ig0 abstractC7742Ig03 = (AbstractC7742Ig0) obj;
                AbstractC7742Ig0 abstractC7742Ig04 = (AbstractC7742Ig0) obj2;
                O90.m5968f(abstractC7742Ig03, "p0");
                O90.m5968f(abstractC7742Ig04, "p1");
                return Boolean.valueOf(((C11604wv0) this.receiver).m25725a(abstractC7742Ig03, abstractC7742Ig04));
        }
    }
}
