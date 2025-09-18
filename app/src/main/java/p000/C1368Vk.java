package p000;

import java.util.regex.Pattern;

/* renamed from: Vk */
/* loaded from: classes2.dex */
public final class C1368Vk extends IS0 {

    /* renamed from: a */
    public final C6545oK f12708a;

    /* renamed from: b */
    public final String f12709b;

    /* renamed from: c */
    public final String f12710c;

    /* renamed from: d */
    public final C11917zN0 f12711d;

    public C1368Vk(C6545oK c6545oK, String str, String str2) {
        this.f12708a = c6545oK;
        this.f12709b = str;
        this.f12710c = str2;
        this.f12711d = JI1.m4274b(new C1305Uk((U21) c6545oK.f38952c.get(1), this));
    }

    @Override // p000.IS0
    /* renamed from: o */
    public final long mo3383o() {
        String str = this.f12710c;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = AbstractC7433Ch1.f1577a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // p000.IS0
    /* renamed from: p */
    public final C8540Xp0 mo3384p() {
        String str = this.f12709b;
        if (str == null) {
            return null;
        }
        Pattern pattern = C8540Xp0.f13986d;
        return AbstractC11511wA1.m25570c(str);
    }

    @Override // p000.IS0
    /* renamed from: w */
    public final InterfaceC0676Kj mo3385w() {
        return this.f12711d;
    }
}
