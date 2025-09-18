package defpackage;

import java.util.regex.Pattern;

/* renamed from: Vk */
/* loaded from: classes2.dex */
public final class C1687Vk extends IS0 {
    public final C6245oK a;
    public final String b;
    public final String c;
    public final C8351zN0 d;

    public C1687Vk(C6245oK c6245oK, String str, String str2) {
        this.a = c6245oK;
        this.b = str;
        this.c = str2;
        this.d = JI1.b(new C1609Uk((U21) c6245oK.c.get(1), this));
    }

    @Override // defpackage.IS0
    public final long o() {
        String str = this.c;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = AbstractC0199Ch1.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.IS0
    public final C1859Xp0 p() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        Pattern pattern = C1859Xp0.d;
        return AbstractC7743wA1.c(str);
    }

    @Override // defpackage.IS0
    public final InterfaceC0827Kj w() {
        return this.d;
    }
}
