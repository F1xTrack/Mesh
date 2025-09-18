package defpackage;

/* loaded from: classes2.dex */
public final class XV extends YV {
    public final InterfaceC6976s90[] c;

    /* JADX WARN: Illegal instructions before constructor call */
    public XV(int i, InterfaceC6976s90[] interfaceC6976s90Arr) {
        if (interfaceC6976s90Arr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i2 = 1;
        int length = interfaceC6976s90Arr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            throw new IllegalStateException("Empty enum: " + interfaceC6976s90Arr.getClass());
        }
        super(i, i2);
        this.c = interfaceC6976s90Arr;
    }

    public final Object c(int i) {
        int i2 = (1 << this.b) - 1;
        int i3 = this.a;
        int i4 = (i & (i2 << i3)) >> i3;
        for (InterfaceC6976s90 interfaceC6976s90 : this.c) {
            if (interfaceC6976s90.a() == i4) {
                return interfaceC6976s90;
            }
        }
        return null;
    }
}
