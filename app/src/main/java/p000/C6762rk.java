package p000;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: rk */
/* loaded from: classes.dex */
public final class C6762rk implements InterfaceC0643KC {

    /* renamed from: a */
    public final /* synthetic */ int f41837a;

    /* renamed from: b */
    public final Object f41838b;

    public /* synthetic */ C6762rk(int i, Object obj) {
        this.f41837a = i;
        this.f41838b = obj;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: a */
    public final Class mo3254a() {
        switch (this.f41837a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f41838b.getClass();
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: b */
    public final void mo3255b() {
        int i = this.f41837a;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: c */
    public final void mo3256c(EnumC11389vD0 enumC11389vD0, InterfaceC0580JC interfaceC0580JC) {
        switch (this.f41837a) {
            case 0:
                try {
                    interfaceC0580JC.mo557j(AbstractC7031vk.m25478a((File) this.f41838b));
                    break;
                } catch (IOException e) {
                    interfaceC0580JC.mo556e(e);
                    return;
                }
            default:
                interfaceC0580JC.mo557j(this.f41838b);
                break;
        }
    }

    @Override // p000.InterfaceC0643KC
    public final void cancel() {
        int i = this.f41837a;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: d */
    public final EnumC1460XC mo3257d() {
        switch (this.f41837a) {
        }
        return EnumC1460XC.f13614a;
    }

    /* renamed from: e */
    private final void m24464e() {
    }

    /* renamed from: f */
    private final void m24465f() {
    }

    /* renamed from: g */
    private final void m24466g() {
    }

    /* renamed from: h */
    private final void m24467h() {
    }
}
