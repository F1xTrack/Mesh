package p000;

/* renamed from: aF0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC8700aF0 implements InterfaceC10997s90 {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* renamed from: a */
    public final int f15407a;

    EnumC8700aF0(int i) {
        this.f15407a = i;
    }

    @Override // p000.InterfaceC10997s90
    /* renamed from: a */
    public final int mo2106a() {
        return this.f15407a;
    }
}
