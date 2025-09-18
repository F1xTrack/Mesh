package p000;

import java.util.List;

/* renamed from: ii0 */
/* loaded from: classes2.dex */
public final class C9787ii0 extends AbstractC7742Ig0 {

    /* renamed from: b */
    public final C8582Yk0 f29414b;

    /* renamed from: c */
    public final AbstractC8418Vg0 f29415c;

    /* renamed from: d */
    public final C8426Vk0 f29416d;

    /* JADX WARN: Multi-variable type inference failed */
    public C9787ii0(C8582Yk0 c8582Yk0, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(c8582Yk0, "storageManager");
        this.f29414b = c8582Yk0;
        this.f29415c = (AbstractC8418Vg0) interfaceC6434mZ;
        this.f29416d = new C8426Vk0(c8582Yk0, interfaceC6434mZ);
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: B */
    public final C7789Jd1 mo3796B() {
        return m19072P().mo3796B();
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: E */
    public final InterfaceC8101Pd1 mo3797E() {
        return m19072P().mo3797E();
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: G */
    public final boolean mo3798G() {
        return m19072P().mo3798G();
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: I */
    public final AbstractC7742Ig0 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        return new C9787ii0(this.f29414b, new C7053w5(c8054Og0, 19, this));
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: L */
    public final AbstractC8315Tg1 mo3963L() {
        AbstractC7742Ig0 abstractC7742Ig0M19072P = m19072P();
        while (abstractC7742Ig0M19072P instanceof C9787ii0) {
            abstractC7742Ig0M19072P = ((C9787ii0) abstractC7742Ig0M19072P).m19072P();
        }
        O90.m5966d(abstractC7742Ig0M19072P, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC8315Tg1) abstractC7742Ig0M19072P;
    }

    /* renamed from: P */
    public final AbstractC7742Ig0 m19072P() {
        return (AbstractC7742Ig0) this.f29416d.invoke();
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: d0 */
    public final InterfaceC10059kq0 mo3799d0() {
        return m19072P().mo3799d0();
    }

    public final String toString() {
        C8426Vk0 c8426Vk0 = this.f29416d;
        return (c8426Vk0.f12018c == EnumC8530Xk0.f13942a || c8426Vk0.f12018c == EnumC8530Xk0.f13943b) ? "<Not computed yet>" : m19072P().toString();
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: u */
    public final List mo3800u() {
        return m19072P().mo3800u();
    }
}
