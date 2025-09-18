package defpackage;

/* renamed from: z02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC8281z02 implements InterfaceC5859mI1 {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);

    public final int a;

    EnumC8281z02(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC5859mI1
    public final int zza() {
        return this.a;
    }
}
