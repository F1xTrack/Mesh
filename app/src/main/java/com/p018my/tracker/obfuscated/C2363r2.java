package com.p018my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.r2 */
/* loaded from: classes2.dex */
public final class C2363r2 {

    /* renamed from: a */
    private final long f20114a;

    /* renamed from: b */
    private final InterfaceC2315f2 f20115b;

    /* renamed from: c */
    private final InterfaceC2315f2[] f20116c;

    /* renamed from: d */
    private final InterfaceC2380w[] f20117d;

    public C2363r2(long j, InterfaceC2315f2 interfaceC2315f2, InterfaceC2315f2[] interfaceC2315f2Arr, InterfaceC2380w[] interfaceC2380wArr) {
        this.f20114a = j;
        this.f20115b = interfaceC2315f2;
        this.f20116c = interfaceC2315f2Arr;
        this.f20117d = interfaceC2380wArr;
    }

    /* renamed from: a */
    public InterfaceC2315f2 m13471a() {
        return this.f20115b;
    }

    /* renamed from: b */
    public InterfaceC2380w[] m13472b() {
        return this.f20117d;
    }

    /* renamed from: c */
    public long m13473c() {
        return this.f20114a;
    }

    /* renamed from: d */
    public InterfaceC2315f2[] m13474d() {
        return this.f20116c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f20115b != null) {
            sb.append("|-----\n| ");
            sb.append(this.f20115b);
            sb.append("\n");
        }
        InterfaceC2315f2[] interfaceC2315f2Arr = this.f20116c;
        if (interfaceC2315f2Arr != null && interfaceC2315f2Arr.length > 0) {
            sb.append("|-----\n");
            for (InterfaceC2315f2 interfaceC2315f2 : this.f20116c) {
                sb.append("| ");
                sb.append(interfaceC2315f2);
                sb.append("\n");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        InterfaceC2380w[] interfaceC2380wArr = this.f20117d;
        if (interfaceC2380wArr != null && interfaceC2380wArr.length > 0) {
            sb2.append("|-----\n");
            for (InterfaceC2380w interfaceC2380w : this.f20117d) {
                sb2.append("| ");
                sb2.append(interfaceC2380w);
                sb2.append("\n");
            }
        }
        return "[TimeSpentTickDTO]\n| timestamp = " + this.f20114a + "\n" + ((Object) sb) + ((Object) sb2) + "[/TimeSpentTickDTO]\n";
    }
}
