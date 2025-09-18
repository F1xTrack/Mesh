package p000;

/* renamed from: z02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC11870z02 implements InterfaceC10248mI1 {
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


    /* renamed from: a */
    public final int f46584a;

    EnumC11870z02(int i) {
        this.f46584a = i;
    }

    @Override // p000.InterfaceC10248mI1
    public final int zza() {
        return this.f46584a;
    }
}
