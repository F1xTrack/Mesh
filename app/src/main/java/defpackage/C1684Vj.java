package defpackage;

/* renamed from: Vj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1684Vj extends EZ implements InterfaceC6099nZ {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1684Vj(int i, Object obj, int i2) {
        super(i, obj);
        this.a = i2;
    }

    @Override // defpackage.AbstractC8422zl, defpackage.InterfaceC1277Qd0
    public final String getName() {
        switch (this.a) {
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

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC5733le0 getOwner() {
        switch (this.a) {
        }
        return BP0.a.b(C0276Dh0.class);
    }

    @Override // defpackage.AbstractC8422zl
    public final String getSignature() {
        switch (this.a) {
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

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                O90.f(str, "p0");
                ((C1996Zj) this.receiver).getClass();
                return C1996Zj.a(str);
            case 1:
                AF0 af0 = (AF0) obj;
                O90.f(af0, "p0");
                return ((C1902Yd1) this.receiver).d(af0, true);
            case 2:
                C1559Tt0 c1559Tt0 = (C1559Tt0) obj;
                O90.f(c1559Tt0, "p0");
                return ((HI) this.receiver).B(c1559Tt0);
            case 3:
                C1130Og0 c1130Og0 = (C1130Og0) obj;
                O90.f(c1130Og0, "p0");
                return new EI((HI) this.receiver, c1130Og0);
            case 4:
                InterfaceC0974Mg0 interfaceC0974Mg0 = (InterfaceC0974Mg0) obj;
                O90.f(interfaceC0974Mg0, "p0");
                return ((C1052Ng0) this.receiver).a(interfaceC0974Mg0);
            case 5:
                C1559Tt0 c1559Tt02 = (C1559Tt0) obj;
                O90.f(c1559Tt02, "p0");
                return C0276Dh0.v((C0276Dh0) this.receiver, c1559Tt02);
            default:
                C1559Tt0 c1559Tt03 = (C1559Tt0) obj;
                O90.f(c1559Tt03, "p0");
                return C0276Dh0.w((C0276Dh0) this.receiver, c1559Tt03);
        }
    }
}
