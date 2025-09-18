package p000;

/* renamed from: XV */
/* loaded from: classes2.dex */
public final class C1479XV extends AbstractC1542YV {

    /* renamed from: c */
    public final InterfaceC10997s90[] f13813c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1479XV(int i, InterfaceC10997s90[] interfaceC10997s90Arr) {
        if (interfaceC10997s90Arr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i2 = 1;
        int length = interfaceC10997s90Arr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            throw new IllegalStateException("Empty enum: " + interfaceC10997s90Arr.getClass());
        }
        super(i, i2);
        this.f13813c = interfaceC10997s90Arr;
    }

    /* renamed from: c */
    public final Object m9059c(int i) {
        int i2 = (1 << this.f14323b) - 1;
        int i3 = this.f14322a;
        int i4 = (i & (i2 << i3)) >> i3;
        for (InterfaceC10997s90 interfaceC10997s90 : this.f13813c) {
            if (interfaceC10997s90.mo2106a() == i4) {
                return interfaceC10997s90;
            }
        }
        return null;
    }
}
