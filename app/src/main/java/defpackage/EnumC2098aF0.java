package defpackage;

/* renamed from: aF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2098aF0 implements InterfaceC6976s90 {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);

    public final int a;

    EnumC2098aF0(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC6976s90
    public final int a() {
        return this.a;
    }
}
