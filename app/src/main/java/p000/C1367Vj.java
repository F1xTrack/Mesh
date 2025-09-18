package p000;

/* renamed from: Vj */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1367Vj extends AbstractC0288EZ implements InterfaceC6497nZ {

    /* renamed from: a */
    public final /* synthetic */ int f12699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1367Vj(int i, Object obj, int i2) {
        super(i, obj);
        this.f12699a = i2;
    }

    @Override // p000.AbstractC7284zl, p000.InterfaceC8152Qd0
    public final String getName() {
        switch (this.f12699a) {
            case 0:
                return "loadResource";
            case 1:
                return "simpleType";
            case 2:
                return "getValueClassPropertyType";
            case 3:
                return "<init>";
            case 4:
                return "prepareType";
            case 5:
                return "searchMethodsByNameWithoutBuiltinMagic";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC10163le0 getOwner() {
        switch (this.f12699a) {
        }
        return BP0.f799a.mo3846b(C7484Dh0.class);
    }

    @Override // p000.AbstractC7284zl
    public final String getSignature() {
        switch (this.f12699a) {
            case 0:
                return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
            case 1:
                return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 2:
                return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 3:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
            case 4:
                return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
            case 5:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f12699a) {
            case 0:
                String str = (String) obj;
                O90.m5968f(str, "p0");
                ((C1619Zj) this.receiver).getClass();
                return C1619Zj.m9583a(str);
            case 1:
                AF0 af0 = (AF0) obj;
                O90.m5968f(af0, "p0");
                return ((C8569Yd1) this.receiver).m9331d(af0, true);
            case 2:
                C8340Tt0 c8340Tt0 = (C8340Tt0) obj;
                O90.m5968f(c8340Tt0, "p0");
                return ((C0460HI) this.receiver).m3342B(c8340Tt0);
            case 3:
                C8054Og0 c8054Og0 = (C8054Og0) obj;
                O90.m5968f(c8054Og0, "p0");
                return new C0271EI((C0460HI) this.receiver, c8054Og0);
            case 4:
                InterfaceC7950Mg0 interfaceC7950Mg0 = (InterfaceC7950Mg0) obj;
                O90.m5968f(interfaceC7950Mg0, "p0");
                return ((C8002Ng0) this.receiver).m5798a(interfaceC7950Mg0);
            case 5:
                C8340Tt0 c8340Tt02 = (C8340Tt0) obj;
                O90.m5968f(c8340Tt02, "p0");
                return C7484Dh0.m1759v((C7484Dh0) this.receiver, c8340Tt02);
            default:
                C8340Tt0 c8340Tt03 = (C8340Tt0) obj;
                O90.m5968f(c8340Tt03, "p0");
                return C7484Dh0.m1760w((C7484Dh0) this.receiver, c8340Tt03);
        }
    }
}
